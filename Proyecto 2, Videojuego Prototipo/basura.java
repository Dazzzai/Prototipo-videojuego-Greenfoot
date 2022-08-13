import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Basura creada para eliminar puntos al contador 
 * 
 * @author Madeline Nahomy Castro Morales 
 * @date 10/08/2022
 */
public class basura extends Actor
{
    private int speed = 2; //velocidad a la que cae la basura 
    public void act()
    {
        setLocation(getX(),getY()+speed); 
        if(getY() >= getWorld().getHeight() -1){ //conseguir el tamaño del mundo 
            MyWorld objeto = (MyWorld) getWorld();
            objeto.removeObject(this); //remover el objeto al caer al suelo 
        }
    }
}
