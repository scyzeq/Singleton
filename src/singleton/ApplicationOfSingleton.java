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
public class ApplicationOfSingleton {
    
    private static ApplicationOfSingleton application = null;
    private int value = 0;
    
    private ApplicationOfSingleton()
    {
        value++;
    }

    public static synchronized ApplicationOfSingleton getApplication() {
        if(application == null)
        {
            application = new ApplicationOfSingleton();
            return application;
        }
        return application;
    }
    
    public void showValue()
    {
        System.out.println("Value: " + value);
    }
    
}
