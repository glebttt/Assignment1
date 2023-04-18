class StringManipulation {

  /**
   * Reverses the end of a string.
   *
   *                          012345                     012345
   * For example: reverseEnd("Hello, world", 5) returns "Hellodlrow ,"
   *                               <----->                    <----->
   *
   * With start == 0, reverses the entire text.
   * With start == text.length(), reverses nothing.
   *
   * @param text    non-null String that will have its end reversed
   * @param start   the index at which the remainder of the input is reversed,
   *                requires 0 <= start <= text.length()
   * @return input text with the substring from start to the end of the string reversed
   */
  public static String reverseEnd(String text, int start) {
    if (text.length() == 0 || text.length() < start){
      return text;
    }
    char [] charText = text.toCharArray();
    char [] manipulateCharText = new char[charText.length-start];

    for (int i = 0; i<manipulateCharText.length; i++) {
      manipulateCharText[i] = charText[i+start];
    }

    int k = 1;
    int length = manipulateCharText.length;
    for (int i = 0; i<length/2; i++) {
      char temp = manipulateCharText[i];
      manipulateCharText[i] = manipulateCharText[length-k];
      manipulateCharText[length-k] = temp;;
      k++;
    }

    for (int i = 0; i<manipulateCharText.length; i++) {
      charText[i+start] = manipulateCharText[i];
    }

    text = new String(charText);
    return text;
  }

}
