package ressources;

public class Game {
    PlayerHalf player1, player2;
    Deck drawingDeck;
    Deck graveYarDeck;
    boolean end_game;
    String winner;

    //CONSTRUCTOR
    public Game(){
        this.player1 = new PlayerHalf("Player 1");
        this.player2 = new PlayerHalf("Player 2");
        this.drawingDeck.populateDeck();
        this.SetUpGame();
    }

    //METHODS
    public void SetUpGame(){
        this.player1.setYouCard(drawingDeck.drawMajor());
        this.player2.setYouCard(drawingDeck.drawMajor());
        while(this.player1.getYouCard() == this.player2.getYouCard()){
            this.drawingDeck.addCard(this.player2.getYouCard());
            this.player2.setYouCard(drawingDeck.drawMajor());
        }
        this.initDraw();
    }

    public void initDraw(){
        drawingDeck.shuffleDeck();
        for(int i=0;i<7;i++){
            Card card1 = drawingDeck.drawCard();
            drawingDeck.removeCardbyObject(card1);
            player1.addToHand(card1);
            Card card2 = drawingDeck.drawCard();
            player2.addToHand(card2);
            drawingDeck.removeCardbyObject(card2);
        }
        
    }

    //console logging players
    public void LogPlayers(){
        player1.logPlayer();
        player2.logPlayer();
    }


    public boolean gameEnded(){
        boolean gameEnded = false;
        if(player1.getYouCard().HealthPoint ==0 || player2.getYouCard().HealthPoint ==0){
            if(player1.getYouCard().HealthPoint ==0 && !(player2.getYouCard().HealthPoint ==0)){
                winner = player2.getUsername();
            }
            else if(player2.getYouCard().HealthPoint ==0 && !(player1.getYouCard().HealthPoint ==0)){
                winner = player1.getUsername();
            }
            else if(player2.getYouCard().HealthPoint ==0 && player1.getYouCard().HealthPoint ==0){
                winner = "Draw";
            }
            gameEnded = true;
        }
        return gameEnded;
    }


    
}
