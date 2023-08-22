import javax.swing.JOptionPane;

public class Visitante extends Pessoa {
    public void mostrar2() {
        String mensagem = "Seja bem-vindo(a) a nossa universidade! \n";
        mensagem += "\nVenha se matricular, todos nossos cursos custam R$ 2000 \nCom descontos de 30%";
        JOptionPane.showMessageDialog(null, mensagem);
    }
}
