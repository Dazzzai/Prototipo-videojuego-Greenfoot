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
    public static int objetivo = 5; 
    public MyWorld()
    {    
        super(600, 500, 1); 
        contador = 0; //contador de gatos atrapados 
        personaje p = new personaje(); //creación de personaje en el mundo 
        addObject(p,300,420); //agregar el objeto al iniciar mundo 
        //gatos creados (falta buscar forma más eficiente) 
        crearGatos1(1);
        crearGatos1a(1);
        crearGatos2(1);
        crearGatos3(1);
        crearBasura(1);
        crearPescado(1);
        crearGatos2a(1); 
    }
    //creación de gatos en distintas posiciones 
    public void crearGatos1(int cantidad){
        gato1 gato1 = new gato1();
        addObject(gato1,50,0);
    }
    public void crearGatos1a(int cantidad){
        gato3 gato3 = new gato3();
        addObject(gato3,235,0);
    }
    public void crearGatos2(int cantidad){
        gato2 gato2 = new gato2();
        addObject(gato2,340,0);
    }
        public void crearGatos2a(int cantidad){
        gato1 gato1 = new gato1();
        addObject(gato1,450,0);
    }
    public void crearGatos3(int cantidad){
        gato3 gato3 = new gato3();
        addObject(gato3,600,0);
    }
    //creación de elementos que quitan puntos al contador 
    public void crearBasura(int cantidad){
        basura basura = new basura();
        addObject(basura,130,25);
    }
    public void crearPescado(int cantidad){
        pescado pescado = new pescado();
        addObject(pescado,520,30);
    }
    //texto mostrado en pantalla 
    public void act()
    {
        showText("CatCatch", 90, 15);
        showText("Gatos recogidos: " + contador, 100, 35);
        showText("Vidas totales: " + vidas, 100, 60); 
        showText("Objetivo: " + objetivo, 500, 35); 
    }
}
