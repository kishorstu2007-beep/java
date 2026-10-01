package atm;

	 abstract class Atm {
	 abstract void withdraw();
	 abstract void deposite();
	}
	public class Demo extends Atm {
	  void withdraw()
	  {
		  System.out.println("withdraw");
	  }
	  void deposite()
	  {
		  System.out.println("deposite");
	  }
		public static void main(String[] args) {
			Demo ff = new Demo();
			ff.withdraw();
			ff.deposite();
		}
	}


