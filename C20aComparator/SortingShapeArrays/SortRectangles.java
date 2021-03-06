/**
 * The sample program from Chapter 13 in
 *   Liang Y Daniel, Introduction to Java Programming, 11st Edition
 */

import java.util.Arrays;

public class SortRectangles {
  public static void main(String[] args) {
    ComparableRectangle[] rectangles = {
      new ComparableRectangle(3.4, 5.4),
      new ComparableRectangle(13.24, 55.4),
      new ComparableRectangle(7.4, 35.4),
      new ComparableRectangle(1.4, 25.4)};

    Arrays.sort(rectangles, new RectangleComparator());

    for (Rectangle rectangle: rectangles) {
      System.out.print(rectangle + " ");
      System.out.println();
    }

    System.out.println("------------------------------------");

    Arrays.sort(rectangles, new RectangleComparatorDescending());

    for (Rectangle rectangle: rectangles) {
      System.out.print(rectangle + " ");
      System.out.println();
    }

  }
}
