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
                String[] rank;
                rank = new String[13];
                rank[0]="Ace";
                rank[1]="2";
                rank[2]="3";
                rank[3]="4";
                rank[4]="5";
                rank[5]="6";
                rank[6]="7";
                rank[7]="8";
                rank[8]="9";
                rank[9]="10";
                rank[10]="Jack";
                rank[11]="Queen";
                rank[12]="King";
                int[] pointvalue;
                pointvalue = new int[13];
                pointvalue[0]=1;
                pointvalue[1]=2;
                pointvalue[2]=3;
                pointvalue[3]=4;
                pointvalue[4]=5;
                pointvalue[5]=6;
                pointvalue[6]=7;
                pointvalue[7]=8;
                pointvalue[8]=9;
                pointvalue[9]=10;
                pointvalue[10]=11;
                pointvalue[11]=12;
                pointvalue[12]=13;
                String[] suit;
                suit = new String[4];
                suit[0]="Spades";
                suit[1]="Hearts";
                suit[2]="Clubs";
                suit[3]="Diamonds";
		Deck testdeck = new Deck(rank,suit,pointvalue);
	}
}