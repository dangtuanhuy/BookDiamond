/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mySessionBeans;

import java.util.List;
import javax.ejb.Local;
import myClass.PaymentMethod;

/**
 *
 * @author HUYHP
 */
@Local
public interface PaymentMethodFacadeLocal {

    void create(PaymentMethod paymentMethod);

    void edit(PaymentMethod paymentMethod);

    void remove(PaymentMethod paymentMethod);

    PaymentMethod find(Object id);

    List<PaymentMethod> findAll();

    List<PaymentMethod> findRange(int[] range);

    int count();
    
}
