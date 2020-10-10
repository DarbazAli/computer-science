public class CLI_Argument {
    public static void main(String[] args) {
        System.out.print("Hi, ");
        System.out.print(args[0]);
        System.out.print(" ");
        System.out.print(args[1]);
        System.out.println(". How are you?");
    }
}

// terminal
// javac CLI_Argument.java
// java CLI_Argument Bob Smith
// Hi, Bob Smith. How are you? -> output message
