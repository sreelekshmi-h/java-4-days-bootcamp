package proj;
import java.util.Scanner;
public class task1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name:");
		String name=sc.nextLine();
		System.out.println("Enter age:");
		int age=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter yor college:");
		String college=sc.nextLine();
		System.out.printf("My name is %s.I am %d years old.I study at %s",name,age,college);
		
		sc.close();
	}

}
