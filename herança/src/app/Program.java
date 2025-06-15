package app;

import java.util.ArrayList;
import java.util.List;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		
		List <Account> list = new ArrayList<>();
		
		

		list.add(new Account(1001, "Valmir", 4532.23));
		BusinessAccount bacc = new BusinessAccount(1002, "Valmir Holding", 435563.48 , 100000.00);
		
		//UPCASTING
		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(1003, "Luciana", 0.0, 20000.00);
		Account acc3 = new SavingsAccount(1004, "Luciana Holding", 13300.00, 10000.00);
		
		//DOWNCASTING
		BusinessAccount acc4 = (BusinessAccount)acc2;
		acc4.loan(10000.00);
		
		if (acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount)acc3;
			acc5.loan(200.0);
			System.out.println("Loan!");
		};
	
		if(acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount)acc3;
			acc5.updateBalance();
			System.out.println("Update!");
		}
		
		Account acc6 = new Account(1010, "Leticia", 1000.00);
		acc6.withdraw(200.00);
		System.out.println(acc6.getBalance());
		
		Account acc7 = new SavingsAccount(1011, "Pedro", 1000.0, 0.01);
		acc7.withdraw(200.0);
		System.out.println(acc7.getBalance());
		
		Account acc8 = new BusinessAccount(1012, "Renato", 1000.0, 500.0);
		acc8.withdraw(200.00);
		System.out.println(acc8.getBalance());
		
		Account x = new Account(1020, "Alex", 1000.0);
		Account y = new SavingsAccount(1023, "Maria", 1000.0, 0.01);
		
		x.withdraw(50.0);
		y.withdraw(50.0);
		
		System.out.println(x.getBalance()); 
		System.out.println(y.getBalance());
		
		
		list.add(new Account(1001, "Alex", 10000.0));
		list.add(new SavingsAccount(1002, "Maria", 1000.0, 0.01));
		list.add(new BusinessAccount(1003, "Bob", 10000.0, 500.0));
		
		double sum = 0.0;
		for(Account acc : list) {
			sum += acc.getBalance();
		}
		
		System.out.printf("Total balance: %.2f%n", sum);
		
		for (Account acc : list) {
			acc.deposit(10);;
		}
		
		for(Account acc: list) {
			System.out.printf("Total %d: %.2f%n", acc.getNumber(), acc.getBalance());
		}
	}

}
