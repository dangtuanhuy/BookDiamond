package myClass;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import myClass.OrderBook;
import myClass.PaymentMethod;
import myClass.User;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-01-26T11:37:28")
@StaticMetamodel(Order1.class)
public class Order1_ { 

    public static volatile SingularAttribute<Order1, Date> orderCreateDate;
    public static volatile SingularAttribute<Order1, Date> orderDeliverDate;
    public static volatile CollectionAttribute<Order1, OrderBook> orderBookCollection;
    public static volatile SingularAttribute<Order1, Integer> orderId;
    public static volatile SingularAttribute<Order1, String> orderDeliverPlace;
    public static volatile SingularAttribute<Order1, PaymentMethod> paymentMethodId;
    public static volatile SingularAttribute<Order1, Integer> orderStatus;
    public static volatile SingularAttribute<Order1, User> username;

}