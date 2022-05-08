package Lambda_demo;

interface Addable_demo {

    int add(int a,int b);


public class LambdaEx1 {

	public static void main(String[] args) {
		// multiple parameters in lambda expression
		Addable_demo ad1=(a,b)->(a+b);  
	    System.out.println("Add: " +ad1.add(5,10));
	    
	    //multiple parameters with datatype in lambda expression
	    Addable_demo ad2=(int a,int b)->(a+b);  
	    System.out.println("Add: " +ad2.add(10,20));

	}

}
}

//Lambda expressions basically express instances of functional interfaces 
//(An interface with single abstract method is called functional interface.
