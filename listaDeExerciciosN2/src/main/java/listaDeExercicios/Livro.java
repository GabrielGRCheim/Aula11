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
 * @brief Class Livro
 */
public class Livro {
    private String titulo;
    private Integer qtdPaginas;
    private Integer paginasLidas;
    
    public Livro(){
        
    }
    
    public Livro(String titulo, Integer qtdPaginas){
        this.titulo = titulo;
        this.qtdPaginas = qtdPaginas;
    }
    
    public String getTitulo(){
        return titulo;
    }
    
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    
    public Integer getQtdPaginas(){
        return qtdPaginas;
    }
    
    public void setQtdPaginas(Integer qtdPaginas){
        this.paginasLidas = qtdPaginas;
    }
    
    public Integer getPaginasLidas(){
        return paginasLidas;
    }
    
    public void setPaginasLidas(Integer paginasLidas){
        this.paginasLidas = paginasLidas;
    }
    
    public void verificarProgresso(){
        System.out.println("você ja leu " + ((paginasLidas * 100 ) / qtdPaginas) + "por cento do livro");
    }
    
    
}
