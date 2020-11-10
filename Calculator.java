class Claculator{
	public static void add(){
	int a=10;
	int b=100;
	int sum=0;
	sum=a+b;
	System.out.println("Sum of 2 num is"+sum);
	}
	public static void sub(){
	int a=12;
	int b=10;
	int dif=0;
	dif=a-b;
	System.out.println("dif of 2  num is" +dif);
	}
	public static void mul(){
	int a=12;
	int b=10;
	int product=0;
	product=a*b;
	System.out.println("product of 2  num is" +product);
	}
	public static void div(){
	int a=20;
	int b=5;
	int q=0;
	q=a/b;
	System.out.println("division of 2  num is" +q);
	}
	public static void main(String args[]){
	Claculator.add();
	Claculator.sub();
	Claculator.mul();
	Claculator.div();
}
}