public class Bank{
    private int balance;

    public Bank(int balance){
        this.balance = balance;
    }

    public Bank(){
        this(0); // balance = 0; OR this.balance = 0;
    }

    public int getBalance(){
        return balance;
    }

    public static void main(String[] args){
        Bank x = new Bank();
        System.out.println("balance is: " + x.getBalance());

        Bank y = new Bank(90);
        System.out.println("balance is: " + y.getBalance());
    }
}
