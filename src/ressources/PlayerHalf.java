package ressources;

public class PlayerHalf {
    private String Username;
    private int max_MP;
    private Hand playerHand;
    private Slot You_Slot;
    private Slot[] Event_Slots;
    private Slot[] Persons_Field;


    // CONSTRUCTOR
    public PlayerHalf(String Username){
        this.max_MP = 5;
        this.Username = Username;
        this.You_Slot = new Slot(true, "You");
        this.Event_Slots = new Slot[3];
        for(int i=0;i<3;i++){
            this.Event_Slots[i] = new Slot(true, "Event");
        }
        this.Persons_Field = new Slot[10];
        for(int i=0;i<3;i++){
            this.Persons_Field[i] = new Slot(false, "Person");
        }
    }

    // GETTERS & SETTERS
    public String getUsername( ){ return this.Username;}

    public void setYouCard(MajorArcanaCard You_Card){
        You_Card.setHealthTo(50);
        You_Card.setCost(0);
        this.You_Slot.addCard(You_Card);
    }

    public void addToHand(Card card){
        this.playerHand.addCard(card);
    }


    public Card getYouCard(){
        return You_Slot.getCard();
    }


    public void logPlayer(){
        System.out.println("Player :"+ this.Username + "\n");
        System.out.println("You:");
        this.You_Slot.getCard().logCard();
        System.out.println("\n");
        System.out.println("Event: \n");
        for(int i=0;i<3;i++){
            this.Event_Slots[i].getCard().logCard();
            System.out.println("\n");
        }
        System.out.println("\n");
        System.out.println("\n");
        for(int i=0;i<10;i++){
            this.Persons_Field[i].getCard().logCard();
            System.out.println("\n");
        }

    }
}
