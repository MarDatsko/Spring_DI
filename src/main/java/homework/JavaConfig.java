package homework;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@EnableScheduling
public class JavaConfig {

    @Bean
    public Time getCurrentTime(){
        return new Time();
    }
}
