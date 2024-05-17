public class Main {
    public static void main(String[] args) {
        RefeitorioEscolar refeitorio = new RefeitorioEscolar();
        CaixaRegistradora caixa = new CaixaRegistradora(refeitorio);

        caixa.vender(1, 2); // Compra 2 hambúrgueres
        caixa.vender(4, 1); // Compra 1 refrigerante
    }
}