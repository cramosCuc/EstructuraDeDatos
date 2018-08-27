
package edatos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Edatos {
    public static void main(String[] args) {
        
        /*Pila*/
        /*
        Pila<String> mipila = new Pila();
        mipila.push("Mbappé");
        mipila.push("Yerri");
        mipila.push("Modric");
        mipila.push("Lukaku");
        mipila.display();
        System.out.println("En el tope está: "+mipila.peek().getValor());
        Nodo<String> nodo = mipila.pull();
        System.out.println("Eliminé a: "+nodo.getValor().toString());
        mipila.display();
        */       
        /*Cadena*/
        /*
        String cadena=getString("datos.txt");
        System.out.println("La cadena es : " +cadena);
        if (validarExpresion(cadena)){
            System.out.println("TODO BIEN TODO BIEN");
        } else{
            System.out.println("LA CADENA VALIÓ MONDÁ");
        }
        */
        /*Cola*/
        /*Cola<String> cola = new Cola();
        cola.enqueue("E20");
        cola.enqueue("E11");
        cola.enqueue("E32");
        cola.enqueue("E23");
        cola.enqueue("E25");
        cola.display();
        Nodo<String> nodo = cola.dequeue();
        System.out.println("Se atendió el nodo: "+nodo.getValor());
        cola.display();
        */
        System.out.println("HashTable");
        
        Persona p1= new Persona("138472934", "Carlos Eduardo", "Ramos Villera", "cramos@cuc.edu.co", "3043377541");
        Persona p2= new Persona("138443975", "Cristian Daniel", "Aragón Peñafiel", "caragon@cuc.edu.co", "304245934");
        Persona p3= new Persona("138423422", "Diego Andrés", "Molina Estrén", "dmolina@cuc.edu.co", "30345641");
        Persona p4= new Persona("234987293", "Radamel", "Falcao Garcia", "rfalcao@cuc.edu.co", "304676541");
        
        Contacto misContactos = new Contacto();
        
        misContactos.adicionar(p1);
        misContactos.adicionar(p2);
        misContactos.adicionar(p3);
        misContactos.adicionar(p4);

        misContactos.display();
        Persona p99=misContactos.buscar("138472934");
        if (p99 != null)
            System.out.println("Contacto encontrado y es: "+p99.getNombreCompleto());
        else 
            System.out.println("Contacto no hallado");
    }
    public static String getString(String archivo){
        String cadena = "";
        try {
            FileReader file = new FileReader(archivo);
            BufferedReader br  = new BufferedReader(file);
            try {
                cadena = br.readLine();
            } catch (IOException ex) {
                System.out.println("No se lee");
            }
        } catch (FileNotFoundException ex) {
            System.out.println("No hay nada");
        }
        return cadena;
    }
    public static boolean validarExpresion(String cadena){
        Pila <Character> pila = new Pila();  
        char actual, anterior;
        for (int i = 0; i <cadena.length(); i++) {
            actual= cadena.charAt(i);
            if(actual == '{' || actual == '[' || actual == '(' ){
                pila.push(actual);
            } else if (!pila.isEmpty()){
                anterior =(char)pila.peek().getValor();
                if(actual == '}' && anterior == '{' || actual == ']' && anterior == '[' || actual == ')' && anterior == '('){
                 pila.pull();  
                } 
            } 
        }
    return pila.isEmpty();
    }
}
