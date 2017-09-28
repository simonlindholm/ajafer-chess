package Pieces;

import Helpers.CaptureDirection;
import Helpers.Color;

public class King extends Piece {

  private String name;
  private Color color;
  private int xPosition;
  private int yPosition;

  public King (String name, Color color, int xPosition, int yPosition) {
    super(name,color,xPosition,yPosition);
    this.name = name;
    this.color = color;
    this.xPosition = xPosition;
    this.yPosition = yPosition;
  }

  @Override
  public boolean isMoveValid(CaptureDirection captureDirection, int startX, int startY, int endX, int endY) {
    System.out.println("Preparing to move... " + name);

    // The King can take one step only in any direction.
    // the distance can therefore be either x = 1 or y = 1 or both (if diagonal step)
    if (startX >= 0 && startX <= 7 && startY >= 0 && startY <= 7 && endX >= 0 && endX <= 7 && endY >= 0 && endY <= 7) {

      int xDistance = Math.abs(endX-startX);
      int yDistance = Math.abs(endY-startY);

      if ((xDistance == 1 && yDistance == 0) || (yDistance == 1 && xDistance == 0)) {
        // King has taken one step to the left, right, up or down
        return true;
      } else if (xDistance == 1 && yDistance == 1) {
        // if distance in both x and y is 1 then user has made a diagonal move (single step)
        return true;
      }

    }

    return false;
  }
}
