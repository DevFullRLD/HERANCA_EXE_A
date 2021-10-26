package Utilities;

import javax.swing.*;
import java.util.Date;

public class Passageiro extends Pessoa{
        String numeroCartao, documento = "";

    public Passageiro(long id, String nome, String email, String telefone, String usuario, String senha, String dataNascimento, String lembrete,String numeroCartao, String documento) {
        super(id, nome, email, telefone, usuario, senha, dataNascimento, lembrete);
        this.documento = documento;
        this.numeroCartao = numeroCartao;
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public void exibirPassageiro(){
        JOptionPane.showMessageDialog(null, "ID do Passageiro: "+ this.getId() + "\n" +
                                                                    "Nome: "     + this.getNome()     + "\n"  +
                                                                    "Numero de Identidade: "+ this.getDocumento() + "\n" +
                                                                    "Numero do Cartão: "+ this.getNumeroCartao() + "\n" +
                                                                    "Data de Nascimento: "+ this.getDataNascimento() + "\n" +
                                                                    "Email: "    + this.getEmail()    + "\n" +
                                                                    "Telefone: " + this.getTelefone() + "\n" +
                                                                    "Usuario: "  + this.getUsuario()  + "\n" +
                                                                    "Lembrete da Senha: " + getLembrete());
    }
}
