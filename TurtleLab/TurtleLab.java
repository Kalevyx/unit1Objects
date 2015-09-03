// http://sites.asmsa.org/java-turtle/documentation

public class TurtleLab
{
    public static void main(String[] args)
    {
        World turtleWorld = new World();
        Turtle turtle1 = new Turtle(turtleWorld);
        Turtle turtle2 = new Turtle(turtleWorld);
        //turtle1.hide();
        turtle1.forward(100);
        turtle1.turn(-45);
        turtle1.forward(100);
        turtle1.turn(135);
        turtle1.forward(140);
        turtle1.turn(135);
        turtle1.forward(100);
        turtle1.backward(100);
        turtle1.turn(-45);
        turtle1.forward(340);
        turtle1.penUp();
        turtle1.turn(135);
        turtle1.forward(100);
        turtle1.turn(45);
        turtle1.forward(100);
        turtle1.turn(45);
        turtle1.penDown();
        turtle1.forward(100);
        turtle1.backward(200);
        
        //turtle2.hide();
        turtle2.backward(100);
        turtle2.turn(135);
        turtle2.forward(100);
        turtle2.turn(135);
        turtle2.forward(140);
        turtle2.turn(135);
        turtle2.forward(100);
        turtle2.backward(100);
        turtle2.turn(-45);
        turtle2.forward(340);
        turtle2.penUp();
        turtle2.turn(135);
        turtle2.forward(100);
        turtle2.turn(45);
        turtle2.forward(100);
        turtle2.turn(-45);
        turtle2.penDown();
        turtle2.forward(100);
        turtle2.backward(200);
    }
}