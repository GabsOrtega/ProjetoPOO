package projetoalunos;
import java.util.List;

public interface Interface {
    public abstract boolean inserir(Aluno p);
    public abstract Aluno seleciona(String rgm);
    public abstract List<Aluno> selecionaTodos();
}
