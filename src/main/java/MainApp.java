import com.dbs.bean.PetProjectSingleton;
import com.dbs.bean.SocialMedia;

public class MainApp {
    public static void main(String[] args) {

        PetProjectSingleton petProjectSingleton = PetProjectSingleton.getInstance();
        petProjectSingleton.setName("Dog Project");
        SocialMedia twitterMedia = new SocialMedia("Twitter", "Social Media");
        SocialMedia hackernewsMedia = twitterMedia.clone();
        hackernewsMedia.setName("Hackernews");
        SocialMedia redditMedia = twitterMedia.clone();
        redditMedia.setName("Reddit");

        twitterMedia.publish();
        hackernewsMedia.publish();
        redditMedia.publish();
    }
}
