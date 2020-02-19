import com.aop.service.IAccountservice;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: cdf
 * @create: 2020-02-20 01:19
 **/
public class Test {
	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("ApplicationContext.xml");

		IAccountservice accountservice= (IAccountservice) applicationContext.getBean("accountservice");

		accountservice.saveAccount();
		accountservice.deleteAccount();
		accountservice.updateAccount(1);
	}
}
