package Mypack1;
class Balance {
	String name;
	double bal;
	Balance(String n, double b) {
	name = n;
	bal = b;
	}
	void show() {
	if(bal<0)
	System.out.print("--> ");
	System.out.println(name + ": $" + bal);
	}
}
class AccountBalance {
	public static void main(String args[]) {
	Balance test[] = new Balance[3];
	test[0] = new Balance("Rahul",123.23);
	test[1] = new Balance("Guru",157.02);
	test[2] = new Balance("Akhil",-12.23); 
	for (int i=0 ;i<3;i++)
		test[i].show();
	}
}
