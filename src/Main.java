import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // add comment
        // добавил код

        Stack<String> stack = new Stack<>();
        while(true) {
            String str = in.nextLine();
            String[] result = str.split(" ");
            switch (result[0]) {
                case "push":
                    stack.push(result[1]);
                    System.out.println("ok");
                    continue;
                case "pop":
                    System.out.println(stack.pop());
                    continue;
                case "back":
                    System.out.println(stack.peek());
                    continue;
                case "size":
                    System.out.println(stack.size());
                    continue;
                case "clear":
                    stack.clear();
                    System.out.println("ok");
                    continue;
                case "exit":
                    System.out.println("bye");
                    System.exit(0);
            }
        }

    }
}