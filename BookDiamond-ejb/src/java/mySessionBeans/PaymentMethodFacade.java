/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mySessionBeans;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import myClass.PaymentMethod;

/**
 *
 * @author HUYHP
 */
@Stateless
public class PaymentMethodFacade extends AbstractFacade<PaymentMethod> implements PaymentMethodFacadeLocal {

    @PersistenceContext(unitName = "BookDiamond-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PaymentMethodFacade() {
        super(PaymentMethod.class);
    }
    
}
