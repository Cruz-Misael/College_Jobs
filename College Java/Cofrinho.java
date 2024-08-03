import java.util.ArrayList;
import java.util.Iterator;

public class Cofrinho {
    private ArrayList<Moeda> moedas; // Coleção de moedas no cofrinho

    public Cofrinho() {
        this.moedas = new ArrayList<>(); // Inicializa a coleção de moedas
    }

    // Adiciona uma moeda ao cofrinho
    public void adicionarMoeda(Moeda moeda) {
        moedas.add(moeda);
    }

    // Remove uma moeda específica do cofrinho
    public void removerMoeda(Moeda moeda) {
        Iterator<Moeda> it = moedas.iterator();
        while (it.hasNext()) {
            Moeda m = it.next();
            // Compara o tipo e valor da moeda para encontrar a moeda a ser removida
            if (m.getMoeda().equals(moeda.getMoeda()) && m.getValor() == moeda.getValor()) {
                it.remove();
                break;
            }
        }
    }

    // Lista todas as moedas no cofrinho
    public void listarMoedas() {
        for (Moeda moeda : moedas) {
            System.out.println(moeda);
        }
    }

    // Calcula o valor total das moedas no cofrinho convertido para Real
    public double calcularTotalConvertido() {
        double total = 0;
        for (Moeda moeda : moedas) {
            total += moeda.converterParaReal();
        }
        return total;
    }
}
