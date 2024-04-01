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
 * @brief Class Retangulo
 */
public class Retangulo1 {

    private double lado1;
    private double lado2;
    private double area;
    private double perimetro;
    
    
    public Retangulo1(){
        
    }
    
    public Retangulo1(double lado1, double lado2, double area, double perimetro){
        super();
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.area = area;
        this.perimetro = perimetro;
    }
    
    public double getLado1(){
        return lado1;
    }
    
    public double getLado2(){
        return lado2;
    }
    
    public double getArea(){
        return area;
    }
    
    public double getPerimetro(){
        return perimetro;
    }
    
    public void setLado1(double lado1){
        this.lado1 = lado1;
    }
    
    public void setLado2(double lado2){
        this.lado2 = lado2;
    }
    
    public void calcularArea(){
        area = lado1 * lado2;
    }
    
    public void calcularPerimetro(){
        perimetro = (lado1 + lado2) * 2;
    }
}
