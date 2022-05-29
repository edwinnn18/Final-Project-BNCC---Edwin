// Edwin - BNCC2101120
// Final Project BNCC Java-A

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class Main extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTable table;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 734, 431);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(145, 53, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(145, 99, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(145, 153, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(145, 206, 86, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnNewButton = new JButton("Create");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model=(DefaultTableModel) table.getModel();
				List list =new ArrayList<>();
				table.setAutoCreateColumnsFromModel(true);
				list.add(textField.getText());
				list.add(textField_1.getText());
				list.add(textField_2.getText());
				list.add(textField_3.getText());
				model.addRow(list.toArray());
				
			}
		});
		btnNewButton.setBounds(40, 284, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Update");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model=(DefaultTableModel) table.getModel();
				if (table.getSelectedRowCount()==1) {
					
					String Kode = textField.getText();
					String Nama = textField_1.getText();
					String Jumlah = textField_2.getText();
					String Harga = textField_3.getText();
					
					model.setValueAt(Kode, table.getSelectedRow(), 0);
					model.setValueAt(Nama, table.getSelectedRow(), 1);
					model.setValueAt(Jumlah, table.getSelectedRow(), 2);
					model.setValueAt(Harga, table.getSelectedRow(), 3);
					
			}
		}
		});
		btnNewButton_1.setBounds(170, 284, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("View");
		
		btnNewButton_2.setBounds(40, 348, 89, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Delete");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model=(DefaultTableModel) table.getModel();
				if (table.getSelectedRowCount()==1) {
					model.removeRow(table.getSelectedRow());
				}
			}
		});
		btnNewButton_3.setBounds(170, 348, 89, 23);
		contentPane.add(btnNewButton_3);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(319, 64, 389, 285);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Kode", "Nama", "Harga", "Stok"
			}
		));
		scrollPane.setViewportView(table);
		
		JLabel lblNewLabel = new JLabel("Kode Menu");
		lblNewLabel.setBounds(55, 56, 148, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nama Menu");
		lblNewLabel_1.setBounds(55, 102, 176, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Harga Menu");
		lblNewLabel_2.setBounds(55, 156, 148, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Stok Menu");
		lblNewLabel_3.setBounds(55, 209, 160, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Database");
		lblNewLabel_4.setBounds(319, 39, 176, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Menu Bar");
		lblNewLabel_5.setBounds(10, 11, 101, 14);
		contentPane.add(lblNewLabel_5);
	}
}
