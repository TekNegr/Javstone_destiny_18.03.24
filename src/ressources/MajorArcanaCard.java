package ressources;

import java.util.ArrayList;

public class MajorArcanaCard extends Card{
    //ENUM WITH VALUES
    private enum MajorArcana{
        THE_FOOL("The Fool", "Blissful Ignorance",3),
        THE_MAGICIAN("The Magician", "Surpassing the plausible",4),
        THE_HIGH_PRIESTESS("The High Priestess", "Hidden influence",5),
        THE_EMPRESS("The Empress", "Gentle Power",5),
        THE_EMPEROR("The Emperor", "Supreme Ruler",6),
        THE_HIEROPHANT("The Hierophant", "Priest",4),
        THE_LOVERS("The Lovers", "Love at First Sight",5),
        THE_CHANGELING("The Chariot", "Conqueror",5),
        STRENGTH("Strength", "Hero",6),
        THE_HERMIT("The Hermit","Solitude",4),
        THE_WHEEL_OF_FORTUNE("The Wheel of Fortune", "Fate",3),
        JUSTICE("Justice", "Retribution",5),
        THE_HANGED_MAN("The Hanged Man", "Martyr",4),
        DEATH("Death", "Grim Reaper",7),
        TEMPERANCE("Temperance", "Patience",5),  
        THE_DEVIL("The Devil","Archfiend",4),
        THE_TOWER("The Tower","Collapse",6),
        THE_STAR("The Star","Distance",7),
        THE_MOON("The Moon","Soul",4),
        THE_SUN("The Sun","Ability",6),
        JUDGEMENT("Judgement","Judgement Day",8),
        THE_WORLD("The World","Completion",9);

        private String name;
        private String destiny;
        private int cost;
        MajorArcana(String name, String destiny, int cost){
            this.name = name;
            this.destiny = destiny;
            this.cost = cost;
        }
    }

    public MajorArcanaCard(MajorArcana majorArc){
        super(majorArc.name,majorArc.destiny,majorArc.cost,0, true, true);
    }

    //CONSTRUCTOR
    public static MajorArcanaCard[] populateWithMajCards(){
        MajorArcanaCard[] cards = new MajorArcanaCard[22];
        for(int i=0;i<22;i++){
            for (MajorArcana majorArc : MajorArcana.values()){
                cards[i] = new MajorArcanaCard(majorArc);
            }
        }
        return cards;

    }


    // FONCTION ABSTRAITE D'ACTIVATION
    @Override
    public void placeCard(Slot placementSlot){
        placementSlot.addCard(this);
    }

    @Override
    public void useSkill(Card targetCard){
        
    }
}


