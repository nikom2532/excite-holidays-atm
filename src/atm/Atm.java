package atm;

public class Atm {
	
	private long money = 0;
	
	public Atm(long cash){
		this.setMoney(cash);
	}
	
	public void deposit(int deposit_money){
		money += deposit_money;
	}
	
	public int[] withdraw(int withdraw_money){
		
		int note20_count = 0;
		int note50_count = 0;
		
		while(withdraw_money >= 50){
			withdraw_money -= 50;
			note50_count++;
		}
		while(withdraw_money > 0){
			withdraw_money -= 20;
			note20_count++;
		}
		
		money -= withdraw_money;
		
		int note[] = new int[2];
		note[0] = note20_count;
		note[1] = note50_count;
		
		return note;
	}
	
	
	public boolean checkMoney(long cost){
		long note20 = 20;
		long note50 = 50;
		
		if(cost % note20 != 0){
			return false;
		}
		else if(cost % note50 != 0){
			return false;
		}
		else{
			return true;
		}
	}
	
	
	
	public long getMoney() {
		return money;
	}

	public void setMoney(long money) {
		this.money = money;
	}
}
