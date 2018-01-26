package myClass;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import myClass.Order1;
import myClass.Role;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-01-26T11:37:28")
@StaticMetamodel(User.class)
public class User_ { 

    public static volatile SingularAttribute<User, String> password;
    public static volatile SingularAttribute<User, String> address;
    public static volatile SingularAttribute<User, Role> role;
    public static volatile CollectionAttribute<User, Order1> order1Collection;
    public static volatile SingularAttribute<User, Integer> phone;
    public static volatile SingularAttribute<User, Integer> sex;
    public static volatile SingularAttribute<User, String> active;
    public static volatile SingularAttribute<User, String> fullNames;
    public static volatile SingularAttribute<User, Date> dateOfBirth;
    public static volatile SingularAttribute<User, String> email;
    public static volatile SingularAttribute<User, String> username;
    public static volatile SingularAttribute<User, Integer> status;

}