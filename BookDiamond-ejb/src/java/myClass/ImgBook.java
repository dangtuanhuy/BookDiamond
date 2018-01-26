/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myClass;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author HUYHP
 */
@Entity
@Table(name = "ImgBook")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ImgBook.findAll", query = "SELECT i FROM ImgBook i")
    , @NamedQuery(name = "ImgBook.findByImgBookId", query = "SELECT i FROM ImgBook i WHERE i.imgBookId = :imgBookId")
    , @NamedQuery(name = "ImgBook.findByImgBook", query = "SELECT i FROM ImgBook i WHERE i.imgBook = :imgBook")})
public class ImgBook implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ImgBookId")
    private Integer imgBookId;
    @Size(max = 450)
    @Column(name = "ImgBook")
    private String imgBook;
    @JoinColumn(name = "BookId", referencedColumnName = "BookId")
    @ManyToOne(optional = false)
    private Books bookId;

    public ImgBook() {
    }

    public ImgBook(Integer imgBookId) {
        this.imgBookId = imgBookId;
    }

    public Integer getImgBookId() {
        return imgBookId;
    }

    public void setImgBookId(Integer imgBookId) {
        this.imgBookId = imgBookId;
    }

    public String getImgBook() {
        return imgBook;
    }

    public void setImgBook(String imgBook) {
        this.imgBook = imgBook;
    }

    public Books getBookId() {
        return bookId;
    }

    public void setBookId(Books bookId) {
        this.bookId = bookId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (imgBookId != null ? imgBookId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ImgBook)) {
            return false;
        }
        ImgBook other = (ImgBook) object;
        if ((this.imgBookId == null && other.imgBookId != null) || (this.imgBookId != null && !this.imgBookId.equals(other.imgBookId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "myClass.ImgBook[ imgBookId=" + imgBookId + " ]";
    }
    
}
