import java.util.HashMap;
import java.util.Map;

public class RefeitorioEscolar {
    private Map<Integer, Alimento> cardapio;

    public RefeitorioEscolar() {
        cardapio = new HashMap<>();
        adicionarAlimento(1, "Hambúrguer", 3.5);
        adicionarAlimento(2, "Cheeseburger", 4.0);
        adicionarAlimento(3, "Batatas Fritas", 2.0);
        adicionarAlimento(4, "Refrigerante", 1.5);
    }

    public void adicionarAlimento(int id, String nome, double preco) {
        cardapio.put(id, new Alimento(nome, preco));
    }

    public void removerAlimento(int id) {
        cardapio.remove(id);
    }

    public Alimento obterAlimento(int id) {
        return cardapio.get(id);
    }
}
