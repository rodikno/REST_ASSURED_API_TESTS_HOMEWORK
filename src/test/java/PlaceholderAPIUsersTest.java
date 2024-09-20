import org.testng.Assert;
import org.testng.annotations.Test;


public class PlaceholderAPIUsersTest extends BaseTest {

    @Test(groups = {"smoke", "regression"})
    public void testGetUserById() {
        // Ці dummy assertions використовується як заглушка для шаблону, обов*язково видаліть його після додавання реальної імплементації
        Assert.assertTrue(true);
    }

    @Test(groups = "regression")
    public void testGetUserByUsername() {
        Assert.assertTrue(true);
    }

}


