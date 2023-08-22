import javax.swing.JOptionPane;

public class Pessoa {
    private String nome;
    private int idade;
    private String sexo;
    private String cpf;
    private int a;
    private String escolha;
    private int cadastro;

    public String getEscolha() {
        return escolha;
    }

    public void setEscolha(String escolha) {
        this.escolha = escolha;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getCadastro() {
        escolhaClasse();
        return cadastro;
    }

    public void setCadastro(int cadastro) {
        this.cadastro = cadastro;
    }

    public void insereDados() {
        this.cadastro = Integer.parseInt(JOptionPane.showInputDialog(
                "Escolha umas das opções: \n 1 - Aluno. \n 2 - Bolsista. \n 3 - Professor. \n 4 - Visitante."));
        this.nome = JOptionPane.showInputDialog("Nome: ");
        this.idade = Integer.parseInt(JOptionPane.showInputDialog("Idade: "));
        this.sexo = JOptionPane.showInputDialog("Sexo: ");
        this.cpf = JOptionPane.showInputDialog("CPF: ");

    }

    public void escolhaClasse() {
        Aluno p1 = new Aluno();
        Bolsista p2 = new Bolsista();
        Professor p3 = new Professor();
        Visitante p4 = new Visitante();

        switch (cadastro) {
            case 1:

                p1.curso();
                p1.mostrar1();
                break;
            case 2:

                p2.curso();
                p2.mostrar1();
                break;
            case 3:

                p3.curso();
                p3.mostrar1();
                break;
            case 4:

                p4.mostrar2();
                break;
            default:
                System.out.println("Opção invalida");
                break;
        }
    }

    public void mostrar() {
        String mensagem = "Cadastro realizado! \n";
        mensagem += "\nNome: " + this.getNome();
        mensagem += "\nIdade: " + this.getIdade();
        mensagem += "\nSexo: " + this.getSexo();
        mensagem += "\nCPF: " + this.getCpf();
        JOptionPane.showMessageDialog(null, mensagem);
    }
}
