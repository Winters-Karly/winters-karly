/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.model;

import java.io.Serializable;

/**
 *
 * @author Gianna
 */
public class ListItem implements Serializable {
    
    //class instance variables
    private String name;
    private int number;

    //contructor
    public ListItem() {
    }

    //getting and setting   

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    

   
    
    
}
