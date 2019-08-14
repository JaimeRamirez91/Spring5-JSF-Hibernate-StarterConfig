package com.inventario.app.dao;

import java.util.List;
import com.inventario.app.models.Categoria;

public interface CategoriaDao {
	public List<Categoria> findAll();
}
