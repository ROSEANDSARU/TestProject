package example;

public class InterfaceImplementtest implements TestInterface1,TestInterface2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceImplementtest obj = new InterfaceImplementtest();
		obj.m1();
		System.out.println(TestInterface1.a);
		TestInterface1.m2();
	}

	@Override
	public
	 void m1() {
		// TODO Auto-generated method stub
		System.out.println(111+"hello"+111);
	}
	
	

}
