import com.mx.config.AppConfig;
import com.mx.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        User user = context.getBean("getUser", User.class);
        System.out.println(user.getName());
    }
}
