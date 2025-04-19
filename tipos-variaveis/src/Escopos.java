public class Escopos {
    double salario = 1400;
    public static void main(String[] args) {
        Escopos escopos = new Escopos();
        escopos.aumentar(10);
    }

    public void aumentar(double porcentagem){
        salario = salario + (porcentagem/100 * salario);
        System.out.println(salario);
    }
    
}

