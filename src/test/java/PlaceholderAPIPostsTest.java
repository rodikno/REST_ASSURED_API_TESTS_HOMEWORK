import org.testng.Assert;
import org.testng.annotations.Test;


public class PlaceholderAPIPostsTest extends BaseTest {

    // Під словом "Post" в назвах методів мається на увазі назва ресурсу (не плутати з HTTP методом POST
    @Test(groups = {"smoke", "regression"})
    public void testGetPost() {
        // Ці dummy assertions використовується як заглушка для шаблону, обов*язково видаліть його після додавання реальної імплементації
        Assert.assertTrue(true);
    }

    @Test(groups = "regression")
    public void testCreatePost() {
        Assert.assertTrue(true);
    }

    @Test(groups = "regression")
    public void testUpdatePost() {
        Assert.assertTrue(true);
    }

    @Test(groups = "regression")
    public void testDeletePost() {
        Assert.assertTrue(true);
    }
}


