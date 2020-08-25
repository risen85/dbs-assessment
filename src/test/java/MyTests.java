import com.dbs.bean.MediaPrototype;
import com.dbs.bean.PetProjectSingleton;
import com.dbs.config.AppConfig;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class MyTests {
    @Test
    public void testSingleTon(){
        AbstractApplicationContext context
                = new AnnotationConfigApplicationContext(AppConfig.class);
        PetProjectSingleton petA = context.getBean(PetProjectSingleton.class);
        PetProjectSingleton petB = context.getBean(PetProjectSingleton.class);
        String name = "Dog Project";
        petA.setName(name);

        Assert.assertEquals(name,petB.getName());
    }

    @Test
    public void testPrototype(){
        AbstractApplicationContext context
                = new AnnotationConfigApplicationContext(AppConfig.class);
        MediaPrototype mediaA = context.getBean(MediaPrototype.class);
        MediaPrototype mediaB = context.getBean(MediaPrototype.class);

        mediaA.setName("Twitter");
        mediaB.setName("Hackernews");
        Assert.assertEquals("Twitter",mediaA.getName());
        Assert.assertEquals("Hackernews",mediaB.getName());

    }
}
