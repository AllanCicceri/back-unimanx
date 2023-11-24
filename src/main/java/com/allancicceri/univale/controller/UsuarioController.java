package com.allancicceri.univale.controller;

import com.allancicceri.univale.model.entity.Projeto;
import com.allancicceri.univale.model.entity.Usuario;
import com.allancicceri.univale.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    @Autowired
    private UsuarioService service;
    private final BCryptPasswordEncoder passwordEncoder;
    public UsuarioController(BCryptPasswordEncoder encoder){
        this.passwordEncoder = encoder;
    }

    @GetMapping
    public ResponseEntity<List<Usuario>> GetAll(){
        List<Usuario> usuarios = service.FindAll();
        return ResponseEntity.ok(usuarios);
    }

    @PostMapping
    public ResponseEntity<Usuario> Create(@RequestBody Usuario usuario){
        String senhaCriptografada = passwordEncoder.encode(usuario.getPassword());
        usuario.setPassword(senhaCriptografada);

        var result = service.create(usuario);
        return ResponseEntity.ok(result);
    }

    @PostMapping("/{nome}")
    public  ResponseEntity<Usuario> GetUserByNameAndPass(@PathVariable String nome, @RequestBody String password){
        Usuario usuario = service.FindByNome(nome);

        if(usuario != null){
            boolean passMatches = passwordEncoder.matches(password, usuario.getPassword());
            if(passMatches){
                return ResponseEntity.ok(usuario);
            }
        }
        return  ResponseEntity.notFound().build();
    }

    @PutMapping
    public  ResponseEntity<Usuario> UpdateUser(@RequestBody Usuario usuario){
        String senhaCriptografada = passwordEncoder.encode(usuario.getPassword());
        usuario.setPassword(senhaCriptografada);
        Usuario usuarioAtualizado = service.Update(usuario);

        return ResponseEntity.ok(usuarioAtualizado);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity RemoveUser(@PathVariable int id){
        service.Delete(id);
        return ResponseEntity.ok().build();

    }


}
