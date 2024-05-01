package projetoalunos;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ArrayAluno implements Interface {
    private List<Aluno> aluno = new ArrayList<>();

    @Override
    public boolean inserir(Aluno p) {
        JOptionPane.showMessageDialog(null, "Aluno cadastrado");
        return aluno.add(p);
        
    }

    @Override
    public Aluno seleciona(String rgm) {
        for (Aluno a : aluno){
            if (a.getRgm().equals(rgm)) {
                float media;
                media = (a.getNotaParcial() + a.getNotaReg()) / 2;
                
                if (media < 6) {
                    JOptionPane.showMessageDialog(null, "Aluno: \nRGM: " + a.getRgm() + " \nNome: " + a.getNome() + "\nNota Final: " + media + "\nSituação Final: Avaliação Final!");
                }
                
                else if (media >= 6) {
                    JOptionPane.showMessageDialog(null, "Aluno: \nRGM: " + a.getRgm() + " \nNome: " + a.getNome() + " \nSituação Final: Aprovado!");
                }
                
                return a;
            }
                
            }

        JOptionPane.showMessageDialog(null, "Aluno não cadastrado no sistema!");
        return null;
    }

    @Override
    public List<Aluno> selecionaTodos() {
        int i = 1;
        for (Aluno a : aluno) {
            System.out.println("Aluno " + i);
            System.out.println("RGM: " + a.getRgm());
            System.out.println("Nome: " + a.getNome());
            System.out.println("Nota Parcial: " + a.getNotaParcial());
            System.out.println("Nota Regimental: " + a.getNotaReg());
            System.out.println("");
            i++;
        }
        return aluno;
    }
    
}
