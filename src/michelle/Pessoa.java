package michelle;


import java.time.LocalDate;

public class Pessoa {

    private String nome;
    private LocalDate dataNascimento;
    private String signo;


    public int getIdade() {
        int idade = LocalDate.now().getYear() - dataNascimento.getYear();
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getSigno() {
        return signo;
    }

    public void setSigno(String signo) {
        this.signo = signo;
    }
}
