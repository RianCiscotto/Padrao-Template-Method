package padroescomportamentais.templatemethod;

public abstract class Colaborador {
    private int registro;
    protected String nome;
    private float avaliacao1;
    private float avaliacao2;

    public int getRegistro() {
        return registro;
    }

    public void setRegistro(int registro) {
        this.registro = registro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getAvaliacao1() {
        return avaliacao1;
    }

    public void setAvaliacao1(float avaliacao1) {
        this.avaliacao1 = avaliacao1;
    }

    public float getAvaliacao2() {
        return avaliacao2;
    }

    public void setAvaliacao2(float avaliacao2) {
        this.avaliacao2 = avaliacao2;
    }

    public float calcularMedia() {
        return (this.avaliacao1 + this.avaliacao2) / 2;
    }

    public abstract String verificarDesempenho();

    public String getTipo() {
        return "Colaborador";
    }

    public String getInfo() {
        return getTipo() + "{" + "registro=" + this.registro + ", nome='" + this.nome + '\'' + ", resultado=" + this.verificarDesempenho() + '}';
    }
}
