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
import listaDeExercicios.Filme;

/**
 *
 * @author Gabriel Gomes Rodrigues Cheim <gabrielgrcheim2@gmail.com>
 * @date 01/04/2024
 * @brief Class TestarFilme
 */
public class TestarFilme {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Filme filme1 = new Filme();
        Filme filme2 = new Filme();
        
        
        System.out.println("Digite o titulo do filme:");
        filme1.setTitulo(sc.nextLine());
        System.out.println("Digite o tempo de duração do filme em minutos");
        filme1.setDuracaoEmMinutos(sc.nextInt());
        filme1.exibirDuracaoEmhoras();
        
        System.out.println("\n- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
        System.out.println("Registre outro filme ");
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - \n");

        sc.nextLine();
        
        System.out.println("Digite o titulo do filme:");
        filme2.setTitulo(sc.nextLine());
        System.out.println("Digite o tem de duração do filme em minutos");
        filme2.setDuracaoEmMinutos(sc.nextInt());
        filme2.exibirDuracaoEmhoras();
        
        System.out.println("\n- - - - - - - - - - - - - - - - - - - - - - - - - - - - - -\n");
        
        System.out.println("Os filmes em cartaz são : \n" + "1 - " + filme1.getTitulo() + "\n" + "2 - " + filme2.getTitulo());
        sc.close();
    }
}
