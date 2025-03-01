package yourworkhere;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ledger {
	private Map<String, Account> accounts = new HashMap<String, Account>();
	private static final Ledger instance = new Ledger();
	
	private Ledger() {};
	
	public static Ledger getInstance() {
		return instance;
	}
	
	public Boolean store(Account account) {
		return this.accounts.put(account.getAccountID(), account) == null ? true : false;
	}
	
	public Account retrieve(String id) {
		return this.accounts.get(id);
	}
	
	public Account createAccount(String type, String firstName, String lastName) {
		if (type == "checking") {
			CheckingAccount ca = new CheckingAccount();
			ca.setAccountID(this.getNextAccountID());
			ca.setAccountType(type);
			ca.setFirstName(firstName);
			ca.setLastName(lastName);
			this.store(ca);
			return ca;
		} else if (type == "savings") {
			SavingsAccount sa = new SavingsAccount();
			sa.setAccountID(this.getNextAccountID());
			sa.setAccountType(type);
			sa.setFirstName(firstName);
			sa.setLastName(lastName);
			this.store(sa);
			return sa;
		} else {
			return null;
		}
	}
	
	public String getNextAccountID() {
		return String.valueOf(this.accounts.size() + 1);
	}
	
	public List<Account> getAllAccounts() {
		List<Account> list = new ArrayList<Account>(this.accounts.values());
		return list;
	}
	
	
}
