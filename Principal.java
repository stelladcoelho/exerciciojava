
import javax.swing.JOptionPane;
import Aluno;

public class Principal {

  static final int QTDREGISTROS = 10;

  public static Aluno alunos[] = new Aluno[QTDREGISTROS];

  public static String entradaDeDadosTexto(String texto) {
    return JOptionPane.showInputDialog(texto);
  }

  public static boolean podeCadastrarAlunos() {
    for(int i = 0; i < QTDREGISTROS; i++) {
      if(alunos[i] == null) {
        return true;
      }
    }
    return false;
  }

  public static void cadastrarAluno() {

    String codigo = entradaDeDadosTexto("\nInforme o código do aluno");
    String nome = entradaDeDadosTexto("\nInforme o nome do aluno");
    String email = entradaDeDadosTexto("\nInforme o email do aluno");
    String cidade = entradaDeDadosTexto("\nInforme a cidade do aluno");
    String uf = entradaDeDadosTexto("\nInforme a UF do aluno");

    for(int i = 0; i < QTDREGISTROS; i++) {
      if(alunos[i] == null) {
        alunos[i] = new Aluno(codigo, nome, email, cidade, uf);
        break;
      }
    }

  }

  public static void consultarAluno() {

    String codigo = entradaDeDadosTexto("\nInforme o código para consulta");

    for(int i = 0; i < QTDREGISTROS; i++) {
      if(alunos[i] != null) {
        if(alunos[i].getCodigo().equals(codigo)) {
          JOptionPane.showMessageDialog(null, alunos[i].toString());
          break;
        }
      }
    }

  }

  public static void atualizarAluno() {
    
    String codigo = entradaDeDadosTexto("\nInforme o código para atualizar");

    for(int i = 0; i < QTDREGISTROS; i++) {
      if(alunos[i] != null) {
        if(alunos[i].getCodigo().equals(codigo)) {
          
          String nome = entradaDeDadosTexto("\nInforme o nome do aluno");
          String email = entradaDeDadosTexto("\nInforme o email do aluno");
          String cidade = entradaDeDadosTexto("\nInforme a cidade do aluno");
          String uf = entradaDeDadosTexto("\nInforme a UF do aluno");

          alunos[i].setNome(nome);
          alunos[i].setEmail(email);
          alunos[i].setCidade(cidade);
          alunos[i].setUf(uf);

          break;

        }
      }
    }

  }

  public static void excluirAluno() {
    
    String codigo = entradaDeDadosTexto("\nInforme o código para remoção");

    for(int i = 0; i < QTDREGISTROS; i++) {
      if(alunos[i] != null) {  
        if(alunos[i].getCodigo().equals(codigo)) {
          alunos[i] = null;
          break;
        }
      }
    }

  }

  public static void listarAlunos() {
    
    String todos = "";
    
    for(int i = 0; i < QTDREGISTROS; i++) {
      if(alunos[i] != null) {
        todos += alunos[i].toString();
      }
    }

    JOptionPane.showMessageDialog(null, todos);

  }

  public static void main(String[] args) {
    
    String opcao = "";
    
    while (!opcao.equals("6")) {
      opcao = entradaDeDadosTexto("Menu de opcoes\n\n" +
                              " 1 - Cadastrar\n" +
                                "2 - Consultar\n"+
                                "3 - Atualizar\n"+
                                "4 - Excluir\n"+
                                "5 - Listar\n"+
                                "6 - Sair \n\n"+
                                "Escolha sua opcao:"
      );
      
      switch(opcao) {
        case "1":
            if(podeCadastrarAlunos()) {
              cadastrarAluno();
            } else {
              JOptionPane.showMessageDialog(null, "Quantidade máxima de alunos atingida!");
            }
            break;
        case "2":
            consultarAluno();
            break;
        case "3" :
            atualizarAluno();
            break;
        case "4":
            excluirAluno();
            break;
        case "5":
            listarAlunos();
            break;
        default:
            break;
      }
        
    
    }

  }

}