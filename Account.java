package BasicOopsProject;

import java.util.Scanner;

public class Account implements AccountOpp{
	Scanner sc=new Scanner(System.in);
	private String custName;
	private long accNum;
	private double accBal;
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public long getAccNum() {
		return accNum;
	}
	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}
	public double getAccBal() {
		return accBal;
	}
	public void setAccBal(double accBal) {
		this.accBal = accBal;
	}
	@Override
	public void createAcc() {
		System.out.println("Enter custName,accBal,accNum");
		this.custName=sc.next();
		this.accBal=sc.nextDouble();
		this.accNum=sc.nextLong();
		System.out.println("Account Is created\n");
	}

	@Override
	public void Balance() {
		System.out.println("Account Balance :"+getAccBal()+"\n");
	}

	@Override
	public void Withdraw() {
		System.out.println("Enter Withdrow Amount");
		double amount=sc.nextDouble();
		if(amount<accBal) {
			accBal-=amount;
			System.out.println("Withdraw Succesfull\n");
		}else {
			try {
			throw new InsufficientBalanceException("Insufficient Balance");
			}catch(Exception e) {
				System.err.println(e.getMessage()+"\n");
			}
		}
	}

	@Override
	public void Deposite() {
		System.out.println("Enter Deposite Amount");
		double amount=sc.nextDouble();
		accBal+=amount;
		System.out.println("Deposited Succesfull\n");
	}
}
