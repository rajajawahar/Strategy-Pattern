/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategypattern;

/**
 *
 * @author rajajawahar
 */
public class Simulator {
    
    public static void main(String[] args){
        Duck duck = new MallardDuck();
        duck.performFly();
        duck.performQuack();
        
    }    
}
