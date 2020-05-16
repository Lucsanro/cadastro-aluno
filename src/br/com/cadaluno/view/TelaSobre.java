package br.com.cadaluno.view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class TelaSobre extends JFrame {

	private JPanel contentPane;
	private JPanel plSobre;
	private JLabel lblSobre;
	private JButton btnFechar;
	private JScrollBar scrollBar;
	private JTextArea jTextAreaSobre;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaSobre frame = new TelaSobre();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaSobre() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(TelaSobre.class.getResource("/imagens/help.png")));
		setTitle("Ajuda > Sobre");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 384, 266);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 250, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		plSobre = new JPanel();
		plSobre.setBackground(new Color(248, 248, 255));
		plSobre.setBorder(new LineBorder(Color.GRAY));
		plSobre.setBounds(10, 32, 358, 195);
		contentPane.add(plSobre);
		plSobre.setLayout(null);

		btnFechar = new JButton("Fechar");
		btnFechar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnFechar.setForeground(new Color(255, 255, 240));
		btnFechar.setBackground(new Color(30, 144, 255));
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}

		});
		btnFechar.setFocusable(false);
		btnFechar.setBounds(135, 166, 89, 23);
		plSobre.add(btnFechar);

		jTextAreaSobre = new JTextArea();
		jTextAreaSobre.setFont(new Font("Calibri", Font.BOLD, 13));
		jTextAreaSobre.setEditable(false);
		jTextAreaSobre.setLineWrap(true);
		jTextAreaSobre.setText(
				"Sistema feito para a disciplina\r de T\u00E9cnicas de Programa\u00E7\u00E3o.\r\n\r\nNo sistema voc\u00EA pode:\r\n- Salvar, Alterar, Consultar e Excluir dados de um Aluno;\r\n- Salvar, Alterar, Consultar e Excluir Notas de um Aluno;\r\n- \u00C9 poss\u00EDvel gerar Boletim com as informa\u00E7\u00F5es essenciais\r\ndo Aluno.\r\n\r\nDesenvolvido por: Lucca Rocha - 2020");
		jTextAreaSobre.setBounds(10, 11, 338, 155);
		plSobre.add(jTextAreaSobre);
		jTextAreaSobre.setBorder(null);
		jTextAreaSobre.setBackground(new Color(248, 248, 255));

		lblSobre = new JLabel("Sobre este Sistema");
		lblSobre.setFont(new Font("Candara", Font.PLAIN, 18));
		lblSobre.setBounds(10, 11, 144, 22);
		contentPane.add(lblSobre);
	}
}
