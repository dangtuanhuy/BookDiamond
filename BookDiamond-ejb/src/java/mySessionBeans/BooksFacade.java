/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mySessionBeans;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import myClass.Books;

/**
 *
 * @author HUYHP
 */
@Stateless
public class BooksFacade extends AbstractFacade<Books> implements BooksFacadeLocal {

    @PersistenceContext(unitName = "BookDiamond-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public BooksFacade() {
        super(Books.class);
    }
    
}
