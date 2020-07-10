package WebDriver;

public class AmzonTest {

	public static void main(String[] args) {

		CreatingWebDriverInterface driver = new ChromeDriver();
		driver.get("https://amazon.com");
		driver.findElement("name");
		driver.close();
		driver.quit();

	}

}
