package soundsystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

/**
 * @author zhangxinyu
 */
@Configuration
@ImportResource("classpath:cd-config.xml")
@Import({CDConfig.class})
public class CDPlayerConfig {
    @Bean
    public CDPlayer cdPlayer() {
        return new CDPlayer();
    }
}
