package poo.atividade2.atividade2.Entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Funcionario
 */
@Entity
public class Funcionario implements Serializable{

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int regCod;

    private String name;
    private double salario;
    private String departamento;
    private String cpf;

    public Funcionario()
    {

    }

    public Funcionario(int cod, String nome, double salario, String dep, String cpf)
    {
        this.regCod = cod;
        this.name = nome;
        this.salario = salario;
        this.departamento = dep;
        this.cpf = cpf;
    }

    public int getRegCod() {
        return regCod;
    }

    public void setRegCod(int regCod) {
        this.regCod = regCod;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    
}