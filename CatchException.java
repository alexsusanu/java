public class CatchException {
    public static void main(String[] args){
        int a = 3;
        int b = 0;

        try {
            int c = a / b;    
        }
        catch (ArithmeticException e){
            System.out.println("cant divide by zero");
        }
    }
}
