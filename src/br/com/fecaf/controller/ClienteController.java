package br.com.fecaf.controller;

import br.com.fecaf.model.Cliente;
import br.com.fecaf.model.Conexao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ClienteController {

    // Listar Clientes do Banco

    public List<Cliente> listarClientes () {
        // Instanciar Conexao
        Conexao conexao = new Conexao();

        // criar lista vazia.

        List<Cliente> clientes = new ArrayList<>();



        // getConnection é uma referencia ao nosso banco de dados
        Connection connection = conexao.getConnection();

        // tenta realizar a query no banco, em caso de erro catch (captura) e código que segue
        try {
            // Responsavel por executar a query
            Statement statement = connection.createStatement();

            // Query para consulta no banco
            String queryList = "SELECT * FROM tbl_cliente";

            // Executar a query no banco
            ResultSet resultSet = statement.executeQuery(queryList);

            while (resultSet.next()) {
                int idCliente = resultSet.getInt("idCliente");
                String nome = resultSet.getString("nome");
                String CPF  = resultSet.getString("CPF");
                String endereco = resultSet.getString("endereco");
                int telefone = resultSet.getInt("telefone");

                System.out.println("/*********************************/");
                System.out.println("idCliente: " + idCliente );
                System.out.println("nome: " + nome);
                System.out.println("CPF: " + CPF);
                System.out.println("end: " + endereco);
                System.out.println("tel: " + telefone);
                System.out.println("/#################################/");

                // instanciando a classe cliente
                Cliente cliente = new Cliente();
                cliente.setIdCliente(idCliente);
                cliente.setNome(nome);
                cliente.setCPF(CPF);
                cliente.setEndereco(endereco);
                cliente.setTelefone(telefone);

                // Adicionando objeto na lista criada.
                 clientes.add(cliente);





            }

            return clientes; // retorna os valores de minha lista.

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }


    public Cliente consultarCPF(String CPF){
       // chamando a função para obter a lista.
        List<Cliente> clientes = listarClientes();

        // para cada cliente, verificamos  se o cpf bate com o informado.
        for(Cliente cliente: clientes){

            if(cliente.getCPF().equals(CPF)){
                System.out.println("Cliente Localizado");
                return cliente;
            }
        }
        System.out.println("Cliente não encontrado!");
        return null;



    }
}
