import com.dbs.bean.MediaPrototype;
import com.dbs.bean.PetProjectSingleton;
import com.dbs.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        PetProjectSingleton petProjectSingleton = context.getBean(PetProjectSingleton.class);
        petProjectSingleton.setName("Dog Project");
        MediaPrototype twitterMedia = context.getBean(MediaPrototype.class);
        MediaPrototype hackernewsMedia = context.getBean(MediaPrototype.class);
        MediaPrototype redditMedia = context.getBean(MediaPrototype.class);
        twitterMedia.setName("Twitter");
        hackernewsMedia.setName("Hackernews");
        redditMedia.setName("Reddit");

        twitterMedia.publish();
        hackernewsMedia.publish();
        redditMedia.publish();
    }
}
