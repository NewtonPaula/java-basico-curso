public class Argumento {
    public static void main(String[] args) {
      String nome = args[0];
      String sobreNome = args[1];
      int idade = Integer.valueOf(args[2]);
      double altura = Double.valueOf(args[3]);
    
      System.out.println("nome completo: "+nome+sobreNome);
      System.out.println("minha idade é de: " + idade);
      System.out.println("tenho a altura de: "+ altura + " cm");
    }

}
