
package gestaomoodweb;

import gestaomoodweb.dao.ClienteDAO;
import gestaomoodweb.dao.ColecoesDAO;
import gestaomoodweb.dao.Conexao;
import gestaomoodweb.dao.FornecedoresDAO;
import gestaomoodweb.dao.ProdutoDAO;
import gestaomoodweb.dao.UsuarioDAO;
import gestaomoodweb.dao.VendasDAO;
import gestaomoodweb.model.Cliente;
import gestaomoodweb.model.Colecoes;
import gestaomoodweb.model.Fornecedores;
import gestaomoodweb.model.Funcionario;
import gestaomoodweb.model.Produto;
import gestaomoodweb.model.Vendas;
import gestaomoodweb.model.VendaProduto;
import gestaomoodweb.service.CalculoService;
import gestaomoodweb.service.ClienteService;
import gestaomoodweb.service.LoginService;
import gestaomoodweb.service.VendaService;

import java.math.BigDecimal;
import java.time.LocalDate;

public class GestaoMoodWEB {

   
    public static void main(String[] args) {
        
        System.out.println("=================================");
        System.out.println("   TESTE DO PROJETO GESTAOMOOD");
        System.out.println("=================================");

        try {

            System.out.println("\n1. Testando conexão com o banco...");

            Conexao conexao = new Conexao();
            conexao.conectar().close();

            System.out.println("OK - Conexão com o banco funcionando.");

            System.out.println("\n2. Testando os modelos...");

            Cliente cliente = new Cliente(
                    1,
                    "Cliente Teste",
                    "teste@email.com",
                    "000.000.000-00",
                    "000000000",
                    "Endereco Teste"
            );

            Produto produto = new Produto(
                    1,
                    "Camisa",
                    "Preto",
                    new BigDecimal("99.90"),
                    "Marca Teste",
                    "SKU001",
                    10,
                    1
            );

            Funcionario funcionario = new Funcionario(
                    1,
                    "Funcionario Teste",
                    "Vendedor",
                    LocalDate.now(),
                    "Ativo"
            );

            Fornecedores fornecedor = new Fornecedores(
                    1,
                    "Fornecedor Teste",
                    "00.000.000/0000-00",
                    "000000000",
                    "fornecedor@email.com"
            );

            Colecoes colecao = new Colecoes(
                    1,
                    "Colecao Teste",
                    "Tema Teste",
                    LocalDate.now(),
                    "2026",
                    1
            );

            Vendas venda = new Vendas(
                    1,
                    LocalDate.now(),
                    new BigDecimal("199.80"),
                    "Pix",
                    1,
                    1
            );

            VendaProduto vendaProduto = new VendaProduto(
                    1,
                    1,
                    2,
                    new BigDecimal("99.90")
            );

            System.out.println("OK - Modelos funcionando.");

            System.out.println("\n3. Testando os DAOs...");

            ClienteDAO clienteDAO = new ClienteDAO();
            ProdutoDAO produtoDAO = new ProdutoDAO();
            ColecoesDAO colecoesDAO = new ColecoesDAO();
            FornecedoresDAO fornecedoresDAO = new FornecedoresDAO();
            VendasDAO vendasDAO = new VendasDAO();
            UsuarioDAO usuarioDAO = new UsuarioDAO();

            System.out.println("OK - DAOs funcionando.");

            System.out.println("\n4. Testando os Services...");

            ClienteService clienteService = new ClienteService();
            VendaService vendaService = new VendaService();
            LoginService loginService = new LoginService();
            CalculoService calculoService = new CalculoService();

            System.out.println("OK - Services funcionando.");

            System.out.println("\n5. Testando o CalculoService...");

            double resultado = calculoService.calcular(100.0, 20.0);

            if (resultado == 80.0) {
                System.out.println("OK - CalculoService funcionando.");
            } else {
                System.out.println("ERRO - CalculoService apresentou resultado inesperado.");
            }

            System.out.println("\n6. Testando os getters dos modelos...");

            if (cliente.getNome().equals("Cliente Teste")
                    && produto.getMarca().equals("Marca Teste")
                    && funcionario.getNome().equals("Funcionario Teste")
                    && fornecedor.getNome().equals("Fornecedor Teste")
                    && colecao.getNome().equals("Colecao Teste")
                    && venda.getPagamento().equals("Pix")
                    && vendaProduto.getQuantidade() == 2) {

                System.out.println("OK - Getters funcionando.");
            } else {
                System.out.println("ERRO - Algum getter apresentou resultado inesperado.");
            }

            System.out.println("\n=================================");
            System.out.println("      TODOS OS TESTES BÁSICOS");
            System.out.println("          FORAM EXECUTADOS");
            System.out.println("=================================");

        } catch (Exception e) {

            System.out.println("\nERRO DURANTE OS TESTES:");
            System.out.println(e.getMessage());
        }
    }
} 
  
