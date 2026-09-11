import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class TelaPrincipal {

	private JFrame frame;
	private JTextField txtCodigo;
	private JTextField txtDescricao;
	private JTextField txtQuantidade;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipal window = new TelaPrincipal();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaPrincipal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 491, 557);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Código:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(123, 41, 112, 31);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblDescrio = new JLabel("Descrição:");
		lblDescrio.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblDescrio.setBounds(123, 92, 112, 31);
		frame.getContentPane().add(lblDescrio);
		
		JLabel lblQuantidade = new JLabel("Quantidade:");
		lblQuantidade.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblQuantidade.setBounds(123, 133, 112, 31);
		frame.getContentPane().add(lblQuantidade);
		
		txtCodigo = new JTextField();
		txtCodigo.setBounds(245, 48, 106, 26);
		frame.getContentPane().add(txtCodigo);
		txtCodigo.setColumns(10);
		
		txtDescricao = new JTextField();
		txtDescricao.setColumns(10);
		txtDescricao.setBounds(245, 92, 106, 26);
		frame.getContentPane().add(txtDescricao);
		
		txtQuantidade = new JTextField();
		txtQuantidade.setColumns(10);
		txtQuantidade.setBounds(245, 140, 106, 26);
		frame.getContentPane().add(txtQuantidade);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnSalvar.setBounds(99, 196, 85, 31);
		frame.getContentPane().add(btnSalvar);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnLimpar.setBounds(206, 196, 85, 31);
		frame.getContentPane().add(btnLimpar);
		
		JButton btnAtualizar = new JButton("Atualizar");
		btnAtualizar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnAtualizar.setBounds(312, 196, 97, 31);
		frame.getContentPane().add(btnAtualizar);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"New columni", "New column", "New column"
			}
		));
		table.setBounds(37, 248, 403, 240);
		frame.getContentPane().add(table);
	}
}
