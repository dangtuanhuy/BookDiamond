/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mySessionBeans;

import java.util.List;
import javax.ejb.Local;
import myClass.Promotion;

/**
 *
 * @author HUYHP
 */
@Local
public interface PromotionFacadeLocal {

    void create(Promotion promotion);

    void edit(Promotion promotion);

    void remove(Promotion promotion);

    Promotion find(Object id);

    List<Promotion> findAll();

    List<Promotion> findRange(int[] range);

    int count();
    
}
