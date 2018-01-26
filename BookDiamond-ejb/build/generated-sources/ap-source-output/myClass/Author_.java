package myClass;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import myClass.Books;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-01-26T11:37:28")
@StaticMetamodel(Author.class)
public class Author_ { 

    public static volatile CollectionAttribute<Author, Books> booksCollection;
    public static volatile SingularAttribute<Author, String> authorNames;
    public static volatile SingularAttribute<Author, String> authorDetails;
    public static volatile SingularAttribute<Author, Integer> authorId;

}