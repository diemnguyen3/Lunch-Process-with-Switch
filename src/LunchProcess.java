import java.util.Scanner;


public class LunchProcess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int answer1;
		int answer2;
		
		Scanner input = new Scanner (System.in);
		System.out.println ("Hungry");
		System.out.println ("Get in line");
		System.out.println ("Buy lunch");
		System.out.println ("Are you thirsty? Enter 1 for Yes and 0 for No");
		answer1=input.nextInt();
		
		switch (answer1) {
		case 1: System.out.println("Did you have breakfast? Enter 1 for Yes and 0 for No");
			answer2=input.nextInt();
			switch (answer2) {
			case 1: System.out.println ("Buy diet coke");break;
			case 0: System.out.println ("Buy coke");break;
			}
		break;
		case 0: System.out.println ("Get water");break;
		}
		
		
		System.out.println ("Eat lunch");
		System.out.println ("Return tray");
		System.out.println ("Leave");
		
	}

}
