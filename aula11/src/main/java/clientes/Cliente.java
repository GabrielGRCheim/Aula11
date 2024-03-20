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

package clientes;

/**
 *
 * @author Gabriel Gomes Rodrigues Cheim <gabrielgrcheim2@gmail.com>
 * @date 20/03/2024
 * @brief Class Cliente
 */
public class Cliente {
    
    private String nomeDoCliente;
    private String telefoneDoCliente;
    private Endereco endereco;

    
    public Cliente(){
        
    }
    
    public void setNomeDoCliente(String nomeDoCliente){
    this.nomeDoCliente = nomeDoCliente;
}

public String getNomeDoCliente(){
    return nomeDoCliente;
}

public void setTelefoneDoCliente(String telefoneDoCliente){
    this.telefoneDoCliente = telefoneDoCliente;
}

public String getTelefoneDoCliente(){
    return telefoneDoCliente;
}

 public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
