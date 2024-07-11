package Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("beans.XML");

        System.out.println("ignore this line this line only testing purpose");
        System.out.println();

        System.out.println("=====================================================");
        System.out.println();

        Airtel airtel = (Airtel) context.getBean("airtel");

        airtel.data();
        airtel.calling();

        System.out.println("------------------------------------------------------");

        Vi vi = (Vi) context.getBean("vi");

        vi.data();
        vi.calling();

        System.out.println("------------------------------------------------------");

        Jio jio = (Jio) context.getBean("jio");

        jio.data();
        jio.calling();

    }
}
