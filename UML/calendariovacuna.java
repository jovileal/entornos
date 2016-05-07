package veterinario;

/**
 *
 * @author Jose Vicente
 */
public class calendariovacuna {
    private String enfermedad;
    private String fecha;
    /**
     * Devuelve el nombre de la enfermedad
     * @return 
     */
    public String getEnfermedad(){
        return enfermedad;
    }
    /**
     * Asigna el nombre de la enfermedad
     * @param enf 
     */
    public void setEnfermedad(String enf){
        enfermedad = enf;
    }     
    /**
     * Devuelve la fecha de la enfermedad
     * @return 
     */
    public String getFecha(){
        return fecha;
    }
    /**
     * Asigna la fecha de la enfermedad
     * @param fech 
     */
    public void setFecha(String fech){
        fecha = fech;
    }    
}
