
package Controller;

import Model.Manager;
import View.Menu;



public class ManagerMenu extends Menu<String> {

  private static String[] mc = {"Normal Calculator", "BMI Calculator","Exit"};

    public  ManagerMenu() {
        super("\n MAIN MENU", mc);
    }

    public void execute(int n) {
        Manager manager = new Manager();
        switch (n) {
            case 1:
                    manager.normalCalculator();
                    break;
                case 2:
                    manager.BMICalculator();
                    break;
                case 3:
                    return;
        }
    }
}