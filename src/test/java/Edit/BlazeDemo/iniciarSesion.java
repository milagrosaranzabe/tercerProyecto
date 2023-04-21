package Edit.BlazeDemo;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iniciarSesion {

	// Atributos
	String url = "https://blazedemo.com/";
	WebDriver driver;

	// Métodos
	@Test
		public void cuentaUsuario() {

			// 1. Abrir el navegador de Chrome en la página de BlazeDemo
			WebDriver driver = new ChromeDriver();
			driver.get(url);
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			
			
			// 2. Hacer click en la sección de "Home"
			WebElement linkHome = driver.findElement(By.linkText("home"));
			linkHome.click();
			
			
			// 3. Completar el formulario de Login
			// Email
			WebElement txtEmail = driver.findElement(By.id("email"));
			txtEmail.sendKeys("milagros@test.com");
			
			// Contraseña
			WebElement txtPassword = driver.findElement(By.id("password"));
			txtPassword.sendKeys("12Test34");
			
			
			// 4. Hacer click en el checkbox Remember Me
			WebElement checkRememberMe = driver.findElement(By.name("remember"));
			checkRememberMe.click();
			
			
			// 5. Hacer click en el botón "Login"
			WebElement btnLogin = driver.findElement(By.xpath("//button[contains(text(),'Login')]"));
			btnLogin.click();
			
			
			// 6. Cerrar el navegador
			driver.close();
	}

}
