import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class IndexTab {
    WebDriver wd;

    @BeforeMethod
    public void precondition() {
        wd = new ChromeDriver();
        wd.navigate().to("file:///C:/Users/eduar/Downloads/index.html");
        wd.manage().window().maximize();
    }

    @Test
    public void testRedBox() {
        WebElement message = wd.findElement(By.cssSelector("#alert > p"));
        WebElement item1 = wd.findElement(By.cssSelector("a[href='#item1']"));
             item1.click();
        Assert.assertTrue(message.getText().contains(item1.getText()));
        System.out.println(message.getText());
        WebElement item2 = wd.findElement(By.cssSelector("a[href='#item2']"));
             item2.click();
        Assert.assertTrue(message.getText().contains(item2.getText()));
        System.out.println(message.getText());
        WebElement item3 = wd.findElement(By.cssSelector("a[href='#item3']"));
             item3.click();
        Assert.assertTrue(message.getText().contains(item3.getText()));
        System.out.println(message.getText());
        WebElement item4 = wd.findElement(By.cssSelector("a[href='#item4']"));
             item4.click();
        Assert.assertTrue(message.getText().contains(item4.getText()));
        System.out.println(message.getText());

    }

    @Test
    public void testLogForm() {
        WebElement message = wd.findElement(By.cssSelector("#alert > p"));
        WebElement name = wd.findElement(By.cssSelector("input[placeholder='Type your name']"));
        WebElement surename = wd.findElement(By.cssSelector("input[placeholder='Type your surename']"));
        name.clear();
        name.click();
        name.sendKeys("Name");
        surename.click();
        surename.clear();
        surename.sendKeys("Surename");
        wd.findElement(By.cssSelector(".btn")).click();
        Assert.assertTrue(message.getText().contains((name.getText() + message.getText())));
        System.out.println(message.getText());
        
    }
}
