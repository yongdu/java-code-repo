package Independency;
import Independency.Book;
import Independency.IsbnGenerator;
import Independency.NumberGenerator;

public class BookService {

	//Attribute
	//private IsbnGenerator isbn = new IsbnGenerator();
	
	private NumberGenerator generator;
	
	//constructor
	public BookService(NumberGenerator generator) {
		this.generator = generator;
	}
	
	//Business method
	public Book createBook(String title) {
		return new Book(title,generator.generateNumber());
	}
	
}
