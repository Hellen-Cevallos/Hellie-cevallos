package com.tuuniversidad.deber2.models;

public class Libro {
    private Long id;
    private String titulo;
    private String autor;
    private String editorial;
    private Integer anioPublicacion;

    public Libro(Long id, String titulo, String autor, String editorial, Integer anioPublicacion) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.anioPublicacion = anioPublicacion;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getEditorial() {
        return editorial;
    }
    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
    public Integer getAnioPublicacion() {
        return anioPublicacion;
    }
    public void setAnioPublicacion(Integer anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }
    @Override
    public String toString() {
        return "Libro{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", editorial='" + editorial + '\'' +
                ", anioPublicacion=" + anioPublicacion +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Libro libro = (Libro) o;

        if (!id.equals(libro.id)) return false;
        if (!titulo.equals(libro.titulo)) return false;
        if (!autor.equals(libro.autor)) return false;
        if (!editorial.equals(libro.editorial)) return false;
        return anioPublicacion.equals(libro.anioPublicacion);
    }
    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + titulo.hashCode();
        result = 31 * result + autor.hashCode();
        result = 31 * result + editorial.hashCode();
        result = 31 * result + anioPublicacion.hashCode();
        return result;
    }
}