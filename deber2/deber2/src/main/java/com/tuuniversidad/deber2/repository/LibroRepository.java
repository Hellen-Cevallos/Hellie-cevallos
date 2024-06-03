package com.tuuniversidad.deber2.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.tuuniversidad.deber2.models.Libro;
import org.springframework.stereotype.Repository;

@Repository
public class LibroRepository {

    private List<Libro> libros;

    public LibroRepository() {
        libros = new ArrayList<>();
        libros.add(new Libro(1L, "Orgullo y prejuicio", "Jane Austen", "T.Egerton,Whitehall", 1813));
        libros.add(new Libro(2L, "Harry Potter y la piedra filosofal", "J. K. Rowling", "Salamandra",1997));
        libros.add(new Libro(3L, "Harry Potter y la piedra filosofal", "Suzanne Collins", "Scholastic",2008));
        libros.add(new Libro(4L, "Crepúsculo", "Stephenie Meyer", "Katherine Tegen Books", 2011));
        libros.add(new Libro(5L, "Divergente", "Veronica Roth", "Bloomsbury Scholastic",2022));
        libros.add(new Libro(6L, "1984", "George Orwell", "Secker & Warburg",2022));
    }

    public List<Libro> obtenerTodosLosLibros() {
        return libros;
    }

    public Optional<Libro> obtenerLibroPorId(Long id) {
        return libros.stream().filter(libro -> libro.getId().equals(id)).findFirst();
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }
}
