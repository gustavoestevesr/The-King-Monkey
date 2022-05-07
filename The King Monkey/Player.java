import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Player extends Actor
{
    GreenfootImage player = new GreenfootImage("Player2.png");
    public void act()
    {
        int x=0, y=0;                     
        if( Greenfoot.isKeyDown("left") ){
            x = -3;
            player = new GreenfootImage("Player1.png");
        } 
        if( Greenfoot.isKeyDown("right") ){
            x = 3;
            player = new GreenfootImage("Player2.png");
        }  
        setImage(player);
        
        if( getOneIntersectingObject(Ladder.class) != null ){    
            if( Greenfoot.isKeyDown("up") ){
                y -= 3;
            } 
            if( Greenfoot.isKeyDown("down") ){
                y += 3;
            } 
        }  
        
        if( Greenfoot.isKeyDown("space") ){
            if( getOneObjectAtOffset(0, getImage().getHeight()/2, Ground.class) != null ){               
                y=-52;
            }           
        }
        
        if( getOneObjectAtOffset(0, getImage().getHeight()/2, Ground.class) == null ){ 
            y+=1;            
        }
        setLocation( getX() + x , getY() + y );
        
        if( getOneIntersectingObject(Barrel.class) != null ){    
            Greenfoot.stop();
            getWorld().showText("GAME OVER", 550, 300);
        }
        if( getOneIntersectingObject(Queen.class) != null ){    
            Greenfoot.stop();
            getWorld().showText("YOU WIN", 550, 300);
        }
    }
}
                
       /*         
        
        
    }
}*/


