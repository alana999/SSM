import com.alana.spring6.iocxml.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUser {
    public static void main(String[] args) {
        ApplicationContext context = new
                ClassPathXmlApplicationContext("bean.xml");
        User user = (User) context.getBean("user");
        System.out.println("get bean via id:"+user);

        User user1 = context.getBean(User.class);
        System.out.println("get bean via class:"+user);

        User user2 = context.getBean("user", User.class);

    }

}
