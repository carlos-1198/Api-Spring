package com.shop.market.persistence.crud;

import com.shop.market.persistence.entity.Producto;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ProductoCrudRepository extends CrudRepository<Producto, Integer> {

    //query nativa @Query(value = "SELECT * FORM productos WHERE id_categoria =?", native Query = true)
    //spring query con ordenamiento findByIdCategoriaOrderByNombreAsc(int idCategoria)
    List<Producto> findByIdCategoria(int idCategoria);
    //busca productos que tengan menos de cierta cantidad en stock y tengan un estado especifico
   // Optional<List<Producto>> findByCantidadStockLessThanAndEstado(int cantidadStocks);
    List<Producto> findByIdCategoriaOrderByNombreAsc(int idCategoria);
    Optional<List<Producto>> findByCantidadStockLessThanAndEstado(int cantidadStock, boolean estado);
}
