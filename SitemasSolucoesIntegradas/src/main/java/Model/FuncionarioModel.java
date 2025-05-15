/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author ALUNO
 */
public class FuncionarioModel {
    private String nome;
    private String cpf;
    private String dataNascimento;
    private String sexo;
    private String email; 
    private String senha;
    
    //metodos getter e setter
    
   // getter serve para vsualizar os dados 
    
    // setter serve para guardar os dados

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
//metodo com retorno do tipo string
    public String getSenha() {
        return senha;
    }
//método com parametro e sem retorno
    public void setSenha(String senha) {
        this.senha = senha;
    }
    
   
}

