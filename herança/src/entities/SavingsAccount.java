package entities;

public final class SavingsAccount extends Account{
	
	private Double interestRate;
	
	public SavingsAccount() {
		super(); 
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}

	public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}
	
	public void updateBalance() {
		balance += balance * interestRate;
	}
	
	@Override // Sobreposição
	public void withdraw(double amount) {
		balance -= amount;
	}
	
	
}
