package day4;

public class TestCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BadCalc badCalc = new BadCalc();
		
		try  {
				badCalc.div(5, 0);	
			} catch (ArithmeticException ae) { 
				System.out.println("arithmetic exception thrown. Don't divide by zero");
				System.out.println(ae);
				ae.printStackTrace();
			}
		System.out.println(badCalc.mult(5, 1));
	}

}
