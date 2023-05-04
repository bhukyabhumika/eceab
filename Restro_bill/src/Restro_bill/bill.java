package Restro_bill;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class bill {

	private JFrame frame;
	private JTextField q;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bill window = new bill();
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
	public bill() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.PINK);
		frame.setBounds(100, 100, 721, 453);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Restro Bill");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblNewLabel.setBounds(258, 26, 207, 46);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Menu");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblNewLabel_1.setBounds(93, 109, 93, 46);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Quantity");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblNewLabel_2.setBounds(93, 193, 93, 31);
		frame.getContentPane().add(lblNewLabel_2);
		
		JComboBox m1 = new JComboBox();
		m1.setFont(new Font("Tahoma", Font.PLAIN, 21));
		m1.setModel(new DefaultComboBoxModel(new String[] {"Select..", "Biryani-150/-", "mandi-240/-(2 piece)", "fried rice-70/-", "manchuria-80/-", "kaju biryani-120/-", "panner biryani-130/-", "red bucket biryani-530/-(3 members)", "juice mandi-300/-(2 piece)", " "}));
		m1.setBounds(258, 125, 135, 22);
		frame.getContentPane().add(m1);
		
		JButton btnNewButton = new JButton("Order");                                                                   
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String item=(String) m1.getSelectedItem();
				String qnty=q.getText();
				int q=Integer.parseInt(qnty);
				int bill=0;
				if(item.equals("Biryani-150/-"))
				{
					bill = q*150;
				}
				else if(item.equals("mandi-240/-(2 piece)"))
				
				{
					bill=q*240;
					JOptionPane.showMessageDialog(btnNewButton, "hello \n Selected item: "+item+" \n Quantity: "+q+" \n your bill: "+bill);
				}
				
                 else if(item.equals("fried rice-70/-"))
				
				{
					bill=q*70;
					JOptionPane.showMessageDialog(btnNewButton, "hello \n Selected item: "+item+" \n Quantity: "+q+" \n your bill: "+bill);
				}
                else if(item.equals("manchuria-80/-"))
				
				{
					bill=q*80;
					JOptionPane.showMessageDialog(btnNewButton, "hello \n Selected item: "+item+" \n Quantity: "+q+" \n your bill: "+bill);
				}
                else if(item.equals("kaju biryani-120/-"))
				
				{
					bill=q*120;
					JOptionPane.showMessageDialog(btnNewButton, "hello \n Selected item: "+item+" \n Quantity: "+q+" \n your bill: "+bill);
				}
                 else if(item.equals("panner biryani-130/-"))
				
				{
					bill=q*130;
					JOptionPane.showMessageDialog(btnNewButton, "hello \n Selected item: "+item+" \n Quantity: "+q+" \n your bill: "+bill);
				}
				else if(item.equals("red bucket biryani-530/-"))
				
				{
					bill=q*530;
					JOptionPane.showMessageDialog(btnNewButton, "hello \n Selected item: "+item+" \n Quantity: "+q+" \n your bill: "+bill);
			    }
				else if(item.equals("juice mandi-300/-"))
				
				{
					bill=q*300;
					JOptionPane.showMessageDialog(btnNewButton, "hello \n Selected item: "+item+" \n Quantity: "+q+" \n your bill: "+bill);
				}
				
				}
					
				
			
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.setBounds(210, 293, 112, 23);
		frame.getContentPane().add(btnNewButton);
		
		q = new JTextField();
		q.setBounds(269, 202, 124, 20);
		frame.getContentPane().add(q);
		q.setColumns(10);
	}
}
