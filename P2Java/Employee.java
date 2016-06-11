package crewmanagement;

/**
 * 
 * @author Jose Vicente Leal
 */

public class Employee {
    protected String name;
    protected String surname;
    protected String dni;
    protected Turn[] turn ;
    protected int turnCount = 0;
    /**
     * 
     */
    Employee (){
    }
    /**
     * 
     * @param aName
     * @param aSurname 
     */
    Employee (String aName, String aSurname){
        if(aName != null && aSurname != null)
        {
            name = aName;
            surname = aSurname;            
        }
    }    
    /**
     * 
     * @param aDNI
     * @param aName
     * @param aSurname 
     */
    Employee (String aDNI,String aName, String aSurname){
        String calcDNI =String.valueOf(aDNI.substring(0, 8)) + "TRWAGMYFPDXBNJZSQVHLCKE".charAt(Integer.parseInt(aDNI.substring(0, 8)) % 23);

        if((aName != null) && (aSurname != null) && (aDNI.toUpperCase().equals(calcDNI)))
        {     
            name = aName;
            surname = aSurname;
            dni= aDNI;     
        }
    } 
    /**
     * 
     * @param aName 
     */
    public void setName(String aName){
        if( aName != null)
            name = aName;
    }  
    /**
     * 
     * @return 
     */
    public String getName(){
        return name;
    } 
    /**
     * 
     * @param aSurname 
     */
    public void setSurname(String aSurname){
        if( aSurname != null)
            surname = aSurname;
    } 
    /**
     * 
     * @return 
     */
    public String getSurname(){
        return surname;
    }
    /**
     * 
     * @param nameInUppercase
     * @param surnameInUpperCase
     * @return 
     */
    public String getFullName(boolean nameInUppercase, boolean surnameInUpperCase){
        if (nameInUppercase == true && surnameInUpperCase == true )
            return name.toUpperCase()+", "+surname.toUpperCase();
        else if (nameInUppercase == true && surnameInUpperCase == false )
            return name.toUpperCase()+", "+surname.toLowerCase();
        else if (nameInUppercase == false && surnameInUpperCase == true )
            return name.toLowerCase()+", "+surname.toUpperCase();
        else
            return name.toLowerCase()+", "+surname.toLowerCase();
    } 
    /**
     * 
     * @param aDNI 
     */
    public void setDNI(String aDNI){
        if (aDNI != null)
        {
            if (aDNI.length() == 9)
            {
                String calcDNI =String.valueOf(aDNI.substring(0, 8)) + "TRWAGMYFPDXBNJZSQVHLCKE".charAt(Integer.parseInt(aDNI.substring(0, 8)) % 23);
                if (calcDNI.equals(aDNI.toUpperCase()))
                    dni = aDNI;
            }
        }
    }
    /**
     * 
     * @return 
     */
    public String getDNI(){
        return dni;
    }

   /**
    * 
    * @param t 
    */
    public void addTurn(Turn t){
        if (t != null)
        {
            if ( getTurnCount()< 7){
                
                int count = getTurnCount();
                Turn[] turnTemp = new Turn[count+1];
                
                for (int i = 0; i < getTurnCount(); i++) {
                    turnTemp[i] = turn[i];
                }
                    turnTemp[count] = t;
                    turn = turnTemp;
                    turnCount++;
            }
        }
    } 
    /**
     * 
     * @param aDay
     */
    public void removeTurn(String aDay ){
        if (aDay != null){
            if (turnCount > 0 ){
            {
                int count = 0;
                for (int i = 0; i < turnCount; i++) {
                    if (turn[i].getDay().equals(aDay.toUpperCase())) {
                        count++;
                    }
                } 
                Turn[] turntemp = new Turn[turnCount-count];
                
                int counttemp = 0;
                for (int i = 0 ; i < turnCount; i++)  {
                    if (!turn[i].getDay().equals(aDay.toUpperCase())) {
                        //System.out.println("Eliminado "+ turn[i].getDay());
                        turntemp[counttemp] = turn[i];
                        counttemp++;
                    }
                }
                turn = turntemp;
                turnCount -=count;
                }  
            } 
        }
    }
    /**
     * 
     * @return 
     */
    public int getTurnCount( ){             
        return turnCount;
    }
  
    /**
     * 
     * @param anIndex
     * @return 
     */
    public Turn getTurnAt(int anIndex){
        if (anIndex < getTurnCount() && anIndex >= 0){
            return turn[anIndex];
        }
        return null;
    }
    
    /**
     * 
     * @return 
     */
    public Turn[] getTurns(){
            return turn;
    }    
}
