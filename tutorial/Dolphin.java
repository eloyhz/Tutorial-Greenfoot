import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Dolphin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dolphin extends Actor
{
    private final int GRAVITY = 1;
    private int velocity;
    
    public Dolphin()
    {
        velocity = 3;
    }
    
    /**
     * Act - do whatever the Dolphin wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        fall();
    }    
    
    public void fall()
    {
        setLocation(getX(), getY() + velocity);
        if (getY() > getWorld().getHeight() - 70)   {
            velocity = 0;
        }   else    {
            velocity += GRAVITY;
        }
    }
}
