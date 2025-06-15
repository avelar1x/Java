package application;

import Entities.Bank;
import java.util.Locale;
import java.util.Scanner;

public class Program {
	
	

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        Bank bank;
        
        System.out.print("Enter account number: ");
        int accountNumber = sc.nextInt();
        
        System.out.print("Enter account holder: ");
        sc.nextLine();
        String accountHolder = sc.next();
        
        System.out.print("Is there na initial deposit (y/n)? ");
        char resposta = sc.next().charAt(0);
    	double initialDeposit = 0.0;
        if(resposta == 'y' || resposta == 'Y') {
        	System.out.print("Enter initial deposit value: ");
        	initialDeposit = sc.nextDouble(); 
        	bank = new Bank(accountNumber, accountHolder, initialDeposit);
        } else {
        	bank = new Bank(accountNumber, accountHolder);
        }
        
        System.out.println();
        System.out.println("Account data:");
        System.out.println(bank);
        
        System.out.println();
        System.out.print("Enter a deposit value: ");
        double depositValue = sc.nextDouble();
        bank.deposit(depositValue);
        System.out.println("Updated account data:");
        System.out.println(bank);
        
        System.out.println();
        System.out.print("Enter a withdraw value: ");
        double withdrawValue = sc.nextDouble();
        bank.withdraw(withdrawValue);
        System.out.println("Updated account data:");
        System.out.println(bank);
        
        
        
        sc.close();

	}

}
