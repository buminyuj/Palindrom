package PalindromOdev;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		char s;
		char q;
		int eslik=0;
		boolean kosul=false;
		do {
		Scanner word=new Scanner(System.in);
		System.out.println("Enter a Word: ");
		String palindrom= word.nextLine();
		String palindromQ=palindrom;
		StackP stack= new StackP(palindrom.length());
		for(int p=0;p<palindrom.length();p++) {
			stack.push(palindrom.charAt(p));
		}
		
		QueueP queue=new QueueP(palindromQ.length());
		
		for(int t=0;t<palindromQ.length();t++) {
			queue.enQueue(palindromQ.charAt(t));
		}
		
		stack.print();
		System.out.print("------------------");
		System.out.println();
		queue.printQ();
		System.out.print("------------------");
		System.out.println();
		for(int z=0;z<palindrom.length();z++) {
			s=stack.pop(palindrom.charAt(z));
			q=queue.deQueue(palindromQ.charAt(z));
			if(s==q) {
				eslik++;
			}
		}
		if(eslik==palindrom.length()) {
			System.out.println("Girdiginiz deger palindromdur !!! ");
		}
		else {
			System.out.println("Girdiginiz deger palindrom degildir !!! ");
		}
		
		System.out.println();
		Scanner scan=new Scanner(System.in);
		System.out.println("**********DEVAM ETMEK ISTIYOR MUSUNUNUZ?(E/H)********** : ");
		String cevap= scan.nextLine();
		String cevapUpper=cevap.toUpperCase();
		if(cevapUpper.equals("E")) {
			kosul=true;
			//stack.reset();
			//queue.reserQ();	
			eslik=0;
		}
		else if(cevapUpper.equals("H"))
			kosul=false;
		else {
			System.out.println(" !!!! Gecersiz bir cevap verdiniz !!!! ");
			kosul=false;
		}
		
	}while(kosul==true);
		}

}
