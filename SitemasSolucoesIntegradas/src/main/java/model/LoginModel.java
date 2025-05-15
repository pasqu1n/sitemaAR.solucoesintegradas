/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ALUNOS
 */
public class LoginModel {
// Cadeia -> String
// Inteiro -> int
// Real -> Double ou float
// Logico -> boolean
// Datas -> Date

 private String email; 
 private String senha;

 // contrutor com paramento
    public LoginModel(String email, String senha) {
        this.email = email;
        this.senha = senha;
    }
 
 // Contrutrutor Vazio
     public LoginModel() {
         
     }
     
     // metodos getter e setter

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
     
     
}
