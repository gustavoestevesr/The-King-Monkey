import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Barrel extends Actor
{
    int x = -3;    
    public void act()
    {       
        int y = 0;
        // Detect if Barril is on the Ground
        if( getOneIntersectingObject(Ground.class) == null ){
            y++;
            if( isAtEdge() ){
                x *= -1;
                y += 80;
            }
        }
        
        // Define new positions to the object
        setLocation( getX() + x , getY() + y );
        
        // turn object while is moving
        turn( x );
    }
}

