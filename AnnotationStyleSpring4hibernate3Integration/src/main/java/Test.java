import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.oracle.configuration.AppConfig;
import com.oracle.model.User;
import com.oracle.service.UserService;

public class Test {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context=new  AnnotationConfigApplicationContext(AppConfig.class);
		
		
		UserService service=context.getBean("userService",UserService.class);
		List<User> alList=service.getAllUsers();
		for(User u: alList)
		{
			System.out.println(u);
		}
		User user=new  User(null,"rama reddy","hyderabad");
		Integer id=service.createUser(user);
		System.out.println("User created with id"+ id);
		List<User> allUser=service.getAllUsers();
		for(User u: allUser)
		{
			System.out.println(u);
		}
		

	}

}
