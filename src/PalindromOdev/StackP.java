package PalindromOdev;

public class StackP {
	int size;
	int top;
	char [] veriler;
	char r;
	StackP(int sizeP) {
		this.size=sizeP;
		this.top=-1;
		veriler=new char[size];
	}
	
	void push(char data) {
		if(isFull()) {
			System.out.println("Stack dolu!");
		}
		else {
			this.top++;
			this.veriler[this.top]=data;
		}
	}
	
	char pop(char c)
	{
		if(isEmpty() ) {
			System.out.println("Stack Boş!");
			return r ;
		}
		else {
			this.top=this.top-1;
			return this.veriler[this.top+1];
		}
	}
	
	void print() {
		if(isEmpty()) {
			System.out.println("Stack Bos!");
		}
		else {
			System.out.print(" STACK YAPISI ");
			System.out.println();
			for(int i=this.top;i>-1;i--) {
				System.out.print(veriler[i]);
				System.out.println();
			}
		}	
	}
	
	boolean isFull() {
		if(this.top==(this.size-1))
			return true;
		else 
			return false;
		
	}
	
	boolean isEmpty() {
		if(this.top==-1) 
			return true;
		else 
			return false;
	}

}
