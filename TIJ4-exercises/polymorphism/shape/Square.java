//: polymorphism/shape/Square.java
package shape;
//import static net.mindview.util.Print.*;

public class Square extends Shape {
  @Override
  public void draw() { System.out.println("Square.draw()"); }
  public void erase() { System.out.println("Square.erase()"); }
} ///:~
