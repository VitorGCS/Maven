package ubCleanCode.ocp.copyModuleExtended;

import ubCleanCode.ocp.copyModule.Reader;

//I extend the behaviour of the application (Copy program) by converting the abstraction in concrete classes
public class keyboard implements Reader {
    public char getchar(){
        System.out.println("Inside getchar() Reader ");
        return 'x';
    }
}