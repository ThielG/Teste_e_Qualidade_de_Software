package stepdefinitions;

import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Quando;
import util.Componentes;

public class ComponentesStep {

    Componentes componentes = new Componentes();

    @Dado("que o usuário acessou o arquivo Campo de Treinamento")
    public void que_o_usuário_acessou_o_arquivo_Campo_de_Treinamento() {
        componentes.inicializar();
    }

    @Dado("que o usuário preencheu os campos nome, sobrenome, sexo, comida, escolaridade e esporte")
    public void que_o_usuário_preencheu_os_campos_nome_sobrenome_sexo_comida_escolaridade_e_esporte() {
        componentes.testarNome();
        componentes.testarSobrenome();
        componentes.testarSexo();
        componentes.testarComidaFavorita();
        componentes.testarEscolaridade();
        componentes.testarEsportes();
    }

    @Quando("clicar no botão Cadastrar")
    public void clicar_no_botão_Cadastrar() {
        componentes.testarBotaoCadastrar();
    }

    @Entao("as informações Guilherme devem ser validados no formulario nome")
    public void as_informações_Guilherme_devem_ser_validados_no_formulario_nome() {
        componentes.validarNome();
        componentes.fecharNavegador();
    }

    @Entao("as informações Thiel devem ser validados no formulario sobrenome")
    public void as_informações_Thiel_devem_ser_validados_no_formulario_sobrenome() {
        componentes.validarSobrenome();
        componentes.fecharNavegador();
    }

    @Entao("as informações masculino devem ser validados no formulario sexo")
    public void as_informações_masculino_devem_ser_validados_no_formulario_sexo() {
        componentes.validarSexo();
        componentes.fecharNavegador();
    }

    @Entao("as informações pizza devem ser validados no formulario comidaFavorita")
    public void as_informações_pizza_devem_ser_validados_no_formulario_comidaFavorita() {
        componentes.validarComidaFavorita();
        componentes.fecharNavegador();
    }

    @Entao("as informações superior devem ser validados no formulario escolaridade")
    public void as_informações_superior_devem_ser_validados_no_formulario_escolaridade() {
        componentes.validarEscolaridade();
        componentes.fecharNavegador();
    }

    @Entao("as informações natacao devem ser validados no formulario esportes")
    public void as_informações_natacao_devem_ser_validados_no_formulario_esportes() {
        componentes.validarEsportes();
        componentes.fecharNavegador();
    }

    @Dado("que o usuário preencheu o campo nome")
    public void que_o_usuário_preencheu_o_campo_nome() {
        componentes.testarNomeObrigatorio();
    }

    @Quando("clicar em Cadastrar")
    public void clicar_em_Cadastrar() {
        componentes.testarBotaoCadastrar();
    }

    @Entao("retorna mensagem de erro O campo nome é obrigatório")
    public void retorna_mensagem_de_erro_O_campo_Nome_é_obrigatório() {
        componentes.validarNomeObrigatorio();
        componentes.fecharNavegador();
    }

    @Dado("que o usuário preencheu o campo sobrenome")
    public void que_o_usuário_preencheu_o_campo_sobrenome() {
        componentes.testarSobrenomeObrigatorio();
    }

    @Entao("retorna mensagem de erro O campo sobrenome é obrigatório")
    public void retorna_mensagem_de_erro_O_campo_sobrenome_é_obrigatório() {
        componentes.validarSobrenomeObrigatorio();
        componentes.fecharNavegador();
    }

    @Dado("que o usuário preencheu o campo sexo")
    public void que_o_usuário_preencheu_o_campo_sexo() {
        componentes.testarSexoObrigatorio();
    }

    @Entao("retorna mensagem de erro O campo sexo é obrigatorio")
    public void retorna_mensagem_de_erro_0_campo_sexo_é_obrigatorio() {
        componentes.validarSexoObrigatorio();
        componentes.fecharNavegador();
    }
}
