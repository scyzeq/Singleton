/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

import java.util.ArrayList;

/**
 *
 * @author AJuda
 */
public class Singleton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
               
        ArrayList<ApplicationOfSingleton> applicationList = new ArrayList<>();
        
        applicationList.add(ApplicationOfSingleton.getApplication());
        applicationList.add(ApplicationOfSingleton.getApplication());
        applicationList.add(ApplicationOfSingleton.getApplication());
        
        applicationList.forEach(System.out::println);
    }
    
}
