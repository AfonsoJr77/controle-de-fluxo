public class FormatadorCepExemplo {
    public static void main(String[] args) {
        
        String cepFormatado = formatarCep (23765064);
            System.out.println(cepFormatado);
    }
    static String formatarCep ( String cep ) throws CepInvalidoException {
        if( cep.length() != 8 )
            throw new CepInvalidoException(); // condição que irá lançar ou não a exceção.
            
            //Simulando um cep formatado
            return "23.765-064";
    }       

    
}
