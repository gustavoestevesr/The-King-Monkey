import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MyWorld extends World
{
    int tempo = 0;
    public void act(){
        tempo++;
        if( tempo % 250 == 0 ){
            Barrel barrel = new Barrel();
            addObject( barrel , 850 , 50 );
        }
    }
        
    public MyWorld()
    {    
        // Create a new world with 1100x600 cells with a cell size of 1x1 pixels.
        super(1100, 600, 1, false); 
        
        // Create a vector object containing 6 grounds
        Ground[] grounds = new Ground[6];  
        // Instantiate each object
        for(int i=1; i<6; i++){
            grounds[i] = new Ground();
            // Adding objects into MyWorld
            addObject( grounds[i] , getWidth()/2, 115*i );
        }
        
        // Create a vector object containing 6 ladders
        Ladder[] ladders = new Ladder[6];  
        // Instantiate each object
        for(int i=1; i<6; i++){
            ladders[i] = new Ladder();
        }
        // Adding objects into MyWorld
        addObject( ladders[1] , 45 , 173 );
        addObject( ladders[2] , 1055 , 287 );
        addObject( ladders[3] , 45 , 400 );
        addObject( ladders[4] , 1055 , 515 );
        
        // Create object Player
        Player player = new Player();
        // Adding object into MyWorld
        addObject( player , 40 , 542);
        
        // Create object KingGorilla
        KingGorilla gorilla = new KingGorilla();
        // Adding object into MyWorld
        addObject( gorilla , 950 , 55 );
        
        // Create object Queen
        Queen queen = new Queen();
        // Adding object into MyWorld
        addObject( queen , 1050 , 70);
    }
}


