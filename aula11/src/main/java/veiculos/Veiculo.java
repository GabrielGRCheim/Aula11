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

package veiculos;

/**
 *
 * @author Gabriel Gomes Rodrigues Cheim <gabrielgrcheim2@gmail.com>
 * @date 18/03/2024
 * @brief Class Veiculo
 */
public abstract class Veiculo {
    // Definição das variaveis abstratas
    private String placa;
    private int ano;
    // Construtor utilizado nas chamadas em outros codigos
    public Veiculo() {
    
    }
   
    public Veiculo(String placa, int ano){
        super();
        this.placa = placa;
        this.ano = ano;
    }
    // Criação do metodo que retorna o valor da varivel 
    public String getPlaca(){
        return placa;
    }
    // Criação do metodo que recebe e armazena as novas informações da variavel
    public void setPlaca(String placa){
        this.placa = placa;
    }
    // Criação do metodo que retorna o valor da varivel 
    public int getAno(){
        return ano;
    }
    // Criação do metodo que recebe e armazena as novas informações da variavel
    public void setAno(int ano){
        this.ano = ano;
    }
    // Sobrecarga que reescreve como as informações serão imprimidas quando a classe for chamada 
    @Override
    public String toString(){
        return "Veiculo [placa= " + placa + " ano= " + ano + "]";
    }
    

}
