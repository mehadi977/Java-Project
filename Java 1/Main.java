import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner object create
        Scanner sc = new Scanner(System.in);
        
        // Name input
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        
        // Age input
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        
        // Output
        System.out.println("\n--- Your Information ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        
        // Scanner close
        sc.close();
    }
}