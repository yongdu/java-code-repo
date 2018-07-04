package yong.du.keep.learning;
// stack generic class declaration
import java.util.ArrayList;
public class Stack<T> {

	private final ArrayList <T> elements; // Array list to store elements
	
	// no-argument constructor create a stack of default size
	public Stack() {
		this(10);// defualt stack size
	}
	// construcor creates a stack of the specified number of elements
	public Stack(int capacity) {
		int initCapacity = capacity > 0 ? capacity:10;
		elements = new ArrayList<T>(initCapacity); // create Arraylist
	}
	
	// push element onto stack
	public void push(T pushValue) {
		elements.add(pushValue);
	}
	
	// return the top element if not empty, else throw EmptyStackException
	public T pop() throws EmptyStackException {
		if(elements.isEmpty()) throw new EmptyStackException("Stack is empty, cannot pop");
		
		//remove and return the top element of the stack
		return elements.remove(elements.size()-1);
	}
}
