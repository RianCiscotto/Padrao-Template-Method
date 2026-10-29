package padroescomportamentais.templatemethod;

public class ColaboradorEspecialista extends Colaborador {
    public String verificarDesempenho() {
        if (this.calcularMedia() >= 7.0f) return "Satisfatório";
        else return "Insatisfatório";
    }

    @Override
    public String getTipo() {
        return "ColaboradorEspecialista";
    }
}
