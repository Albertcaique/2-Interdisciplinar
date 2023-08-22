import javax.swing.JOptionPane;

public class Professor extends Pessoa {
    private String especialidade;
    private float salario = 4000;

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public void curso() {
        this.especialidade = JOptionPane.showInputDialog("Especialidade: ");
    }

    public void mostrar1() {
        String mensagem = "Especialidade escolhida! \n";
        mensagem += "\nEspecialidade: " + this.getEspecialidade();
        mensagem += "\nSalário: R$ " + this.getSalario();
        JOptionPane.showMessageDialog(null, mensagem);
    }
}
