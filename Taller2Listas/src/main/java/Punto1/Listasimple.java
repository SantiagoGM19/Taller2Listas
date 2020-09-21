/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author santi
 */
package Punto1;

/**
 *
 * @author santi
 */
public class Listasimple <T extends Number> implements Ilist<T>
{   
    public Nodo<T> head;
    public int suma;
    public int tamaño;
    
    public Listasimple()
    {
        this.head = null;
        this.suma = 0;
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
        
        nodo.setSiguienteNodo(this.head);
        
        this.head = nodo;
        
        this.tamaño++;
    }

    @Override
    public void EliminarUltimoNodo() 
    {
       
        for (Nodo<T> i = this.head; i != null; i.getSiguienteNodo()) 
        {
            if(i.getSiguienteNodo() == null)
            {
                i = null;
                this.tamaño--;
                break;
            }
        }
        
    }

    @Override
    public void MostrarDatos() 
    {
        Nodo<T> i = this.head;
        
        while(i != null)
        {
            System.out.println(i.getDato().intValue());
            i = i.getSiguienteNodo();
        }
    }
    
    
    
    public void mostrarDatoMayor()
    {
        if (this.ListaVacia() == true)
        {
            System.out.println("La lista está vacía");
        }
        else
        {
            int datoMayor = this.head.getDato().intValue();
            
            Nodo<T> i = this.head;
            
            while (i != null)
            {
                int datoSiguiente = i.getDato().intValue();
                if(datoMayor < datoSiguiente)
                {
                    datoMayor = datoSiguiente;
                }
                
                i = i.getSiguienteNodo();
     
            }
                 
            System.out.println("El mayor dato de la lista es: " + datoMayor);
        }
    }
    
    
    public void mostrarDatoMenor()
    {
        if (this.ListaVacia() == true)
        {
            System.out.println("La lista está vacia");
        }
        else
        {
            int datoMenor = this.head.getDato().intValue();
            Nodo<T> i = this.head;
            
            while (i != null)
            {
                int datoSiguiente = i.getDato().intValue();
                if (datoMenor > datoSiguiente)
                {
                    datoMenor = datoSiguiente;
                }
                
                i = i.getSiguienteNodo();
                
            }
                          
            System.out.println("El menor dato de la lista es: " + datoMenor);
        }
    }
    
    
    public void MostrarPromedio()
    {
        Nodo<T> i = this.head;
        
        while(i != null)
        {
            this.suma += i.getDato().intValue();
            i = i.getSiguienteNodo();
        }
        double promedio = this.suma/this.tamaño;
        System.out.println("El promedio de la lista es: " + promedio);
    }
        
    
}
