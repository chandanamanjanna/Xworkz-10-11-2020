class Claculator3{
	public static int add(int a,int b){
	int sum=0;
	sum=a+b;
	return sum;
	}
	public static double sub(double a,double b){
	double dif=0;
	dif=a-b;
	return dif;
	}
	public static int mul(int a,int b){
	int pdct=0;
	pdct=a*b;
	return pdct;
	}
	public static double div(double a,double b){
	double q=0;
	q=a/b;
	return q;
	}
	public static void main(String args[]){
	int sum=Claculator3.add(22,33);
	double dif=Claculator3.sub(45.6,23.4);
	int pdct=Claculator3.mul(56,98);
	double q=Claculator3.div(98,5);
	System.out.println("sum of 2 num is"+sum);
	System.out.println("dif of 3 num is"+dif);
	System.out.println("mul os 2 num is"+pdct);
	System.out.println("div of 2 num is"+q);
}

}