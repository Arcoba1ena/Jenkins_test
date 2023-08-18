import functions.UserFunctions;
import org.testng.annotations.Test;
import io.qameta.allure.Description;

public class UserListTest extends UserFunctions {
    @Test(testName = "GET /users")
    @Description("Тест проверяет что параметр page = 2")
    public void checkUserListPage() {
        getUserListPage();
    }
}