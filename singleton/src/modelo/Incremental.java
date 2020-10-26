package modelo;

public class Incremental {

	
        private static int count = 0;
        private int numero;
        private static Incremental unicaInstancia;

        private Incremental() {
                     numero = ++count;
        }
        public String toString() {
                     return "Incremental " + numero;
        }
        
        /*
         * Para evitar que mais de uma thread consiga instanciar essa classe ao mesmo tempo
         * foi usada a anota��o synchronized, que cria uma exclus�o m�tua.
         */
        public static synchronized Incremental getInstance() {
        	if(unicaInstancia == null) {
        		unicaInstancia = new Incremental();
        		
        	}
        	
        	return unicaInstancia;
        		
        }
}

