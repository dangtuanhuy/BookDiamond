/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myClass;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author HUYHP
 */
@Entity
@Table(name = "Order")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Order1.findAll", query = "SELECT o FROM Order1 o")
    , @NamedQuery(name = "Order1.findByOrderId", query = "SELECT o FROM Order1 o WHERE o.orderId = :orderId")
    , @NamedQuery(name = "Order1.findByOrderCreateDate", query = "SELECT o FROM Order1 o WHERE o.orderCreateDate = :orderCreateDate")
    , @NamedQuery(name = "Order1.findByOrderDeliverDate", query = "SELECT o FROM Order1 o WHERE o.orderDeliverDate = :orderDeliverDate")
    , @NamedQuery(name = "Order1.findByOrderDeliverPlace", query = "SELECT o FROM Order1 o WHERE o.orderDeliverPlace = :orderDeliverPlace")
    , @NamedQuery(name = "Order1.findByOrderStatus", query = "SELECT o FROM Order1 o WHERE o.orderStatus = :orderStatus")})
public class Order1 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "OrderId")
    private Integer orderId;
    @Column(name = "OrderCreateDate")
    @Temporal(TemporalType.DATE)
    private Date orderCreateDate;
    @Column(name = "OrderDeliverDate")
    @Temporal(TemporalType.DATE)
    private Date orderDeliverDate;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "OrderDeliverPlace")
    private String orderDeliverPlace;
    @Basic(optional = false)
    @NotNull
    @Column(name = "OrderStatus")
    private int orderStatus;
    @JoinColumn(name = "PaymentMethodId", referencedColumnName = "PaymentMethodId")
    @ManyToOne(optional = false)
    private PaymentMethod paymentMethodId;
    @JoinColumn(name = "Username", referencedColumnName = "Username")
    @ManyToOne(optional = false)
    private User username;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "order1")
    private Collection<OrderBook> orderBookCollection;

    public Order1() {
    }

    public Order1(Integer orderId) {
        this.orderId = orderId;
    }

    public Order1(Integer orderId, String orderDeliverPlace, int orderStatus) {
        this.orderId = orderId;
        this.orderDeliverPlace = orderDeliverPlace;
        this.orderStatus = orderStatus;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Date getOrderCreateDate() {
        return orderCreateDate;
    }

    public void setOrderCreateDate(Date orderCreateDate) {
        this.orderCreateDate = orderCreateDate;
    }

    public Date getOrderDeliverDate() {
        return orderDeliverDate;
    }

    public void setOrderDeliverDate(Date orderDeliverDate) {
        this.orderDeliverDate = orderDeliverDate;
    }

    public String getOrderDeliverPlace() {
        return orderDeliverPlace;
    }

    public void setOrderDeliverPlace(String orderDeliverPlace) {
        this.orderDeliverPlace = orderDeliverPlace;
    }

    public int getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(int orderStatus) {
        this.orderStatus = orderStatus;
    }

    public PaymentMethod getPaymentMethodId() {
        return paymentMethodId;
    }

    public void setPaymentMethodId(PaymentMethod paymentMethodId) {
        this.paymentMethodId = paymentMethodId;
    }

    public User getUsername() {
        return username;
    }

    public void setUsername(User username) {
        this.username = username;
    }

    @XmlTransient
    public Collection<OrderBook> getOrderBookCollection() {
        return orderBookCollection;
    }

    public void setOrderBookCollection(Collection<OrderBook> orderBookCollection) {
        this.orderBookCollection = orderBookCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (orderId != null ? orderId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Order1)) {
            return false;
        }
        Order1 other = (Order1) object;
        if ((this.orderId == null && other.orderId != null) || (this.orderId != null && !this.orderId.equals(other.orderId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "myClass.Order1[ orderId=" + orderId + " ]";
    }
    
}
