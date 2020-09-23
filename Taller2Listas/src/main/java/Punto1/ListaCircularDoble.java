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
public class ListaCircularDoble<T extends Number> implements Ilist<T>
{
    private NodoDoble<T> head, tail;
    private int tamaño;
    
    public ListaCircularDoble()
    {
        this.head = this.tail = null;
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
        if(this.ListaVacia() == true)
        {
            this.head = this.tail = nodo;
            this.head.setSiguienteNodo(nodo);
            this.head.setNodoAnterior(nodo);
            this.tail.setSiguienteNodo(nodo);
            this.tail.setNodoAnterior(nodo);
        }
        else
        {
            NodoDoble<T> i = this.head;
            while(i != null)
            {
                if(i == this.tail)
                {
                    i.setSiguienteNodo(nodo);
                    NodoDoble<T> current = i;
                    this.tail = nodo;
                    this.tail.setSiguienteNodo(this.head);
                    this.tail.setNodoAnterior(current);
                    this.head.setNodoAnterior(this.tail);
                    break;
                }
                i = i.getSiguienteNodo();
            }
        }
        this.tamaño++;
    }
    
    //punto del taller
    @Override
    public void EliminarUltimoNodo() 
    {
        if(this.ListaVacia() == true)
        {
            System.out.println("La lista ya se encuentra vacía");
        }
        else
        {
            NodoDoble<T> current = this.tail.getNodoAnterior();
            this.tail = current;
            this.tail.setSiguienteNodo(this.head);
            this.tamaño--;
        }
    }

    @Override
    public void MostrarDatos() 
    {
        NodoDoble<T> i = this.head;
        while(i != null)
        {
            if(i == this.head)
            {
                System.out.println(i.getDato().intValue() + "(head)");
            }
            else
            {
                System.out.println(i.getDato().intValue());
            }
            if(i.getSiguienteNodo() == this.head)
            {
                break;
            }
            i = i.getSiguienteNodo();
        }
    }
    
    // punto del taller
    public void EliminarPrimerNodo()
    {
        if(this.ListaVacia() == true)
        {
            System.out.println("La lista ya se encuentra vacía");
        }
        else
        {
            NodoDoble<T> current = this.head.getSiguienteNodo();
            this.head = current;
        }
    }
    
    //punto del taller
    public void MostrarDatosDescendente()
    {
        NodoDoble<T> i = this.tail;
        while(i != null)
        {
            if(i == this.tail)
            {
                System.out.println(i.getDato().intValue() + "(tail)");
            }
            else
            {
                System.out.println(i.getDato().intValue());
            }
            if(i.getNodoAnterior() == this.tail)
            {
                break;
            }
            
            i = i.getNodoAnterior();
        }
    }
    
    //punto del taller
    public void AñadirOrdenadamente(T dato)
    {
        if(this.ListaVacia() == true)
        {
            this.añadirNodo(dato);
        }
        else
        {
            
            NodoDoble<T> nodo = new NodoDoble<>(dato);
            if(dato.intValue() == this.head.getDato().intValue() || dato.intValue() == this.tail.getDato().intValue())
            {
                System.out.println("El dato: " + dato.intValue() + 
                        " no se puede agregar porque ya se encuentra en la lista");
            }
            if(nodo.getDato().intValue()< this.head.getDato().intValue())
            {
                NodoDoble<T> current = this.head;
                this.head = nodo;
                this.head.setSiguienteNodo(current);
                current.setNodoAnterior(this.head);
                this.head.setNodoAnterior(this.tail);
                this.tail.setSiguienteNodo(this.head);
            }
            else if(nodo.getDato().intValue() > this.tail.getDato().intValue())
            {
                NodoDoble<T> current = this.tail;
                this.tail = nodo;
                this.tail.setSiguienteNodo(this.head);
                this.tail.setNodoAnterior(current);
                current.setSiguienteNodo(nodo);
                this.head.setNodoAnterior(this.tail);
            }
            else if(nodo.getDato().intValue() < this.tail.getDato().intValue())
            {
                NodoDoble<T> i = this.tail;
                while(i != null)
                {
                    if(dato.intValue() == i.getDato().intValue())
                    {
                        System.out.println("El dato: " + dato.intValue() + 
                                " no se puede agregar porque ya se encuentra en la lista");
                        break;
                    }
                    else if(dato.intValue() < i.getDato().intValue())
                    {
                       if(dato.intValue() > i.getNodoAnterior().getDato().intValue() )
                       {
                           nodo.setSiguienteNodo(i);
                           nodo.setNodoAnterior(i.getNodoAnterior());
                           i.getNodoAnterior().setSiguienteNodo(nodo);
                           i.setNodoAnterior(nodo);
                           break;
                       }
                    }
                    i = i.getNodoAnterior();
                }
            }
        }
        this.tamaño++;
    }
    
}
