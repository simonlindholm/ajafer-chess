package Pieces;
import Helpers.CaptureDirection;
import Helpers.Color;

public class Knight extends Piece {

  private String name;
  private Color color;
  private int xPosition;
  private int yPosition;

  public Knight(String name, Color color, int xPosition, int yPosition) {
    super(name,color,xPosition,yPosition);
    this.name = name;
    this.color = color;
    this.xPosition = xPosition;
    this.yPosition = yPosition;
  }

  @Override
  public boolean isMoveValid(CaptureDirection captureDirection, int startX, int startY, int endX, int endY) {
    System.out.println("Preparing to move... " + name);

    int deltaX = endX - startX;
    int deltaY = endY - startY;

    // Every possible move for a knight consists of either 2 moves in x and 1 in y or 2 moves in y and 1 in x
    // This is again regardless of the color (which side of the board) the knight is

    int xDistance = Math.abs(deltaX);
    int yDistance = Math.abs(deltaY);

    if (xDistance == 2 && yDistance == 1) {
      return true;
    } else if (yDistance == 2 && xDistance == 1) {
      return true;
    }

    return false;
  }
}
