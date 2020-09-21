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
public class ListaDoble<T extends Number> implements Ilist<T>
{
    private NodoDoble<T> head;
    private NodoDoble<T> tail;
    private int tamaño;
    
    public ListaDoble()
    {
        this.head = null;
        this.tail = null;
        this.tamaño = 0;
    }
    

    @Override
    public boolean ListaVacia() 
    {
        return this.tamaño == 0;
    }       

    @Override
    public void añadirNodo(T dato) 
    {
        NodoDoble<T> nodo = new NodoDoble<>(dato);
       if(ListaVacia() == true)
       {
           this.head = this. tail = nodo;
           this.tamaño++;
       }
       else
       {
           nodo.setSiguienteNodo(this.head);
           NodoDoble<T> current = this.head;
           this.head = nodo;
           current.setNodoAnterior(nodo);
           this.tamaño++;
       }
    }

    @Override
    public void EliminarUltimoNodo() 
    {
        this.tail = this.tail.getNodoAnterior();
        this.tail.setSiguienteNodo(null);
        this.tamaño--;
    }

    @Override
    public void MostrarDatos() 
    {
        NodoDoble<T> i = this.head;
        while(i != null)
        {
            System.out.println(i.getDato().intValue());
            i = i.getSiguienteNodo();
        }
    }
    
    public void ExisteDato(T dato)
    {
        NodoDoble<T> i = this.head;
        int cont = 0;
        while(i != null)
        {
            if(dato == i.getDato())
            {
                System.out.println("El dato se encuentra en la lista");
                break;
            }
            i = i.getSiguienteNodo();
            cont++;
        }
        if(cont == this.tamaño)
        {
            System.out.println("El dato no se encuentra en la lista");
        }
    }
    
    public void EliminarPrimerNodo()
    {
        NodoDoble<T> current = this.head.getSiguienteNodo();
        this.head = null;
        this.head = current;
        this.tamaño--;
    }
}
