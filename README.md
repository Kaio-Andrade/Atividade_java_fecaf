# Atividade_java_fecaf

# Atividade Java - Gerenciamento Básico de Clientes com MySQL

## Descrição do Projeto
Este projeto é uma atividade de programação em Java que demonstra a conexão com um banco de dados MySQL e a realização de operações básicas de consulta (leitura/query) em uma tabela de clientes.

O projeto consiste em um modelo de dados para clientes, uma classe para gerenciar a conexão com o banco e uma classe controller para orquestrar as operações.

## Tecnologias Utilizadas
* **Linguagem:** Java
* **Banco de Dados:** MySQL
* **Driver de Conexão:** MySQL Connector/J (v8.0.25, conforme configurado no `Project-Conexoes.iml`)

## Estrutura de Código
* `App.java`: Contém o método `main` para execução da aplicação, demonstrando a listagem de clientes e a consulta por CPF.
* `Cliente.java`: Classe de modelo (POJO) que representa a entidade `Cliente`, com atributos como nome, CPF, endereço, idCliente e telefone.
* `Conexao.java`: Classe responsável por estabelecer a conexão com o banco de dados MySQL usando o DriverManager.
* `ClienteController.java`: Lógica de negócios que implementa a listagem de todos os clientes (`listarClientes()`) e a consulta de um cliente por CPF (`consultarCPF(String CPF)`).
* `script.sql`: Script SQL para criação do banco e da tabela.

## Configuração do Banco de Dados (MySQL)

Para que o projeto funcione corretamente, o banco de dados deve ser configurado conforme o script fornecido:

1.  **Criação do Banco de Dados:** Crie o banco de dados chamado `db_java`.
    ```sql
    CREATE DATABASE db_java;
    USE `db_java`;
    ```

2.  **Criação da Tabela e Dados Iniciais:** Execute o restante do conteúdo do arquivo `script.sql` para criar a tabela `tbl_cliente` e popular com dados de exemplo.
    * A tabela `tbl_cliente` é criada com colunas para `idCliente`, `nome`, `CPF`, `endereco` e `telefone`.
    * Os CPFs iniciais inseridos são: `'754845865'` (DANIEL), `'784512784'` (LAURA) e `'968574123'` (VALERIA).

3.  **Configurações de Conexão:** O arquivo `Conexao.java` está configurado com as seguintes credenciais padrão:
    * **Servidor:** `localhost`
    * **Banco de Dados:** `db_java`
    * **Usuário (User):** `root`
    * **Senha (Password):** `12313` (MUDE esta string para a senha do seu usuário `root` do MySQL)

## Como Executar

1.  **Pré-requisitos:** Tenha o Java Development Kit (JDK) e um servidor MySQL instalados e em execução.
2.  **Configuração do Projeto:** Certifique-se de que o driver MySQL Connector/J (`mysql-connector-java-8.0.25.jar`) esteja adicionado às dependências do seu projeto Java.
3.  **Configuração do Banco:** Execute as etapas da seção **Configuração do Banco de Dados** acima.
4.  **Execução da Aplicação:**
    * Execute a classe principal `App.java`.
    * O método `main` irá:
        * Tentar conectar ao banco de dados e imprimir o status da conexão.
        * Chamar `listarClientes()`, que imprimirá no console os detalhes de todos os clientes cadastrados.
        * Chamar `consultarCPF("754845862")`. **Atenção:** O CPF pesquisado no `App.java` (`"754845862"`) não existe nos dados iniciais do `script.sql`. Para um teste bem-sucedido, você pode alterar o CPF em `App.java` para, por exemplo, `"754845865"` para encontrar 'DANIEL'.
