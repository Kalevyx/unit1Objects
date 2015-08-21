import java.awt.Color;

public class TurtleWorld
{
    public static void main(String args[])
    {
        World turtleWorld = new World();
        Turtle turtle = new Turtle(turtleWorld);
        turtle.setPenColor(Color.BLUE);
        turtle.setBodyColor(Color.pink);
        turtle.penDown();
        turtle.turn(30);
        turtle.forward(200);
        turtle.turn(120);
        turtle.forward(200);
        turtle.turn(120);
        turtle.forward(200);
        turtle.penUp();
        turtle.turnRight();
        turtle.forward(115);
        turtle.penDown();
        turtle.turnRight();
        turtle.forward(200);
        turtle.turn(120);
        turtle.forward(200);
        turtle.turn(120);
        turtle.forward(200);
        turtle.turnRight();
        turtle.penUp();
        turtle.forward(60);
        turtle.turn(60);
        turtle.penDown();
        
    }
}
