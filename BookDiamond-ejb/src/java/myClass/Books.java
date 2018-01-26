/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myClass;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
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
@Table(name = "Books")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Books.findAll", query = "SELECT b FROM Books b")
    , @NamedQuery(name = "Books.findByBookId", query = "SELECT b FROM Books b WHERE b.bookId = :bookId")
    , @NamedQuery(name = "Books.findByBookNames", query = "SELECT b FROM Books b WHERE b.bookNames = :bookNames")
    , @NamedQuery(name = "Books.findByBookDetails", query = "SELECT b FROM Books b WHERE b.bookDetails = :bookDetails")
    , @NamedQuery(name = "Books.findByBookUpdate", query = "SELECT b FROM Books b WHERE b.bookUpdate = :bookUpdate")
    , @NamedQuery(name = "Books.findByBookPrice", query = "SELECT b FROM Books b WHERE b.bookPrice = :bookPrice")
    , @NamedQuery(name = "Books.findByBookQuantity", query = "SELECT b FROM Books b WHERE b.bookQuantity = :bookQuantity")
    , @NamedQuery(name = "Books.findByBookSold", query = "SELECT b FROM Books b WHERE b.bookSold = :bookSold")})
public class Books implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "BookId")
    private Integer bookId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "BookNames")
    private String bookNames;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 250)
    @Column(name = "BookDetails")
    private String bookDetails;
    @Basic(optional = false)
    @NotNull
    @Column(name = "BookUpdate")
    @Temporal(TemporalType.DATE)
    private Date bookUpdate;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "BookPrice")
    private BigDecimal bookPrice;
    @Basic(optional = false)
    @NotNull
    @Column(name = "BookQuantity")
    private int bookQuantity;
    @Column(name = "BookSold")
    private Integer bookSold;
    @JoinTable(name = "Pro_Book", joinColumns = {
        @JoinColumn(name = "BookId", referencedColumnName = "BookId")}, inverseJoinColumns = {
        @JoinColumn(name = "PromotionId", referencedColumnName = "PromotionId")})
    @ManyToMany
    private Collection<Promotion> promotionCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "books")
    private Collection<OrderBook> orderBookCollection;
    @JoinColumn(name = "AuthorId", referencedColumnName = "AuthorId")
    @ManyToOne
    private Author authorId;
    @JoinColumn(name = "CategoryId", referencedColumnName = "CategoryId")
    @ManyToOne
    private Category categoryId;
    @JoinColumn(name = "PublisherId", referencedColumnName = "PublisherId")
    @ManyToOne
    private Publisher publisherId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "bookId")
    private Collection<ImgBook> imgBookCollection;

    public Books() {
    }

    public Books(Integer bookId) {
        this.bookId = bookId;
    }

    public Books(Integer bookId, String bookNames, String bookDetails, Date bookUpdate, BigDecimal bookPrice, int bookQuantity) {
        this.bookId = bookId;
        this.bookNames = bookNames;
        this.bookDetails = bookDetails;
        this.bookUpdate = bookUpdate;
        this.bookPrice = bookPrice;
        this.bookQuantity = bookQuantity;
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public String getBookNames() {
        return bookNames;
    }

    public void setBookNames(String bookNames) {
        this.bookNames = bookNames;
    }

    public String getBookDetails() {
        return bookDetails;
    }

    public void setBookDetails(String bookDetails) {
        this.bookDetails = bookDetails;
    }

    public Date getBookUpdate() {
        return bookUpdate;
    }

    public void setBookUpdate(Date bookUpdate) {
        this.bookUpdate = bookUpdate;
    }

    public BigDecimal getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(BigDecimal bookPrice) {
        this.bookPrice = bookPrice;
    }

    public int getBookQuantity() {
        return bookQuantity;
    }

    public void setBookQuantity(int bookQuantity) {
        this.bookQuantity = bookQuantity;
    }

    public Integer getBookSold() {
        return bookSold;
    }

    public void setBookSold(Integer bookSold) {
        this.bookSold = bookSold;
    }

    @XmlTransient
    public Collection<Promotion> getPromotionCollection() {
        return promotionCollection;
    }

    public void setPromotionCollection(Collection<Promotion> promotionCollection) {
        this.promotionCollection = promotionCollection;
    }

    @XmlTransient
    public Collection<OrderBook> getOrderBookCollection() {
        return orderBookCollection;
    }

    public void setOrderBookCollection(Collection<OrderBook> orderBookCollection) {
        this.orderBookCollection = orderBookCollection;
    }

    public Author getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Author authorId) {
        this.authorId = authorId;
    }

    public Category getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Category categoryId) {
        this.categoryId = categoryId;
    }

    public Publisher getPublisherId() {
        return publisherId;
    }

    public void setPublisherId(Publisher publisherId) {
        this.publisherId = publisherId;
    }

    @XmlTransient
    public Collection<ImgBook> getImgBookCollection() {
        return imgBookCollection;
    }

    public void setImgBookCollection(Collection<ImgBook> imgBookCollection) {
        this.imgBookCollection = imgBookCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (bookId != null ? bookId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Books)) {
            return false;
        }
        Books other = (Books) object;
        if ((this.bookId == null && other.bookId != null) || (this.bookId != null && !this.bookId.equals(other.bookId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "myClass.Books[ bookId=" + bookId + " ]";
    }
    
}
