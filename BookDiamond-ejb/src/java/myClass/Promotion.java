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
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
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
@Table(name = "Promotion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Promotion.findAll", query = "SELECT p FROM Promotion p")
    , @NamedQuery(name = "Promotion.findByPromotionId", query = "SELECT p FROM Promotion p WHERE p.promotionId = :promotionId")
    , @NamedQuery(name = "Promotion.findByPromotionName", query = "SELECT p FROM Promotion p WHERE p.promotionName = :promotionName")
    , @NamedQuery(name = "Promotion.findByPromotionDiscount", query = "SELECT p FROM Promotion p WHERE p.promotionDiscount = :promotionDiscount")
    , @NamedQuery(name = "Promotion.findByPromotionContent", query = "SELECT p FROM Promotion p WHERE p.promotionContent = :promotionContent")
    , @NamedQuery(name = "Promotion.findByPromotionActive", query = "SELECT p FROM Promotion p WHERE p.promotionActive = :promotionActive")
    , @NamedQuery(name = "Promotion.findByPromotionClose", query = "SELECT p FROM Promotion p WHERE p.promotionClose = :promotionClose")
    , @NamedQuery(name = "Promotion.findByPromotionOpen", query = "SELECT p FROM Promotion p WHERE p.promotionOpen = :promotionOpen")})
public class Promotion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "PromotionId")
    private Integer promotionId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "PromotionName")
    private String promotionName;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PromotionDiscount")
    private int promotionDiscount;
    @Size(max = 50)
    @Column(name = "PromotionContent")
    private String promotionContent;
    @Column(name = "PromotionActive")
    @Temporal(TemporalType.DATE)
    private Date promotionActive;
    @Column(name = "PromotionClose")
    @Temporal(TemporalType.DATE)
    private Date promotionClose;
    @Column(name = "PromotionOpen")
    private Integer promotionOpen;
    @ManyToMany(mappedBy = "promotionCollection")
    private Collection<Books> booksCollection;

    public Promotion() {
    }

    public Promotion(Integer promotionId) {
        this.promotionId = promotionId;
    }

    public Promotion(Integer promotionId, String promotionName, int promotionDiscount) {
        this.promotionId = promotionId;
        this.promotionName = promotionName;
        this.promotionDiscount = promotionDiscount;
    }

    public Integer getPromotionId() {
        return promotionId;
    }

    public void setPromotionId(Integer promotionId) {
        this.promotionId = promotionId;
    }

    public String getPromotionName() {
        return promotionName;
    }

    public void setPromotionName(String promotionName) {
        this.promotionName = promotionName;
    }

    public int getPromotionDiscount() {
        return promotionDiscount;
    }

    public void setPromotionDiscount(int promotionDiscount) {
        this.promotionDiscount = promotionDiscount;
    }

    public String getPromotionContent() {
        return promotionContent;
    }

    public void setPromotionContent(String promotionContent) {
        this.promotionContent = promotionContent;
    }

    public Date getPromotionActive() {
        return promotionActive;
    }

    public void setPromotionActive(Date promotionActive) {
        this.promotionActive = promotionActive;
    }

    public Date getPromotionClose() {
        return promotionClose;
    }

    public void setPromotionClose(Date promotionClose) {
        this.promotionClose = promotionClose;
    }

    public Integer getPromotionOpen() {
        return promotionOpen;
    }

    public void setPromotionOpen(Integer promotionOpen) {
        this.promotionOpen = promotionOpen;
    }

    @XmlTransient
    public Collection<Books> getBooksCollection() {
        return booksCollection;
    }

    public void setBooksCollection(Collection<Books> booksCollection) {
        this.booksCollection = booksCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (promotionId != null ? promotionId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Promotion)) {
            return false;
        }
        Promotion other = (Promotion) object;
        if ((this.promotionId == null && other.promotionId != null) || (this.promotionId != null && !this.promotionId.equals(other.promotionId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "myClass.Promotion[ promotionId=" + promotionId + " ]";
    }
    
}
