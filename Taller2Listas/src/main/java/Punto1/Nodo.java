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
public class Nodo<V> 
{
    private V dato;
    private Nodo<V> siguienteNodo;
   
    public Nodo(V dato)
    {
        this.dato = dato;
        this.siguienteNodo = null;
        
    }
    
    public V getDato()
    {
        return this.dato;
    }
    
    
    public void setDato(V dato)
    {
        this.dato = dato;
    }
    
    
    public void setSiguienteNodo(Nodo<V> siguienteNodo)
    {
        this.siguienteNodo = siguienteNodo;
    }
    
    
    public Nodo<V> getSiguienteNodo()
    {
        return this.siguienteNodo;
    }
    
}
