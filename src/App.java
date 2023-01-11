public class App {
    public static void main(String[] args) throws Exception {
        int numero = 5;
        int i = 0;

        System.out.println("Tabela de multiplicacao de " + numero);

        while (i <= 10) {
            System.out.println(numero + " x " + i + " = " + numero*i);
            i++;
        }
    }
}
