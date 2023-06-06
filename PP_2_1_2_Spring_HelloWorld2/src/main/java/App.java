import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld helloWorld1 = context.getBean("helloWorld", HelloWorld.class);
        Cat cat1 = context.getBean("cat", Cat.class);
        Cat cat2 = context.getBean("cat", Cat.class);

        HelloWorld helloWorld2 = context.getBean("helloWorld", HelloWorld.class);

        System.out.println("Ссылки на HelloWorld одинаковые: " + (helloWorld1 == helloWorld2));
        System.out.println("Ссылки на Cat одинаковые: " + (cat1 == cat2));
    }
}
