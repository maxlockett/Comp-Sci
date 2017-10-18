import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Scanner sc = new Scanner(System.in);
        Selections section = new Selections();

        //System.out.println("Hello! What is your name? Please enter below:");
        // String name = sc.nextLine();
        // System.out.println("Good afternoon " + name + "! It's really nice to meet you!");
        //System.out.println("My name is LJM\u00B2, I am the future of personal computing.");
        //System.out.println("Are you ready to take a journey into Computing History and More? Press the enter key to continue...");
        //sc.nextLine();

        FuncLists.funcListTop();

        System.out.print("Please enter the number of your selection, followed by the enter key: ");
        int mainSec = section.mainSel();

        section.subSection(mainSec);

        System.out.println("Thank you. Now, from the above list, please select the subsection you would like to explore,");
        System.out.print("followed by the enter key: ");

        int subSec = section.mainSel();



    }
}