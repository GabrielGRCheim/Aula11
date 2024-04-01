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

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import listaDeExercicios.Funcionario1;

/**
 *
 * @author Gabriel Gomes Rodrigues Cheim <gabrielgrcheim2@gmail.com>
 * @date 01/04/2024
 * @brief Class MainFuncionarios
 */
public class MainFuncionarios {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Funcionario1 funcionario = new Funcionario1();
        List<Funcionario1> funcionarios = new ArrayList<>();
        int opcao;
        boolean sair = true;

        do {
            sair = true;
            System.out.println("Deseja registrar outro funcionario\n" + "1 = Sim \n" + " 2 - Não");
            opcao = sc.nextInt();
            if (opcao == 1) {
                System.out.println("Digite o primeiro nome do funcionario: ");
                funcionario.setNome(sc.nextLine());
                System.out.println("Digite o sobrenome do funcionario: ");
                funcionario.setSobrenome(sc.nextLine());
                System.out.println("Digite o numero de horas trabalhadas: ");
                funcionario.setHorasTrabalhasdas(sc.nextInt());
                System.out.println("Digite o valor por hora trabalhada: ");
                funcionario.setValorPorHora(sc.nextDouble());

                funcionario.nomeCompleto();
                funcionario.calcularSalario();
            }

            System.out.println("Deseja adicionar um valor ao parametro valor por hora? \n " + "1 - Sim \n " + "2 - Não\n" + "3 - Sair");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o valor que sera somado:");
                    funcionario.setHorasTrabalhasdas(sc.nextInt());
                    funcionario.incrementarHoras();
                    funcionario.calcularSalario();
                    System.out.println("Salario alterado com sucesso");
                    break;
                case 2:
                    funcionarios.add(funcionario);
                    System.out.println("Informações do funcionario foram salvas!!");
                case 3:
                    System.out.println("O programa sera encerrado!");
                    sair = false;
                    break;
                default:
                    System.out.println("Opção selecionada invalida!\n" + "Tente novamente!");
                    break;

            }
        } while (sair != false);
    }
}
