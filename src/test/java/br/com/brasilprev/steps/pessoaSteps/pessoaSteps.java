package br.com.brasilprev.steps.pessoaSteps;

import br.com.brasilprev.repository.PessoaRepositoryTest;
import io.cucumber.java.pt.Entao;
import org.springframework.beans.factory.annotation.Autowired;

public class pessoaSteps {

    @Autowired PessoaRepositoryTest pessoaFuncionalidade;

    @Entao("^Deve procurar pessoa pelo cpf$")
    public void deve_procurar_pessoa_pelo_cpf() throws Throwable {
        pessoaFuncionalidade.deve_procurar_pessoa_pelo_cpf();
    }

    @Entao("^Deve procurar pessoa pelo cpf inexistente$")
    public void deve_encontrar_pessoa_cpf_inexistente() throws Throwable {
        pessoaFuncionalidade.deve_encontrar_pessoa_cpf_inexistente();
    }
    @Entao("^Deve encontrar a pessoa pelo ddd e numero de telefone$")
    public void deve_encontrar_pessoa_pelo_ddd_e_numero_de_telefone() throws Throwable {
        pessoaFuncionalidade.deve_encontrar_pessoa_pelo_ddd_e_numero_de_telefone();
    }
    @Entao("^Deve filtrar pessoa pelo ddd do telefone$")
    public void deve_filtrar_pessoas_pelo_ddd_do_telefone() throws Throwable {
        pessoaFuncionalidade.deve_filtrar_pessoas_pelo_ddd_do_telefone();
    }
    @Entao("^Deve filtrar pessoa por parte do cpf$")
    public void deve_filtrar_pessoas_por_parte_do_cpf() throws Throwable {
        pessoaFuncionalidade.deve_filtrar_pessoas_por_parte_do_cpf();
    }
    @Entao("^Deve filtrar pessoa por parte do nome$")
    public void deve_filtrar_pessoas_por_parte_do_nome() throws Throwable {
        pessoaFuncionalidade.deve_filtrar_pessoas_por_parte_do_nome();
    }
    @Entao("^Deve filtrar pessoa por filtro composto$")
    public void deve_filtrar_pessoas_por_filtro_composto() throws Throwable {
        pessoaFuncionalidade.deve_filtrar_pessoas_por_filtro_composto();
    }
    @Entao("^Nao deve encontrar pessoa cujo dd e telefone nao estejam cadastradados$")
    public void nao_deve_encontrar_pessoa_cujo_ddd_e_telefone_nao_estejam_cadastradados() throws Throwable {
        pessoaFuncionalidade.nao_deve_encontrar_pessoa_cujo_ddd_e_telefone_nao_estejam_cadastradados();
    }
    @Entao("^Deve filtrar pessoas pelo numero do telefone$")
    public void deve_filtrar_pessoas_pelo_numero_do_telefone() throws Throwable {
        pessoaFuncionalidade.deve_filtrar_pessoas_pelo_numero_do_telefone();
    }






}
