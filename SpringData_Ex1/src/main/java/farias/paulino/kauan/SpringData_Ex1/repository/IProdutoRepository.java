package farias.paulino.kauan.SpringData_Ex1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import farias.paulino.kauan.SpringData_Ex1.model.Produto;

public interface IProdutoRepository extends JpaRepository<Produto, Integer> {

}
