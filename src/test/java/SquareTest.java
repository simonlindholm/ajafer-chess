import Helpers.Color;
import Pieces.Pawn;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {
  private final Pawn TEST_PAWN = new Pawn("Pawn", Color.BLACK, 1, 0);
  private final Square TEST_SQUARE = new Square(Color.BLACK, TEST_PAWN, 1, 0);

  @Test
  void hasPiece() {
    // We initialized TEST_SQUARE with a pawn
    assertEquals(TEST_SQUARE.hasPiece(), true);
  }

  @Test
  void getPiece() {
    assertEquals(TEST_SQUARE.getPiece(), TEST_PAWN);
  }

  @Test
  void getColor() {
    assertEquals(TEST_SQUARE.getColor(), Color.BLACK);
  }

  @Test
  void getxPosition() {
    assertEquals(TEST_SQUARE.getxPosition(), 1);
  }

  @Test
  void getyPosition() {
    assertEquals(TEST_SQUARE.getyPosition(), 0);
  }

}