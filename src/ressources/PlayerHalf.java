package ressources;

public class PlayerHalf {
    private String Username;
    private int MP;
    private int max_MP;
    private Hand playerHand;
    private Slot You_Slot;
    private Slot[] Event_Slots;
    private Slot[] Persons_Field;
    private Game game;


    // CONSTRUCTOR
    public PlayerHalf(String Username, Game game){
        this.game = game;
        this.max_MP = 5;
        this.Username = Username;
        this.playerHand = new Hand(15);
        this.You_Slot = new Slot(true, "You");
        this.Event_Slots = new Slot[3];
        for(int i=0;i<3;i++){
            this.Event_Slots[i] = new Slot(true, "Event");
        }
        this.Persons_Field = new Slot[10];
        for(int i=0;i<6;i++){
            this.Persons_Field[i] = new Slot(false, "Person");
        }
    }

    // GETTERS & SETTERS
    public String getUsername( ){ return this.Username;}

    public Slot[] getPersons_Field(){
        return this.Persons_Field;
    }

    public void placeCard(Slot placemenSlot, int index){
        if (placemenSlot == null){
            this.playerHand.placeCard(placemenSlot, index);
        }
    }

    public Slot[] getEvent_Slots(){
        return this.Event_Slots;
    }

    public void drawFromDeck(){
        this.addToHand(this.game.drawingDeck.drawCard());
    }

    public void updateSlots(Slot upd_You, Slot[] upd_Event, Slot[] upd_Person){
        if(upd_You != this.You_Slot || upd_You != null){
            this.You_Slot = upd_You;
        }
        else if(upd_Event != this.Event_Slots || upd_Event != null){
            this.Event_Slots = upd_Event;
        }
        else if(upd_Person != this.Persons_Field || upd_Person != null){
            this.Persons_Field = upd_Person;
        }
    }
    
    public void setYouCard(MajorArcanaCard You_Card){
        You_Card.setHealthTo(50);
        You_Card.setCost(0);
        this.You_Slot.addCard(You_Card);
    }

    public void addToHand(Card card){
        this.playerHand.addCard(card);
    }

    public void addMaxMP(){this.max_MP ++;}

    public void addMp(int delta){
        while(this.MP < this.max_MP){
            this.MP += delta;
        }
    }

    public void regenMp(){
        this.MP = this.max_MP;
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
