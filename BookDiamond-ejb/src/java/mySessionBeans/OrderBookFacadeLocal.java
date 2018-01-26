/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mySessionBeans;

import java.util.List;
import javax.ejb.Local;
import myClass.OrderBook;

/**
 *
 * @author HUYHP
 */
@Local
public interface OrderBookFacadeLocal {

    void create(OrderBook orderBook);

    void edit(OrderBook orderBook);

    void remove(OrderBook orderBook);

    OrderBook find(Object id);

    List<OrderBook> findAll();

    List<OrderBook> findRange(int[] range);

    int count();
    
}
