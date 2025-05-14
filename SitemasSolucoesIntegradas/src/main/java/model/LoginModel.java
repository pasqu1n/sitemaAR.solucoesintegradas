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

 String email; 
 String senha;

 // contrutor com paramento
    public LoginModel(String email, String senha) {
        this.email = email;
        this.senha = senha;
    }
 
 // Contrutrutor Vazio
     public LoginModel() {
         
     }
}
