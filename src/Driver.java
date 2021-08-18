public class Driver {

	public static void main(String[] args) {

		ArrayStack object1 = new ArrayStack();
		LinkedStack object2 = new LinkedStack();
		
		//ArrayStack
		object1.push(1);
		object1.push(7);
		object1.push(3);
		object1.push(4);
		object1.push(9);
		object1.push(2);
	
		System.out.println("Pushed " + object1.size() + " ints to ArrayStack");
		
		System.out.println("First pop:  " + object1.pop());
		System.out.println("Second pop: " + object1.pop());
		System.out.println("Third pop:  " + object1.pop());
		System.out.println("Fourth pop: " + object1.pop());
		System.out.println("Fifth pop:  " + object1.pop());
		System.out.println("Sixth pop:  " + object1.pop());
		System.out.println("");
		
		//LinkedStack
		object2.push(1);
		object2.push(7);
		object2.push(3);
		object2.push(4);
		object2.push(9);
		object2.push(2);
	
		System.out.println("Pushed " + object2.size() + " ints to LinkedStack");
		
		System.out.println("First pop:  " + object2.pop());
		System.out.println("Second pop: " + object2.pop());
		System.out.println("Third pop:  " + object2.pop());
		System.out.println("Fourth pop: " + object2.pop());
		System.out.println("Fifth pop:  " + object2.pop());
		System.out.println("Sixth pop:  " + object2.pop());
		
		
	}

}
