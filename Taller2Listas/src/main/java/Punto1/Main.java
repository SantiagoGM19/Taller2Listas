package Punto1;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author santi
 */
public class Main 
{
    public static void main (String[] args)
    {
        
        /*
        ListaDoble<Integer> listD = new ListaDoble<>();
        
        listD.añadirNodo(1);
        listD.añadirNodo(2);
        listD.añadirNodo(3);
        listD.añadirNodo(4);
        listD.añadirNodo(5);
        
        listD.MostrarDatos();
        
        listD.EliminarPrimerNodo();
        
        System.out.println("--------------------------------------");
        
        listD.MostrarDatos();
        
        listD.EliminarPrimerNodo();
        
        System.out.println("--------------------------------------");
        
        listD.MostrarDatos();
        */
        /*
        Listasimple<Integer> list = new Listasimple<>();
        
        list.añadirNodo(1);
        list.añadirNodo(2);
        list.añadirNodo(3);
        list.añadirNodo(4);
        list.añadirNodo(5);
       
        
        list.EliminarUltimoNodo();
        
        list.MostrarDatos();
        
        System.out.println("");
        
        */
        
        ListaCircularSimple<Integer> listac = new ListaCircularSimple<>();
       
        listac.añadirNodo(1);
        listac.añadirNodo(2);
        listac.añadirNodo(3);
        listac.añadirNodo(4);
        listac.añadirNodo(5);
        
        ListaCircularSimple<Integer> lista_hija = new ListaCircularSimple<>();
        lista_hija.añadirNodo(6);
        lista_hija.añadirNodo(7);
        lista_hija.añadirNodo(8);
        lista_hija.añadirNodo(9);
        lista_hija.añadirNodo(10);
        
        listac.UnirLista(lista_hija);
        
        listac.MostrarDatos();
        
        System.out.println("");
        
        
    }
    
}
