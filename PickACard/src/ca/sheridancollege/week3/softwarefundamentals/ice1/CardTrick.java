/*Name: Terry Peterratnaraj
    SN:991464285
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author dancye
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        
        Random rand = new Random(); 
        Scanner sc = new Scanner(System.in);
        int inputValue;
        String inputSuit;
        
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue(rand.nextInt(13)+1);
            c.setSuit(Card.SUITS[rand.nextInt(3)]);
            magicHand[i]=c;
            System.out.println(c.getValue());
            System.out.println(c.getSuit());
        }
        
        //insert code to ask the user for Card value and suit, create their card
        System.out.println("Please insert Card value: ");
        inputValue = sc.nextInt();
        sc.nextLine();
        System.out.println("Please insert Card suit: ");
        inputSuit = sc.nextLine();
        
        System.out.println("Your Card is: " + inputValue+ " " + inputSuit);
        // and search magicHand here
        for(Card c: magicHand){
            if(inputSuit.equals(c.getSuit()))
            {
                if(inputValue == c.getValue()){
                  //Then report the result here
                  System.out.println("Your value and suit matched " + c.getValue() + " " + c.getSuit());
                }
            }
            else{
                System.out.println("Your value and suit did not match.");
            }
        }   
    }
    
}
