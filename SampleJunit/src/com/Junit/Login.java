package com.Junit;

import java.util.Objects;

public class Login {

    public Login(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    private String name;
    private int quantity;

    public int getQty() {
        return quantity;
    }

    public void setQty(int qty) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public boolean equals(Object obj) {
       
    	if (this == obj) 
    		return true;
        
        if (obj == null || getClass() != obj.getClass()) 
        	return false;
       
        Login details = (Login) obj;
        
        return quantity == details.quantity &&
                
        Objects.equals(name, details.name);
    }
 
}
