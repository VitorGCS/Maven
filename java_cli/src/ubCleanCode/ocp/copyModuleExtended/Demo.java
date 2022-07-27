package ubCleanCode.ocp.copyModuleExtended;

import ubCleanCode.ocp.copyModule.Copy;

public class Demo {
    public static void main(String [] args){
        System.out.println("Using my Keyboard !!!!");
        keyboard key = new keyboard();
        System.out.println("Using my Printer !!!!");
        Printer print = new Printer();

        Copy cop = new Copy();
        // I inject the concrete classes in the abstract class and add a new behaviour to that class
        cop.copy(key, print);
    }
}

