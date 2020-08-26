import com.dbs.bean.PetProjectSingleton;
import com.dbs.bean.SocialMedia;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class MyTests {
    @Test
    public void testSingleTon() {

        PetProjectSingleton petA = PetProjectSingleton.getInstance();
        PetProjectSingleton petB = PetProjectSingleton.getInstance();
        String name = "Dog Project";
        petA.setName(name);

        Assert.assertEquals(name, petB.getName());
    }

    @Test
    public void testPrototype() {
        SocialMedia twitterMedia = new SocialMedia("Twitter", "Social Media");
        SocialMedia hackernewsMedia = twitterMedia.clone();
        hackernewsMedia.setName("Hackernews");
        Assert.assertEquals("Twitter", twitterMedia.getName());
        Assert.assertEquals("Hackernews", hackernewsMedia.getName());

        Assert.assertEquals("Social Media", twitterMedia.getType());
        Assert.assertEquals("Social Media", hackernewsMedia.getType());
    }
}
