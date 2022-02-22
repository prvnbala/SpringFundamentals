import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import repository.HibernateSpeakerRepositoryImpl;
import repository.SpeakerRepository;
import service.SpeakerService;
import service.SpeakerServiceImpl;

@Configuration
public class AppConfig {

    @Bean(name = "speakerRepository")
    public SpeakerRepository getSpeakerRepository() {
        return new HibernateSpeakerRepositoryImpl();
    }

    @Bean(name = "speakerService")
    public SpeakerService getSpeakerService() {
        //constructor injection
        //return new SpeakerServiceImpl(getSpeakerRepository());

        //setter injection
        SpeakerServiceImpl speakerService = new SpeakerServiceImpl();
        speakerService.setRepository(getSpeakerRepository());
        return speakerService;

    }
}
