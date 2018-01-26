package myClass;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import myClass.Books;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-01-26T11:37:28")
@StaticMetamodel(Publisher.class)
public class Publisher_ { 

    public static volatile SingularAttribute<Publisher, Integer> publisherId;
    public static volatile CollectionAttribute<Publisher, Books> booksCollection;
    public static volatile SingularAttribute<Publisher, String> publisherName;
    public static volatile SingularAttribute<Publisher, String> publisherDescription;

}