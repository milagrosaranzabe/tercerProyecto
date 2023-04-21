package Edit.BlazeDemo;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class comprarPasajes {
	
	// Atributos
	String url = "https://blazedemo.com/";
	WebDriver driver;
	
	// Métodos
	@Test
	public void compraDePasaje() {
		
		// 1. Abrir el navegador de Chrome en la página de BlazeDemo
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		
		// 2. Seleccionar destinos de vuelos
		// Destino de salida
		Select selDeparture = new Select(driver.findElement(By.name("fromPort")));
		selDeparture.selectByVisibleText("Boston");

		// Destino de llegada
		Select selDestination = new Select(driver.findElement(By.name("toPort")));
		selDestination.selectByVisibleText("New York");
		
		
		// 3. Hacer click en el botón "Find Flights"
		WebElement btnFindFlights = driver.findElement(By.xpath("//body/div[3]/form[1]/div[1]/input[1]"));
		btnFindFlights.click();
		
		
		// 4. Hacer click en la opción de vuelo de preferencia
		WebElement btnChooseFlight = driver.findElement(By.xpath("//tbody/tr[2]/td[1]/input[1]"));
		btnChooseFlight.click();
		
		
		// 5. Completar el formulario de compra
		// Nombre
		WebElement txtName = driver.findElement(By.id("inputName"));
		txtName.sendKeys("Pedro González");
		
		// Dirección
		WebElement txtAddress = driver.findElement(By.id("address"));
		txtAddress.sendKeys("Avellaneda 450");
		
		// Ciudad
		WebElement txtCity = driver.findElement(By.id("city"));
		txtCity.sendKeys("Mar del Plata");
		
		// Provincia
		WebElement txtState = driver.findElement(By.id("state"));
		txtState.sendKeys("Buenos Aires");
		
		// Código Postal
		WebElement txtCode = driver.findElement(By.id("zipCode"));
		txtCode.sendKeys("223");
		
		// Seleccionar Tarjeta de Crédito
		Select selCreditCard = new Select(driver.findElement(By.id("cardType")));
		selCreditCard.selectByVisibleText("American Express");
		
		// Número de Tarjeta
		WebElement txtCardNumber = driver.findElement(By.id("creditCardNumber"));
		txtCardNumber.sendKeys("99065473");
		
		// Mes
		WebElement txtMonth = driver.findElement(By.id("creditCardMonth"));
		txtMonth.sendKeys("09");
		
		// Año
		WebElement txtYear = driver.findElement(By.id("creditCardYear"));
		txtYear.sendKeys("2030");
		
		// Nombre de la Tarjeta
		WebElement txtNameCard = driver.findElement(By.id("nameOnCard"));
		txtNameCard.sendKeys("Pedro Gonzalez");
		
		
		// 6. Hacer click en el checkbox Remember Me
		WebElement checkRemember= driver.findElement(By.id("rememberMe"));
		checkRemember.click();
		
		
		// 7. Hacer click en el botón "Purchase Flight"
		WebElement btnPurchase= driver.findElement(By.xpath("//body/div[2]/form[1]/div[11]/div[1]/input[1]"));
		btnPurchase.click();
		
		
		// 8. Comprobación del título en el resultado
		String tituloActual = driver.getTitle();
		String tituloEsperado = "BlazeDemo Confirmation";

		Assert.assertEquals(tituloActual, tituloEsperado);
		
		
		// 9. Cerrar el navegador
		driver.close();				
	}

}
