/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fct;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Calendar;

import javax.swing.JOptionPane;

/**
 *
 * @author Willian Sotocorno || Murilo Pereira
 */
public class FormPrincipal extends javax.swing.JFrame {

	// Declaração dos vetoroes para armazenar Clientes e Produtos.
	private Cliente[] arrc = new Cliente[20];
	private ProdutoNacional[] arrpn = new ProdutoNacional[50];
	private ProdutoImportado[] arrpi = new ProdutoImportado[30];
	private Venda[] arrv = new Venda[30];

	/**
	 * Creates new form FormPrincipal
	 */
	public FormPrincipal() {
		initComponents();
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		jPanel2 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		jScrollPane2 = new javax.swing.JScrollPane();
		jTextArea2 = new javax.swing.JTextArea();
		menuBarra = new javax.swing.JMenuBar();
		menuMenu = new javax.swing.JMenu();
		menuCadastrar = new javax.swing.JMenu();
		menuCliente = new javax.swing.JMenuItem();
		menuProduto = new javax.swing.JMenu();
		menuNacional = new javax.swing.JMenuItem();
		menuImportado = new javax.swing.JMenuItem();
		menuCompra = new javax.swing.JMenuItem();
		menuDados = new javax.swing.JMenu();
		menuSalvar = new javax.swing.JMenuItem();
		menuCarregar = new javax.swing.JMenuItem();
		menuRelatorios = new javax.swing.JMenu();
		menuClientes = new javax.swing.JMenu();
		menuClienteGeral = new javax.swing.JMenuItem();
		menuClienteEspecifico = new javax.swing.JMenuItem();
		menuClienteGastos = new javax.swing.JMenuItem();
		menuProdutos = new javax.swing.JMenu();
		menuProdutoGeral = new javax.swing.JMenuItem();
		menuProdotuEspecifico = new javax.swing.JMenuItem();
		menuVendas = new javax.swing.JMenu();
		menuVendasGeral = new javax.swing.JMenuItem();
		menuVendasEspecifico = new javax.swing.JMenuItem();
		menuVendasSimples = new javax.swing.JMenuItem();
		menuVendasDetalhado = new javax.swing.JMenuItem();
		menuAjuda = new javax.swing.JMenu();
		menuSobre = new javax.swing.JMenuItem();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("Sistema de Controle de Vendas");
		setBackground(new java.awt.Color(255, 255, 255));

		jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

		jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
		jLabel1.setText("RELATÓRIOS");

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
						.addContainerGap(262, Short.MAX_VALUE).addComponent(jLabel1).addGap(266, 266, 266)));
		jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup().addContainerGap().addComponent(jLabel1)
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		jTextArea2.setEditable(false);
		jTextArea2.setColumns(20);
		jTextArea2.setRows(5);
		jScrollPane2.setViewportView(jTextArea2);

		menuBarra.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

		menuMenu.setText("Menu");
		menuMenu.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N

		menuCadastrar.setText("Cadastrar");
		menuCadastrar.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N

		menuCliente.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
		menuCliente.setText("Cliente");
		menuCliente.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				menuClienteActionPerformed(evt);
			}
		});
		menuCadastrar.add(menuCliente);

		menuProduto.setText("Produto");
		menuProduto.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N

		menuNacional.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
		menuNacional.setText("Nacional");
		menuNacional.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				menuNacionalActionPerformed(evt);
			}
		});
		menuProduto.add(menuNacional);

		menuImportado.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
		menuImportado.setText("Importado");
		menuImportado.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				menuImportadoActionPerformed(evt);
			}
		});
		menuProduto.add(menuImportado);

		menuCadastrar.add(menuProduto);

		menuMenu.add(menuCadastrar);

		menuCompra.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
		menuCompra.setText("Nova Compra");
		menuCompra.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				menuCompraActionPerformed(evt);
			}
		});
		menuMenu.add(menuCompra);

		menuDados.setText("Dados");
		menuDados.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N

		menuSalvar.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
		menuSalvar.setText("Salvar em arquivo");
		menuSalvar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				menuSalvarActionPerformed(evt);
			}
		});
		menuDados.add(menuSalvar);

		menuCarregar.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
		menuCarregar.setText("Carregar a partir de arquivo");
		menuCarregar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				menuCarregarActionPerformed(evt);
			}
		});
		menuDados.add(menuCarregar);

		menuMenu.add(menuDados);

		menuBarra.add(menuMenu);

		menuRelatorios.setText("Relatórios");
		menuRelatorios.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N

		menuClientes.setText("Clientes");
		menuClientes.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N

		menuClienteGeral.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
		menuClienteGeral.setText("Clientes Geral");
		menuClienteGeral.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				menuClienteGeralActionPerformed(evt);
			}
		});
		menuClientes.add(menuClienteGeral);

		menuClienteEspecifico.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
		menuClienteEspecifico.setText("Cliente Específico");
		menuClienteEspecifico.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				menuClienteEspecificoActionPerformed(evt);
			}
		});
		menuClientes.add(menuClienteEspecifico);

		menuClienteGastos.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
		menuClienteGastos.setText("Gastos de um cliente");
		menuClienteGastos.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				menuClienteGastosActionPerformed(evt);
			}
		});
		menuClientes.add(menuClienteGastos);

		menuRelatorios.add(menuClientes);

		menuProdutos.setText("Produtos");
		menuProdutos.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N

		menuProdutoGeral.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
		menuProdutoGeral.setText("Produtos Geral");
		menuProdutoGeral.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				menuProdutoGeralActionPerformed(evt);
			}
		});
		menuProdutos.add(menuProdutoGeral);

		menuProdotuEspecifico.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
		menuProdotuEspecifico.setText("Produto Específico");
		menuProdotuEspecifico.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				menuProdotuEspecificoActionPerformed(evt);
			}
		});
		menuProdutos.add(menuProdotuEspecifico);

		menuRelatorios.add(menuProdutos);

		menuVendas.setText("Vendas");
		menuVendas.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N

		menuVendasGeral.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
		menuVendasGeral.setText("Vendas Geral");
		menuVendasGeral.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				menuVendasGeralActionPerformed(evt);
			}
		});
		menuVendas.add(menuVendasGeral);

		menuVendasEspecifico.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
		menuVendasEspecifico.setText("Vendas Específico");
		menuVendasEspecifico.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				menuVendasEspecificoActionPerformed(evt);
			}
		});
		menuVendas.add(menuVendasEspecifico);

		menuVendasSimples.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
		menuVendasSimples.setText("Vendas por tipo de pagamento - Simples");
		menuVendasSimples.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				menuVendasSimplesActionPerformed(evt);
			}
		});
		menuVendas.add(menuVendasSimples);

		menuVendasDetalhado.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
		menuVendasDetalhado.setText("Vendas por tipo de pagamento - Detalhado");
		menuVendasDetalhado.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				menuVendasDetalhadoActionPerformed(evt);
			}
		});
		menuVendas.add(menuVendasDetalhado);

		menuRelatorios.add(menuVendas);

		menuBarra.add(menuRelatorios);

		menuAjuda.setText("Ajuda");
		menuAjuda.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N

		menuSobre.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
		menuSobre.setText("Sobre");
		menuSobre.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				menuSobreActionPerformed(evt);
			}
		});
		menuAjuda.add(menuSobre);

		menuBarra.add(menuAjuda);

		setJMenuBar(menuBarra);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jPanel2,
						javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addComponent(jScrollPane2));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(1, 1, 1)
						.addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 386, Short.MAX_VALUE)));

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void menuSobreActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_menuSobreActionPerformed
		JOptionPane.showMessageDialog(null, "Desenvolvido por:");
	}// GEN-LAST:event_menuSobreActionPerformed

	private void menuClienteActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_menuClienteActionPerformed
		int i = 0;
		while (arrc[i] != null) {
			i++;
		}
		arrc[i] = new Cliente();
		FormCliente form = new FormCliente(this, true, arrc[i]);
		form.setLocationRelativeTo(null);
		form.setResizable(false);
		form.setVisible(true);
	}// GEN-LAST:event_menuClienteActionPerformed

	private void menuNacionalActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_menuNacionalActionPerformed
		int i = 0;
		while (arrpn[i] != null) {
			i++;
		}
		arrpn[i] = new ProdutoNacional();
		FormNacional form = new FormNacional(this, true, arrpn[i]);
		form.setLocationRelativeTo(null);
		form.setResizable(false);
		form.setVisible(true);
	}// GEN-LAST:event_menuNacionalActionPerformed

	private void menuImportadoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_menuImportadoActionPerformed
		int i = 0;
		while (arrpi[i] != null) {
			i++;
		}
		arrpi[i] = new ProdutoImportado();
		FormImportado form = new FormImportado(this, true, arrpi[i]);
		form.setLocationRelativeTo(null);
		form.setResizable(false);
		form.setVisible(true);
	}// GEN-LAST:event_menuImportadoActionPerformed

	private void menuClienteEspecificoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_menuClienteEspecificoActionPerformed
		String cpfBusca = JOptionPane.showInputDialog("Insira o CPF do cliente: ");
		this.jTextArea2.setText("");
		String textoAtual = "====Cliente====\n";
		for (int i = 0; i < arrc.length; i++) {
			if (arrc[i] != null) {
				if (arrc[i].getCpf().equals(cpfBusca)) {
					textoAtual += "Nome: " + arrc[i].getNome() + "\n";
					textoAtual += "CPF: " + arrc[i].getCpf() + "\n\n";
				}
			}
		}
		textoAtual += "================";
		this.jTextArea2.setText(textoAtual);

	}// GEN-LAST:event_menuClienteEspecificoActionPerformed

	private void menuProdotuEspecificoActionPerformed(java.awt.event.ActionEvent evt) {
		this.jTextArea2.setText("");
		String pCode = JOptionPane.showInputDialog("Insira o código do produto: ");
		String textoAtual = "========Produto código: " + pCode + "========\n";
		for (int i = 0; i < arrpn.length; i++) {
			if (arrpn[i] != null) {
				if (arrpn[i].getCodigo().toUpperCase().equals(pCode.toUpperCase())) {
					textoAtual += "Código: " + arrpn[i].getCodigo() + "\n";
					textoAtual += "Descrição: " + arrpn[i].getDescricao() + "\n";
					textoAtual += "Tipo: Nacional\n";
					textoAtual += "Imposto: R$" + arrpn[i].getTaxaImposto() + "\n";
					textoAtual += "Valor: R$" + arrpn[i].getValor() + "\n\n";
					textoAtual += "============================";
					this.jTextArea2.setText(textoAtual);
					return;
				}
			}
		}
		for (int i = 0; i < arrpi.length; i++) {
			if (arrpi[i] != null) {
				if (arrpi[i].getCodigo().toUpperCase().equals(pCode.toUpperCase())) {
					textoAtual += "Código: " + arrpi[i].getCodigo() + "\n";
					textoAtual += "Descrição: " + arrpi[i].getDescricao() + "\n";
					textoAtual += "Tipo: Importado\n";
					textoAtual += "Imposto: " + arrpi[i].getTaxaImposto() + "\n";
					textoAtual += "Taxa importação: " + arrpi[i].getTaxaImportacao() + "\n";
					textoAtual += "Valor: R$" + arrpi[i].getValor() + "\n\n";
					textoAtual += "============================";
					this.jTextArea2.setText(textoAtual);
					return;
				}
			}
		}
		this.jTextArea2.setText("Produto não encontrado");

	}

	private void menuVendasDetalhadoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_menuVendasDetalhadoActionPerformed
		int code = -1;
		try {
			code = Integer.parseInt(JOptionPane.showInputDialog(
					"Selecione um tipo de pagamento:\n1-Dinheiro\n2-Cartão\n3-Cheque\n\nInsira somente números:"));
		} catch (Exception ex) {
			this.jTextArea2.setText("Entrada inválida.");
			return;
		}
		String textoAtual = "";
		switch (code) {
		case 1:
			this.jTextArea2.setText("");
			textoAtual = "====Vendas c/ pgto. em dinheiro====\n";
			for (int i = 0; i < arrv.length; i++) {
				if (arrv[i] != null) {
					if (arrv[i].getTipoPgto().getTipoPagamento().equals("Dinheiro")) {
						textoAtual += "Venda Nº: " + arrv[i].getNumero();
						textoAtual += " Data: " + arrv[i].getData().get(Calendar.DAY_OF_MONTH) + "/"
								+ arrv[i].getData().get(Calendar.MONTH) + "/" + arrv[i].getData().get(Calendar.YEAR);
						textoAtual += " Cliente: " + arrv[i].getCliente().getNome();
						textoAtual += " CPF: " + arrv[i].getCliente().getCpf() + "\n";
						textoAtual += "Itens: \n";
						textoAtual += "\nN | Cod | Descrição | Valor U. | Qtde | Total\n";
						for (int j = 0; j < arrv[i].getItens().length; j++) {
							if (arrv[i].getItens()[j] != null)
								textoAtual += j + " | " + arrv[i].getItens()[j].getCodigoProduto() + " | "
										+ arrv[i].getItens()[j].getDescricao() + " | R$"
										+ arrv[i].getItens()[j].getValor() + " | "
										+ arrv[i].getItens()[j].getQuantidade() + " | R$"
										+ arrv[i].getItens()[j].calcularTotal() + "\n";
						}
						textoAtual += "\nTotal: R$" + arrv[i].calcularTotal();
						textoAtual += "\nMétodo de pagamento: " + arrv[i].getTipoPgto().getTipoPagamento();
						textoAtual += "\n\n";
					}
				}
			}
			break;

		case 2:
			this.jTextArea2.setText("");
			textoAtual = "====Vendas c/ pgto. no cartão====\n";
			for (int i = 0; i < arrv.length; i++) {
				if (arrv[i] != null) {
					if (arrv[i].getTipoPgto().getTipoPagamento().equals("Cartão")) {
						textoAtual += "Venda Nº: " + arrv[i].getNumero();
						textoAtual += " Data: " + arrv[i].getData().get(Calendar.DAY_OF_MONTH) + "/"
								+ arrv[i].getData().get(Calendar.MONTH) + "/" + arrv[i].getData().get(Calendar.YEAR);
						textoAtual += " Cliente: " + arrv[i].getCliente().getNome();
						textoAtual += " CPF: " + arrv[i].getCliente().getCpf() + "\n";
						textoAtual += "Itens: \n";
						textoAtual += "\nN | Cod | Descrição | Valor U. | Qtde | Total\n";
						for (int j = 0; j < arrv[i].getItens().length; j++) {
							if (arrv[i].getItens()[j] != null)
								textoAtual += j + " | " + arrv[i].getItens()[j].getCodigoProduto() + " | "
										+ arrv[i].getItens()[j].getDescricao() + " | R$"
										+ arrv[i].getItens()[j].getValor() + " | "
										+ arrv[i].getItens()[j].getQuantidade() + " | R$"
										+ arrv[i].getItens()[j].calcularTotal() + "\n";
						}
						textoAtual += "\nTotal: R$" + arrv[i].calcularTotal();
						textoAtual += "\nMétodo de pagamento: " + arrv[i].getTipoPgto().getTipoPagamento();
						textoAtual += "\nNome: " + ((Cartao) (arrv[i].getTipoPgto())).getNome();
						textoAtual += "\nNúmero: " + ((Cartao) (arrv[i].getTipoPgto())).getNumero();
						textoAtual += "\n\n";
					}
				}
			}
			break;

		case 3:
			this.jTextArea2.setText("");
			textoAtual = "====Vendas c/ pgto. no cheque====\n";
			for (int i = 0; i < arrv.length; i++) {
				if (arrv[i] != null) {
					if (arrv[i].getTipoPgto().getTipoPagamento().equals("Cheque")) {
						textoAtual += "Venda Nº: " + arrv[i].getNumero();
						textoAtual += " Data: " + arrv[i].getData().get(Calendar.DAY_OF_MONTH) + "/"
								+ arrv[i].getData().get(Calendar.MONTH) + "/" + arrv[i].getData().get(Calendar.YEAR);
						textoAtual += " Cliente: " + arrv[i].getCliente().getNome();
						textoAtual += " CPF: " + arrv[i].getCliente().getCpf() + "\n";
						textoAtual += "Itens: \n";
						textoAtual += "\nN | Cod | Descrição | Valor U. | Qtde | Total\n";
						for (int j = 0; j < arrv[i].getItens().length; j++) {
							if (arrv[i].getItens()[j] != null)
								textoAtual += j + " | " + arrv[i].getItens()[j].getCodigoProduto() + " | "
										+ arrv[i].getItens()[j].getDescricao() + " | R$"
										+ arrv[i].getItens()[j].getValor() + " | "
										+ arrv[i].getItens()[j].getQuantidade() + " | R$"
										+ arrv[i].getItens()[j].calcularTotal() + "\n";
						}
						textoAtual += "\nTotal: R$" + arrv[i].calcularTotal();
						textoAtual += "\nMétodo de pagamento: " + arrv[i].getTipoPgto().getTipoPagamento();
						textoAtual += "\nEmissor: " + ((Cheque) arrv[i].getTipoPgto()).getNomeEmissor();
						textoAtual += "\nNúmero do cheque: " + ((Cheque) arrv[i].getTipoPgto()).getNumeroCheque();
						textoAtual += "\n\n";
					}
				}
			}
			break;

		default:
			this.jTextArea2.setText("Método de pagamento inválido.");
			break;
		}
		this.jTextArea2.setText(textoAtual);
	}// GEN-LAST:event_menuVendasDetalhadoActionPerformed

	private void menuCompraActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_menuCompraActionPerformed
		int i = 0;
		while (arrv[i] != null) {
			i++;
		}
		arrv[i] = new Venda(15);
		FormVenda form = new FormVenda(this, true, arrv[i], arrc, arrpn, arrpi, i);
		form.setLocationRelativeTo(null);
		form.setResizable(false);
		form.setVisible(true);
	}// GEN-LAST:event_menuCompraActionPerformed

	private void menuClienteGeralActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_menuClienteGeralActionPerformed
		this.jTextArea2.setText("");
		String textoAtual = "====Clientes====\n";
		for (int i = 0; i < arrc.length; i++) {
			if (arrc[i] != null) {
				textoAtual += "Nome: " + arrc[i].getNome() + "\n";
				textoAtual += "CPF: " + arrc[i].getCpf() + "\n\n";
			}
		}
		textoAtual += "================";
		this.jTextArea2.setText(textoAtual);
	}

	private void menuClienteGastosActionPerformed(java.awt.event.ActionEvent evt) {
		this.jTextArea2.setText("");
		String cpfBusca = JOptionPane.showInputDialog("Insira o CPF do cliente: ");
		String textoAtual = "====Compras com o CPF: " + cpfBusca + " ====\n";
		float total = 0;
		for (int i = 0; i < arrv.length; i++) {
			if (arrv[i] != null) {
				if (arrv[i].getCliente().getCpf().equals(cpfBusca)) {
					textoAtual += "Venda Nº: " + arrv[i].getNumero();
					textoAtual += " Data: " + arrv[i].getData().get(Calendar.DAY_OF_MONTH) + "/"
							+ arrv[i].getData().get(Calendar.MONTH) + "/" + arrv[i].getData().get(Calendar.YEAR);
					textoAtual += " Cliente: " + arrv[i].getCliente().getNome();
					textoAtual += " CPF: " + arrv[i].getCliente().getCpf() + "\n";
					textoAtual += "Itens: \n";
					textoAtual += "\nN | Cod | Descrição | Valor U. | Qtde | Total\n";
					for (int j = 0; j < arrv[i].getItens().length; j++) {
						if (arrv[i].getItens()[j] != null)
							textoAtual += j + " | " + arrv[i].getItens()[j].getCodigoProduto() + " | "
									+ arrv[i].getItens()[j].getDescricao() + " | R$" + arrv[i].getItens()[j].getValor()
									+ " | " + arrv[i].getItens()[j].getQuantidade() + " | R$"
									+ arrv[i].getItens()[j].calcularTotal() + "\n";
					}
					textoAtual += "\nTotal: R$" + arrv[i].calcularTotal();
					total += arrv[i].calcularTotal();
					textoAtual += "\nMétodo de pagamento: " + arrv[i].getTipoPgto().getTipoPagamento();

					if (arrv[i].getTipoPgto() instanceof Cartao) {
						textoAtual += "\nNome: " + ((Cartao) arrv[i].getTipoPgto()).getNome();
						textoAtual += "\nNúmero: " + ((Cartao) arrv[i].getTipoPgto()).getNumero();
					} else if (arrv[i].getTipoPgto() instanceof Cheque) {
						textoAtual += "\nEmissor: " + ((Cheque) arrv[i].getTipoPgto()).getNomeEmissor();
						textoAtual += "\nNúmero: " + ((Cheque) arrv[i].getTipoPgto()).getNumeroCheque();
					}
					textoAtual += "\n\n";
				}
			}
		}
		textoAtual += "\nValor total gasto: R$" + total;
		textoAtual += "\n==============================";
		this.jTextArea2.setText(textoAtual);
	}

	private void menuProdutoGeralActionPerformed(java.awt.event.ActionEvent evt) {
		this.jTextArea2.setText("");
		String textoAtual = "====Produtos nacionais====\n";
		for (int i = 0; i < arrpn.length; i++) {
			if (arrpn[i] != null) {
				textoAtual += "Código: " + arrpn[i].getCodigo() + "\n";
				textoAtual += "Descrição: " + arrpn[i].getDescricao() + "\n";
				textoAtual += "Imposto: R$" + arrpn[i].getTaxaImposto() + "\n";
				textoAtual += "Valor: R$" + arrpn[i].getValor() + "\n\n";
			}
		}
		textoAtual += "============================";
		textoAtual += "\n========Produtos Importados=======\n";
		for (int i = 0; i < arrpi.length; i++) {
			if (arrpi[i] != null) {
				textoAtual += "Código: " + arrpi[i].getCodigo() + "\n";
				textoAtual += "Descrição: " + arrpi[i].getDescricao() + "\n";
				textoAtual += "Imposto: R$" + arrpi[i].getTaxaImposto() + "\n";
				textoAtual += "Taxa importação: R$" + arrpi[i].getTaxaImportacao() + "\n";
				textoAtual += "Valor: R$" + arrpi[i].getValor() + "\n\n";
			}
		}
		textoAtual += "============================";
		this.jTextArea2.setText(textoAtual);
	}

	private void menuVendasGeralActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_menuVendasGeralActionPerformed
		this.jTextArea2.setText("");
		String textoAtual = "====Vendas====\n";
		float total = 0;
		for (int i = 0; i < arrv.length; i++) {
			if (arrv[i] != null) {
				textoAtual += "Venda Nº: " + arrv[i].getNumero();
				textoAtual += " Data: " + arrv[i].getData().get(Calendar.DAY_OF_MONTH) + "/"
						+ arrv[i].getData().get(Calendar.MONTH) + "/" + arrv[i].getData().get(Calendar.YEAR);
				textoAtual += " Cliente: " + arrv[i].getCliente().getNome();
				textoAtual += " CPF: " + arrv[i].getCliente().getCpf() + "\n";
				textoAtual += "Itens: \n";
				textoAtual += "\nN | Cod | Descrição | Valor U. | Qtde | Total\n";
				for (int j = 0; j < arrv[i].getItens().length; j++) {
					if (arrv[i].getItens()[j] != null)
						textoAtual += j + " | " + arrv[i].getItens()[j].getCodigoProduto() + " | "
								+ arrv[i].getItens()[j].getDescricao() + " | R$" + arrv[i].getItens()[j].getValor()
								+ " | " + arrv[i].getItens()[j].getQuantidade() + " | R$"
								+ arrv[i].getItens()[j].calcularTotal() + "\n";
				}
				textoAtual += "\nTotal: R$" + arrv[i].calcularTotal();
				total += arrv[i].calcularTotal();
				textoAtual += "\nMétodo de pagamento: " + arrv[i].getTipoPgto().getTipoPagamento();
				textoAtual += "\n\n";
			}
		}
		textoAtual += "\nValor gerado com vendas: R$" + total;
		textoAtual += "==============================";
		this.jTextArea2.setText(textoAtual);
	}// GEN-LAST:event_menuVendasGeralActionPerformed

	private void menuVendasEspecificoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_menuVendasEspecificoActionPerformed
		this.jTextArea2.setText("");
		String vendasCod = JOptionPane.showInputDialog("Insira o código da venda: ");
		String textoAtual = "====Venda código: " + vendasCod + " ====\n";
		for (int i = 0; i < arrv.length; i++) {
			if (arrv[i] != null) {
				if (arrv[i].getNumero().toUpperCase().equals(vendasCod.toUpperCase())) {
					textoAtual += "Venda Nº: " + arrv[i].getNumero();
					textoAtual += " Data: " + arrv[i].getData().get(Calendar.DAY_OF_MONTH) + "/"
							+ arrv[i].getData().get(Calendar.MONTH) + "/" + arrv[i].getData().get(Calendar.YEAR);
					textoAtual += " Cliente: " + arrv[i].getCliente().getNome();
					textoAtual += " CPF: " + arrv[i].getCliente().getCpf() + "\n";
					textoAtual += "Itens: \n";
					textoAtual += "\nN | Cod | Descrição | Valor U. | Qtde | Total\n";
					for (int j = 0; j < arrv[i].getItens().length; j++) {
						if (arrv[i].getItens()[j] != null)
							textoAtual += j + " | " + arrv[i].getItens()[j].getCodigoProduto() + " | "
									+ arrv[i].getItens()[j].getDescricao() + " | R$" + arrv[i].getItens()[j].getValor()
									+ " | " + arrv[i].getItens()[j].getQuantidade() + " | R$"
									+ arrv[i].getItens()[j].calcularTotal() + "\n";
					}
					textoAtual += "\nTotal: R$" + arrv[i].calcularTotal();
					textoAtual += "\nMétodo de pagamento: " + arrv[i].getTipoPgto().getTipoPagamento();
					if (arrv[i].getTipoPgto() instanceof Cartao) {
						textoAtual += "\nNome: " + ((Cartao) arrv[i].getTipoPgto()).getNome();
						textoAtual += "\nNúmero: " + ((Cartao) arrv[i].getTipoPgto()).getNumero();
					} else if (arrv[i].getTipoPgto() instanceof Cheque) {
						textoAtual += "\nEmissor: " + ((Cheque) arrv[i].getTipoPgto()).getNomeEmissor();
						textoAtual += "\nNúmero: " + ((Cheque) arrv[i].getTipoPgto()).getNumeroCheque();
					}
					textoAtual += "\n\n";
					textoAtual += "===========================================";
					this.jTextArea2.setText(textoAtual);
				}
			}
		}
	}

	private void menuVendasSimplesActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_menuVendasSimplesActionPerformed
		int code = -1;
		try {
			code = Integer.parseInt(JOptionPane.showInputDialog(
					"Selecione um tipo de pagamento:\n1-Dinheiro\n2-Cartão\n3-Cheque\n\nInsira somente números:"));
		} catch (Exception ex) {
			this.jTextArea2.setText("Entrada inválida.");
			return;
		}
		String textoAtual = "";
		switch (code) {
		case 1:
			this.jTextArea2.setText("");
			textoAtual = "====Vendas c/ pgto. em dinheiro====\n";
			for (int i = 0; i < arrv.length; i++) {
				if (arrv[i] != null) {
					if (arrv[i].getTipoPgto().getTipoPagamento().equals("Dinheiro")) {
						textoAtual += " Cliente: " + arrv[i].getCliente().getNome();
						textoAtual += " Data: " + arrv[i].getData().get(Calendar.DAY_OF_MONTH) + "/"
								+ arrv[i].getData().get(Calendar.MONTH) + "/" + arrv[i].getData().get(Calendar.YEAR);
						textoAtual += "\nItens: \n";
						textoAtual += "\nN | Cod | Descrição | Valor U. | Qtde | Total\n";
						textoAtual += "\nTotal: R$" + arrv[i].calcularTotal();
						textoAtual += "\nMétodo de pagamento: " + arrv[i].getTipoPgto().getTipoPagamento();
						textoAtual += "\n\n";
						textoAtual += "=================================";
						this.jTextArea2.setText(textoAtual);
					}
				}
			}
			break;

		case 2:
			this.jTextArea2.setText("");
			textoAtual = "====Vendas c/ pgto. no cartão====\n";
			for (int i = 0; i < arrv.length; i++) {
				if (arrv[i] != null) {
					if (arrv[i].getTipoPgto().getTipoPagamento().equals("Cartão")) {
						textoAtual += " Cliente: " + arrv[i].getCliente().getNome();
						textoAtual += " Data: " + arrv[i].getData().get(Calendar.DAY_OF_MONTH) + "/"
								+ arrv[i].getData().get(Calendar.MONTH) + "/" + arrv[i].getData().get(Calendar.YEAR);
						textoAtual += "\nItens: \n";
						textoAtual += "\nN | Cod | Descrição | Valor U. | Qtde | Total\n";
						textoAtual += "\nTotal: R$" + arrv[i].calcularTotal();
						textoAtual += "\nMétodo de pagamento: " + arrv[i].getTipoPgto().getTipoPagamento();
						textoAtual += "\nNome: " + ((Cartao) arrv[i].getTipoPgto()).getNome();
						textoAtual += "\nNúmero: " + ((Cartao) arrv[i].getTipoPgto()).getNumero();
						textoAtual += "\n\n";
						textoAtual += "=================================";
						this.jTextArea2.setText(textoAtual);
					}
				}
			}
			break;

		case 3:
			this.jTextArea2.setText("");
			textoAtual = "====Vendas c/ pgto. no cheque====\n";
			for (int i = 0; i < arrv.length; i++) {
				if (arrv[i] != null) {
					if (arrv[i].getTipoPgto().getTipoPagamento().equals("Cheque")) {
						textoAtual += " Cliente: " + arrv[i].getCliente().getNome();
						textoAtual += " Data: " + arrv[i].getData().get(Calendar.DAY_OF_MONTH) + "/"
								+ arrv[i].getData().get(Calendar.MONTH) + "/" + arrv[i].getData().get(Calendar.YEAR);
						textoAtual += "\nItens: \n";
						textoAtual += "\nN | Cod | Descrição | Valor U. | Qtde | Total\n";
						textoAtual += "\nTotal: R$" + arrv[i].calcularTotal();
						textoAtual += "\nMétodo de pagamento: " + arrv[i].getTipoPgto().getTipoPagamento();
						textoAtual += "\nEmissor: " + ((Cheque) arrv[i].getTipoPgto()).getNomeEmissor();
						textoAtual += "\nNúmero: " + ((Cheque) arrv[i].getTipoPgto()).getNumeroCheque();
						textoAtual += "\n\n";
						textoAtual += "=================================";
						this.jTextArea2.setText(textoAtual);
					}
				}
			}
			break;

		default:
			this.jTextArea2.setText("Método de pagamento inválido.");
			break;
		}
	}// GEN-LAST:event_menuVendasSimplesActionPerformed

	private void menuSalvarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_menuSalvarActionPerformed
		try {
			// Salvar
			FileOutputStream fOutStream = new FileOutputStream("pn.dat");
			ObjectOutputStream objOutput = new ObjectOutputStream(fOutStream);
			objOutput.writeObject(arrpn);
			objOutput.writeObject(arrc);
			objOutput.close();

		} catch (IOException erro) {
			System.out.printf("Erro ao salvar arquivo");
		}
	}// GEN-LAST:event_menuSalvarActionPerformed

	private void menuCarregarActionPerformed(java.awt.event.ActionEvent evt){// GEN-FIRST:event_menuCarregarActionPerformed
		// Carregar
		try {
			FileInputStream fileInputS = new FileInputStream("pn.dat");
			ObjectInputStream objInputS = new ObjectInputStream(fileInputS);
			arrpn = (ProdutoNacional[]) objInputS.readObject();
			arrc = (Cliente[]) objInputS.readObject();
			objInputS.close();
			System.out.println(arrpn[0].getDescricao());
			System.out.println(arrc[0].getNome());
		} catch (Exception erro) {
			System.out.printf("Erro ao carregar arquivo");
		}

	}// GEN-LAST:event_menuCarregarActionPerformed

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		// <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
		// (optional) ">
		/*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the default
		 * look and feel. For details see
		 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				// new FormPrincipal().setVisible(true);
				FormPrincipal form = new FormPrincipal();
				form.setLocationRelativeTo(null);
				form.setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JLabel jLabel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JScrollPane jScrollPane2;
	private javax.swing.JTextArea jTextArea2;
	private javax.swing.JMenu menuAjuda;
	private javax.swing.JMenuBar menuBarra;
	private javax.swing.JMenu menuCadastrar;
	private javax.swing.JMenuItem menuCarregar;
	private javax.swing.JMenuItem menuCliente;
	private javax.swing.JMenuItem menuClienteEspecifico;
	private javax.swing.JMenuItem menuClienteGastos;
	private javax.swing.JMenuItem menuClienteGeral;
	private javax.swing.JMenu menuClientes;
	private javax.swing.JMenuItem menuCompra;
	private javax.swing.JMenu menuDados;
	private javax.swing.JMenuItem menuImportado;
	private javax.swing.JMenu menuMenu;
	private javax.swing.JMenuItem menuNacional;
	private javax.swing.JMenuItem menuProdotuEspecifico;
	private javax.swing.JMenu menuProduto;
	private javax.swing.JMenuItem menuProdutoGeral;
	private javax.swing.JMenu menuProdutos;
	private javax.swing.JMenu menuRelatorios;
	private javax.swing.JMenuItem menuSalvar;
	private javax.swing.JMenuItem menuSobre;
	private javax.swing.JMenu menuVendas;
	private javax.swing.JMenuItem menuVendasDetalhado;
	private javax.swing.JMenuItem menuVendasEspecifico;
	private javax.swing.JMenuItem menuVendasGeral;
	private javax.swing.JMenuItem menuVendasSimples;
	// End of variables declaration//GEN-END:variables
}
