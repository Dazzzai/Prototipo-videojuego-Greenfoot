import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Bonus creado 
 * 
 * @author Madeline Nahomy Castro Morales 
 * @date 13/08/2022 
 */
public class bonus extends Actor
{
    int speed = 2; 
    public void act()
    {
        setLocation(getX(),getY()+ speed);
        if(getY() >= getWorld().getHeight() -1){ //conseguir tamaño del mundo 
            MyWorld gato = (MyWorld) getWorld();
            gato.removeObject(this); //remover al caer al suelo 
        }
    }
}

