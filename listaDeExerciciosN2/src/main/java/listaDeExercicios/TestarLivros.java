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

import java.util.Scanner;

/**
 *
 * @author Gabriel Gomes Rodrigues Cheim <gabrielgrcheim2@gmail.com>
 * @date 01/04/2024
 * @brief Class TestarLivros
 */
public class TestarLivros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Livro livro = new Livro();
        
        System.out.println("Digite o título do livro: ");
        livro.setTitulo(sc.nextLine());
        System.out.println("Digite a quantidade de paginas do livro: ");
        livro.setQtdPaginas(sc.nextInt());
        System.out.println("O livro" + livro.getTitulo() + " possui " + livro.getQtdPaginas() + " páginas");
        System.out.println("Digite a quantidade de paginas ja lidas");
        livro.setPaginasLidas(sc.nextInt());
        livro.verificarProgresso();
        
    }
}
