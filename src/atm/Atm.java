package atm;

public class Atm {
	
	private long money = 0;
	
	public Atm(long cash){
		this.setMoney(cash);
	}
	
	public int deposit(int deposit_money){
		return 0;
	}
	
	public int withdraw(int withdraw_money){
		return 0;
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
