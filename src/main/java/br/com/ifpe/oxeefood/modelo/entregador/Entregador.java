package br.com.ifpe.oxeefood.modelo.entregador;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.Where;

import br.com.ifpe.oxeefood.util.entity.EntidadeAuditavel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name = "Entregador")
@Where(clause = "habilitado = true")
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Entregador extends EntidadeAuditavel  {
    @Column
   private String Nome;
   @Column
   private String Cpf;
    @Column
   private String Rg;
   @Column
   private LocalDate DataNascimento;
   @Column
   private String FoneCelular;
   @Column
   private String FoneFixo;
    @Column
   private String QtdEntregasRealizadas;

    @Column
   private String ValordeFrete;

    @Column
   private String Rua;

    @Column
   private int Numero;
   @Column
   private String Bairro;

     @Column
   private String Cidade;

       @Column
   private int Cep;

         @Column
   private int UF;
    
      @Column
   private String Complemento;

}

