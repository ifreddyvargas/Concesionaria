package com.ifreddyvargas;

import com.ifreddyvargas.model.Cliente;
import com.ifreddyvargas.util.ConectorBD;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        Connection connection = ConectorBD.getConnection();
    }




/*
    Cliente cliente = new Cliente("1450", "Carlos Perez", "Cochabamba", "Av. Ayacucho s/n", "45939493");
    Cliente cliente1 = new Cliente("1450", "Carlos Perez", "Cochabamba", "Av. Ayacucho s/n", "45939493");
    Cliente cliente2 = new Cliente("1450", "Carlos Perez", "Cochabamba", "Av. Ayacucho s/n", "45939493");
    Cliente cliente3 = new Cliente("1450", "Carlos Perez", "Cochabamba", "Av. Ayacucho s/n", "45939493");
    Cliente cliente4 = new Cliente("1450", "Carlos Perez", "Cochabamba", "Av. Ayacucho s/n", "45939493");
    Cliente cliente5 = new Cliente("1450", "Carlos Perez", "Cochabamba", "Av. Ayacucho s/n", "45939493");
    Cliente cliente6 = new Cliente("1450", "Carlos Perez", "Cochabamba", "Av. Ayacucho s/n", "45939493");
    Cliente cliente7 = new Cliente("1450", "Carlos Perez", "Cochabamba", "Av. Ayacucho s/n", "45939493");
    Cliente cliente8 = new Cliente("1450", "Carlos Perez", "Cochabamba", "Av. Ayacucho s/n", "45939493");
    Cliente cliente9 = new Cliente("1450", "Carlos Perez", "Cochabamba", "Av. Ayacucho s/n", "45939493");
    Cliente cliente10 = new Cliente("1450", "Carlos Perez", "Cochabamba", "Av. Ayacucho s/n", "45939493");
    //Pon nombre a todos los clientes, cambia nif, direccion, y telefono.

    //CRUD tabla clientes
    ClienteDao clienteDao = new ClienteDao();
    clienteDao.addCliente(cliente)

    // READ
    List<Cliente> cliente = clienteDao.getClass();
    for(int i =0; i < clientes.size(); i++){
        Cliente cliente = clientes.get(i);

        System.out.println(cliente);
    }
    //UPDATE
    Cliente cliente =new Cliente("1450", "Carlos Perez", "Cochabamba", "Av. Ayacucho s/n", "45939493");
    clienteDAO.updateCliente(cliente);

    // DELETE
    clienteDao,deleteCliente(nif 1450);

*/
}