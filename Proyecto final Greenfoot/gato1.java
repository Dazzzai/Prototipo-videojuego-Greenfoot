import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * gato1 del videojuego 
 * 
 * @author Madeline Nahomy Castro Morales 
 * @date 9/08/2022
 */
public class gato1 extends Actor
{
    private int speed = 3; //velocidad a la que cae 
    
    public void act()
    {
        setLocation(getX(),getY()+speed);
        if(getY() >= getWorld().getHeight() -1){ //obtener tamaño del mundo 
            MyWorld gato = (MyWorld) getWorld();
            gato.removeObject(this); //remover objeto al caer al suelo 
        }
    }
}
