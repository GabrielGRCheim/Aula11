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

package musicas;

/**
 *
 * @author Gabriel Gomes Rodrigues Cheim <gabrielgrcheim2@gmail.com>
 * @date 20/03/2024
 * @brief Class Musica
 */
public class Musica {

    private String nomeDaMusica;
    private String tipoDaMusica;
    
    public Musica(){
    
    }
    
    public Musica(String nomeDaMusica, String tipoDaMusica){
        super();
        this.nomeDaMusica = nomeDaMusica;
        this.tipoDaMusica = tipoDaMusica;
    }
    
    public void setNomeDaMusica(String nomeDaMusica){
        this.nomeDaMusica = nomeDaMusica;
    }
    
    public String getNomeDaMusica( ){
        return nomeDaMusica;
    }
    
    public void setTipoDaMusica(String tipoDaMusica){
        this.tipoDaMusica = tipoDaMusica;
    }
    
    public String getTipoDaMusica( ){
        return tipoDaMusica;
    }
    
    @Override
    public String toString(){
        return "Musica [nome= " + nomeDaMusica + " tipo= " + tipoDaMusica + "]";
    }
}
