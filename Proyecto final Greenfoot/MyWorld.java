import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Mundo del videojuego creado para prototipo programado del juego.
 * 
 * @author Madeline Castro 
 * @version 8/08/2022
 */
public class MyWorld extends World
{
    public static int contador = 0;
    public static int vidas = 3; 
    public static int objetivo = 3; 
    public static int level = 1;  
    public MyWorld()
    {    
        super(600, 500, 1); 
        contador = 0; //contador de gatos atrapados 
        personaje p = new personaje(); //creación de personaje en el mundo 
        addObject(p,300,420); //agregar el objeto al iniciar mundo 
        //gatos creados  
        crearGatos1();
        crearGatos2();
        crearGatos3();
        crearBasura();
        crearPescado();
        crearBonus();
        logo();
    }
    //creación de gatos en distintas posiciones 
    public void crearGatos1(){
        gato1 gato1 = new gato1();
        addObject(gato1,70,20);
    }
    public void crearGatos2(){
        gato2 gato2 = new gato2();
        addObject(gato2,310,0);
    }
    public void crearGatos3(){
        gato3 gato3 = new gato3();
        addObject(gato3,600,0);
    }
    //creación de elementos que quitan puntos al contador 
    public void crearBasura(){
        basura basura = new basura();
        addObject(basura,170,0);
        addObject(basura,300,0);
    }
    public void crearPescado(){
        pescado pescado = new pescado();
        addObject(pescado,390,30);
    }
    //creación del bonus
    public void crearBonus(){
        bonus bonus = new bonus();
        addObject(bonus, 500, 40);
    }
    public void logo(){
        logo logo = new logo();
        addObject(logo, 510, 475);
    }
    //texto mostrado en pantalla 
    public void act()
    {
        showText("Gatos salvados: " + contador, 100, 35);
        showText("Vidas totales: " + vidas, 100, 60); 
        showText("Objetivo: " + objetivo, 500, 35); 
        showText("Nivel: " + level, 500, 60);
    }
}

