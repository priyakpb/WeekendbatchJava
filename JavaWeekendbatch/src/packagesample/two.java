package packagesample;

public class two extends one {

	@Override
	void method() {
		System.out.println("Print here");
		
	}

	
	public static void main(String[] args) {
	
		two obj =new two();
		obj.method();
		
	}
}
