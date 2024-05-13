package farias.paulino.kauan.SpringData_Ex1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import farias.paulino.kauan.SpringData_Ex1.model.ProdutoPedido;
import farias.paulino.kauan.SpringData_Ex1.model.ProdutoPedidoId;

public interface IProdutoPedidoRepository extends JpaRepository<ProdutoPedido, ProdutoPedidoId> {

}
