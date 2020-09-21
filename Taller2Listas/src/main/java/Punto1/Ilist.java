/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto1;

/**
 *
 * @author santi
 */
public interface Ilist<T> 
{
   
    public boolean ListaVacia();
    
    public void añadirNodo(T dato);
    
    public void EliminarUltimoNodo();
    
    public void MostrarDatos();
}
