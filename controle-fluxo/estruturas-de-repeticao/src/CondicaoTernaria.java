public class CondicaoTernaria {
    public static void main(String[] args) {
        int nota = 7;
        String avaliado = nota >= 7 ? "aprovado" : nota >= 5 && nota<7 ? "recuperacao": "reprovado";
        System.out.println(avaliado);
    }
}
