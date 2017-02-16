package com.service;

import java.util.List;

import org.springframework.security.access.prepost.PostAuthorize;
import org.springframework.security.access.prepost.PreAuthorize;

public interface CRUD<T> {

	@PreAuthorize("hasRole('ROLE_ADMIN')")
	public void create(T parameter);

	@PreAuthorize("hasRole('ROLE_ADMIN') OR hasRole('ROLE_USER')")
	public List<T> read(int parameter);

	@PreAuthorize("hasRole('ROLE_ADMIN')")
	public void update(T parameter);

	@PreAuthorize("hasRole('ROLE_ADMIN')")
	public void delete(int parameter);

	public T get(int parameter);
}