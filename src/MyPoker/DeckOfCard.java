package MyPoker;

import java.security.SecureRandom;

public class DeckOfCard {
	SecureRandom random = new SecureRandom();
	String[] faces = { "♠", "♥", "♦", "♣" };

	// String[] face = new String[52];
	// int[] suit = new int[52];
	Card[] card = new Card[52];
	int count;

	DeckOfCard() {
		for (int i = 0; i < card.length; i++) {
			// face[i] = faces[i/13];
			card[i] = new Card(faces[i / 13], (i % 13) + 1);
		}

		count = 0;
	}

	public void shuffle() {
		for (int i = 0; i < card.length; i++) {
			int randNum = random.nextInt(52);

			Card tempFace = card[i];
			card[i] = card[randNum];
			card[randNum] = tempFace;
		}

	}

	public void displayDeckOfCard() {
		for (int i = 0; i < card.length; i++) {
			if (i % 13 == 0)
				System.out.println();
			System.out.print(card[i].face + card[i].suit + "  ");
		}
	}

	public Integer deal() {
		if (count >= 52)
			return null;
		System.out.print(card[count].face + card[count].suit + "  ");
		count++;
		return count;
	}
}