//The CropControl class- part of the control layer
//class contains all of the calculation methods for managing the crops
//Author: Karly Winters, Hernan Rodriguez, Gianna Echegaray
//Date last modified: May 2018

package byu.cit260.cropControl;

import byu.cit260.controller.CropControl;
import byui.cit260.model.CropData;
import org.junit.Test;
import static org.junit.Assert.*;


public class CropControlTest {
    
    public CropControlTest() {
    }


    /**
     * Test of sellLand method, of class CropControl.
     */
//    @Test
//    public void testSellLand() {
//        System.out.println("sellLand");
//        int landPrice = 15;
//        int acresToSell = 10;
//        CropData theCrops = new CropData();
//        theCrops.setWheatInStore(1000);
//        theCrops.setAcresOwned(2800);
//        int expResult = 2790;
//        int result = CropControl.sellLand(landPrice, acresToSell, theCrops);
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of buyLand method, of class CropControl.
//     * Test 1
//     */
//    @Test
//    public void testBuyLand1() {
//        System.out.println("buyLand  - test 1");
//        
//        int acresToBuy = 50;
//        int pricePerAcre = 20;
//        CropData cropData = new CropData();
//        cropData.setWheatInStore(2000);
//        cropData.setPopulation(6);
//        cropData.setAcresOwned(10);
//        
//        int expResult = 60;
//        int result = CropControl.buyLand(acresToBuy, pricePerAcre, cropData);
//        assertEquals(expResult, result);
//    }
//    
//    /**
//     * Test of buyLand method, of class CropControl.
//     * Test 2
//     */
//    @Test
//    public void testBuyLand2() {
//        System.out.println("buyLand  - test 2");
//        
//        int acresToBuy = -50;
//        int pricePerAcre = 20;
//        CropData cropData = new CropData();
//        cropData.setWheatInStore(2000);
//        cropData.setPopulation(6);
//        cropData.setAcresOwned(10);
//        
//        int expResult = -1;
//        int result = CropControl.buyLand(acresToBuy, pricePerAcre, cropData);
//        assertEquals(expResult, result);
//    }
//    
//    /**
//     * Test of buyLand method, of class CropControl.
//     * Test 3
//     */
//    @Test
//    public void testBuyLand3() {
//        System.out.println("buyLand  - test 3");
//        
//        int acresToBuy = 50;
//        int pricePerAcre = 20;
//        CropData cropData = new CropData();
//        cropData.setWheatInStore(10);
//        cropData.setPopulation(6);
//        cropData.setAcresOwned(10);
//        
//        int expResult = -1;
//        int result = CropControl.buyLand(acresToBuy, pricePerAcre, cropData);
//        assertEquals(expResult, result);
//    }
//    
//    /**
//     * Test of buyLand method, of class CropControl.
//     * Test 4
//     */
//    @Test
//    public void testBuyLand4() {
//        System.out.println("buyLand  - test 4");
//        
//        int acresToBuy = 50;
//        int pricePerAcre = 20;
//        CropData cropData = new CropData();
//        cropData.setWheatInStore(2000);
//        cropData.setPopulation(1);
//        cropData.setAcresOwned(10);
//        
//        int expResult = -1;
//        int result = CropControl.buyLand(acresToBuy, pricePerAcre, cropData);
//        assertEquals(expResult, result);
//    }
//    
//    /**
//     * Test of buyLand method, of class CropControl.
//     * Test 5
//     */
//    @Test
//    public void testBuyLand5() {
//        System.out.println("buyLand  - test 5");
//        
//        int acresToBuy = 50;
//        int pricePerAcre = 20;
//        CropData cropData = new CropData();
//        cropData.setWheatInStore(1000);
//        cropData.setPopulation(6);
//        cropData.setAcresOwned(10);
//        
//        int expResult = 60;
//        int result = CropControl.buyLand(acresToBuy, pricePerAcre, cropData);
//        assertEquals(expResult, result);
//    }
//    
//    /**
//     * Test of buyLand method, of class CropControl.
//     * Test 6
//     */
//    @Test
//    public void testBuyLand6() {
//        System.out.println("buyLand  - test 6");
//        
//        int acresToBuy = 0;
//        int pricePerAcre = 20;
//        CropData cropData = new CropData();
//        cropData.setWheatInStore(1000);
//        cropData.setPopulation(6);
//        cropData.setAcresOwned(10);
//        
//        int expResult = 10;
//        int result = CropControl.buyLand(acresToBuy, pricePerAcre, cropData);
//        assertEquals(expResult, result);
//    }
//
//
//    /**
//     * Test of feedPeople method, of class CropControl.
//     * Test 1
//     */
//    @Test
//    public void testFeedPeople1() {
//        System.out.println("feedPeople - test 1");
//        int bushelsOfGrain = 100;
//        CropData cropData = new CropData();
//        cropData.setWheatInStore(1000);
//        
//        int expResult = 900;
//        int result = CropControl.feedPeople(bushelsOfGrain, cropData);
//        assertEquals(expResult, result);
//    }
//    
//        /**
//     * Test of feedPeople method, of class CropControl.
//     * Test 2
//     */
//    @Test
//    public void testFeedPeople2() {
//        System.out.println("feedPeople - test 2");
//        int bushelsOfGrain = -10;
//        CropData cropData = new CropData();
//        cropData.setWheatInStore(1000);
//        
//        int expResult = -1;
//        int result = CropControl.feedPeople(bushelsOfGrain, cropData);
//        assertEquals(expResult, result);
//    }
//        /**
//     * Test of feedPeople method, of class CropControl.
//     * Test 3
//     */
//    @Test
//    public void testFeedPeople3() {
//        System.out.println("feedPeople - test 3");
//        int bushelsOfGrain = 2000;
//        CropData cropData = new CropData();
//        cropData.setWheatInStore(1000);
//        
//        int expResult = -1;
//        int result = CropControl.feedPeople(bushelsOfGrain, cropData);
//        assertEquals(expResult, result);
//    }
//        /**
//     * Test of feedPeople method, of class CropControl.
//     * Test 4
//     */
//    @Test
//    public void testFeedPeople4() {
//        System.out.println("feedPeople - test 4");
//        int bushelsOfGrain = 0;
//        CropData cropData = new CropData();
//        cropData.setWheatInStore(1000);
//        
//        int expResult = 1000;
//        int result = CropControl.feedPeople(bushelsOfGrain, cropData);
//        assertEquals(expResult, result);
//    }
//    
//        /**
//     * Test of feedPeople method, of class CropControl.
//     * Test 5
//     */
//    @Test
//    public void testFeedPeople5() {
//        System.out.println("feedPeople - test 5");
//        int bushelsOfGrain = 1000;
//        CropData cropData = new CropData();
//        cropData.setWheatInStore(1000);
//        
//        int expResult = 0;
//        int result = CropControl.feedPeople(bushelsOfGrain, cropData);
//        assertEquals(expResult, result);
//    }
//    
//     /**
//     * Test of PlantCrops method, of class CropControl.
//     * Test 1
//     */
//    
//    @Test
//    public void testPlantCrops1() {
//        System.out.println("plantCrops - test 1");
//        
//        int acresToPlant = 6;
//        CropData cropData = new CropData();
//        cropData.setAcresOwned(60);
//        cropData.setWheatInStore(2000);
//        cropData.setAcresPlanted(0);
//        
//        int expResult = 1997;
//        int result = CropControl.plantCrops(acresToPlant, cropData);
//        assertEquals(expResult, result);
//    
//    }   
//    
//     /**
//     * Test of PlantCrops method, of class CropControl.
//     * Test 2
//     */
//    
//        @Test
//    public void testPlantCrops2() {
//        System.out.println("plantCrops - test 2");
// 
//        int acresToPlant = -6;
//        CropData cropData = new CropData();
//        cropData.setAcresOwned(60);
//        cropData.setWheatInStore(2000);
//        cropData.setAcresPlanted(0);
//        
//        int expResult = -1;
//        int result = CropControl.plantCrops(acresToPlant, cropData);
//        assertEquals(expResult, result);
//    
//    }  
//    
//     /**
//     * Test of PlantCrops method, of class CropControl.
//     * Test 3
//     */
//    
//        @Test
//    public void testPlantCrops3() {
//        System.out.println("plantCrops - test 3");
//
//        int acresToPlant = 6;
//        CropData cropData = new CropData();
//        cropData.setAcresOwned(3);
//        cropData.setWheatInStore(2000);
//        cropData.setAcresPlanted(0);
//        
//        int expResult = -1;
//        int result = CropControl.plantCrops(acresToPlant, cropData);
//        assertEquals(expResult, result);
//    
//    }  
//      
//     /**
//     * Test of PlantCrops method, of class CropControl.
//     * Test 4
//     */
//    
//        @Test
//    public void testPlantCrops4() {
//        System.out.println("plantCrops - test 4");
// 
//        int acresToPlant = 6;
//        CropData cropData = new CropData();
//        cropData.setAcresOwned(60);
//        cropData.setWheatInStore(2);
//        cropData.setAcresPlanted(0);
//        
//        int expResult = -1;
//        int result = CropControl.plantCrops(acresToPlant, cropData);
//        assertEquals(expResult, result);
//    }  
//    
//     /**
//     * Test of PlantCrops method, of class CropControl.
//     * Test 5
//     */
//   
//        @Test
//    public void testPlantCrops5() {
//        System.out.println("plantCrops - test 5");
// 
//        int acresToPlant = 60;
//        CropData cropData = new CropData();
//        cropData.setAcresOwned(60);
//        cropData.setWheatInStore(30);
//        cropData.setAcresPlanted(0);
//        
//        int expResult = 0;
//        int result = CropControl.plantCrops(acresToPlant, cropData);
//        assertEquals(expResult, result);
//    
//    }  
//    
//     /**
//     * Test of PlantCrops method, of class CropControl.
//     * Test 6
//     */
//    
//        @Test
//    public void testPlantCrops6() {
//        System.out.println("plantCrops - test 6");
//
//        int acresToPlant = 0;
//        CropData cropData = new CropData();
//        cropData.setAcresOwned(60);
//        cropData.setWheatInStore(2000);
//        cropData.setAcresPlanted(0);
//        
//        int expResult = 2000;
//        int result = CropControl.plantCrops(acresToPlant, cropData);
//        assertEquals(expResult, result);
//    
//    }
//    
//     /**
//     * Test of setOffering method, of class CropControl.
//     * Test 1
//     */
//    
//     @Test
//    public void setOffering1() {
//        System.out.println("setOffering - test 1");
//        
//        CropData cropData = new CropData();
//        int payOffering = 5;
//        // if within parameters, you're good. 
//    }
//    
//    /**
//     * Test of setOffering method, of class CropControl.
//     * Test 2
//     */
//    
//     @Test
//    public void setOffering2() {
//        System.out.println("setOffering - test 2");
//        
//        CropData cropData = new CropData();
//        int payOffering = -20;
//        // Not usable user input.
//    }
//    
//    /**
//     * Test of setOffering method, of class CropControl.
//     * Test 3
//     */
//    
//     @Test
//    public void setOffering3() {
//        System.out.println("setOffering - test 3");
//    
//        CropData cropData = new CropData();
//        int payOffering = 110;
//        // Not usable user input.
//    }
//    
//     /**
//     * Test of setOffering method, of class CropControl.
//     * Test 4
//     */
//    
//     @Test
//    public void setOffering4() {
//        System.out.println("setOffering - test 4");
//    
//        CropData cropData = new CropData();
//        int payOffering = 0;
//    }
//    
//     /**
//     * Test of setOffering method, of class CropControl.
//     * Test 5
//     */
//    
//     @Test
//    public void setOffering5() {
//        System.out.println("setOffering - test 5");
//    
//        CropData cropData = new CropData();
//        int payOffering = 100;
//    }
}
