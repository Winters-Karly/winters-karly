//The CropControl class- part of the control layer
//class contains all of the calculation methods for managing the crops
//Author: Karly Winters, Hernan Rodriguez, Gianna Echegaray
//Date last modified: May 2018

package byu.cit260.cropControl;

import byui.cit260.model.CropData;
import java.util.Random;

public class CropControl {
    
    
    private static final int LAND_BASE = 17;
    private static final int LAND_RANGE = 10;
    
    //random number generator
    private static Random random = new Random();
    

    /**
     * calcLandCost
     * Purpose: calculate a random land price between 17 and 26 bushels/acre
     * @params: none
     * @return: the land cost
     */
    public static int calcLandCost(){
        int landPrice = random.nextInt(LAND_RANGE) + LAND_BASE;
        return landPrice;
    }
    
    //The sellLand method
    //Purpose: To sell land
    //Parameters: the price of land, the number of acres to sell, and a 
    //            reference to a CropData object
    //Returns: the number of acres owned after the sale
    //Pre-conditions: acres to sell must be positive
    //                and <= acresOwned
    public static int sellLand(int landPrice, int acresToSell, CropData cropData)
    {
       //if acresToSell < 0, return -1
        if(acresToSell < 0)
            return -1;
        
       //if acresToSell > acresOwned, return -1
         int owned = cropData.getAcresOwned();
         if(acresToSell > owned)
             return -1;
         
       //acresOwned = acresOwned - acresToSell
         owned -= acresToSell;
         cropData.setAcresOwned(owned);
         
       //wheatInStore = wheatInStore + acresToSell * landPrice
         int wheat = cropData.getWheatInStore();
         wheat-= (acresToSell * landPrice);
         cropData.setWheatInStore(wheat);
         
       //return acresOwned
         return owned;
    }
    
 					
     //The buyLand method					
     //Purpose: To buy land					
     //@param price per acre					
     //@param the amount  of acres to buy					
     //@param a reference to the CropData object					
     //@return the number of acres owned after the purchase					
     //Pre-Conditions: acres to buy must be positive, 
     //                 have enough population and 
     //                 have wnough wheat for the purchase  					
					

    public static int buyLand( int acresToBuy,int pricePerAcre, CropData cropData)
    {
//      if acresToBuy < 0, THEN RETURN -1
        if(acresToBuy < 0)
            return -1;
        
//      if ( wheatInStore <  acresToBuy * pricePerAcre) THEN RETURN -1
        int wheat = cropData.getWheatInStore();
        if( wheat < acresToBuy * pricePerAcre)
            return -1;

//      if ( population * 10 <  (acresToBuy + acresOwned  ) ) THEN RETURN -1
        int population = cropData.getPopulation();
        int acresOwned = cropData.getAcresOwned();
        if( population * 10 < (acresToBuy + acresOwned))
            return -1;
        
        
//        acresOwned += acresToBuy;
        acresOwned += acresToBuy;
        cropData.setAcresOwned(acresOwned);

//      wheatInStore -= ( acresToBuy * pricePerAcre )
        wheat -= ( acresToBuy * pricePerAcre );
        cropData.setWheatInStore(wheat);
        
        return acresOwned;
    }
     
}
