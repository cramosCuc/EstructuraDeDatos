
package edatos;


public class Pila <E> {//<Generic>
    private Nodo top;
    private int size;

    public Pila() {
        this.top = null;
        this.size = 0;   
    }
    
    public void push(E valor){
    Nodo <E> nodo = new Nodo(valor);
    if(this.isEmpty()){
        this.setTop(nodo);
        top.setLink(null);
    } else {
        nodo.setLink(top);
        this.setTop(nodo);
    }
    this.setSize(this.getSize()+1);
    }
    
    public Nodo pull(){
      if(!this.isEmpty()){
       Nodo<E> nodo = this.getTop();  
       this.setTop(nodo.getLink());
       this.setSize(this.getSize()-1);
       nodo.setLink(null);
       return nodo;
      } else {
       return null;  
      }
    }
    
    public Nodo peek(){
       if (this.top != null)
           return this.getTop();   
        else
           return null;
    }

    public Nodo getTop() {
        return top;
    }

    public void setTop(Nodo top) {
        this.top = top;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        if(size > 0)
        this.size = size;
        else
        this.size = 0;
    }
    
    public boolean isEmpty(){
       return (top == null); //return ((top == null)? true : false);    
    }

    
    public void display() {//metodo to string
        
        Nodo<E> nodo = this.getTop();
        System.out.println("El tamaño de la pila es: "+this.getSize());
        while (nodo != null){
            System.out.println(nodo.getValor().toString());
            nodo = nodo.getLink();
        }
    }   
}