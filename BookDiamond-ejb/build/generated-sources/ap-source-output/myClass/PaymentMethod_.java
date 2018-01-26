package myClass;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import myClass.Order1;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-01-26T11:37:28")
@StaticMetamodel(PaymentMethod.class)
public class PaymentMethod_ { 

    public static volatile CollectionAttribute<PaymentMethod, Order1> order1Collection;
    public static volatile SingularAttribute<PaymentMethod, Integer> paymentMethodId;
    public static volatile SingularAttribute<PaymentMethod, String> paymentMethodName;

}