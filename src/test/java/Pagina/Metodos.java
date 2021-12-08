package Pagina;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Metodos {

	

		protected static WebDriver driver;

		public void abriNavegador(String site) {
			try {
				System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
				driver = new ChromeDriver();
				driver.get(site);
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			} catch (Exception e) {
				System.err.println("---Erro ao abrir navegador---" + e.getMessage());
				System.err.println("---Causa do erro ao abrir navegador---" + e.getCause());
			}
		}

		public void clicar(By elemento) {
			try {
				driver.findElement(elemento).click();
			} catch (Exception e) {
				System.err.println(" --------erro ao clicar --------" + e.getMessage());
				System.err.println(" -------causa do erro-------" + e.getCause());

			}

		}

		public void escrever(By elemento, String text) {
			try {
				driver.findElement(elemento).sendKeys(text);
			} catch (Exception e) {
				System.err.println(" --------erro ao clicar --------" + e.getMessage());
				System.err.println(" -------causa do erro-------" + e.getCause());
			}
		}

		public void fecharNavegador() {
			driver.quit();

		}

		public void pausa(int tempo) {
			try {
				Thread.sleep(tempo);
			} catch (Exception e) {
				System.err.println("--------erro ao validar texto" + e.getMessage());
				System.err.println("--------causa do erro" + e.getCause());
	}
		}
			public void validarTexto(By elemento, String textoEsperado) {
				try {
					String textoCapturado = driver.findElement(elemento).getText();
					assertEquals(textoEsperado, textoCapturado);
				} catch (Exception e) {
					System.err.println("--------erro ao validar texto" + e.getMessage());
					System.err.println("--------causa do erro" + e.getCause());
				}
			}
				public void screenShot(String nomeEvidencia) {
					try {
						TakesScreenshot scrShot = (TakesScreenshot) driver;
						File scrFile = scrShot.getScreenshotAs(OutputType.FILE);
						File destFile = new File("./Evidencias/" + nomeEvidencia + ".png");
						FileUtils.copyFile(scrFile, destFile);
					} catch (Exception e) {
						System.err.println("--------erro ao tirar screenShot" + e.getMessage());
						System.err.println("--------causa do erro" + e.getCause());
					}
			
			
			
			}
		}
