import java.util.concurrent.ThreadLocalRandom;
public class ControleDeCandidatura {
    public static void main(String[] args) throws Exception {
        selecionarCandidato();

    }
    static void selecionarCandidato(){
        String[] candidatos = {"Newton","Estela","Lucas","Jose","Souza","Queiroz","Munhoz","Mariano"};
        int candidatosSelecionados = 0;
        int cont = 0;
        double salarioBase = 2000;
        while(candidatosSelecionados <5 && cont < candidatos.length){
            String candidato = candidatos[cont];
            double salarioPrentendido = valorPretendido();
            System.out.println("analisando candidato " + candidato + "valor selecionado " + salarioPrentendido);
            if (salarioBase>=salarioPrentendido) {
                System.out.println("candidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecionados ++;
            }
            cont++;


        }

    }
    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800,2200);
    }
    static void analisarCandidato(double metaDeSalario){

        double salarioBase = 2000;
        if (salarioBase > metaDeSalario) {
            System.out.println("Ligar para o candidato");
            
        }else if(salarioBase == metaDeSalario){
            System.out.println("Mandar contra proposta para o candidato");
            
        }else
        System.out.println("Aguarde resultado dos demais candidatos");
    }
}
