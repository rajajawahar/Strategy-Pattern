/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategypattern;


import strategypattern.classes.FlyWithWings;



public class MallardDuck extends Duck {

    public MallardDuck() {
       flyBehaviour = new FlyWithWings();
    }
    
    

    @Override
    void display() {
        
    }

  

    
    
}
