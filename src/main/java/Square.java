import Helpers.Color;
import Pieces.Piece;

public class Square {

   /**
    * A square object represents a single square on the 8x8 board matrix.
    * It should therefore consist of a color, an (x,y) position and a piece
    * Note: the square may have an empty (null) piece.
   */
  private Color color;
  private int xPosition;
  private int yPosition;
  private Piece piece;

   /**
    * A single square out of the total 64 squares, should be initalized
    * with a color, (x,y) position and a piece (which can be null)
   */
  public Square(Color color, Piece piece, int xPosition, int yPosition) {
    this.color = color;
    this.xPosition = xPosition;
    this.yPosition = yPosition;
    this.piece = piece;
  }

   /**
    *
    * Other objects can only set the square's piece with this setter function
   */
   // We want to reduce dependency and think about access control.
  public void setPiece(Piece piece) {
    this.piece = piece;
  }

   /**
    * Allows us to, at any point in time, check if a square is holding a piece or not.
   */
  public boolean hasPiece(){
    if (piece == null) {
      return false;
    }
    return true;
  }

   /**
    * Our getter methods for square properties.
   */
  public Piece getPiece(){
    return piece;
  }

  public Color getColor() {
    return color;
  }

  public int getxPosition() {
    return xPosition;
  }

  public int getyPosition() {
    return yPosition;
  }

}
