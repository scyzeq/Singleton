/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

/**
 *
 * @author AJuda
 */
public class Singleton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ApplicationOfSingleton[] application= new ApplicationOfSingleton[3];
        
        application[0]=ApplicationOfSingleton.getApplication();
        application[1]=ApplicationOfSingleton.getApplication();
        application[2]=ApplicationOfSingleton.getApplication();
        
        for (ApplicationOfSingleton val: application)
        {
            val.showValue();
        }
    }
    
}
