package ATP28.view;

import ATP28.controller.PessoaFController;
import ATP28.controller.PessoaJController;
import ATP28.model.PessoaFisica;
import ATP28.model.PessoaJuridica;
import ATP28.model.Endereco;

public class Main {
    public static void main(String[] args) {

        PessoaFController PessoaFController = new PessoaFController();
        PessoaJController PessoaJController = new PessoaJController();

        PessoaFisica pf = new PessoaFisica();
        PessoaJuridica pj = new PessoaJuridica();
        Endereco end = new Endereco();

        // PESSOA FISICA
        pf.nome = "Raissa";
        pf.sobrenome = "Martins";
        pf.cpf = "94934994";


        // PESSOA JURIDICA
        pj.nome = "Os Devs Java";
        pj.sobrenome = "Javeiros";
        pj.nome_empresa = "Javinhas";
        pj.cnpj = "9392932-923";


        // ENDERECO

        end.logradouro = "Av. Brasil";
        end.complemento = "Casa do portão amarelo";
        end.numero ="169";
        end.cep = "7500000";
        end.cidade = "Anápolis";
        end.estado = "Goiás";

        pf.endereco = end;

        // IMPRESSAO

        System.out.println(pf);
        System.out.println(pj);
        System.out.println(end);
    }  
}
