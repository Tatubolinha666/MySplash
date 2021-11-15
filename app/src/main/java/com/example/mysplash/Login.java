package com.example.mysplash;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Login
{
    private static final String usuario = "nome";
    private static final String senha = "senha";
    private String usuario;
    private String senha;

    public String getusuario()
    {
        return usuario;
    }
    public void setUsuario(String usuario)
    {
        usuario = usuario;
    }
    public String getsenha()
    {
        return senha;
    }
    public void setSenha(String senha)
    {
        senha = senha;
    }    public boolean ValidarUsuario()
{
    if (usuario.equals(""))
    {
        return false;
    }
    else if (senha.equals(""))
    {
        return false;
    }
    else if (!usuario.equals(usuario) || !senha.equals(senha))
    {
        return false;
    }
    else
    {
        return true;
    }
}




