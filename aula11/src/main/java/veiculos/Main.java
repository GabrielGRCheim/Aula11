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

// Importes para o funcionamento do codigo
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gabriel Gomes Rodrigues Cheim <gabrielgrcheim2@gmail.com>
 * @date 18/03/2024
 * @brief Class Main
 */
public class Main {

    public static void main(String[] args) {
        // definição do Scanner para entrada do usuario
        Scanner sc = new Scanner(System.in);
        Onibus onibus = new Onibus();
        Caminhao caminhao = new Caminhao();
        // Criação da lista para armazenamento dos veiculos registrados
        List<Veiculo> veiculos = new ArrayList<>();

        // variaveis utilizadas para a transição no codigo
        boolean voltar = false;
        boolean fechar = false;
        int opcao;

        // Laço de repetição que impede que o codigo termine antes que seja solicitado pelo usuario
        while (!fechar) {
            System.out.println("Selecione uma das opções: \n"
                    + "1 - Adicionar um veiculo. \n"
                    + "2 - Remover um veiculo \n"
                    + "3 - Editar um veiculo \n"
                    + "4 - Fechar.");

            opcao = sc.nextInt();
            
            switch (opcao) {
                // Parte responsavel por registrar e adicionar veiculos a lista
                case 1:
                    while (!voltar) {
                        System.out.println("Selecione o veiculo que você deseja registrar \n 1 - Onibus \n 2 - Caminhão \n 3 - Voltar");
                        opcao = sc.nextInt();
                        if (opcao == 1) {
                            System.out.println("Digite a Placa do veiculo: ");
                            onibus.setPlaca(sc.next());
                            System.out.println("Digite o Ano do veiculo: ");
                            onibus.setAno(sc.nextInt());
                            System.out.println("Digite o número de Assentos do veicuo: ");
                            onibus.setAssentos(sc.nextInt());
                            veiculos.add(onibus);
                            break;
                        } else if (opcao == 2) {
                            System.out.println("Digite a Placa do veiculo: ");
                            caminhao.setPlaca(sc.next());
                            System.out.println("Digite o Ano do veiculo: ");
                            caminhao.setAno(sc.nextInt());
                            System.out.println("Digite o número de Eixos do veicuo: ");
                            caminhao.setEixos(sc.nextInt());
                            veiculos.add(caminhao);
                            break;
                        } else if (opcao == 3) {
                            voltar = true;
                            break;
                        } else {
                            System.out.println("Opção digitada invalida! \n tente novamente!");
                        }

                    }
                    break;
                    // Parte responsavel por remover veiculos registrados na lista 
                case 2:
                    int VeiculoRemover;
                    if (!veiculos.isEmpty()) {
                        for (int i = 0; i > veiculos.size(); i++) {
                            System.out.println("Índicie" + i);
                            System.out.println(veiculos.get(i) + "\n");
                        }
                        System.out.println("Qual veiculo você deseja remover");
                        VeiculoRemover = sc.nextInt();

                        if (VeiculoRemover >= 0 && VeiculoRemover <= veiculos.size()) {
                            veiculos.remove(VeiculoRemover);
                            System.out.println("Veiculo removido com sucesso!!");
                        }
                    } else {
                        System.out.println("Você ainda não possui veiculos registrados!");
                    }
                    break;
                    // Parte responsavel por editar informações de veiculos ja contidos na lista 
                case 3:
                    if (!veiculos.isEmpty()) {
                        for (int i = 0; i > veiculos.size(); i++) {
                            System.out.println("Índicie" + i);
                            System.out.println(veiculos.get(i) + "\n");
                        }
                        System.out.println("Qual veiculo você deseja Editar?");
                        opcao = sc.nextInt();

                        if (opcao >= 0 && opcao <= veiculos.size()) {
                            Veiculo VeiculoEditar = veiculos.get(opcao);
                            if (VeiculoEditar instanceof Onibus) {
                                System.out.println("Qual a nova placa do veiculo?:");
                                VeiculoEditar.setPlaca(sc.next());
                                System.out.println("Qual o novo Ano do veiculo?:");
                                VeiculoEditar.setAno(sc.nextInt());
                                System.out.println("Qual o novo número de Assentos?:");
                                ((Onibus) VeiculoEditar).setAssentos(sc.nextInt());
                                System.out.println("Veiculo Editado com sucesso!!");
                            } else if (VeiculoEditar instanceof Caminhao) {
                                System.out.println("Qual a nova placa do veiculo?:");
                                VeiculoEditar.setPlaca(sc.next());
                                System.out.println("Qual o novo Ano do veiculo?:");
                                VeiculoEditar.setAno(sc.nextInt());
                                System.out.println("Qual o novo número de Eixos?:");
                                ((Caminhao) VeiculoEditar).setEixos(sc.nextInt());
                                System.out.println("Veiculo Editado com sucesso!!");
                            } else {
                                System.out.println("Índice digitado invalido!!");
                            }
                        }
                    } else {
                        System.out.println("Você ainda não possui veiculos registrados!");
                    }
                    break;
                    // Parte responsavel pela finalização do codigo 
                case 4:
                    fechar = true;
                    System.out.println("Programa Finalizado");
                    break;
                    // Parte responsavel pela validação de digiteção correta do usuario
                default:
                    System.out.println("Opção digitada invalida! \n Tente novamente");

            }
        }

    }
}
