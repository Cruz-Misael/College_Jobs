public class Dolar extends Moeda {
    public Dolar(double valor) {
        super(valor);
    }

    @Override
    public double converterParaReal() {
        return valor * 5.0; // Converte Dólar para Real usando uma taxa de câmbio fixa
    }

    @Override
    public String getMoeda() {
        return "Dolar"; // Retorna o nome da moeda
    }
}

public class Euro extends Moeda {
    public Euro(double valor) {
        super(valor);
    }

    @Override
    public double converterParaReal() {
        return valor * 6.0; // Converte Euro para Real usando uma taxa de câmbio fixa
    }

    @Override
    public String getMoeda() {
        return "Euro"; // Retorna o nome da moeda
    }
}

public class Real extends Moeda {
    public Real(double valor) {
        super(valor);
    }

    @Override
    public double converterParaReal() {
        return valor; // Real já está em Reais
    }

    @Override
    public String getMoeda() {
        return "Real"; // Retorna o nome da moeda
    }
}
