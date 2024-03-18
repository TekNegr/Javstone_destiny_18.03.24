package ressources;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import javafx.scene.image.Image;

public abstract class Card {
    protected String name;
    protected String destiny;
    protected int cost;
    protected String Placement;
    protected int HealthPoint;
    protected Image image;
    protected ArrayList<String> status;
    protected boolean isMajorArcana;
    protected Effect effect;
    protected boolean isCharacter;
    protected int damage;


    //enum of effects ? not sure what to do with it 
    protected enum Effect{
        DODGE("Dodge"),
        DAMAGE("Damage"),
        B_HEAL("Heal"),
        B_MP("Generate MP"),
        B_DMG("Boost Damage"),
        B_RAND( "Random Buff/Debuff"),
        N_HEAL("Nerf Heal"),
        N_MP("Nerf MP"),
        N_DMG("Nerf Damage"),
        IMMUNE("Immune"),
        DRAW("Draw"),
        DRAW_Min( "Draw Minor Arcana"),
        DRAW_Maj( "Draw Major Arcana"),
        STEAL("Steal Card"),
        SPAWN("Spawn"),
        STUN("Stun card"),
        SACRIFICE("Sacrifice of card"),
        PROTECT( "Protect");
        ;


        private String effectName;
        private int value;

        Effect(String name){this.effectName = name;}

        public void setValue(int v){this.value=v;}

        public int getValue(){return this.value;}
    }



    // CONSTRUCTEUR
    public Card(String name, String destiny, int cost, int HP, boolean isMA, boolean isCharacter) {
        this.name = name;
        this.destiny = destiny;
        this.cost = cost;
        this.HealthPoint = HP;
        this.isMajorArcana=isMA;
        this.Placement = null;
        this.isCharacter = isCharacter;
    }


    //  GETTERS AND SETTERS

    ////GETTERS  
    public int getHealth(){
        return HealthPoint;
    }
    public String getName(){
        return name;
    }

    public String getDestiny(){
        return destiny;
    }

    public int getCost(){
        return cost;
    }
   
    public String[] getStats(){
        return this.status.toArray(new String[this.status.size()]);
    }

    public int getDamage(){
        return this.damage;
    }


    ////SETTERS
    public void varCost(int delta){
        this.cost += delta;
    }

    public void setCost(int cost){
        this.cost = cost;
    }

    public void setPlacement(String placement){
        this.Placement = placement;
    }
    
    public void setHealthTo(int HP){
        this.HealthPoint = HP;
    }

    public void setDamage(int dmg){
        this.damage=dmg;
    }


    ////VARIER
   

    public void varyHealth(int delta){
        this.HealthPoint += delta;
    }

    public void addStats(String status){
        this.status.add(status);
    }

    public void removeStats(String status) {
        String[] statuses = this.getStats();
        for(int i =0;i<statuses.length;i++){
            if (statuses[i].equals(status)) {
                this.status.remove(i);
                break;
            }
        }
    }

    public void varyDamage(int delta){
        this.damage+=delta;
    }


    //Console log of cards
    public void logCard(){
        if(this.isMajorArcana){
            System.out.println("MajorArcana");
        }
        else{
            System.out.println("MinorArcana");
        }
        System.out.println("Card : " + this.name + "\n");
        System.out.println("Destiny : " + this.destiny + "\n");
        System.out.println("Stats: " + this.HealthPoint+  " HP"+ this.cost + " MP cost \n");

        System.out.println("\n");
        System.out.println("----------------------------------\n");
    }
    


    // FONCTION ABSTRAITE D'ACTIVATION
    public abstract void placeCard(Slot placementSlot);


    public abstract void useSkill(Card targetCard) throws Exception ;


    public abstract void attackCard(Slot slotTarget);
}
