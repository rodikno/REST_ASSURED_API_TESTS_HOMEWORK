import org.testng.Assert;
import org.testng.annotations.Test;


public class PlaceholderAPICommentsTest extends BaseTest {

    @Test(groups = {"smoke", "regression"})
    public void testGetCommentById() {
        // Ці dummy assertions використовується як заглушка для шаблону, обов*язково видаліть його після додавання реальної імплементації
        Assert.assertTrue(true);
    }

    @Test(groups = "regression")
    public void testGetCommentsByPostId() {
        Assert.assertTrue(true);
    }

}


