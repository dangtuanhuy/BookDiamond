package myClass;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import myClass.Books;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-01-26T11:37:28")
@StaticMetamodel(Promotion.class)
public class Promotion_ { 

    public static volatile SingularAttribute<Promotion, Integer> promotionOpen;
    public static volatile SingularAttribute<Promotion, String> promotionName;
    public static volatile SingularAttribute<Promotion, Integer> promotionDiscount;
    public static volatile CollectionAttribute<Promotion, Books> booksCollection;
    public static volatile SingularAttribute<Promotion, Date> promotionActive;
    public static volatile SingularAttribute<Promotion, String> promotionContent;
    public static volatile SingularAttribute<Promotion, Date> promotionClose;
    public static volatile SingularAttribute<Promotion, Integer> promotionId;

}