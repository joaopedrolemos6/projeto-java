public class CaixaRegistradora {
    private RefeitorioEscolar refeitorio;

    public CaixaRegistradora(RefeitorioEscolar refeitorio) {
        this.refeitorio = refeitorio;
    }

    public void vender(int idAlimento, int quantidade) {
        Alimento alimento = refeitorio.obterAlimento(idAlimento);
        double precoTotal = alimento.getPreco() * quantidade;
        System.out.println("Venda realizada: " + quantidade + " " + alimento.getNome() + "(s) por R$ " + precoTotal);
    }
}