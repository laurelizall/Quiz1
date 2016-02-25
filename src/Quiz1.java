
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;
import java.awt.Color;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author halll7908
 */
public class Quiz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        City town = new City();
    Robot bot = new Robot(town, 4, 0, Direction.EAST);
    bot.setColor(Color.cyan);
    
    new Wall(town, 4, 2, Direction.WEST);
    new Wall(town, 4, 2, Direction.NORTH);
    new Wall(town, 3, 3, Direction.WEST);
    new Wall(town, 3, 3, Direction.NORTH);
    new Wall(town, 2, 4, Direction.WEST);
    new Wall(town, 2, 4, Direction.NORTH);
    new Wall(town, 2, 5, Direction.NORTH);
    new Wall(town, 2, 5, Direction.EAST);
    new Wall(town, 3, 6, Direction.NORTH);
    new Wall(town, 3, 6, Direction.EAST);
    new Wall(town, 4, 7, Direction.NORTH);
    new Wall(town, 4, 7, Direction.EAST);
    
    new Thing(town, 4, 1);
    new Thing(town, 3, 2);
    new Thing(town, 2, 3);
    new Thing(town, 1, 4);
    
    bot.move();
    bot.turnLeft();
    bot.pickThing();
    bot.move();
    bot.turnLeft();
    bot.turnLeft();
    bot.turnLeft();
    bot.move();
    bot.pickThing();
    bot.turnLeft();
    bot.move();
    bot.turnLeft();
    bot.turnLeft();
    bot.turnLeft();
    bot.move();
    bot.pickThing();
    bot.turnLeft();
    bot.move();
    bot.turnLeft();
    bot.turnLeft();
    bot.turnLeft();
    bot.move(); 
    bot.pickThing(); // last thing
    bot.move();
    bot.putThing();
    bot.move();
    bot.turnLeft();
    bot.turnLeft();
    bot.turnLeft();
    bot.move();
    bot.putThing();
    bot.turnLeft();
    bot.move();
    bot.turnLeft();
    bot.turnLeft();
    bot.turnLeft();
    bot.move();
    bot.putThing();
    bot.turnLeft();
    bot.move();
    bot.turnLeft();
    bot.turnLeft();
    bot.turnLeft();
    bot.move();
    bot.turnLeft();
    bot.putThing();
    bot.move();
    }
}
