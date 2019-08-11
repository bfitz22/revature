package yourworkhere;

import java.util.ArrayList;
import java.util.List;

public class Reporter {
	private Ledger ledger;
	
	public Reporter(Ledger ledger) {
		this.ledger = ledger; 
	}
	
	public int getNumAccounts() {
		return this.ledger.getAllAccounts().size();
	}
	
	public List<Account> getAccountsWithMinimum(int min) {
		List<Account> newList = new ArrayList<Account>();
		List<Account> list = this.ledger.getAllAccounts();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getBalance() >= min) {
				newList.add(list.get(i));
			}
		}
		return newList;
	}
	
	public void printAllAccounts() {
		List<Account> list = this.ledger.getAllAccounts();
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
	
	public void getNumAccountsByType() {
		int savings = 0;
		int checking = 0;
		List<Account> list = this.ledger.getAllAccounts();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getAccountType() == "savings") {
				savings++;
			} else if (list.get(i).getAccountType() == "checking") {
				checking++;
			}
		System.out.println("number of savings accounts: " + savings + 
				"\nnumber of checking accounts: " + checking);
		}
	}
}
