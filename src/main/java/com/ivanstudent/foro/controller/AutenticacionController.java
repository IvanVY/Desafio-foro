package com.ivanstudent.foro.controller;

import com.ivanstudent.foro.dto.security.DatosJWTtoken;
import com.ivanstudent.foro.dto.usuario.DatosAutenticacionUsuario;
import com.ivanstudent.foro.modelo.Usuario;
import com.ivanstudent.foro.security.TokenService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class AutenticacionController {

    @Autowired
    private AuthenticationManager authenticationManager;
    @Autowired
    private TokenService tokenService;


    @PostMapping
    public ResponseEntity autenticarUsuario(@RequestBody @Valid DatosAutenticacionUsuario datosAutenticacion) {
        Authentication authToken = new UsernamePasswordAuthenticationToken(datosAutenticacion.email(), datosAutenticacion.contrasena());
        var usuarioAutenticado = authenticationManager.authenticate(authToken);
        var JWTtoken = tokenService.generarToken((Usuario) usuarioAutenticado.getPrincipal());
        return ResponseEntity.ok(new DatosJWTtoken(JWTtoken));
    }
}