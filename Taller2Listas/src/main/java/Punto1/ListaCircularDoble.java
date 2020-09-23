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
                    this.head.setNodoAnterior(nodo);
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
            System.out.println(i.getDato().intValue());
            if(i.getSiguienteNodo() == this.head)
            {
                break;
            }
            i = i.getSiguienteNodo();
        }
    }
    
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
    
    public void MostrarDatosDescendente()
    {
        NodoDoble<T> i = this.head;
        NodoDoble<T> mayorNodo = this.head;
        int [] verificados = new int[this.tamaño];
        int cont = -1;
        int z = 1;
        while( z != 0)
        {
            
            while(i != null)
            {
                if(i.getDato().intValue() > mayorNodo.getDato().intValue())
                {
                    mayorNodo = i;
                }
                
                if(i == this.tail)
                {
                    break;
                }
                
                boolean verificado = false;
                for (int j = 0; j < verificados.length; j++) 
                {
                    if(i.getSiguienteNodo().getDato().intValue() == verificados[j])
                    {
                        i = i.getSiguienteNodo().getSiguienteNodo();
                        verificado = true;
                    }
                }
                if(verificado == false)
                {
                    i = i.getSiguienteNodo();
                }
            }
         
            cont++;
            verificados[cont] =mayorNodo.getDato().intValue();
            System.out.println(mayorNodo.getDato().intValue());
            mayorNodo = this.head;
            if(cont == this.tamaño-1)
            {
                z = 0;
            }
            
            
        }
    }
    
}
