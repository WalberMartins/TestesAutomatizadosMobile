package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class TelaInicialPage {
	
	public TelaInicialPage(AppiumDriver<?> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(id = "com.google.android.keep:id/skip_welcome")
	private MobileElement botaoPrimeirosPassos;
	
	@AndroidFindBy(accessibility = "Nova nota de texto")
	private MobileElement botaoNovaNota;
	
	@AndroidFindBy(id = "com.google.android.keep:id/editable_title")
	private MobileElement campoTitulo;
	
	@AndroidFindBy(id = "com.google.android.keep:id/edit_note_text")
	private MobileElement campoNota;
	
	@AndroidFindBy(accessibility = "Abrir gaveta de navegação")
	private MobileElement botaoVoltar;
	
	@AndroidFindBy(accessibility = "Abrir gaveta de navegação")
	private MobileElement botaoMenu;
	
	@AndroidFindBy(id = "com.google.android.keep:id/drawer_link_settings")
	private MobileElement botaoConfiguracoes;
	
	@AndroidFindBy(xpath = "//android.widget.ListView//android.widget.LinearLayout")
	private List<MobileElement> menus;
	
	@AndroidFindBy(id = "com.google.android.keep:id/settings_add_new_items_to_bottom")
	private MobileElement switchAdicionarNovosItensAparteSuperior;
	
	@AndroidFindBy(xpath = "//android.support.v7.widget.RecyclerView//androidx.cardview.widget.CardView")
	private List<MobileElement> notas;
	
	public void acionarBotaoPrimeirosPassos() {
		botaoPrimeirosPassos.click();
	}
	
	public void acionarBotaoNovaNota() {
		botaoNovaNota.click();
	}
	
	public void informarCampoTitulo(String titulo) {
		campoTitulo.sendKeys(titulo);
	}
	
	public void informarCampoNota(String nota) {
		campoNota.sendKeys(nota);
	}
	
	public void acionarBotaoVoltar() {
		botaoVoltar.click();
	}
	
	public void acionarBotaoMenu() {
		botaoMenu.click();
	}
	
	public void acionarAbaConfiguracoes() {
//		botaoConfiguracoes.click();
		menus.get(8).click();
	}
	
	public void clicarSwitch() {
		switchAdicionarNovosItensAparteSuperior.click();
	}

	public void acionarANota(String nota) {
		notas.get(acharNota(nota)).click();
	}
	
	private int acharNota(String nota) {
		int i; 
		for(i = 0; i < notas.size(); i++) {
			try {
				notas.get(i).findElement(By.xpath("//android.widget.LinearLayout/android.widget.TextView[@text='"+nota+"']"));
				break;
			}
			catch (Exception e) {
				continue;
			}
			
		}
		return i;
	}

}