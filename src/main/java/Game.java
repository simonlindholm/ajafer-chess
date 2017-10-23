import Helpers.Color;

public class Game {
   /**
    * A game object consists of two players and a board.
    * The game should also control who's turn it is to make a move.
   */
  private Player player1;
  private Player player2;
  private Board board;
  private Color currentTurn;

   /**
    *  A game is initialized with two players,
    *  Once two players are in the game,
    *  the game tells the board to set up.
   */
  public Game(Player player1, Player player2) {
    this.player1 = player1;
    this.player2 = player2;
    setupGame();
  }

   /**
    * This function associates a game with a board and vice versa.
    * The board should even setup all 32 pieces for both players
    * in the correct positions and finally display the board
    * to verify that the game is ready to be played.
   */
  private void setupGame() {
    player1.setCurrentGame(this);
    player2.setCurrentGame(this);

    Board board = new Board();
    setBoard(board);

    board.setCurrentGame(this);
    board.setupBoard();
    board.setupPieces(player1);
    board.setupPieces(player2);
    board.displayBoard();

    nextTurn();
  }

  public void endGame() {

  }

  public Board getBoard(){
    return board;
  }

  public void setBoard(Board board){
    this.board = board;
  }

  public Color getCurrentTurn(){
    return currentTurn;
  }

  /**
   * This function allows us to, at any time, check who's turn it currently is.
  */
  public void checkTurn() {
    if (currentTurn == player1.getCurrentColor()) {
      System.out.println(player1.getName()+"'s  turn to make a move.");
    } else {
      System.out.println(player2.getName()+"'s turn to make a move");
    }
  }

   /**
    * This function will toggle the current turn, allowing the other user to take his turn
    * The board should call this function every time a method is made.
   */
  public void nextTurn() {
    if (currentTurn == player1.getCurrentColor()) {
      currentTurn = player2.getCurrentColor();
    } else {
      currentTurn = player1.getCurrentColor();
    }
  }

}
