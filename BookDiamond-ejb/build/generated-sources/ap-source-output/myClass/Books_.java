package myClass;

import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import myClass.Author;
import myClass.Category;
import myClass.ImgBook;
import myClass.OrderBook;
import myClass.Promotion;
import myClass.Publisher;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-01-26T11:37:28")
@StaticMetamodel(Books.class)
public class Books_ { 

    public static volatile SingularAttribute<Books, Integer> bookSold;
    public static volatile CollectionAttribute<Books, OrderBook> orderBookCollection;
    public static volatile SingularAttribute<Books, String> bookDetails;
    public static volatile SingularAttribute<Books, String> bookNames;
    public static volatile SingularAttribute<Books, Author> authorId;
    public static volatile SingularAttribute<Books, Integer> bookId;
    public static volatile SingularAttribute<Books, Publisher> publisherId;
    public static volatile SingularAttribute<Books, Integer> bookQuantity;
    public static volatile CollectionAttribute<Books, Promotion> promotionCollection;
    public static volatile CollectionAttribute<Books, ImgBook> imgBookCollection;
    public static volatile SingularAttribute<Books, Date> bookUpdate;
    public static volatile SingularAttribute<Books, BigDecimal> bookPrice;
    public static volatile SingularAttribute<Books, Category> categoryId;

}