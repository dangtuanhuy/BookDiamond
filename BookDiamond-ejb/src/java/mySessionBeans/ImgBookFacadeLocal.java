/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mySessionBeans;

import java.util.List;
import javax.ejb.Local;
import myClass.ImgBook;

/**
 *
 * @author HUYHP
 */
@Local
public interface ImgBookFacadeLocal {

    void create(ImgBook imgBook);

    void edit(ImgBook imgBook);

    void remove(ImgBook imgBook);

    ImgBook find(Object id);

    List<ImgBook> findAll();

    List<ImgBook> findRange(int[] range);

    int count();
    
}
