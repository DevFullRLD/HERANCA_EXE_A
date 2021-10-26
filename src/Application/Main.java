package Application;

import Utilities.Funcionario;
import Utilities.Passageiro;

import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        int opera = Integer.parseInt(JOptionPane.showInputDialog("Digite o tipo de Cadastro que deseja realizar:" + "\n"+
                                                                 "1 - Cadastro de Funcionario" + "\n" +
                                                                 "2 - Cadastro de Passageiro"));



        switch (opera){

            case 1:{
                // ENTRADA DE DADOS
                String cod   = JOptionPane.showInputDialog("Digite o codigo do Funcionario");
                String cc    = JOptionPane.showInputDialog("Digite a C/C: ");
                String nome  = JOptionPane.showInputDialog("Digite o nome do Funcionario:");
                String dtNas   = JOptionPane.showInputDialog("Digite a data de nascimento no Padrão dd/MM/yyyy");
                String email = JOptionPane.showInputDialog("Digite o email:");
                String tel   = JOptionPane.showInputDialog("Digite o telefone do Funcionario:");
                String user  = JOptionPane.showInputDialog("Digite o usuario para o Funcionario");
                String pass  = JOptionPane.showInputDialog("Digite a senha para o Funcionario");
                String lem   = JOptionPane.showInputDialog("Digite um lembrete para a senha do mesmo");
                long id = 0;
                Funcionario funcionario = new Funcionario(id, nome, email, tel, user, pass, dtNas, lem, cod, cc);

                //ATRIBUICAO DE VALORES
                funcionario.setCodigo(cod);
                funcionario.setContaCorrente(cc);
                funcionario.setNome(nome);
                funcionario.setDataNascimento(dtNas);
                funcionario.setEmail(email);
                funcionario.setTelefone(tel);
                funcionario.setUsuario(user);
                funcionario.setSenha(pass);
                funcionario.setLembrete(lem);

                //APRESENTAR DADOS
                funcionario.exibirFuncionario();
                break;
            }
            case 2:{
                // ENTRADA DE DADOS
                long id      = Long.parseLong(JOptionPane.showInputDialog("Digite o ID do Passageiro"));
                String nome  = JOptionPane.showInputDialog("Digite o nome do Funcionario:");
                String doc     = JOptionPane.showInputDialog("Digite o numero do seu documento (RG): ");
                String numCard = JOptionPane.showInputDialog("Digite o numero do Cartão: ");
                String dtNas   = JOptionPane.showInputDialog("Digite a data de nascimento no Padrão dd/MM/yyyy");
                String email = JOptionPane.showInputDialog("Digite o email:");
                String tel   = JOptionPane.showInputDialog("Digite o telefone do Funcionario:");
                String user  = JOptionPane.showInputDialog("Digite o usuario para o Funcionario");
                String pass  = JOptionPane.showInputDialog("Digite a senha para o Funcionario");
                String lem   = JOptionPane.showInputDialog("Digite um lembrete para a senha do mesmo");
                Passageiro passageiro = new Passageiro(id, nome, email, tel, user, pass, dtNas, lem, numCard, doc);

                //ATRIBUICAO DE VALORES
                passageiro.setId(id);
                passageiro.setNome(nome);
                passageiro.setDocumento(doc);
                passageiro.setNumeroCartao(numCard);
                passageiro.setDataNascimento(dtNas);
                passageiro.setEmail(email);
                passageiro.setTelefone(tel);
                passageiro.setUsuario(user);
                passageiro.setSenha(pass);
                passageiro.setLembrete(lem);
                //APRESENTAR DADOS
                passageiro.exibirPassageiro();
                break;
            }
            default:{
                JOptionPane.showMessageDialog(null,"Opção invalida, execute o programa novamente!");
            }
        }
    }
}
