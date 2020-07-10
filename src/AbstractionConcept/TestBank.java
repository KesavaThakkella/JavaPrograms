package AbstractionConcept;

public class TestBank {

	public static void main(String[] args) {

		HDFCBank hb = new HDFCBank();
		hb.loan();
		hb.credit();
		hb.debit();
		hb.hdfcfunds();

		// Creating object reference to HDFCBank class which can be referred by
		// Bank class this is called as dynamic Polymarphism

		Bank b = new HDFCBank();
		b.loan();
		b.credit();
		b.debit();
		// b.hdfcfunds(); if we try to access this using HDFC bank object
		// reference which is referred by bank it is not possible to access this
		// method. but in above using HDFC bank object reference we can access
		// this method because this the property of its own HDFC and which is
		// referred by its bank itself

	}

}
