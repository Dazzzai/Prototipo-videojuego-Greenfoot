import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Personaje principal controlado por el usuario. 
 * 
 * @author Madeline Castro 
 * @Date 9/08/2022
 */
public class personaje extends Actor
{
    MyWorld thisGame; //para obtener el contador 
    private int speed = 3;
    public void act()
    {
        move(); //se mueve el personaje
    }
    public void move(){ 
        if(Greenfoot.isKeyDown("D")){ //se mueve a la izquierda
            move(3+speed);
        }
        if(Greenfoot.isKeyDown("A")){ //se mueve a la derecha
            move(-3-speed);
        }
        //para recoger los gatos 
        Actor gato1 = getOneIntersectingObject(gato1.class);
        if(gato1 != null)
        {
            getWorld().removeObject(gato1);//elimina el gato al ser tocado
            thisGame.contador++; //suma 1 al contador 
        }
        Actor gato2 = getOneIntersectingObject(gato2.class);
        if(gato2 != null)
        {
            getWorld().removeObject(gato2); //elimina el gato al ser tocado
            thisGame.contador++; //suma 1 al contador 
        }
        Actor gato3 = getOneIntersectingObject(gato3.class);
        if(gato3 != null)
        {
            getWorld().removeObject(gato3);//elimina el gato al ser tocado
            thisGame.contador++; //suma 1 al contador 
        }
        Actor basura = getOneIntersectingObject(basura.class);
        if(basura != null)
        {
            getWorld().removeObject(basura);//elimina el gato al ser tocado
            thisGame.contador--; //resta 1 al contador 
            thisGame.vidas--; //resta  1 a la vida 
        }
        Actor pescado = getOneIntersectingObject(pescado.class);
        if(pescado != null)
        {
            getWorld().removeObject(pescado);//elimina el gato al ser tocado
            thisGame.contador--; //resta 1 al contador 
            thisGame.vidas--;//resta 1 a la vida
        }
        Actor bonus = getOneIntersectingObject(bonus.class);
        if(bonus != null)
        {
            getWorld().removeObject(bonus);//elimina el gato al ser tocado
            thisGame.contador++; //resta 1 al contador 
        }
    }
}
    
