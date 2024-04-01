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
 * @brief Class Circulo1
 */
public class Circulo1 {
    private double raio;
    private double area;
    private double perimetro;
    
    public Circulo1(){
        
    }
    
    public Circulo1(double area, double raio, double perimetro){
        super();
        this.area = area;
        this.perimetro = perimetro;
        this.raio = raio;
    }
    
    public double getRaio(){
        return raio;
    }
    
    public double getArea(){
        return area;
    }
    
    public double getPerimetro(){
        return perimetro;
    }
    
    public void setRaio(double raio){
        this.raio = raio;
    }
    
    public void calcularArea(){
        area = raio * raio * 3.14;
    }
    
    public void calcularPerimetro(){
        perimetro = 2 * 3.14 * raio;
    }
}
