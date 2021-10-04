
package dominio;

public class Persona {
    private String nombre;

    //constrictor
    public Persona(String nombre) {
       this.nombre= nombre;
    }

    //G&S
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
       this.nombre= nombre;
    }

    @Override
    public String toString() {
        return "nombre: " + nombre;
    }

    
    
    

}