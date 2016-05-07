package veterinario;

import java.util.ArrayList;

/**
 *
 * @author Jose Vicente 
 */
public class mascota {
    private int codigo;
    private String alias;  
    private String especie;
    private String color;
    private String fechaNacimiento;
    private double pesoMedio;
    private double pesoActual;
    private ArrayList <historialmedico> historialMedico = new ArrayList<>();
    private ArrayList <calendariovacuna> calendarioVacuna = new ArrayList<>();
    private String raza;
    private int numVisitas;
    /**
     * Devuelve el codigo de la mascota
     * @return 
     */
    public int getCodigo(){
        return codigo;
    }
    /**
     * Asigna el codigo de la mascota
     * @param cod 
     */
    public void setCodigo(int cod){
        codigo = cod;
    }     
    /**
     * Devuelve el alias de la mascota
     * @return 
     */
    public String getAlias(){
        return alias;
    } 
    /**
     * Asigna el alias a la mascota
     * @param ali 
     */
    public void setAlias(String ali){
        alias = ali;
    } 
    /**
     * Devuelve el tipo de especie
     * @return 
     */
    public String getEspecie(){
        return especie;
    } 
    /**
     * Asigna el tipo de especie
     * @param esp 
     */
    public void setEspecie(String esp){
        especie = esp;
    } 
    /**
     * Devuelve el color
     * @return 
     */
    public String getColor(){
        return color;
    } 
    /**
     * Asigna el color
     * @param col 
     */
    public void setColor(String col){
        color = col;
    }
    /**
     * Devuelve la fecha de nacimiento
     * @return 
     */
    public String getFechaNac(){
        return fechaNacimiento;
    }
    /**
     * Asgna la fecha de nacimiento
     * @param dat 
     */
    public void setFechaNac(String dat){
        fechaNacimiento = dat;
    }
    /**
     * Devuelve la raza de la mascota
     * @return 
     */
    public String getRaza(){
        return raza;
    }
    /**
     * Asigna la raza de la mascota
     * @param raz 
     */
    public void setRaza(String raz){
        raza = raz;
    }
    /**
     * Devuelve el peso medio
     * @return 
     */
    public double getPesoMedio(){
        return pesoMedio;
    } 
    /**
     * S asigna el peso medio
     * @param pes 
     */
    public void setPesoMedio(double pes){
        pesoMedio = pes;
    } 
    /**
     * Devuelve el peso actual
     * @return 
     */
    public double getPesoActual(){
        return pesoActual;
    } 
    /**
     * Asiga el peso actual
     * @param pes 
     */
    public void setPesoActual(double pes){
        pesoActual = pes;
    } 
    /**
     * Devuelve el numero de visitas
     * @return 
     */
    public int getNumVis(){
        return numVisitas;
    }  
    /**
     * Asigna el numero de visitas
     * @param vis 
     */
    public void setNumVis(int vis){
        numVisitas = vis;
    }  
    /**
     * Devuelve el historial medico de la mascota
     * @return 
     */
    public ArrayList<historialmedico> getHistorialMed(){
        return historialMedico;
    }
    /**
     * Añade historial medico
     * @param his 
     */
    public void addHistorialMed(historialmedico his){
        historialMedico.add(his);
    }  
    /**
     * Borra un elemento del historial medico
     * @param his 
     */
    public void delHistorialMed(historialmedico his){
        historialMedico.remove(his);
    }      
    /**
     * Devuelve el historial de vacunacion de la mascota
     * @return 
     */
    public ArrayList<calendariovacuna> getCalendarioVac(){
        return calendarioVacuna;
    }
    /**
     * Añade un elemento al calendario de vacunacion
     * @param his 
     */
    public void addValendarioVac(calendariovacuna his){
        calendarioVacuna.add(his);
    }
    /**
     * Borra un elemento del calendario de vacunacion
     * @param his 
     */
    public void delCalendarioVac(calendariovacuna his){
        calendarioVacuna.remove(his);
    }     
}
