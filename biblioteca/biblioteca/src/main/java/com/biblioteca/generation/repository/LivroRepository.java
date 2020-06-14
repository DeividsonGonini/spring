package com.biblioteca.generation.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.biblioteca.generation.model.Livro;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Long>{
public List<Livro>findAllByTituloContainingIgnoreCase (String Titulo);
}
