package br.com.ifpe.oxeefood.modelo.produto;

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
@Table(name = "Produto")
@Where(clause = "habilitado = true")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Produto extends EntidadeAuditavel  {
    
   @Column
   private String titulo;
   @Column
   private String codigo;
   @Column
   private String descricao;
   @Column
   private String valorUnitario;
   @Column
   private String tempoEntregaMinima;
   @Column
   private String tempoEntregaMaxima;

}
