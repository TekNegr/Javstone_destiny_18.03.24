package ressources;
import java.util.ArrayList;
public class Hand {
 // instance variables
 protected int handSize;
 protected Card[] hand;

 // constructor
 public Hand(int size) {
     handSize = size;
     hand = new Card[handSize];
 }

 // methods
 public void addCard(Card card) {
    for(int i=0;i<handSize;i++) {
        if (hand[i] == null){
            hand[handSize] = card;
        }
    }

 }

 public void removeCard(int position) {
    if(position<0 ||  position>=handSize) throw new IndexOutOfBoundsException();
    else hand[position]=null;
 }

 public void removeCardbyObject(Card card){
    for(int i=0;i<this.handSize;i++){
        if(this.hand[i].equals(card)){
            this.hand[i] = null;
            break;
        }
        else{
            throw new IndexOutOfBoundsException();
        }
    }
}

 public Card getCard(int position) {
    return hand[position];
 }

 public void giveCard(Hand otherHand, int position) {
    if(position<0 ||  position>=handSize) throw new IndexOutOfBoundsException();
    else{
        otherHand.addCard(getCard(position));
        removeCard(position);
    }
 }

 public int getHandSize() {
     return handSize;
 }

public void placeCard(Slot pSlot, int position){
    hand[position].placeCard(pSlot);
    removeCard(position);
}


}
