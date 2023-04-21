package Edit.BlazeDemo;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class crearCuenta {

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
		
		
		// 3. Hacer click en Register
		WebElement linkRegister = driver.findElement(By.linkText("Register"));
		linkRegister.click();
		
		
		// 4. Completar el formulario de registro
		// Nombre
		WebElement txtName = driver.findElement(By.id("name"));
		txtName.sendKeys("Milagros");
		
		// Empresa
		WebElement txtCompany = driver.findElement(By.id("company"));
		txtCompany.sendKeys("Autonoma");
		
		// Email
		WebElement txtEmail = driver.findElement(By.id("email"));
		txtEmail.sendKeys("milagros@test.com");
		
		// Contraseña
		WebElement txtPassword = driver.findElement(By.id("password"));
		txtPassword.sendKeys("12Test34");
		
		// Confirmar contraseña
		WebElement txtPassword2 = driver.findElement(By.id("password-confirm"));
		txtPassword2.sendKeys("12Test34");
		
		
		// 5. Hacer click en el botón "Register"
		WebElement btnRegister = driver.findElement(By.xpath("//button[contains(text(),'Register')]"));
		btnRegister.click();
		
		
		// 6. Cerrar el navegador
		driver.close();
	}

}
