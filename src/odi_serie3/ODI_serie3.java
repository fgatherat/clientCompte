package odi_serie3;

import business.Customer;

/**
 *
 * @author francois.gatherat
 */
public class ODI_serie3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Customer c1 = new Customer(1,"luc" ,"chevre");
        
        c1.addAccount("123", "epargne", 0.1);
        c1.getAccountByNumber("123").credit(100);
        c1.getAccountByNumber("123").debit(150);
        
    }
    
}
