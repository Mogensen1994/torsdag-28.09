import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

   	System.out.println("Please type your name:");

	Scanner scanner = new Scanner(System.in);
   	String userName = scanner.nextLine();

   	System.out.println("Hello, " + userName + "! please type you age?");
   	int age = scanner.nextInt();
   	System.out.println(age);
   	int retirement =69;
   	int yearsuntilretirement = retirement - age;
   System.out.println(" you are going work "+yearsuntilretirement+"years more for retirement");
}
}