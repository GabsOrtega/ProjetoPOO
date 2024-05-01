package projetoalunos;
import javax.swing.JOptionPane;


public class ProjetoAlunos {

    public static void main(String[] args) {
    
    ArrayAluno listaAlunos = new ArrayAluno();
    while (true){
    int opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "1 - Cadastrar aluno"
            + "\n2 - Pesquisar aluno"
            + "\n3 - Listar todos os alunos"
            + "\n4 - Dados do projeto"
            + "\n5 - Sair"));
    
    switch (opcao){
        case 1:
            String rgm = JOptionPane.showInputDialog("Digite o RGM do aluno: ");
            String nome = JOptionPane.showInputDialog("Digite o Nome do aluno: ");
            float nota_parcial = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota parcial do aluno: "));
            float nota_reg = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota regimental do aluno: "));
                   
            Aluno aluno = new Aluno(rgm, nome, nota_parcial, nota_reg);
            listaAlunos.inserir(aluno);
            break;
            
        case 2:
            String rgmPesquisar = JOptionPane.showInputDialog(null, "Digite o RGM do aluno que deseja pesquisar: ");
            listaAlunos.seleciona(rgmPesquisar);
            break;
            
        case 3:
            listaAlunos.selecionaTodos();
            break;
        
        case 4:
            JOptionPane.showMessageDialog(null, "Gabriel Ortega - RGM: 34659293 \nRivaldo Junior - RGM: 34608532 \nSamuel Rodrigues - RGM: 35812206 \n\n               Versão: 1.0");
            break;
            
        case 5:
            System.exit(0);
            break;
        default:
            JOptionPane.showMessageDialog(null, "Opção Inválida!");
    }
    }
    
    
    }
}
