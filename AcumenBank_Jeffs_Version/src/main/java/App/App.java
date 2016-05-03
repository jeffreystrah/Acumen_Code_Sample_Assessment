/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App;

import Controllers.BankController;

/**
 *
 * @author apprentice
 */
public class App {
    public static void main(String[] args) {
        BankController bc = new BankController();
        
        bc.run();
    }
}
