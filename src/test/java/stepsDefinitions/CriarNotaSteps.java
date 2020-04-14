package stepsDefinitions;

import static org.junit.Assert.assertEquals;
import static utils.Utils.driver;

import org.openqa.selenium.By;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.TelaInicialPage;

public class CriarNotaSteps {
	
	private TelaInicialPage telaInicial = new TelaInicialPage(driver);
	
	@Dado("que eu aciono o Primeiros passos")
	public void queEuAcionoOPrimeirosPassos() {
	    telaInicial.acionarBotaoPrimeirosPassos();
	}
	
	@Quando("^eu acionar o botao Nova nota$")
	public void euAcionarOBotaoNovaNota() {
		telaInicial.acionarBotaoNovaNota();
	}

	@Quando("eu informar no campo titulo {string}")
	public void euInformarNoCampoTitulo(String titulo) {
	    telaInicial.informarCampoTitulo(titulo);
	}

	@E("eu informar no campo nota {string}")
	public void euInformarNoCampoNota(String nota) {
	    telaInicial.informarCampoNota(nota);
	}

	@E("eu acionar o botao voltar")
	public void euAcionarOBotaoVoltar() {
	    telaInicial.acionarBotaoVoltar();
	}

	@Entao("o aplicativo cadastra a nota com o titulo {string}")
	public void oAplicativoCadastraANotaComOTitulo(String titulo) {
	    assertEquals(titulo, driver.findElement(By.xpath("//android.widget.TextView[@text='"+titulo+"']")).getText());
	}
	
	@Quando("eu acionar o menu")
	public void euAcionarOMenu() {
		telaInicial.acionarBotaoMenu();
	}

	@E("acionar a aba configuracoes")
	public void acionarAAbaConfiguracoes() {
		telaInicial.acionarAbaConfiguracoes();
	}

	@E("eu tocar no switch")
	public void euTocarNoSwitch() {
	    telaInicial.clicarSwitch();
	}

	@Entao("o Switch fica desabilitado")
	public void oSwitchFicaDesabilitado() {
		assertEquals("false", driver.findElement(By.id("com.google.android.keep:id/settings_add_new_items_to_bottom")).getAttribute("checked"));
	}
	
	@Quando("eu acionar a nota {string}")
	public void euAcionarANota(String nota) {
	    telaInicial.acionarANota(nota);
	}

}
