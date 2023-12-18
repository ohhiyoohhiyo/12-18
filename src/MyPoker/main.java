package MyPoker;

public class main {

	public static void main(String[] args) {
		DeckOfCard deck = new DeckOfCard();
		
		System.out.println("\n-----before-----");
		deck.displayDeckOfCard();
		deck.shuffle();
		System.out.println("\n-----before-----");
		deck.displayDeckOfCard();
		
		System.out.println("\n-----before-----");
		for (int i = 0; i <53; i++)
		deck.deal();
	}
}
