public abstract class Moeda {
    protected double valor; // Valor da moeda

    public Moeda(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    // Método abstrato para converter a moeda para Real
    public abstract double converterParaReal();
    
    // Método abstrato para obter o tipo de moeda
    public abstract String getMoeda();
    
    @Override
    public String toString() {
        return getMoeda() + ": " + valor; // Retorna uma representação da moeda em formato String
    }
}
