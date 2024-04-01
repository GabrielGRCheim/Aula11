/*
 * Copyright (C) 2024 Gabriel Gomes Rodrigues Cheim <gabrielgrcheim2@gmail.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package listaDeExercicios;

/**
 *
 * @author Gabriel Gomes Rodrigues Cheim <gabrielgrcheim2@gmail.com>
 * @date 01/04/2024
 * @brief Class Funcionario1
 */
public class Funcionario1 {
    private String nome;
    private String sobrenome;
    protected Integer horasTrabalhadas;
    protected double valorPorHora;
    
    public Funcionario1(){
        
    }
    
    public Funcionario1(String nome, String sobrenome, Integer horasTrabalhadas, double valorPorHora){
        super();
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.valorPorHora =valorPorHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
       public void setSobrenome(String sobrenome){
        this.sobrenome = sobrenome;
    }
    
       public void setHorasTrabalhasdas(Integer horasTrabalhadas){
        this.horasTrabalhadas = horasTrabalhadas;
    }
    
       public void setValorPorHora(double valorPorHora){
        this.valorPorHora = horasTrabalhadas;
    }
    
    public void nomeCompleto(){
        System.out.println(nome + sobrenome);
    }
    
    public void calcularSalario(){
        System.out.println(horasTrabalhadas * valorPorHora);
    }
    
    public void incrementarHoras(){
        this.valorPorHora = valorPorHora + horasTrabalhadas;
    }
    

}
