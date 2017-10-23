import Helpers.Color;

 /**
  * The purpose of this class is to initialize a game with two players
  * and allow both players to make moves on each other and take out
  * the opponents pieces. This verifies that our written rules logic
  * is indeed correct.
 */

public class GameTester {

  public static void main(String[] args){
    Player player1 = new Player(Color.BLACK,"Bob");
    Player player2 = new Player(Color.WHITE, "Jim");
    Game newGame = new Game(player1,player2);

    try {
      newGame.getBoard().movePiece(player1,6,0,5,0);
      newGame.getBoard().movePiece(player2, 1,6, 2,6);

      newGame.getBoard().movePiece(player1,7,1,5,2);
      newGame.getBoard().movePiece(player2, 1,1, 2,1);

      newGame.getBoard().movePiece(player1,5,0,4,0);
      newGame.getBoard().movePiece(player2, 2,1, 3,1);

      newGame.getBoard().movePiece(player1,6,4,5,4);
      newGame.getBoard().movePiece(player2,1,5,2,5);

      newGame.getBoard().movePiece(player1,5,4,4,4);
      newGame.getBoard().movePiece(player2,3,1,4,0);

      newGame.getBoard().movePiece(player1,7,5,3,1);
      newGame.getBoard().movePiece(player2,0,2,1,1);

      newGame.getBoard().movePiece(player1,7,6,5,5);
      newGame.getBoard().movePiece(player2,1,1,4,4);

    } catch (Exception e) {
      System.out.println("Error: " + e.getLocalizedMessage());
    }

  }
}
