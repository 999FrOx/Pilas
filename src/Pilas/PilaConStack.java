package Pilas;
import java.util.Stack;

public class PilaConStack {
    public void metodo01(){
        Stack<String> stack = new Stack<>();

        stack.push("Juan");
        stack.push("Luis");
        stack.push("Jesus");

        System.out.println("Stack: " + stack);
    }
}
