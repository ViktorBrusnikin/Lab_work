class MyFirstClass {
	public static void main(String[] s) {
		MySecondClass obj = new MySecondClass(0,0);
		System.out.println(obj.sum());
		for (int i = 1; i <= 8; i++) {
			for (int j = 1; j <= 8; j++) {
				obj.setA(i);
				obj.setB(j);
				System.out.print(obj.sum());
				System.out.print(" ");
			}
		System.out.println();
		}
	}
}

class MySecondClass{
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