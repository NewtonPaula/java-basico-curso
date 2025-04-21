public class FormatarTelefone {
    public static void main(String[] args) {

        try {
            String telefoneFormatado = formatarTelefone("8881888999");
            System.out.println(telefoneFormatado);
        } catch (ValidarTelefone e) {

            System.out.println("telefone invalido");
        }

    }

    static String formatarTelefone(String telefone) throws ValidarTelefone{
        if( telefone.length() != 9){
            throw new ValidarTelefone();
        }

            return telefone;
        

    }
    
}
