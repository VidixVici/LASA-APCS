// VidixVici - Zach - LASA AP CS 2021-2022
class Main {
  public static final int DAYS_PER_WEEK = 7;
  public static void main(String[] args) {

      int x = 27;
      System.out.println("x = " + x);
      x++;
      System.out.println("x = " + (x + 1));
      System.out.println("x = " + x);

      x = Integer.MAX_VALUE;
      System.out.println("x = " + x);
      x++;
      System.out.println("x = " + (x + 1));
      System.out.println("x = " + x);

      x = Integer.MAX_VALUE;
      System.out.println("x = " + x);

      x = Integer.MIN_VALUE;
      System.out.println("x = " + x);

      double y = 6.2;
      System.out.println("y = " + y);
      y = 27;
      System.out.println("y = " + y);

      char a = '$';
      System.out.println("a = " + a);
      a = 39;
      System.out.println("a = " + a);

      String b = "Hello";
      String c = "World";
      System.out.print(b + "\n\\\n" + c + "\n");

      int days = 212;
      System.out.println("212 days is " + (float)((double) days / (double) DAYS_PER_WEEK) + " weeks.");

      int e = 6;
      int f = 27;
      System.out.println(e + " + " + f + " = " + (f + e) + " (not 627)");

      double g = 5.8 * 2;
      double h = 2.5;
      System.out.println("integer part of g / h = " + (int)(g / h));
  }
}