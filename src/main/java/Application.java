import com.pluralsight.service.SpeakerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args){

        //creates the appconfig beans
        ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);

        //SpeakerService speaker = new SpeakerServiceImpl();
        SpeakerService speaker = appContext.getBean("speakerService",SpeakerService.class);

        System.out.println(speaker);

        speaker.findAll().forEach(p -> System.out.println(p.getFirstName()));
    }
}
