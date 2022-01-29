package Day4;

public class SplitCommand {

    public static void main(String[] args) {
        //create a single string
        String statement = "My name is John";
        //declare string array to split the message to print out only John
        String[] arrayMessage = statement.split( " ");

        //print out John
        System.out.println("result is " + arrayMessage[3]);
    }
}
