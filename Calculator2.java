class Claculator2{
	public static int add(){
  	int a=10;
	int b=20;
	int sum=0;
	sum=a+b;
	System.out.println("addation of 2 num is"+sum);
	return sum;
	}
	public static int sub(){
  	int a=200;
	int b=20;
	int dif=0;
	dif=a-b;
	System.out.println("sub of 2 num is"+dif);
	return dif;
	}
	public static int mul(){
  	int a=200;
	int b=20;
	int pdct=0;
	pdct=a*b;
	System.out.println("mul of 2 num is"+pdct);
	return pdct;
	}
	public static double div(){
  	double a=201;
	double b=20;
	double q=0;
	q=a/b;
	System.out.println("div of 2 num is"+q);
	return q;
	}
	public static void main(String args[]){
	int sum=Claculator2.add();
	int dif=Claculator2.sub();
	int pdct=Claculator2.mul();
	double q=Claculator2.div();	
} 

}