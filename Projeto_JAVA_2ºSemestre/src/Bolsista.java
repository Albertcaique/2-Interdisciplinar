import javax.swing.JOptionPane;

public class Bolsista extends Aluno{
    private double bolsa = (2000 -(2000*0.30));

    public double getBolsa() {
        return bolsa;
    }

    public void setBolsa(double bolsa) {
        this.bolsa = bolsa;
    }

    @Override
    public void mostrar1() {
        String mensagem = "Valor com desconto da Bolsa! \n";
        mensagem += "\nCruso: " + this.getCurso();
        mensagem += "\nMensalidade : R$ " + this.getBolsa();
        JOptionPane.showMessageDialog(null, mensagem);
    }
}
