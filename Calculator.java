package week1.day2;

public class Calculator {

	public int add(int num1, int num2, int num3)
	{
		int sum = num1+num2+num3;
		return sum;
	}

	public int sub(int num1, int num2)
	{
		int diff = num1-num2;
		return diff;
	}

	public double mul(double num1, double num2)
	{
		double output = num1*num2;
		return output;
	}

	public float divide(float num1, float num2)
	{
		float output = num1/num2;
		return output;
	}
	public static void main(String[] args) {

		Calculator objCal = new Calculator();
		System.out.println(objCal.add(2, 3, 4));
		System.out.println(objCal.sub(6, 3));
		System.out.println(objCal.mul(2.23, 3));
		System.out.println(objCal.divide(65, 3));
	}

}
