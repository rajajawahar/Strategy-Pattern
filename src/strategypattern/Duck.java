
package strategypattern;

import strategypattern.interfaces.FlyBehaviour;
import strategypattern.interfaces.QuackBehaviour;

/**
 *
 * @author rajajawahar
 */
abstract public class Duck {
    
    abstract void display();
    
    FlyBehaviour flyBehaviour ;
    QuackBehaviour quackBehaviour;   
    
    
    Duck(){
    
    }
    
    public void performQuack(){
        if(quackBehaviour!=null)
        quackBehaviour.quack();
    }
    
    public void performFly(){
        flyBehaviour.Fly();
    }

    
    
 
}
