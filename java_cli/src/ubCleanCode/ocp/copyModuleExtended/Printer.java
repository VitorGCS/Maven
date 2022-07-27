package ubCleanCode.ocp.copyModuleExtended;

import ubCleanCode.ocp.copyModule.Writer;

//I extend the behaviour of the application (Copy program) by converting the abstraction in concrete classes
public class Printer implements Writer {
    public void putchar(int c){
        System.out.println("Inside putchar() Writer ");
        System.out.println(c);
    }
}