package myfirstpackage;
public class MySecondClass{
 	private int a;
 	private int b;

 	public int sum(){
		return 	a + b;
	}
	
	public MySecondClass(int a, int b){
		this.a = a;
		this.b = b;
	}

	public int getA(){
		return a;
	}

	public int getB(){
		return b;
	}

	public void setA(int a){
		this.a=a;
	}

	public void setB(int b){
		this.b=b;
	}

}