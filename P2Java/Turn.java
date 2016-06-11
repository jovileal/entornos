package crewmanagement;
/**
 * 
 * @author Jose Vicente Leal
 */
public class Turn {
    protected String aDay;
    protected int aInitHour;
    protected int aFinishHour;
    /**
     * 
     */
    Turn(){
    }
    /**
     * 
     * @param aDay 
     */
    Turn(String aDay){
       this.aDay = aDay.trim().toUpperCase();
    }   
    /**
     * 
     * @param aDay
     * @param aInitHour
     * @param aFinishHour 
     */ 
    Turn(String aDay, int aInitHour, int aFinishHour){
        if (( aDay != null) && (aInitHour != aFinishHour ) && (aInitHour > 0 ) 
				&& (aInitHour < 24 ) && (aFinishHour > 0 ) && (aFinishHour < 24 )){
            this.aDay = aDay.toUpperCase();
            this.aInitHour = aInitHour;
            this.aFinishHour = aFinishHour;
        }
    } 
    /**
     * 
     * @param aDay 
     */
    public void setDay(String aDay){
        if (aDay != null)
            this.aDay = aDay.toUpperCase();
    }
    /**
     * 
     * @return 
     */
    public String getDay(){
        return aDay;
    }  
    /**
     * 
     * @param aInitHour 
     */
    public void setInitHour(int aInitHour){
        if((aInitHour > 0 ) && (aInitHour < 24 ) )
            this.aInitHour = aInitHour;
    }
    /**
     * 
     * @return 
     */
    public int getInitHour(){
        return aInitHour;
    } 
    /**
     * 
     * @param aFinishHour 
     */
    public void setFinishHour(int aFinishHour){
        if((aFinishHour > 0 ) && (aFinishHour < 24 ))
            this.aFinishHour = aFinishHour;
    }
    /**
     * 
     * @return 
     */
    public int getFinishHour(){
        return aFinishHour;
    }     
}
