package farias.paulino.kauan.SpringData_Ex1.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Pedido")
public class Pedido {
	
	@Id
	@Column(name = "id", nullable = false)
	private int id;
	
	@Column(name="data_pedido", nullable = false)
	private LocalDate data_pedido;
	
	
}
