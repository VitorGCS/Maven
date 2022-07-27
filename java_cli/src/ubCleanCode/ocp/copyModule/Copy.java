package ubCleanCode.ocp.copyModule;

// I close this class with abstractions Reader and Writer
public class Copy {
    public void copy(Reader reader, Writer writer){
        int c;
        while((c = reader.getchar()) != 'x' ){ //'x' means EOF
            writer.putchar(c);
        }
    }
}