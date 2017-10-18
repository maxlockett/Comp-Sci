import java.util.Scanner;

class Selections {
    private Scanner sc = new Scanner(System.in);

    int mainSel() {
        int section;
        while (true) try {
            String sectionRaw = sc.nextLine();
            section = Integer.parseInt(sectionRaw);
            if (section < 1 || section > 4) {
                throw new ArithmeticException();
            }
            break;
        } catch (Exception e) {
            //System.out.println();
            System.out.print("Please enter a number between 1 and 4: ");
        }
        return section;
    }

    void subSection(int mainSec) {
        if (mainSec == 1) {
            FuncLists.oneSub();
        } else if (mainSec == 2) {
            FuncLists.twoSub();
        } else if (mainSec == 3) {
            FuncLists.threeSub();
        } else if (mainSec == 4) {
            FuncLists.jokes();
        }
    }
}
