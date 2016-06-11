package propertyshop;

class Property {
    protected String nombre;
    protected String direccion;
    protected double metros_contruidos;
    protected double metros_utiles;
    protected String propietario;
    protected String direccion_propietario;
    protected int precio;

    /**
     * 
     * @param nam 
     */
    public void setName (String nam){   
		if (nam != null )        
			nombre = nam.trim().toLowerCase();
    }

    /**
     * 
     * @return 
     */
    public String getName (){           
        return nombre;
    }

    /**
     * 
     * @param dir 
     */
    public void setAddress (String dir){  
		 if (dir != null)         
			direccion = dir.trim().toUpperCase();
    } 

    /**
     * 
     * @return 
     */
    public String getAddress (){           
        return direccion;
    }   

    /**
     * 
     * @param contruct 
     */
    public void setConstructedSurface(double contruct){
        if ( contruct > 0 )
            metros_contruidos = contruct; 
    }

    /**
     * 
     * @return 
     */
    public double getConstructedSurface (){        
        return metros_contruidos;
    } 

    /**
     * 
     * @param available 
     */
    public void setAvailableSurface(double available){
        if ( available > 0 )
            metros_utiles = available;              
    }

    /**
     * 
     * @return 
     */
    public double getAvailableSurface (){           

        return metros_utiles;
    } 

    /**
     * 
     * @param owner 
     */
    public void setOwner(String owner){
		propietario = owner;

    }

    /**
     * 
     * @return 
     */
    public String getOwner (){           

        return propietario;
    }  

    /**
     * 
     * @param owneraddress 
     */
    public void setOwnerAddress(String owneraddress){
		if ( owneraddress != null )
			direccion_propietario =  owneraddress;  
    }

    /**
     * 
     * @return 
     */
    public String getOwnerAddress (){           
        return direccion_propietario;
    }  

    /**
     * 
     * @param price 
     */
    public void setPrice(int price){
        if (price > 0)
            precio =  price; 
    }

    /**
     * 
     * @return 
     */
    public int getPrice (){           
        return precio;
    }           
}
