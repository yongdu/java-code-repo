package Independency;

public class Book {
	
	
	//Attribute
	private String title;
	private String number;
	
	
	//Constructor
	public Book() {}
	
	public Book(String title, String number) {
		this.title= title;
		this.number= number;
	}
	
	//Getters and Setters
	public String getTilte() {return title;}
	public String getNumber() {return number;}
	public void setTitle(String title) {this.title= title;}
	public void setNumber(String number) {this.number= number;}
	
	
}
