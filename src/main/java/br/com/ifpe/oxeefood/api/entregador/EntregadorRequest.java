package br.com.ifpe.oxeefood.api.entregador;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

import br.com.ifpe.oxeefood.modelo.entregador.Entregador;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EntregadorRequest {

   
   private String Nome;
  
   private String Cpf;
   
   private String Rg;

   @JsonFormat(pattern = "dd/MM/yyyy")
   private LocalDate DataNascimento;
  
   private String FoneCelular;
  
   private String FoneFixo;
    
   private String QtdEntregasRealizadas;

   
   private String ValordeFrete;

   private String Rua;

  
   private int Numero;
   
   private String Bairro;

    
   private String Cidade;

   
   private int Cep;

        
   private int UF;
    
    
   private String Complemento;



   public Entregador build() {

       return Entregador.builder()
               .Nome(Nome)
               .Cpf(Cpf)
               .Rg(Rg)
               .DataNascimento(DataNascimento)
               .FoneCelular(FoneCelular)
               .FoneFixo(FoneFixo)
               .QtdEntregasRealizadas(QtdEntregasRealizadas)
               .ValordeFrete(ValordeFrete)
               .Rua(Rua)
               .Numero( Numero)
               .Bairro(Bairro)
               .Cidade(Cidade)
               .Cep(Cep)
               .UF( UF)
               .Complemento(Complemento)
               .build();
   }
}


 