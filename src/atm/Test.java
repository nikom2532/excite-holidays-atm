package atm;

import java.util.Scanner;

public class Test {
	
	static long money = 10000;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("*******************************");
		System.out.println("*\t Welcome to ATM \t*");
		System.out.println("*******************************\n");
		
		System.out.println("You have: " + money + " Dolar\n");
		
		System.out.println("1. deposit");
		System.out.println("2. withdraw\n\n");
		System.out.println("3. Exit\n\n");
		System.out.print("please choose the choice: ");
		
		int i = sc.nextInt();
		
			
		Atm obj = new Atm(money);
		
		if(i == 1){
			System.out.print("How many money do you want to deposit: ");
			int deposit_money = sc.nextInt();
			
			if(obj.checkMoney(deposit_money)){
				obj.deposit(deposit_money);
			}
			else{
				System.out.print("Cannot deposit. There are only 20 Note, and 50 Note");
			}
			
		}
		else if(i == 2){
			System.out.print("How many money do you want to withdraw: ");
			int withdraw_money = sc.nextInt();
			
			if(obj.checkMoney(withdraw_money)){
				obj.deposit(withdraw_money);
			}
			else{
				System.out.print("Cannot deposit. There are only 20 Note, and 50 Note");
			}
		}
		else{
			System.out.println("You choose incorrect choice\nExit.");
		}
		
		
		
	}
}
