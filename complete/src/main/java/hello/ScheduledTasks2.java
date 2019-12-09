package hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class ScheduledTasks2 {
    private static final Logger log = LoggerFactory.getLogger(ScheduledTasks2.class);

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

@Scheduled(fixedRate = 120000)
    public void reportCurrentTime()
    {
        log.info("The other time {}", dateFormat.format(new Date()));
    }

}
