package ressources;

public class MinorArcanaCards extends Card{

    //ENUM WITH VALUES
    private enum Suit {
        SWORDS("Swords"), CUPS("Cups"), PENTACLES("Pentacles"), WANDS("Wands");

        private String suitName;
        Suit(String suitName){ 
            this.suitName = suitName;
        }

        public String getSuit(){
            return suitName;
        }


    }

    private enum Value{
        ACE("Ace", 1),
        TWO("Two", 2),
        THREE("Three", 3),
        FOUR("Four", 4),
        FIVE("Five", 5),
        SIX("Six", 6),
        SEVEN("Seven", 7),
        EIGHT("Eight", 8),
        NINE("Nine", 9),
        TEN("Ten", 10),
        PAGE("Page", 11),
        KNIGHT("Knight", 12),
        QUEEN("Queen", 13),
        KING("King", 14);


        private String valueName;
        private int valueNumber;
        Value(String name, int valueNumber){
            this.valueName=name;
            this.valueNumber=valueNumber;
        }

        public int getValue(){
            return valueNumber;
        }


    }

    private Suit suit;
    private Value value;

    //CONSTRUCTOR
    public MinorArcanaCards(String name,  String destiny, int cost, int HP, Suit suit, Value value, boolean isCharacter){
        super(name, destiny, cost, HP, false, isCharacter);
        this.suit = suit;
        this.value = value;

    }


    //CUSTOM METHODS

    ///Populate deck with minor arcanas
    public static MinorArcanaCards[] populateWithMinCards(){
        MinorArcanaCards[] DeckMinCards = new MinorArcanaCards[56];
        for (int i=0; i<56; i++){
            for(Suit suit : Suit.values()){
                for(Value value: Value.values()) {
                    String cardName = value.valueName + " of " +  suit.suitName;
                    String cardDestiny;
                    int cardCost;
                    int HP, DMG;
                    boolean isCharacter;
                    if (value.valueNumber > 10){
                        cardDestiny = "Spawnable of" + suit.suitName;
                        isCharacter = true;
                        cardCost = value.valueNumber -5;
                        HP = setHPMinARc(suit, value);
                        DMG = setDMGMinArc(suit, value);
                    }
                    else{
                        cardDestiny = "Spell of" + suit.suitName;
                        isCharacter = false;
                        cardCost = value.valueNumber;
                        DMG = 0;
                        HP = 0;
                    }
                    DeckMinCards[i] = new MinorArcanaCards(cardName, cardDestiny, cardCost,HP, suit, value, isCharacter);
                }
            }
        }
        return DeckMinCards;
    }


    ///HP setter
    public static int setHPMinARc(Suit suit, Value value){
        int hp = 0;
        switch (value) {
            case KING:
                hp = 15;
                break;

            case QUEEN:
                hp=12;
                break;

            case KNIGHT:
                hp=9;
                break;

            case PAGE:
                hp=6;
                break;
            default:
                hp = 0;
                break;
        }
        if (suit == Suit.CUPS ){
            hp *= 1.3;
        }
        return hp;

    }

    public static int setDMGMinArc(Suit suit, Value value){
        int DMG;
        switch (value) {
            case KING:
                DMG = 6;
                break;

            case QUEEN:
                DMG=4;
                break;

            case KNIGHT:
                DMG=3;
                break;

            case PAGE:
                DMG=1;
                break;
            default:
                DMG = 0;
                break;
        }
        if (suit == Suit.SWORDS){
            DMG *= 1.3;
        }
        return DMG;
    }


    // FONCTION ABSTRAITE D'ACTIVATION
    @Override
    public void placeCard(Slot placementSlot){
        while(!placementSlot.acceptOnlyMaj()){
            placementSlot.addCard(this);
        }
    }

    @Override
    public void useSkill(Card targetCard){
        switch (this.suit) {
            case Suit.SWORDS:{
                targetCard.varyDamage()
                break;
            }
            case Suit.CUPS:{
                break;
            }
            case Suit.PENTACLES:{
                break;
            }
            case Suit.WANDS:{
                break;
            }
            default:{
                break;
            }
        }
    }

    @Override
    public void attackCard(Slot slotTarget){

    };
}
