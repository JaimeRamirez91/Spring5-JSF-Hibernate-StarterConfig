package com.inventario.app.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.inventario.app.models.Categoria;
@Repository("clienteDaoJPA")
public class CategoriaDaoImp implements CategoriaDao{
	
	@PersistenceContext
    private EntityManager em;
	
	@SuppressWarnings("unchecked")
	@Transactional
	@Override
	public List<Categoria> findAll() {
		return em.createQuery("from Categoria").getResultList();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
