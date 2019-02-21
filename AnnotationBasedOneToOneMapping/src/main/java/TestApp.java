import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.model.Customer1;
import com.model.Txn1;
import com.util.HibernateUtil;

public class TestApp {

	public static void main(String[] args)throws Exception {
		Txn1 txn=new Txn1();
		txn.setDate(new Date());
		txn.setTotal(100);
		Customer1 customer1=new Customer1();
		customer1.setAddress("hyderabad");
		customer1.setEmail("prajanu@h");
		customer1.setName("narayan");
		customer1.setTxn(txn);
		txn.setCustomer(customer1);
		SessionFactory factory=HibernateUtil.getSessionFactory();
		Session session=factory.getCurrentSession();
		Transaction transaction=session.beginTransaction();
		session.save(txn);
		transaction.commit();
		factory.close();
		

	}

}
