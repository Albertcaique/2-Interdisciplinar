import javax.swing.JOptionPane;

public class Aluno extends Pessoa {
    private double mensalidade = 2000;
    private String curso;

    public double getMensalidade() {
        return mensalidade;
    }

    public void setMensalidade(Double mensalidade) {
        this.mensalidade = mensalidade;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void curso() {
        this.curso = JOptionPane.showInputDialog("Curso: ");
    }

    public void mostrar1() {
        String mensagem = "Curso escolhido! \n";
        mensagem += "\nCruso: " + this.getCurso();
        mensagem += "\nMensalidade : R$ " + this.getMensalidade();
        JOptionPane.showMessageDialog(null, mensagem);
    }
}
