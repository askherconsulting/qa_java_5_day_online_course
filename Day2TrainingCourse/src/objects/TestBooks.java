package objects;

public class TestBooks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book book1 = new Book("Prisoner of Azkaban", "J.K. Rowling", 10);
		Book book2 = new Book("Harry Potter and the Goblet of Fire", "J.K. Rowling", 11);
		Book book3 = new Book("Harry Potter and the Chamber of Secrets", "J.K. Rowling", 13);
		Book[] library = new Book[3];
		
		library[0] = book1;
		library[1] = book2;
		library[2] = book3; 
		
		System.out.println(book1.toString());
		System.out.println("");
		
		System.out.println("The best harry potter book is " + book1.getTitle());
		System.out.println("");
		
		for (int x =0 ; x < library.length; x++) {
			System.out.println(library[x]);
		}
		

	}

}
