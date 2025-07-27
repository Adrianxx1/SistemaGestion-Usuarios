package com.cursojava.curso.controllers;

import com.cursojava.curso.models.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsuarioController {

    @RequestMapping(value = "usuario/{id}")
    public Usuario getUsuario(@PathVariable Long id){
        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNombre("Luis");
        usuario.setApellido("Amador");
        usuario.setTelefono("2413222234");
        return usuario;
    }
    @RequestMapping(value = "usuario23")
    public Usuario editar(){
     Usuario usuario = new Usuario();
     usuario.setNombre("Luis");
     usuario.setApellido("Amador");
     usuario.setTelefono("2413222234");
        return usuario;
    }
    @RequestMapping(value = "usuario233")
    public Usuario eliminar(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Luis");
        usuario.setApellido("Amador");
        usuario.setTelefono("2413222234");
        return usuario;
    }
    @RequestMapping(value = "usuario12")
    public Usuario buscar(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Luis");
        usuario.setApellido("Amador");
        usuario.setTelefono("2413222234");
        return usuario;
    }
}

