package com.distribuida.servicio;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;


import com.distribuida.dto.Todos;

@ApplicationScoped
@Transactional

public class ServicioTodosImpl implements ServicioTodos{
	
	@PersistenceContext(unitName = "TodosPU")
	private EntityManager entityManager;

	@Override
	public List<Todos> getDirecciones() {
		List<Todos> lista = null;
		lista = entityManager.createNamedQuery("todos.findAll", Todos.class).getResultList();
		return lista;
		
	}

}
