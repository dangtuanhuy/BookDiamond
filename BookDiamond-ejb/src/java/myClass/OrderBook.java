/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myClass;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author HUYHP
 */
@Entity
@Table(name = "OrderBook")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OrderBook.findAll", query = "SELECT o FROM OrderBook o")
    , @NamedQuery(name = "OrderBook.findByTreeOrderId", query = "SELECT o FROM OrderBook o WHERE o.orderBookPK.treeOrderId = :treeOrderId")
    , @NamedQuery(name = "OrderBook.findByOrderId", query = "SELECT o FROM OrderBook o WHERE o.orderBookPK.orderId = :orderId")
    , @NamedQuery(name = "OrderBook.findByBookOrderQuantity", query = "SELECT o FROM OrderBook o WHERE o.bookOrderQuantity = :bookOrderQuantity")
    , @NamedQuery(name = "OrderBook.findByBookSoldPrice", query = "SELECT o FROM OrderBook o WHERE o.bookSoldPrice = :bookSoldPrice")
    , @NamedQuery(name = "OrderBook.findByBookOriginalPrice", query = "SELECT o FROM OrderBook o WHERE o.bookOriginalPrice = :bookOriginalPrice")})
public class OrderBook implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected OrderBookPK orderBookPK;
    @Basic(optional = false)
    @NotNull
    @Column(name = "BookOrderQuantity")
    private int bookOrderQuantity;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "BookSoldPrice")
    private BigDecimal bookSoldPrice;
    @Basic(optional = false)
    @NotNull
    @Column(name = "BookOriginalPrice")
    private BigDecimal bookOriginalPrice;
    @JoinColumn(name = "TreeOrderId", referencedColumnName = "BookId", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Books books;
    @JoinColumn(name = "OrderId", referencedColumnName = "OrderId", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Order1 order1;

    public OrderBook() {
    }

    public OrderBook(OrderBookPK orderBookPK) {
        this.orderBookPK = orderBookPK;
    }

    public OrderBook(OrderBookPK orderBookPK, int bookOrderQuantity, BigDecimal bookSoldPrice, BigDecimal bookOriginalPrice) {
        this.orderBookPK = orderBookPK;
        this.bookOrderQuantity = bookOrderQuantity;
        this.bookSoldPrice = bookSoldPrice;
        this.bookOriginalPrice = bookOriginalPrice;
    }

    public OrderBook(int treeOrderId, int orderId) {
        this.orderBookPK = new OrderBookPK(treeOrderId, orderId);
    }

    public OrderBookPK getOrderBookPK() {
        return orderBookPK;
    }

    public void setOrderBookPK(OrderBookPK orderBookPK) {
        this.orderBookPK = orderBookPK;
    }

    public int getBookOrderQuantity() {
        return bookOrderQuantity;
    }

    public void setBookOrderQuantity(int bookOrderQuantity) {
        this.bookOrderQuantity = bookOrderQuantity;
    }

    public BigDecimal getBookSoldPrice() {
        return bookSoldPrice;
    }

    public void setBookSoldPrice(BigDecimal bookSoldPrice) {
        this.bookSoldPrice = bookSoldPrice;
    }

    public BigDecimal getBookOriginalPrice() {
        return bookOriginalPrice;
    }

    public void setBookOriginalPrice(BigDecimal bookOriginalPrice) {
        this.bookOriginalPrice = bookOriginalPrice;
    }

    public Books getBooks() {
        return books;
    }

    public void setBooks(Books books) {
        this.books = books;
    }

    public Order1 getOrder1() {
        return order1;
    }

    public void setOrder1(Order1 order1) {
        this.order1 = order1;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (orderBookPK != null ? orderBookPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OrderBook)) {
            return false;
        }
        OrderBook other = (OrderBook) object;
        if ((this.orderBookPK == null && other.orderBookPK != null) || (this.orderBookPK != null && !this.orderBookPK.equals(other.orderBookPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "myClass.OrderBook[ orderBookPK=" + orderBookPK + " ]";
    }
    
}
