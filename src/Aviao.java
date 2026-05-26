public class Aviao {
    private String modelo;
    private float tamanhoTanqueEmLitros;

    public Aviao() {
    }

    public Aviao(String modelo, float tamanhoTanqueEmLitros) {
        this.modelo = modelo;
        this.tamanhoTanqueEmLitros = tamanhoTanqueEmLitros;
    }

    public Aviao(String modelo, String tamanhoTanqueEmLitros) {

    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getTamanhoTanqueEmLitros() {
        return tamanhoTanqueEmLitros;
    }

    public void setTamanhoTanqueEmLitros(float tamanhoTanqueEmLitros) {
        this.tamanhoTanqueEmLitros = tamanhoTanqueEmLitros;
    }

    @Override
    public String toString() {
        return "Aviao{" +
                "modelo='" + modelo + '\'' +
                ", tamanhoTanqueEmLitros=" + tamanhoTanqueEmLitros +
                '}';
    }
}
