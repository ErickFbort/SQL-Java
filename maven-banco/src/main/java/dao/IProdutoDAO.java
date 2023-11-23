package dao;

import java.util.List;

import ModeloTable.Produto;

public interface IProdutoDAO {
    Produto findById(int produtoId);
    List<Produto> findAll();
    void save(Produto produto);
    void update(Produto produto);
    void delete(Produto produto);
}
