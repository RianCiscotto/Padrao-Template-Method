package padroescomportamentais.templatemethod;

public class ColaboradorOperacional extends Colaborador {
    public String verificarDesempenho() {
        if (this.calcularMedia() >= 6.0f) return "Satisfatório";
        else return "Insatisfatório";
    }
}
