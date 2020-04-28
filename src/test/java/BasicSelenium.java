import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class BasicSelenium extends TestManeger{
    
    @Test
    public void openHomePage()
    {
        driver.get("https://trello.com/");
        String title = driver.getTitle();
        Assertions.assertEquals(title, "Trello");
    }
}
