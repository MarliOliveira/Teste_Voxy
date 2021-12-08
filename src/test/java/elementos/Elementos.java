package elementos;

import org.openqa.selenium.By;

public class Elementos {
	

	private By email = By.name("email");
	private By btnContinuar = By.xpath("//*[contains(text(), 'Continuar')]");

		

	public By getEmail() {
		return email;
	}
	public By getBtnContinuar() {
		return btnContinuar;
	}}
