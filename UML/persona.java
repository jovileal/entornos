package veterinario;

/**
 *
 * @author Jose Vicente
 */
public class persona {
    private String DNI;
    private String nombre;
  
    /**
     * Devuelve el nombre
     * @return 
     */
    public String getNombre(){
        return nombre;
    }
    /**
     * Actualiza el nombre 
     * @param nom
     */
    public void setNombre(String nom){
        nombre = nom;
    }
    /**
     * Devuelve el DNI
     * @return 
     */
    public String getDNI(){
        return DNI;
    }      
 
}
