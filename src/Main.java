import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Hello! What is your name? Please enter below:");
        String name = sc.nextLine();
        System.out.println("Good afternoon " + name + "! It's really nice to meet you!");
        System.out.println("My name is LJM\u00B2, I am the future of personal computing.");

    }

    public static void funcList() {
        System.out.println("1. First Generation Hardware");
        System.out.println("    a. Generation Timeframe");
        System.out.println("    b. Major Developments");
        System.out.println("    c. Key Figures");
        System.out.println("    d. Influence on the Future of Computing");

        System.out.println("2. Fourth Generation Hardware");
        System.out.println("    a. Generation Timeframe");
        System.out.println("    b. Major Developments");
        System.out.println("    c. Key Figures");
        System.out.println("    d. Influence on the Future of Computing and Beyond");

        System.out.println("3. Fifth Generation Software");
        System.out.println("    a. Generation Timeframe");
        System.out.println("    b. Major Developments");
        System.out.println("    c. Key Figures");
        System.out.println("    d. The Future of Software");

        System.out.println("4. Jokes");
        System.out.println("    a. Your Mother Jokes");
        System.out.println("    b. Dad Jokes");
        System.out.println("    c. STEM Jokes");
        System.out.println("    d. Knock-Knock Jokes");
    }
}
