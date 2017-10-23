package Pieces;

import Helpers.CaptureDirection;
import Helpers.Color;

public class Queen extends Piece {

  private String name;
  private Color color;
  private int xPosition;
  private int yPosition;

  public Queen(String name, Color color, int xPosition, int yPosition) {
    super(name, color, xPosition, yPosition);
    this.name = name;
    this.color = color;
    this.xPosition = xPosition;
    this.yPosition = yPosition;
  }

  @Override
  public boolean isMoveValid(CaptureDirection captureDirection, int startX, int startY, int endX, int endY) {
    System.out.println("Preparing to move... " + name);

    // Queen moves like a rook and bishop, copy some of the logic
    if (startX >= 0 && startX <= 7 && startY >= 0 && startY <= 7 && endX >= 0 && endX <= 7 && endY >= 0 && endY <= 7) {

      int deltaX = endX - startX;
      int deltaY = endY - startY;

      // TODO:- Clean this pile of shit.

      // Bishop logic first since it is not dependant on color
      if (deltaX < 0 && deltaY > 0 && (deltaY / deltaX) == -1) {
        return true;
      } else if (deltaX < 0 && deltaY < 0 && (deltaY / deltaX) == 1) {
        return true;
      } else if (deltaX > 0 && deltaY > 0 && (deltaY / deltaX) == 1) {
        return true;
      } else if (deltaX > 0 && deltaY < 0 && (deltaY / deltaX) == -1) {
        return true;
      }

      // Logic for Rook
      if (color == Color.BLACK) {
        // Logic for black rook move
        if (deltaX < 0 && deltaY == 0) {
          // if a black rook moves forward x spaces then deltaX should be negative and deltaY 0
          return true;
        } else if (deltaX > 0 && deltaY == 0) {
          // if a black rook moves backward x spaces then deltaX should be positive and deltaY 0
          return true;
        } else if (deltaX == 0 && deltaY > 0) {
          // if a black rook moves right x spaces then deltaX is 0 and deltaY positive
          return true;
        } else if (deltaX == 0 && deltaY < 0) {
          // if a black rook moves x left spaces then deltaX is 0 and deltaY negative
          return true;
        }
      } else if (color == Color.WHITE) {
        // Logic for white rook move
        if (deltaX > 0 && deltaY == 0 ) {
          // if a white rook moves forward x spaces then deltaX should be positive and deltaY 0;
          return true;
        } else if (deltaX < 0 && deltaY == 0) {
          // if a white rook moves backward x spaces then deltaX should be negative and deltaY 0;
          return true;
        } else if (deltaX == 0 && deltaY > 0) {
          // if a white rook moves to the right x spaces then deltaX is 0 and deltaY positive;
          return true;
        } else if (deltaX == 0 && deltaY < 0) {
          // if a white rook moves to the left x spaces then deltaX is 0 and deltaY negative;
          return true;
        }
      }

    }

    return false;
  }
}
