package util;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Componentes {
    private WebDriver driver;
    private Select select;

    public void inicializar() {
        String chromeDriver = System.getProperty("user.dir") + "/driver/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromeDriver);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:///" + System.getProperty("user.dir") + "/driver/componentes.html");
    }

    public void fecharNavegador() {
        driver.quit();
    }

    public void testarNome() {
        driver.findElement(By.id("elementosForm:nome")).sendKeys("Guilherme");
    }

    public void validarNome() {
        Assert.assertEquals("Guilherme", driver.findElement(By.id("descNome")).findElement(By.tagName("span")).getText());
    }

    public void testarSobrenome() {
        driver.findElement(By.id("elementosForm:sobrenome")).sendKeys("Thiel");
    }

    public void validarSobrenome() {
        Assert.assertEquals("Thiel", driver.findElement((By.id("descSobrenome"))).findElement(By.tagName("span")).getText());
    }

    public void testarSexo() {
        driver.findElement(By.id("elementosForm:sexo:0")).click();
    }

    public void validarSexo() {
        Assert.assertEquals("masculino", driver.findElement((By.id("descSexo"))).findElement(By.tagName("span")).getText());
    }

    public void testarComidaFavorita() {
        driver.findElement(By.id("elementosForm:comidaFavorita:2")).click();
    }

    public void validarComidaFavorita() {
        Assert.assertEquals("Pizza", driver.findElement((By.id("descComida"))).findElement(By.tagName("span")).getText());
    }

    public void testarEscolaridade() {
        select = new Select(driver.findElement(By.id("elementosForm:escolaridade")));
        select.selectByValue("superior");
    }

    public void validarEscolaridade() {
        Assert.assertEquals("superior", driver.findElement((By.id("descEscolaridade"))).findElement(By.tagName("span")).getText());
    }

    public void testarEsportes() {
        select = new Select(driver.findElement(By.id("elementosForm:esportes")));
        select.selectByValue("natacao");
    }

    public void validarEsportes() {
        Assert.assertTrue(driver.findElement(By.id("descEsportes")).getText().contains(select.getFirstSelectedOption().getText()));
    }

    public void testarBotaoCadastrar() {
        driver.findElement(By.id("elementosForm:cadastrar")).click();
    }

    public void testarNomeObrigatorio() {
        driver.findElement(By.id("elementosForm:nome")).sendKeys("");
    }

    public void validarNomeObrigatorio() {
        Alert mensagem = driver.switchTo().alert();
        Assert.assertEquals(mensagem.getText(), "Nome e obrigatorio");
        mensagem.accept();
    }

    public void testarSobrenomeObrigatorio() {
        driver.findElement(By.id("elementosForm:sobrenome")).sendKeys("");
    }

    public void validarSobrenomeObrigatorio() {
        Alert mensagem = driver.switchTo().alert();
        Assert.assertEquals(mensagem.getText(), "Sobrenome e obrigatorio");
        mensagem.accept();
    }

    public void testarSexoObrigatorio() {
        driver.findElement(By.id("elementosForm:sexo"));
    }

    public void validarSexoObrigatorio() {
        Alert mensagem = driver.switchTo().alert();
        Assert.assertEquals(mensagem.getText(), "Sexo e obrigatorio");
        mensagem.accept();
    }
}
