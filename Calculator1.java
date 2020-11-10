class Claculator1{
	public static void add(int a,int b){
	int sum=0;
	sum=a+b;
	System.out.println("sum of 2 num is"+sum);
	}
	public static void sub(int a,int b){
	int dif=0;
	dif=a-b;
	System.out.println("dif of 2 num is"+dif);
	}
	public static void mul(int a,int b){
	int mul=0;
	mul=a*b;
	System.out.println("mul of 2 num is"+mul);
	}
	public static void div(double a,double b){
	double q=0;
	q=a/b;
	System.out.println("div of 2 num is"+q);
	}
	public static void main(String args[]){
	int a=400;
 	int b=200;
	Claculator1.add(a,b);
	Claculator1.sub(a,b);
	Claculator1.mul(22,33);
	Claculator1.div(155,23);
	}
}