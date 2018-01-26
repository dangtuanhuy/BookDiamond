package myClass;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import myClass.Books;
import myClass.Order1;
import myClass.OrderBookPK;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-01-26T11:37:28")
@StaticMetamodel(OrderBook.class)
public class OrderBook_ { 

    public static volatile SingularAttribute<OrderBook, Integer> bookOrderQuantity;
    public static volatile SingularAttribute<OrderBook, BigDecimal> bookSoldPrice;
    public static volatile SingularAttribute<OrderBook, Books> books;
    public static volatile SingularAttribute<OrderBook, OrderBookPK> orderBookPK;
    public static volatile SingularAttribute<OrderBook, BigDecimal> bookOriginalPrice;
    public static volatile SingularAttribute<OrderBook, Order1> order1;

}