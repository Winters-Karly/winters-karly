/*
 * The Game() class file for the cityOfAaron project.
 * CIT-260
 * Spring 2018
 * Team Members: Gianna Echegaray, Hernan Rodriguez, Karly Winters
 */
package byui.cit260.model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Gianna
 */
public class Game implements Serializable{

    public static void setCurrentGame(Game theGame) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private Player thePlayer;
    private CropData cropData;
    private ArrayList<ListItem> items = new ArrayList<>();
    private ArrayList<ListItem> animals = new ArrayList<>();
    private ArrayList<ListItem> tools = new ArrayList<>();
    private ArrayList<ListItem> provisions = new ArrayList<>();
    private Map map;
    
    public Game() {
    }

    //Player
    public Player getThePlayer() {
        return thePlayer;
    }

    public void setThePlayer(Player thePlayer) {
        this.thePlayer = thePlayer;
    }

    //CropData
    public CropData getCropData() {
        return cropData;
    }

    public void setCropData(CropData cropData) {
        this.cropData = cropData;
    }

    //ListItem
    public ArrayList<ListItem> getItems() {
        return items;
    }

    public void setItems(ArrayList<ListItem> items) {
        this.items = items;
    }

    public ArrayList<ListItem> getAnimals() {
        return animals;
    }

    public void setAnimals(ArrayList<ListItem> animals) {
        this.animals = animals;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public ArrayList<ListItem> getTools() {
        return tools;
    }

    public void setTools(ArrayList<ListItem> tools) {
        this.tools = tools;
    }

    public ArrayList<ListItem> getProvisions() {
        return provisions;
    }

    public void setProvisions(ArrayList<ListItem> provisions) {
        this.provisions = provisions;
    }
    
    

 }
