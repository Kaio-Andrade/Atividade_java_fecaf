package br.com.fecaf;

import br.com.fecaf.controller.ClienteController;
import br.com.fecaf.model.Cliente;
import br.com.fecaf.model.Conexao;

import java.util.List;

public class App {
    public static void main(String[] args) {
        ClienteController clienteController = new ClienteController();

        List<Cliente> clientes = clienteController.listarClientes();
        //Cliente cliente1 = clientes.get(0); TESTE
       // System.out.println(cliente1.getNome());  TESTE
        Cliente cliente = clienteController.consultarCPF("754845862"); // CPF DO KAIO.
        // essa funcao retorna um cliente, caso encontrar algum buscando pelo seu cpf.
        System.out.println(cliente.getNome());
    }
}
