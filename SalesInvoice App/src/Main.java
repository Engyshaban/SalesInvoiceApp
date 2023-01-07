
import view.View;

import controller.ControllerInv;
public class Main {
    public static void main(String[] args) throws InterruptedException {

        View view = new View();

        ControllerInv CtrlInv = new ControllerInv(view);

        view.runUI();

    }
}
