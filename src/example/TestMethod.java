package example;

public class TestMethod {
	
	static{
		System.out.println("static block");
	}
	
	static int i=100;
	 static void staticMethod()
	{
		
	System.out.println("static method");	
		
	}
	 
	 void nonStaticMethod(){
		 
		 System.out.println("non static");
	 }
	 TestMethod(){
		 System.out.println("constuctor");
		 
	 }
	 
	 public static void main(String args[]){
		 
		 /*TestMethod testmethod = new TestMethod(); 
		 testmethod.nonStaticMethod();
		 staticMethod();*/
		 System.out.println(TestMethod.i);
		 
	 }

}
