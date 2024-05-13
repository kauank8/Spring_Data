package farias.paulino.kauan.SpringData_Ex1.model;

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
public class ProdutoPedidoId {
	private static final long serialVersionUID = 1L;
	private Produto produto;
	private Pedido pedido;
}
