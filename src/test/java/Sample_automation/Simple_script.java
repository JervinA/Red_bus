package Sample_automation;

import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Simple_script {

	public static void main(String[] args) {
		
		WebDriverManager.edgedriver().setup();
		
		EdgeDriver driver = new EdgeDriver();
		
		driver.get("https://www.google.com");

	}

}
