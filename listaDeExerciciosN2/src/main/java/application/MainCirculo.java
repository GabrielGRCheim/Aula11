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

package application;

import java.util.Scanner;
import listaDeExercicios.Circulo1;

/**
 *
 * @author Gabriel Gomes Rodrigues Cheim <gabrielgrcheim2@gmail.com>
 * @date 01/04/2024
 * @brief Class MainCirculo
 */
public class MainCirculo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circulo1 circulo = new Circulo1();
        
        System.out.println("Digite o valor do primeiro raio");
        circulo.setRaio(sc.nextDouble());
        circulo.calcularArea();
        circulo.calcularPerimetro();
        System.out.println("O valor da Área é: ");
        System.out.println(circulo.getArea());
        System.out.println("O valor do perímetro é: ");
        System.out.println(circulo.getPerimetro());
    }

}
