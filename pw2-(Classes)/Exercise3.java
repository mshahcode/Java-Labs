package pw2;

import java.util.Arrays;

public class Exercise3 {
	public static class MyStack{
	    private int top = -1;
	    private int capacity;
	    private int arr[];
	    public void setCapacity(int capacity) {
	    	arr = new int[capacity];
	    }
	    public int getCapacity() {
	    	return this.capacity;
	    }
	    public int[] getArr() {
	    	return this.arr;
	    }
	    public void push(int i){
	    	top++;
	        arr[top]=i;
	    }
	    public int peek(){
	        return arr[top];
	    }
	    public int pop(){
	    	int removed = arr[top];
	    	top--;
	        return removed;
	        
	    }
	    public boolean isEmpty(){
	        return top==-1;
	    }
	}
	public static void main(String[] args) {
		MyStack stck = new MyStack();
		System.out.println("Stack intitial is empty :  "+stck.isEmpty());
		System.out.println("Setting the capacity of stact to : 4");
		stck.setCapacity(4);
		System.out.println("Adding 5,10,15,16 to array");
		stck.push(5);
		stck.push(10);
		stck.push(15);
		stck.push(16);
		System.out.println("The top of stack after adding 5,10,15,16 is : "+stck.peek());
		System.out.println("The stact whole is : "+Arrays.toString(stck.getArr()));
		System.out.println("Checking now on emptiness of stack : "+stck.isEmpty());
		System.out.println("Popping top element from stack, element is "+ stck.pop());
		System.out.println("Now the top stack is: "+stck.peek());
		System.out.println("Les's add one more and check the top");
		stck.push(20);
		System.out.println("Now the top stack is: "+stck.peek());	
		System.out.println("Checking now on emptiness of stack : "+stck.isEmpty());
		System.out.println("The stact whole is : "+Arrays.toString(stck.getArr()));
	}

}
