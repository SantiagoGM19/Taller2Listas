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
public class NodoDoble<V> 
{
    private V dato;
    private NodoDoble<V> siguienteNodo;
    private NodoDoble<V> NodoAnterior;
    
    public NodoDoble(V dato)
    {
        this.dato = dato;
        this.siguienteNodo = null;
        this.NodoAnterior = null;
    }

    /**
     * @return the dato
     */   
    public V getDato() 
    {
        return dato;
    }
    
    /**
     * @param dato the dato to set
     */
    public void setDato(V dato) 
    {
        this.dato = dato;
    }

    /**
     * @return the siguienteNodo
     */
    public NodoDoble<V> getSiguienteNodo() 
    {
        return siguienteNodo;
    }

    /**
     * @param siguienteNodo the siguienteNodo to set
     */
    public void setSiguienteNodo(NodoDoble<V> siguienteNodo) 
    {
        this.siguienteNodo = siguienteNodo;
    }

    /**
     * @return the NodoAnterior
     */
    public NodoDoble<V> getNodoAnterior() {
        return NodoAnterior;
    }

    /**
     * @param NodoAnterior the NodoAnterior to set
     */
    public void setNodoAnterior(NodoDoble<V> NodoAnterior) 
    {
        this.NodoAnterior = NodoAnterior;
    }

    
}
