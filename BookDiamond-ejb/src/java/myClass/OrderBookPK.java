/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myClass;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author HUYHP
 */
@Embeddable
public class OrderBookPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "TreeOrderId")
    private int treeOrderId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "OrderId")
    private int orderId;

    public OrderBookPK() {
    }

    public OrderBookPK(int treeOrderId, int orderId) {
        this.treeOrderId = treeOrderId;
        this.orderId = orderId;
    }

    public int getTreeOrderId() {
        return treeOrderId;
    }

    public void setTreeOrderId(int treeOrderId) {
        this.treeOrderId = treeOrderId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) treeOrderId;
        hash += (int) orderId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OrderBookPK)) {
            return false;
        }
        OrderBookPK other = (OrderBookPK) object;
        if (this.treeOrderId != other.treeOrderId) {
            return false;
        }
        if (this.orderId != other.orderId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "myClass.OrderBookPK[ treeOrderId=" + treeOrderId + ", orderId=" + orderId + " ]";
    }
    
}
