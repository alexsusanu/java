public class EnumExample {
    public enum CardSuit {HEARTS, SPADES, CLUBS, DIAMONDS}

    public static void main(String[] args){
        CardSuit suit;
        suit = CardSuit.HEARTS;
        System.out.println(suit);

    for (CardSuit s : CardSuit.values()){
        System.out.println(s);
        }
    }
}
