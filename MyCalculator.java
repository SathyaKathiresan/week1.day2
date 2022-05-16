package week1.day2;

public class MyCalculator {

	public static void main(String[] args) {
		Calculator objCal = new Calculator();
		System.out.println(objCal.add(6, 3, 0));
		System.out.println(objCal.divide(3, 0));
		System.out.println(objCal.sub(9, 12));
		System.out.println(objCal.mul(012.3, 9.8));
	}

}
