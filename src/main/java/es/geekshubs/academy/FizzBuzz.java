package es.geekshubs.academy;

public class FizzBuzz {

  /**
   * Apply Method
   * @param count
   * @return
   */
  public String apply(final int count) {
      StringBuilder bfr = new StringBuilder();
      for (int i = 1; i <= count; i++) {
          if (i % 3 == 0) {
              bfr.append("Geeks");
          }
          if (i % 5 == 0) {
              bfr.append("Hubs");
          }
          if (i % 3 != 0 && i % 5 != 0) {
              bfr.append(i);
          }
          bfr.append("\n");
      }
      return bfr.toString();
  }

}
