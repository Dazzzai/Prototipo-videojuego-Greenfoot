import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * pescado del videojuego 
 * 
 * @author Madeline Nahomy Castro Morales 
 * @date 10/08/2022
 */
public class pescado extends Actor
{
    private int speed = 2; //velocidad a la que cae 
    public void act()
    {
        setLocation(getX(),getY()+ speed);
        if(getY() >= getWorld().getHeight() -1){ //obtener tamaño del mundo 
            MyWorld pescado = (MyWorld) getWorld();
            pescado.removeObject(this); //remover objeto al caer al suelo 
        }
    }
}
