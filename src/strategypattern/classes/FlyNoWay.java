/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategypattern.classes;

import strategypattern.interfaces.FlyBehaviour;

/**
 *
 * @author rajajawahar
 */
public class FlyNoWay implements FlyBehaviour{

    @Override
    public void Fly() {
                System.out.print("I can't fly");

    }
    
}
