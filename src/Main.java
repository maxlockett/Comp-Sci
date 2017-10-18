import java.util.Scanner;
import java.util.concurrent.TimeUnit;

@SuppressWarnings("InfiniteLoopStatement")

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Scanner sc = new Scanner(System.in);
        Selections section = new Selections();
        Logic logicEval = new Logic();
        Information info = new Information();

        while (true) {
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

            int infoNum = logicEval.infoNum(mainSec, subSec);
            System.out.println("Thank you! Your data is coming right up!");

            TimeUnit.MILLISECONDS.sleep(750);
            System.out.println();
            System.out.println("Beep-Boop-Beep-Boop-Beep-Boop");
            TimeUnit.MILLISECONDS.sleep(750);
            System.out.println();

            logicEval.returnInfo(infoNum);

            System.out.println();
            System.out.println("Press enter to start over...");
            sc.nextLine();
        }
    }
}