/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andrew_2
 */
public class DeckTester {
    
	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
                String[] rank={"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
                int[] pointvalue={1,2,3,4,5,6,7,8,9,10,11,12,13};
                String[] suit={"Spades","Hearts","Clubs","Diamonds"};
		Deck testdeck = new Deck(rank,suit,pointvalue);
                System.out.print(testdeck.toString());
	}
}