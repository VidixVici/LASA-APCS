import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.awt.*;
import java.util.concurrent.TimeUnit;

public class Main {
  public static void main(String[] args) {  
		//create a world for your turtles
		World turtleWorld = new World(600, 800);
		
		//create your first turtle
    Turtle deb = new Turtle(150, 150, turtleWorld);
		Turtle tim = new Turtle(300, 300, turtleWorld);
    Turtle joe = new Turtle(300, 150, turtleWorld);

		//move the turtled forward
    /*deb.forward(100);
    deb.turnRight();
    deb.forward(100);
    deb.turnRight();
    deb.forward(100);
    deb.turnRight();
    deb.forward(100);

    tim.forward(150);
    tim.turn(120);
    tim.forward(150);
    tim.turn(120);
    tim.forward(150);
    tim.turn(120);
  */
  deb.Square();
  tim.Triangle();
  joe.Triangle();
  }


  public static void delaySeconds(int d)
  {
    try {
      TimeUnit.SECONDS.sleep(d);
    }
    catch(InterruptedException exception) {
            // Output expected InterruptedExceptions.
            System.out.println("Exception: "+exception);
        } catch (Exception exception) {
            // Output unexpected Exceptions.
            System.out.println("Exception: "+exception+", "+false);
        }
  }


}
