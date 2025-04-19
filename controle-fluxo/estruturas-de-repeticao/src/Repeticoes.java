public class Repeticoes {
    public static void main(String[] args) {
        //exemplo for simples
        for(int x=1; x<=10; x++){
            System.out.println(x);
        }
        //exemplo for array
        String nomes[] = {"newton","jose","souza","estela","amor"};
        for(int i=0;i<=nomes.length;i++){
            System.out.println(nomes[i]);
        }
        String alunos[] = {"newton","jose","souza","estela","amor"};
        //exemplo de foreach     
        for(String nome:alunos){
            System.out.println(nome);

        }
        //exemplo break
        for(int x=1; x<=10; x++){
            System.out.println(x);
            if(x==5){
                break;
            }
        }
        //exemplo de continue
        for(int x=1; x<=10; x++){
            if(x==5){
                continue;
            }
            System.out.println(x);
        }

        // exemplo while
        int n2 = 0;
        while (n2 < 15) {
            System.out.println("voce ganhou");
            
        }


    }    
}
