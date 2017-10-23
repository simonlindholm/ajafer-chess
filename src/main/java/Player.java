import Helpers.Color;
import Pieces.Piece;

public class Player {

   /**
    * A player has a color, name and game that the player is associated with.
    * We also keep track of the players pieces and how many times the player
    * has won or lost a game.
   */
  private Color currentColor;
  private String name;
  private Piece[] currentPieces;
  private int numberOfWins;
  private int numberOfLosses;
  private Game currentGame;

   /**
    * During initialization of a player, we only assign the player a color and name.
   */
  public Player(Color color, String name) {
    currentColor = color;
    this.name = name;
  }

   /**
    * Getters and setters for the private instance properties on the player object.
   */
  public void setCurrentGame(Game game){
    currentGame = game;
  }

  public Game getCurrentGame(){
    return currentGame;
  }

  public String getName() {
    return name;
  }

  public Color getCurrentColor() {
    return currentColor;
  }

}
