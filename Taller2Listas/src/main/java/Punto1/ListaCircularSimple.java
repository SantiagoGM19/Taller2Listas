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
public class ListaCircularSimple<T extends Number> implements Ilist<T>
{
    public Nodo<T> head;
    public int tamaño;
    
    public ListaCircularSimple()
    {
        this.head = null;
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
        Nodo<T> nodo = new Nodo<>(dato);
        if(this.ListaVacia() == true)
        {
            this.head = nodo;
            this.head.setSiguienteNodo(nodo);
        }
        else
        {
            Nodo<T> i = this.head;
            while(i != null)
            {
                if(i.getSiguienteNodo() == this.head)
                {
                    i.setSiguienteNodo(nodo);
                    nodo.setSiguienteNodo(this.head);
                    break;
                }
                i = i.getSiguienteNodo();
            }
            
        }
        this.tamaño++;
    }

    @Override
    public void EliminarUltimoNodo() 
    {
        Nodo<T> i = this.head;
        while(i != null)
        {
            Nodo<T>current = i.getSiguienteNodo();
            if(current.getSiguienteNodo() == this.head)
            {
                current = null;
                i.setSiguienteNodo(this.head);
                break;
            }
            i = i.getSiguienteNodo();
        }
        this.tamaño--;
    }

    @Override
    public void MostrarDatos() 
    {
        Nodo<T> i = this.head;
        while(i != null)
        {
            System.out.println(i.getDato().intValue());
            if(i.getSiguienteNodo() == this.head)
            {
                break;
            }
            i = i.getSiguienteNodo();
        }
    }
    
    public void UnirLista(ListaCircularSimple<T> lista)
    {
       Nodo<T> i = this.head;
       while(i != null)
       {
           if(i.getSiguienteNodo() == this.head)
           {
               i.setSiguienteNodo(lista.head);
               i = i.getSiguienteNodo();
           }
           if(i.getSiguienteNodo() == lista.head)
           {
               i.setSiguienteNodo(this.head);
               break;
           }
           i = i.getSiguienteNodo();
       }
       this.tamaño += lista.tamaño;
    }
    
    
}
