package soundsystem;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author zhangxinyu
 * @version v1.0
 * @date created in 2022-02-24 18:32
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {CDPlayerConfig.class})
public class CDPlayerTest {
    @Autowired
    private CDPlayer cdPlayer;

    @Autowired
    private CompactDisc compactDisc;

    @Test
    public void test() {
        AnnotationConfigApplicationContext cont =
                new AnnotationConfigApplicationContext(CDPlayerConfig.class);
        //BlankDisc bean = cont.getBean(BlankDisc.class);
        SgtPeppers bean1 = cont.getBean(SgtPeppers.class);
    }

}