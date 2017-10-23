package Pieces;

import Helpers.CaptureDirection;
import Helpers.Color;

public abstract class Piece {

   /**
    * Abstract piece class that our 6 piece types will inherit from.
    * A piece will have a name, color and position on the board
   */
  private String name;
  private Color color;
  private int xPosition;
  private int yPosition;

   /**
    * The piece should be initialized with all properties (name, position, color)
   */
  public Piece(String name, Color color, int xPosition, int yPosition) {
    this.name = name;
    this.color = color;
    this.xPosition = xPosition;
    this.yPosition = yPosition;
  }

   /**
    * Setup our getters and setters for our properties
   */
  public String getName() {
    return name;
  }

  public int getxPosition() {
    return xPosition;
  }

  private void setxPosition(int x) {
    xPosition = x;
  }

  public void updatePosition(int x, int y) {
      setxPosition(x);
      setyPosition(y);
  }

  public int getyPosition() {
    return yPosition;
  }

  private void setyPosition(int y){
    yPosition = y;
  }

  public Color getColor() {
    return color;
  }

   /**
    * This function is noted as abstract, the implementation will differ for each class inheriting from it.
    * This is due to the fact that each piece on the board has its own set of rules for how/when it may or
    * may not be moved. We will write the logic for this in each inherited class.
   */
  public abstract boolean isMoveValid(CaptureDirection captureDirection, int startX, int startY, int endX, int endY);
}