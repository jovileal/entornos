package veterinario;

import java.util.ArrayList;

/**
 *
 * @author Jose Vicente
 */
public class cliente {
    private int codigo;
    private String apellido;
    private String cuentaBancaria;
    private String direccion;
    private int telefono;
    private ArrayList <persona> personas = new ArrayList<>();
  
    /**
     * Devuelve el nombre
     * @return 
     */
    public int getCodigo(){
        return codigo;
    }
    /**
     * Actualizada el valor del codigo
     * @param cod 
     */
    public void setCodigo(int cod){
        codigo = cod;
    } 
    /**
     * Devuelve el apellido
     * @return 
     */
    public String getApellido(){
        return apellido;
    } 
    /**
     * Actualiza el apellido
     * @param ape 
     */
    public void setApellido(String ape){
        apellido = ape;
    }  /**
     * Devuelve la cuenta bancaria
     * @return 
     */    
    public String getcuentaBancaria(){
        return cuentaBancaria;
    } 
    /**
     * Actualizada la cuenta bancaria
     * @param cuenta 
     */
    public void setCuentaBancaria(String cuenta){
        cuentaBancaria = cuenta;
    }
    /**
     * Devuelve la direccion
     * @return 
     */
    public String getDireccion(){
        return direccion;
    }
    /**
     * Actualiza el campo direccion
     * @param dir 
     */
    public void setDireccion(String dir){
        direccion = dir;
    }
    /**
     * Devuelve el telefono
     * @return 
     */
    public int getTelefono(){
        return telefono;
    }/**
     *  Actualiza el campo telefono
     * @param tel 
     */ 
    public void setTelefono(int tel){
        telefono = tel;
    } 
    /**
     * Devuelve todas las personas del cliente
     * @return 
     */
    public ArrayList <persona> getPersonas(){
        return personas;
    }/**
     * Añade a una persona
     * @param p 
     */ 
    public void addPersonas(persona p){
        personas.add(p);
    }
    /**
     * Elima a una persona
     * @param p 
     */ 
    public void delPersonas(persona p){
        personas.remove(p);
    } 
    
}
