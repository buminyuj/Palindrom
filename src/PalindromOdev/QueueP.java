package PalindromOdev;

public class QueueP {
	char x;
	int front;
	int rear; 
	char[] values;
	int boyut;
	QueueP(int sizeParametre){
		this.boyut=sizeParametre;
		values=new char[this.boyut];
		front=rear=-1;	
	}
	
	void enQueue(char data) {
		if(isFullQ())
			System.out.println("Kuyruk dolu ! ");
		else {
			rear++;
			values[rear]=data;
		}
	}
	
	void printQ() {
		if(isEmptyQ()) {
			System.out.println("Kuyruk boş! ");
		}
		else {
			System.out.print(" QUEUE YAPISI ");
			System.out.println();
			for(int j=front+1;j<=this.rear;j++) {
				System.out.print(values[j]);
				System.out.println();
			}
		}
			
	}
	
	char deQueue(char b) {
		if(isEmptyQ()) {
			System.out.println("Kuyruk Boş !!");
			return x;
		}
		else {
			front++;
			return this.values[front];
		}
	}
	boolean isEmptyQ() {
		if(this.rear==this.front) {
			return true;
		}
		else 
			return false;
	}
	
	boolean isFullQ() {
		if(this.rear==boyut-1) {
			return true;
		}
		else 
			return false;
		
	}
}
