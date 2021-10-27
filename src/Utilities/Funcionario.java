package Utilities;

import javax.swing.*;

public class Funcionario extends Pessoa{

    private String codigo, contaCorrente = "";

    public Funcionario(long id, String nome, String email, String telefone, String usuario, String senha, String dataNascimento, String lembrete, String codigo, String contaCorrente) {
        super(id, nome, email, telefone, usuario, senha, dataNascimento, lembrete);
        this.codigo = codigo;
        this.contaCorrente = contaCorrente;
    }


    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getContaCorrente() {
        return contaCorrente;
    }

    public void setContaCorrente(String contaCorrente) {
        this.contaCorrente = contaCorrente;
    }

    public void exibirFuncionario(){
        JOptionPane.showMessageDialog(null, "Codigo do Funcionario: "+ getCodigo() + "\n" +
                                                                    "Nome: "     + getNome()     + "\n"  +
                                                                    "Conta Corrente: "+ getContaCorrente() + "\n" +
                                                                    "Data de Nascimento: "+ getDataNascimento() + "\n" +
                                                                    "Email: "    + getEmail()    + "\n" +
                                                                    "Telefone: " + getTelefone() + "\n" +
                                                                    "Usuario: "  + getUsuario()  + "\n" +
                                                                    "Lembrete da Senha: " + getLembrete());
                                                        }
}
