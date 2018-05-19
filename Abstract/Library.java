package Abstract;

public abstract class Library {
	

	public abstract void display();
	

	public static void main(String args[]) {
		Library lib = new Book();
		lib.display();
		
		Library Au = new Author();
		Au.display();
		
		
	}


}

