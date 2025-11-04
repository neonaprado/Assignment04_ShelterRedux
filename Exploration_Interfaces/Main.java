/**
 * Demonstrate the use of abstract classes
 * @Author  YOUR NAME
 *
 * Do the following steps:
 *
 * Step 0: Add YOUR NAME above
 *
 * Step 1: Examine the code and notce the TODO's
 *
 * Step 2:  In Relatable.java, implement the isLargerThan method in the Relatable Interface
 *
 * Step 3:  In Main.java's main method. add the test cases described in the exploration and test.  It should print that rectangle 1 is the largest.
 *
 * Step 4: In Main.java's main method, create two more rectangles. This time, make the rectangle passed in as the argument the bigger one. Test.  
 * 
 * Step 5: In Main.java's main method, create two more rectangles. This time, make the rectangles the same size. Test. 
 * 
 * */

 class Main {

    private static void reportCompare(String label, Relatable a, Relatable b) {
        int cmp = a.isLargerThan(b);
        System.out.println(label + " -> cmp=" + cmp);
        System.out.println(cmp > 0 ? "first is larger": (cmp < 0 ? "second is larger" : "same size"));
      }
  
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(0, 0, 5, 4); // 20
        Rectangle r2 = new Rectangle(0, 0, 3, 4); // 12
        System.out.println("case 1: " + r1 + " vs " + r2);
        reportCompare("case 1", r1, r2);


        Rectangle r3 = new Rectangle(0, 0, 2, 3); // 6
        Rectangle r4 = new Rectangle(0, 0, 4, 4); // 16
        System.out.println("case 2: " + r3 + " vs " + r4);
        reportCompare("case 2", r3, r4);



  }
  }
