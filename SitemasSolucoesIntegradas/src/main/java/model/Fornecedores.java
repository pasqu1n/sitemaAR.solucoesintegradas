/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Arthur / Marcos Daniel
 */
public class Fornecedores {
// cadeia -> String
// inteiro -> Int
// real -> Double ou Float
// logico -> Boolean
// datas -> Date
    
    private String nomeFornecedor;
    private String contatoDosFornecedores; 
    private String nomeDaLojaDosFornecedores;

    public Fornecedores(String nomeFornecedor, String contatoDosFornecedores, String nomeDaLojaDosFornecedores) {
       this.nomeFornecedor = nomeFornecedor;
        this.contatoDosFornecedores = contatoDosFornecedores;
        this.nomeDaLojaDosFornecedores = nomeDaLojaDosFornecedores;
        
    }

    public Fornecedores() {
    }
    
    // metodo getter e setter

    public String getNomeFornecedor() {
        return nomeFornecedor;
    }

    public void setNomeFornecedor(String nomeFornecedor) {
        this.nomeFornecedor = nomeFornecedor;
    }

    public String getContatoDosFornecedores() {
        return contatoDosFornecedores;
    }

    public void setContatoDosFornecedores(String contatoDosFornecedores) {
        this.contatoDosFornecedores = contatoDosFornecedores;
    }

    public String getNomeDaLojaDosFornecedores() {
        return nomeDaLojaDosFornecedores;
    }

    public void setNomeDaLojaDosFornecedores(String nomeDaLojaDosFornecedores) {
        this.nomeDaLojaDosFornecedores = nomeDaLojaDosFornecedores;
    }
    
            
           
}
