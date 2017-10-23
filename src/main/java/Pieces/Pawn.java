package Pieces;

import Helpers.CaptureDirection;
import Helpers.Color;

public class Pawn extends Piece {
  private String name;
  private Color color;
  private int xPosition;
  private int yPosition;

  public Pawn(String name, Color color, int xPosition, int yPosition) {
    super(name, color, xPosition, yPosition);
    this.name = name;
    this.color = color;
    this.xPosition = xPosition;
    this.yPosition = yPosition;
  }

  public int getxPosition() {
    return xPosition;
  }

  public int getyPosition(){
    return yPosition;
  }

  @Override
  public boolean isMoveValid(CaptureDirection captureDirection, int startX, int startY, int endX, int endY) {
    if (startX >= 0 && startX <= 7 && startY >= 0 && startY <= 7 && endX >= 0 && endX <= 7 && endY >= 0 && endY <= 7) {
      int deltaX = endX - startX;
      int deltaY = endY - startY;

      if (color == Color.BLACK) {
        if (captureDirection == CaptureDirection.LEFT && deltaX == -1 && deltaY == -1) {
          // one step diagonally to the left means deltaX is -1 and deltaY is -1
          return true;
        } else if (captureDirection == CaptureDirection.RIGHT && deltaX == -1 && deltaY == 1) {
          // one step diagonally to the right means deltaX is -1 and deltaY is 1
          return true;
        } else if (deltaX == -1 && deltaY == 0) {
          // One step forward means deltaX is -1 and deltaY is 0
          return true;
        }

      } else if (color == Color.WHITE) {
        if (captureDirection == CaptureDirection.LEFT && deltaX == 1 && deltaY == -1) {
          // one step diagonally to the left means deltaX is 1 and deltaY is -1;
          return true;
        } else if (captureDirection == CaptureDirection.RIGHT && deltaX == 1 && deltaY == 1) {
          // one step diagonally to the right means deltaX is 1 and deltaY is 1;
          return true;
        } else if (deltaX == 1 && deltaY == 0) {
          // one step forward means deltaX is -1 and deltaY is 0;
          return true;
        }
      }
    }

    return false;
  }
}
