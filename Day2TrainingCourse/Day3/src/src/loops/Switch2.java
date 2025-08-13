package src.loops;

public class Switch2 {

	public static void main(String[] args) {
		
		int dayOfWeek = 6;
		
		if (dayOfWeek == 1 ) {
			System.out.println("Its a weekday");
		} else if (dayOfWeek == 2 ) {
			System.out.println("Its a weekday");
		}else if (dayOfWeek == 6 ) {
			System.out.println("Its a weekend");
		}else if (dayOfWeek == 6 ) {
			System.out.println("Its a weekend");
		} else {
			System.out.println("not a valid number use 1-7");
		}
		
		switch (dayOfWeek) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("Its a weekday");
			break;
		case 6: 
		case 7:
			System.out.println("Its a weekend");
			break;
		default:
			System.out.println("wrong number use 1-7");
		} 

	}

}
