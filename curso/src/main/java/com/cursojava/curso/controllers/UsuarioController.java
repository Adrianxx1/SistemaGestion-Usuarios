package com.cursojava.curso.controllers;

import com.cursojava.curso.models.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
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

    @RequestMapping(value = "usuarios")
    public List<Usuario> getUsuarios(){
        List<Usuario> usuarios = new ArrayList<>();
        Usuario usuario = new Usuario();
        usuario.setId(23l);
        usuario.setNombre("Luci");
        usuario.setApellido("Flores");
        usuario.setTelefono("2413342234");
        usuario.setEmail("laior@gmail.com");

        Usuario usuario2 = new Usuario();
        usuario2.setId(2l);
        usuario2.setNombre("Luis");
        usuario2.setApellido("Amador");
        usuario2.setTelefono("2413222234");
        usuario2.setEmail("lsaaor@gmail.com");


     Usuario usuario3 = new Usuario();
     usuario3.setId(1l);
     usuario3.setNombre("Seb");
     usuario3.setApellido("Amador");
     usuario3.setTelefono("2433222234");
     usuario3.setEmail("ior@gmail.com");
     usuarios.add(usuario);
     usuarios.add(usuario2);
     usuarios.add(usuario3);
     return usuarios;

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

