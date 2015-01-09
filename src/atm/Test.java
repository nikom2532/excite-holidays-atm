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
			System.out.print("How many $20 Note money do you want to deposit: ");
			int deposit_20money = sc.nextInt();
			
			System.out.print("How many $50 Note money do you want to deposit: ");
			int deposit_50money = sc.nextInt();
			
			int deposit_money = (deposit_20money * 20) + (deposit_50money * 50);
			
			obj.deposit(deposit_money);
			
			System.out.print("Now you have $" + obj.getMoney());
		}
		else if(i == 2){
			System.out.print("How many money do you want to withdraw: ");
			int withdraw_money = sc.nextInt();
			
			if(obj.checkMoney(withdraw_money)){
				
				if(money >= withdraw_money){
					int a[] = obj.withdraw(withdraw_money);
					System.out.print("\n\nYou get Note 20$ for " + a[0] + " note");
					System.out.print("You get Note 50$ for " + a[1] + " note\n");
					
					System.out.print("Now you have $" + obj.getMoney());
				}
				else{
					System.out.print("There are only " + money + " Dollar to deposit. Cannot withdraw");
				}
				
			}
			else{
				System.out.print("Cannot deposit. There are only 20 Note, and 50 Note");
			}
		}
		else if(i == 2){
			System.out.println("Thank you for using our ATM. Good Bye.");
		}
		else{
			System.out.println("You choose incorrect choice\nExit.");
		}
		
		
		
	}
}
