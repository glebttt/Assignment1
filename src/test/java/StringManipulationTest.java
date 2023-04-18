import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/*
 * Testing strategy
 *
 * Partition the inputs as follows:
 * text.length(): 0, 1, > 1
 * start:         0, 1, 1 < start < text.length() - 1,
 *                text.length() - 1, text.length()
 * text.length()-start: 0, 1, even > 1, odd > 1
 *
 * Include even- and odd-length reversals because
 * only odd has a middle element that doesn't move.
 *
 * Exhaustive Cartesian coverage of partitions.
 */

class StringManipulationTest {

   // covers text.length() = 0,

  //        text.length()-start = 0

    //   covers start = 0 = text.length(),
  @Test
  public void testEmpty() {
      assertEquals("", StringManipulation.reverseEnd("", 0));
  }
  // covers text.length()-start: even>1
  @Test
  public void testEven() { assertEquals("Hrotkce", StringManipulation.reverseEnd("Hecktor", 1));}
  // covers text.length()-start: odd>1
  @Test
  public void testOdd(){ assertEquals("Danallei", StringManipulation.reverseEnd("Daniella", 3) );}
  // covers textLength() = 0
  @Test
  public void testZeroTextLength() {assertEquals("",StringManipulation.reverseEnd("",3));}
  // covers text.length() = 1
  @Test
  public void testOneTextLength() {assertEquals("H",StringManipulation.reverseEnd("H",3));}
  // covers text.length()  > 1
  @Test
  public void testMoreThanOneTextLength() {assertEquals("Hail",StringManipulation.reverseEnd("Hlia",1));}
  // covers start: 0
  @Test
  public void testZeroStart() {assertEquals("Hail",StringManipulation.reverseEnd("liaH",0));}
  // covers start: 1
  @Test
  public void testOneStart() {assertEquals("Holle",StringManipulation.reverseEnd("Hello",1));}
  //covers start: 1 < start < text.length() - 1
  @Test
  public void testStartBetweenOneAndTextLength() {assertEquals("Helol", StringManipulation.reverseEnd("Hello", 3));}
  // covers start: text.length() - 1
  @Test
  public void testStartTextLengthMinusOne() {assertEquals("Hello", StringManipulation.reverseEnd("Hello", 4));}
  // covers start: text.length()
  @Test
  public void testStartTextLength() {assertEquals("Hello", StringManipulation.reverseEnd("Hello", 5));}






}
