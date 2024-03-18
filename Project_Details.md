PROJECT : HEARTHSTONE LIKE IN JAVA

GAME NAME : DESTINY'S SHOWDOWN

DESCRIPTION: A MIX BETWEEN  Hearthstone and Magic the Gathering BUT USING TAROT CARDS AND DESTINY AS IT'S MAIN THEME. 

MECHANICS DESCRIPTION : The players have access to 2 types of cards with Various abilities and playability : the Major Arcanas and the Minor Arcanas. 
Major Arcanas are usually spawnable creatures  that can be summoned by players to battle or to represent the player or affect the general situation of a game. 
Minor Arcanas are usually only effects that can be played to boost or clive the game, but faces Minor arcanas (like the king or paige) can become spawnable creatures as well depending on the card's effect. 

ASSETS LIST : 78 CARDS (22 Major Arcanas, 56  Minor Arcanas),
    3 Playable Slots/Field ("You" Slot, "Event" Slot, "Persons" Field),
    2 Players (Stats : Health Points, Mind Points)

GAME DESCRIPTION : 
    GAME SETUP : 
        - The game is played by two players.
        - Each Player start the game by picking a random MajorArcana that will give them a permanent effect for the duration of the game. This card is placed in the "You" Slot and must be protected.
        - Each Player then start with 50 HP, 5MP and draw 7 cards to his hand.
        -A coin then decides on the first player to play and the other is rewarded by a card from the deck and 1 extra MP. 
        -The drawing deck is the same for both players but shuffled each time a new turn starts and the "You" cards are taken away from said drawing deck.

    TURN MECHANICS : 
        1- Draw 2 cards from the deck and then Discard one
        2.a- Play your cards by spending MPs and placing them on the "Event" slot or the "Persons" field. (Unless said otherwise, cards are disabled from attacking on the exact same turn)
        2.b- Players can use the cards in their "Persons" field to attack their opponent, always aiming first for the opponent's "Persons" field and then(if a card has been defeated, and there is leftover attack points) the "You" Slot card.
        3- If a player has no more card in Hand, he is given 2 for free. 
        4- Once the player ends their turn, their turn's effects take place and they are given 1 extra MP prior to the previous turn and their MP are filled back up. (They can have a Max of 15MP )

    END OF GAME : 
        A game ends when a player defeats his opponent's "You" Card.
        


