public class FluxoDeSaque {
    public static void main(String[] args) throws Exception {
        double saldo = 100;
        double saque = 101;

    if (saque<saldo) {
        saldo = saldo-saque;
        System.out.println(saldo);
    }else
        System.out.println("saldo insuficiente");
            }
}
