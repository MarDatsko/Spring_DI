package homework;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class Time {

    @Scheduled(cron = "*/1 * * * * * ")
    public void printCurrentTime(){
        System.out.println(LocalDateTime.now());
    }
}
