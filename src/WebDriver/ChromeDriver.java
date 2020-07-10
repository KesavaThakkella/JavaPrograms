package WebDriver;

public class ChromeDriver implements CreatingWebDriverInterface {

	public ChromeDriver() {

		System.out.println("Lauch the chrome driver");
	};

	@Override
	public void get(String url) {

		System.out.println("launch the URL" + url);

	}

	@Override
	public void findElement(String locator) {

		System.out.println("find the element" + locator);

	}

	@Override
	public void close() {

		System.out.println("Close the browser");

	}

	@Override
	public void quit() {

		System.out.println("Quit the browser");

	}

}
