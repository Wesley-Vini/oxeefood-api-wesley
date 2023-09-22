package br.com.ifpe.oxeefood.api.produto;


import br.com.ifpe.oxeefood.modelo.produto.Produto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProdutoRequest {

   
   private String titulo;
   
   private String codigo;
  
   private String descricao;
  
   private String valorUnitario;
  
   private String tempoEntregaMinima;
   
   private String tempoEntregaMaxima;

   public Produto build() {

       return Produto.builder()
               .titulo(titulo)
               .codigo(codigo)
               .descricao(descricao)
               .valorUnitario(valorUnitario)
               .tempoEntregaMinima(tempoEntregaMinima)
               .tempoEntregaMaxima(tempoEntregaMaxima)

               .build();
   }
}

