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

package alunos;

/**
 *
 * @author Gabriel Gomes Rodrigues Cheim <gabrielgrcheim2@gmail.com>
 * @date 20/03/2024
 * @brief Class departamento
 */
public class departamento {

    private String nomeDoCurso;
    private String siglaDoCurso;
    private int duracao;
    private String nomeDoDepartamento;
    private String siglaDoDepartamento;
    
    public departamento() {
        
    }

    public void setNomeDoCurso(String nomeDoCurso) {
        this.nomeDoCurso = nomeDoCurso;
    }

    public String getNomeDoCurso() {
        return nomeDoCurso;
    }

    public void setSiglaDoCurso(String siglaDoCurso) {
        this.siglaDoCurso = siglaDoCurso;
    }

    public String getSiglaDoCurso() {
        return siglaDoCurso;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setNomeDoDepartamento(String nomeDoDepartamento) {
        this.nomeDoDepartamento = nomeDoDepartamento;
    }

    public String getNomeDoDepartamento() {
        return nomeDoDepartamento;
    }

    public void setSigladoDoDepartamento(String siglaDoDepartamento){
        this.siglaDoDepartamento = siglaDoDepartamento;
    }

    public String getSiglaDoDepartamento() {
        return siglaDoDepartamento;
    }
}
