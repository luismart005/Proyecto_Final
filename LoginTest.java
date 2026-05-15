public class LoginTest {

    @Test
    public void loginExitoso() {
        driver.get("https://www.ejemplo.com/login");
        driver.findElement(By.id("usuario")).sendKeys("admin");
        driver.findElement(By.id("password")).sendKeys("1234");
        driver.findElement(By.id("btnLogin")).click();
        driver.findElement(By.cssSelector(".dashboard")).click();
        Assert.assertEquals("Bienvenido", mensajeBienvenida);
    }
}