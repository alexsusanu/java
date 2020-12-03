import java.util.*;

public class GetValidInteger{
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        System.out.println("Enter an integer: ");
        int i = GetInteger();
        System.out.println("you entered: " + i);

    }

    public static int GetInteger(){
        while (true){
            try {
                return scanner.nextInt();
            }
            catch (InputMismatchException e) {
                scanner.next();
                System.out.println("Thats not an int. Try again: ");
            }
        }
    }
}
