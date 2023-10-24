package ExercicioFacul;

class Carro implements Comparable<Carro> {
        private String marca;
        private String modelo;
        private int anoFabricacao;

       // Construtor de classe Carro
      public Carro(String marca, String modelo, int anoFabricacao) {
             this.marca = marca;
             this.modelo = modelo;
             this.anoFabricacao = anoFabricacao;
        }
        // Método para a marca do carro
        public String getMarca() {
              return marca;
        }
        // Método para o modelo do carro
        public String getModelo() {
               return modelo;
        }
        // Método para o ano de fabricação do carro
        public int getAnoFabricacao() {
               return anoFabricacao;
         }

        // Método de comparação para ordenar carros por ano de fabricanção
       @Override
      public int compareTo(Carro outroCarro) {
             return Integer.compare(this.anoFabricacao, outroCarro.getAnoFabricacao());
     }

      // Método para representar um carro como uma string
      @Override
      public String toString() {
             return marca + " " + modelo + " (" + anoFabricacao + ")";
      }
}
