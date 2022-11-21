package BasicOopsProject;

import java.util.Scanner;

public class AtmInterface {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		AccountOpp account=new Account();
		System.out.println("ATM INTERFACE\n--- ---------");
		while(true) {
			System.out.println("1.create Acc\n2.Balance\n3.Deposite\n4.Withdraw\n5.Exit\nenter Choice");
			int choice=sc.nextInt();
			switch(choice) {
			case 1: account.createAcc();
			break;
			case 2:account.Balance();
			break;
			case 3:account.Deposite();
			break;
			case 4:account.Withdraw();
			break;
			case 5:System.out.println("Thank You");
			System.exit(0);
			default:
				System.out.println("Invalid Choice");
			}
		}
	}
}