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
 * @brief Class Caminhao
 */
public class Caminhao extends Veiculo{
    // De finição da variavel exclusiva do Onibus
    private int eixos;
    // Construtor responsavel pela chama para utilização na Main
    public Caminhao(){
        
    }
    
    public Caminhao(String placa, int ano){
        super(placa, ano);
    }
    // Metodos responsaveis pela chamada e adição de informações 
    public void setEixos(int eixos){
        this.eixos = eixos;
    }
    
    public int getEixos(int eixos){
        return eixos;
    }
    // Sobrecarga que reescreve como as informações serão imprimidas quando a classe for chamada 
    @Override
    public String toString(){
        return "Caminhao [placa= " + super.getPlaca() + " ano= " + super.getAno() + " eixos= " + eixos + "]";
    }
}
