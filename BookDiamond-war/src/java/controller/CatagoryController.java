/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.ejb.EJB;
import mySessionBeans.CategoryFacadeLocal;
import myClass.*;
import mySessionBeans.AbstractFacade.*;
import java.util.*;
import static java.util.Collections.list;

/**
 *
 * @author HUYHP
 */
@Named(value = "catagoryController")
@SessionScoped
public class CatagoryController implements Serializable {

    @EJB
    private CategoryFacadeLocal categoryFacade;
private  Category cate = new Category();
    public CatagoryController(CategoryFacadeLocal categoryFacade, int CategoryId, String CategoryName, String CategoryDescription) {
        this.categoryFacade = categoryFacade;
        this.CategoryId = CategoryId;
        this.CategoryName = CategoryName;
        this.CategoryDescription = CategoryDescription;
    }
    private int CategoryId;
    private String CategoryName;
    private  String CategoryDescription;
    public CatagoryController() {
    }

    public CategoryFacadeLocal getCategoryFacade() {
        return categoryFacade;
    }

    public void setCategoryFacade(CategoryFacadeLocal categoryFacade) {
        this.categoryFacade = categoryFacade;
    }

    public int getCategoryId() {
        return CategoryId;
    }

    public void setCategoryId(int CategoryId) {
        this.CategoryId = CategoryId;
    }

    public String getCategoryName() {
        return CategoryName;
    }

    public void setCategoryName(String CategoryName) {
        this.CategoryName = CategoryName;
    }

    public String getCategoryDescription() {
        return CategoryDescription;
    }

    public void setCategoryDescription(String CategoryDescription) {
        this.CategoryDescription = CategoryDescription;
    }
    //Lấy danh sách
    public  List<Category> findAll()
    {
        return this.categoryFacade.findAll();
    }
    //Add
    public  String add()
    { 
        this.categoryFacade.create(this.cate);
        this.cate = new Category();
    return  "index";
    }
    //Delete
    public  void delete(Category cate)
    {
        this.categoryFacade.remove(cate);
    }
    //Edit
    public  String update(Category cate)
    {
        this.cate = cate;
        return "update";
    }
    public  String update()
    {
        this.categoryFacade.edit(cate);
        this.cate = new Category();
        return "index";
    }
    public Category getCate() {
        return cate;
    }

    public void setCate(Category cate) {
        this.cate = cate;
    }
}
