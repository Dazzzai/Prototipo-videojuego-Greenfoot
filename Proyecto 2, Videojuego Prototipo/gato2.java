import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * gato2 del videojuego 
 * 
 * @author Madeline Nahomy Castro Morales 
 * @date 9/08/2022
 */
public class gato2 extends Actor
{
    private int speed = 2; //velocidad del gato 
    
    public void act(){
        setLocation(getX(),getY()+ speed);
        if(getY() >= getWorld().getHeight() -1){ //obtener el tamaño del mundo 
            MyWorld gato = (MyWorld) getWorld();
            gato.removeObject(this); //remover objeto al caer al suelo 
        }
    }
}

