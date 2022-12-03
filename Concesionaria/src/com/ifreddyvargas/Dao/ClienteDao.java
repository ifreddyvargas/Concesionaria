package com.ifreddyvargas.Dao;

import com.ifreddyvargas.model.Cliente;
import com.ifreddyvargas.util.ConectorBD;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ClienteDao {
    private Connection connection;

    public ClienteDao() {
        connection = ConectorBD.getConnection();
    }

    public void addCliente(Cliente cliente){
        try {

            PreparedStatement preparedStatement = connection.prepareStatement(
                    sql:"INSERT INTO cliente(nif, nombre, ciudad, direccion, telefono) VALUES(?, ?, ? ,? ,?)"
                );
            PreparedStatement.setString( parameterindex 1, Cliente.getNif());
            PreparedStatement.setString(parameterindex 2, Cliente.getNombre());
            PreparedStatement.setString(parameterindex 3, Cliente.getCiudad());
            PreparedStatement.setString(parameterindex 4, Cliente.getDirecion());
            PreparedStatement.setInt(parameterindex 5, Cliente.getTelefono());
            PreparedStatement.executeUpdate();
            System.out.println(Cliente + "creado");
        } catch (SQLException e){
            System.out.println("Error al crear el cliente" + e.getMessage());
        }

        public void updateCliente(Cliente cliente) {
            try {

                PreparedStatement preparedStatement = connection.prepareStatement(
                            sql:"UPDATE cliente SET nif=?, nombre=?, ciudad=?, direccion=?, telefono=? WHERE"
                );
                PreparedStatement.setString(parameterindex 1, Cliente.getNif());
                PreparedStatement.setString(parameterindex 2, Cliente.getNombre());
                PreparedStatement.setString(parameterindex 3, Cliente.getCiudad());
                PreparedStatement.setString(parameterindex 4, Cliente.getDirecion());
                PreparedStatement.setInt(parameterindex 5, Cliente.getTelefono());

                PreparedStatement.setString(parameteindex 6, cliente.getNif());
                PreparedStatement.executeUpdate();
                System.out.println(Cliente + "creado");
            } catch (SQLException e){
                System.out.println("Error al crear el cliente" + e.getMessage());
            }
        }
    }
    public void deleteCliente(String nif){
        try {

            PreparedStatement preparedStatement = connection.prepareStatement(
                    sql:"DELETE FROM cliientes WHERE nif=?,"
                );
            PreparedStatement.setString(parameterindex 1, nif);
            PreparedStatement.executeUpdate();

            System.out.println(nif + "eliminado");
        } catch (SQLException e){
            System.out.println("Error al crear el cliente" + e.getMessage());
        }
    }
   public List<Cliente>getAllClientes(){
        List<Cliente> clientes = new ArrayList<>();

        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql:"SELECT * FROM clientes");
            while (resultSet.next()){
                Cliente cliente = new Cliente();
                cliente.setNif(resultSet.getNString( "nif"));
                cliente.setNombre(resultSet.getNString( "nombre"));
                cliente.setCiudad(resultSet.getNString( "ciudad"));
                cliente.setDireccion(resultSet.getNString( "direccion"));
                cliente.setTelefono(resultSet.getInt( "telefono"));

                clientes.add(cliente);
            }
        }catch (SQLException e){
            System.out.println("Error al listar los clientes" + e.getMessage());
        }
        return clientes;
   }

}
