package Steps;

import Pagina.Metodos;
import elementos.Elementos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Teste_Voxy {

	Metodos metodos = new Metodos();
	Elementos elementos = new Elementos();

	@Given("acessar o site da voxy {string}")
	public void acessar_o_site_da_voxy(String site) {
		metodos.abriNavegador(site);

	}

	@When("digitar email valido")
	public void digitar_email_valido() {
       metodos.escrever(elementos.getEmail(), "marlideoliveira2016@gmail.com");
	}

	@When("clicar em continuar")
	public void clicar_em_continuar() {
		metodos.clicar(elementos.getBtnContinuar());
	}

	@Then("validar a mensagem de retorno e fechar pop up")
	public void validar_a_mensagem_de_retorno_e_fechar_pop_up() {
		metodos.screenShot("pop");
		metodos.fecharNavegador();
		

	}
}
	/*@When("digitar email invalido")
	public void digitar_email_invalido() {

	}

	@When("em continuar")
	public void em_continuar() {

	}

	@Then("validar a mensagem de erro e fechar pop up")
	public void validar_a_mensagem_de_erro_e_fechar_pop_up() {

	}

	@When("preencher telefone valido")
	public void preencher_telefone_valido() {

	}

	@When("preencher telefone invalido")
	public void preencher_telefone_invalido() {

	}

	@When("clicar em tenho um codigo")
	public void clicar_em_tenho_um_codigo() {

	}

	@When("preencher com codigo ficticio")
	public void preencher_com_codigo_ficticio() {

	}

	@When("preencher com dados invalidos")
	public void preencher_com_dados_invalidos() {

	}

	@Then("valido a nao habilitacao do botao ativar")
	public void valido_a_nao_habilitacao_do_botao_ativar() {

	}

	@When("clicar em suporte")
	public void clicar_em_suporte() {

	}

	@When("preencher informacoes em deixe uma mensagem")
	public void preencher_informacoes_em_deixe_uma_mensagem() {

	}

	@When("clicar em enviar")
	public void clicar_em_enviar() {

	}

	@Then("valido a mensagem de retorno de email enviado")
	public void valido_a_mensagem_de_retorno_de_email_enviado() {

	}

	@When("clicar em ajuda")
	public void clicar_em_ajuda() {

	}

	@When("clicar em Help Center")
	public void clicar_em_help_center() {

	}

	@Then("vizualizo informacoes nao disponiveis")
	public void vizualizo_informacoes_nao_disponiveis() {

	}

	@When("clicar em whats new")
	public void clicar_em_whats_new() {

	}
*/