CARD/SLOT DESCRIPTIONS : 
    
    "You" Slot : Holds the main player card and  represents the player himself. 

    "Event" Slot: Much like trap cards on Yu Gi Oh, they can hold up to 2 Major Arcana Card held face down for the opponent and can activate their capacity once.

    "Persons" Field : Main Playable field where all other cards are placed. It can contain spawnable Major or Minor Arcana Cards, or hold the Minor Arcana spells to activate them at the end of the turn. It can hold up to 10 cards (with 5 spawnables max)


    MAJOR ARCANAS : 
        {CARD NAME} - {DESTINY}: {"YOU" EFFECT}    ; {"EVENT" EFFECT}  ; {"PERSONS" EFFECT}

        The Fool - "Blissful Ignorance": {Can dodge attacks} ; {Sacrifices itself if the "You" card is attacked} ; {When defeated, rewards user with MP}
        
        The Magician - "Surpassing the plausible" : {Boost for every wand} ; {Spawns himself to take damage if "You" is attacked} ; {When defeated, rewards user with a random wand}
        
        The High Priestess - "Hidden influence" : {Nerfs a random enemy "Person" every turn} ; {Steals 3MP from the opponent on next turn} ; {Gives MP based on a percentage of damage taken}

        The Empress - "Gentle Power" : {Gives random small boost each turn} ; {lowers damage sent to "You"} ; {Spreads damage taken to random "Persons" (the player's or the opponent's)}

        The Emperor - "Supreme Ruler" : {Boost for every sword} ; {Boosts attacks for 1 turn} ; {+2 AtkP and +1HP for all ally "Persons"}
        
        The Hierophant - "Priest" : {Boost for every Pentacle} ; {If "You" isn't attacked on the previous turn, annexes the weakest enemy "Person"} ; {Can only be attacked when alone}
        
        The Lovers -  "Love at First Sight" : {Boost for every Cups} ; {When spawning a King or a Queen, spawns their other half of same suit} ; {When defeated, kills the weakest ennemy "Person"}
        
        The Chariot - "Conqueror" : {Can put to hand 1 defeated enemy card per turn} ; {Draws 2 card if damaging enemy "You"} ; {Attacks anyone who attacks him}
        
        Strength - "Hero" : {When "You" takes damage, gives small boost to all "Persons"} ; {If a "Person" is defeated, spawns himself} ; {When defeated gives a medium boost to a random ally "Person"}
        
        The Hermit - "Solitude" : {Always rewarded if gaining MP} ; {Spawns himself when the "Persons" field is empty} ; {If alone, gain 5MP}
        
        Wheel of Fortune - "Fate" : {Replace a random card in the player's hand every turn } ; {When Drawing draws automatically a Major Arcana} ; {When defeated steals an enemy major Arcana in their hand}
        
        Justice - "Retribution" : {Sends back to sender a percentage of damage taken by "You"} ; {At the end of the turn can steal a card from the enemy and discard another} ; {When defeated send the rest of the attack towards the sender}
        
        The Hanged Man - "Martyr" : {Nerfs the card who attacks when aimed towards "You"} ; {When "You" is attacked, spreads the damages towards ally "Persons" unless empty} ; {When attacked, even if not defeated, kills himself to give HP to other "Persons"}
        
        Death - "Grim Reaper" : {Can Kill an opponent's "Person" if player sacrifices one of theirs} ; {When an ally Major Arcana is defeated, the player gets it back in his hand} ; {When defeated deals damage to all "Persons"}
        
        Temperance - "Patience" : {Gain +1MP for each Person if you don't spawn on the turn} ; {Cumulates 1 MP point per turn, and activates to give all MPs when "You" is attacked} ; {Redirects all attacks towards him, but can't attack aggressors}
        
        The Devil - "Archfiend" : {If "You" is attacked, has a small chance of sending damage to a random enemy "Person"} ; {Gain MP at the end of the turn for all Missing "You" HP} ; {Can only attack ally "Persons" but gives HP for all attacks}
        
        The Tower - "Collapse" : {Gain HP or MP whenever a "Person" dies} ; {Whenever a "Person" dies, heals "You"} ; {Gain MP when attacked}
        
        The Star - "Distance" : {if "You" isn't attacked for 2 turns, gains 1MP forr each "Person"} ; {For the next turn divides all enemy attacks by 2} ; {Can only be attacked when alone, but when attacked doubles enemy damage}
        
        The Moon - "Soul" : {Can stun 1 random enemy "Person"} ; {When Board empty spawns a random Minor Arcana spawnable} ; {When a spawnable Minor Arcana is defeated, earn HP}
        
        The Sun - "Ability" : {Gain 1MP for every spawn} ; {Next Major Arcana spaw is free} ; {When defeated deals damage to all enemy "Persons"}
        
        Judgment - "Judgement Day" : {If "You" is defeated and the player still has "Persons", he can sacrifice them all to gain HP} ; {Can discard 2 random enemy cards} ; {When defeated let the player see all of the opponent's cards on next turn}
        
        The World - "Completion" : {Gain +2MP if you have more "Persons" than your opponent  at the end of the turn} ; {When empty handed earns 4 cards instead 2} ; {When defeated spawns the same card with half life}


Minor Arcanas : 

    {Value} -   WANDS  ;   CUPS ;   PENTACLES   ;   SWORDS

    ACE -  {Instant Major Arcana Spawn} ; {+5 HP for all "Persons" or +10 for "You"} ; {+1MP for each cards in Person} ; {-5 HP for all enemy "Persons"}

    2 - {+1 Card, +1MP} ; {+2HP for 1 card} ; {+2 MP} ; {+2 AtkP for 1 card}

    3 - {+2 Card, +1MP}; {+3HP for 1 card} ; {+3 MP} ; {+3 AtkP for 1 card}

    4 - {+2 Card, +2MP}; {+4HP for 1 card} ; {+4 MP} ; {+4 AtkP for 1 card}

    5 - {+3Card, +2MP}; {+5HP for 1 card} ; {+5 MP} ; {+5 AtkP for 1 card}

    6 - {+4 Card, +2MP}; {+3HP for 2 cards} ; {+4 MP, +2 Card} ; {+3 AtkP for 2 card}

    7 - {+4 Card, +3MP}; {+3HP for 1 card and +2HP for 2 cards} ; {+5 MP, +2 Card} ; {+5 AtkP for 1 card, +1 AtkP for 2 card}

    8 - {+5 Card, +3MP}; {+4HP for 2 cards} ; {+5 MP, +3 Card} ; {+5 AtkP for 1 card, +1 AtkP for 3 card}

    9 - {+6 Card, +3MP}; {+3HP for 3 cards} ; {+6 MP, +3 Card} ; {+5 AtkP for 1 card, +2 AtkP for 2 card}

    10 - {+6 Card, +4MP}; {+5HP for 2 cards} ; {+7 MP, +3 Card} ; {+6 AtkP for 1 card, +2 AtkP for 2 card}

    PAIGE - {spawn 1 paige with (6HP, 2AtkP) and +2 Card}; {spawn 1 paige with (10HP, 2AtkP) and +1HP for all "Persons"} ; {spawn 1 paige with (6HP, 2AtkP) and +1MP for each "Persons"} ; {spawn 1 paige with (6HP, 4AtkP) and +1AtkP for all "Persons"}

    KNIGHT - {spawn 1 Knight with (7HP, 3AtkP) and +2 Card}; {spawn 1 knight with (10HP, 3AtkP) and +2HP for all "Persons"} ; {spawn 1 Knight with (7HP, 3AtkP) and +2MP for each "Persons"} ; {spawn 1 Knight with (7HP, 6AtkP) and +2AtkP for all "Persons"}

    QUEEN - {spawn 1 Queen with (10HP, 3AtkP) and +3 Card}; {spawn 1 queen with (15HP, 3AtkP) and +3HP for all "Persons"} ; {spawn 1 Queen with (10HP, 3AtkP) and +3MP for each "Persons"} ; {spawn 1 Queen with (10HP, 6AtkP) and +3AtkP for all "Persons"}

    KING - {spawn 1 King with (15HP, 4AtkP) and +4 Card}; {spawn 1 king with (20HP, 4AtkP)} ; {spawn 1 king with (15HP, 4AtkP) and +4MP for each "Persons"} ; {spawn 1 king with (15HP, 8AtkP) and +4AtkP for all "Persons"}