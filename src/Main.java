import java.awt.Container;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class Main extends JFrame {
	Toolkit tk = Toolkit.getDefaultToolkit();
	Dimension d = tk.getScreenSize();
	Container vsebina = getContentPane();
	JPanel tabla = new JPanel();
	JButton jButton1;
	JLabel jLabel1;
	JScrollPane jScrollPane1;
	JScrollPane jScrollPane2;
	JTextArea jTextArea1;
	JTextArea jTextArea2;
	JTextArea jTextArea3;
	ImageIcon logo = new ImageIcon(this.getClass().getResource("hh.jpg"),
			"David hasselhoff");
	JLabel labela = new JLabel(logo);

	int sirina = d.width;
	int visina = d.height;

	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("GAY - O - MATIC");
		setSize(450, 400);
		setResizable(false);
		setLocation((sirina - 450) / 2, (visina - 370) / 2);

		vsebina.add(tabla);
		tabla.setLayout(null);

		jScrollPane1 = new javax.swing.JScrollPane();
		jTextArea1 = new javax.swing.JTextArea();
		jScrollPane2 = new javax.swing.JScrollPane();
		jTextArea2 = new javax.swing.JTextArea();
		jButton1 = new javax.swing.JButton();
		jLabel1 = new javax.swing.JLabel();
		jTextArea3 = new javax.swing.JTextArea();

		jTextArea1.setLineWrap(true);
		jScrollPane1.setViewportView(jTextArea1);

		tabla.add(jScrollPane1);
		jScrollPane1.setBounds(10, 10, 270, 140);

		jTextArea2.setLineWrap(true);
		jScrollPane2.setViewportView(jTextArea2);

		tabla.add(jScrollPane2);
		jScrollPane2.setBounds(10, 160, 270, 170);

		jButton1.setText("Touch ME");
		jButton1.setActionCommand("OK");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		tabla.add(jButton1);
		jButton1.setBounds(310, 80, 100, 30);

		jLabel1.setText("GAY-O-MATIC");
		tabla.add(jLabel1);
		jLabel1.setBounds(320, 20, 100, 50);

		jTextArea3.setEditable(false);
		jTextArea3.setLineWrap(true);
		jTextArea3
				.setText("V zgornje okno vpisemo nekej (ninzda je gay) in spodaj dobimo tekst za irc (GaY).");
		jTextArea3.setWrapStyleWord(true);
		tabla.add(jTextArea3);
		jTextArea3.setBounds(310, 160, 100, 90);

		labela.setBounds(320, 260, 76, 80);
		labela.setToolTipText("David Hasselhoff");
		tabla.add(labela);

		setVisible(true);
	}

	public static void main(String[] args) {
		JFrame okvir = new Main();
		okvir.setVisible(true);
	}

	public void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed
		if ("OK".equals(evt.getActionCommand())) {
			jTextArea2.setText("");
			String alfa = jTextArea1.getText();
			Random rand = new Random();
			for (int i = 0; i < alfa.length(); ++i) {
				if (alfa.charAt(i) != '\n') {
					int a = rand.nextInt(2);
					if (a == 1) {
						jTextArea2.append("\037");
						;
					}

					a = rand.nextInt(2);
					if (a == 1) {
						jTextArea2.append("\002");
						;
					}

					a = rand.nextInt(16);
					int b = rand.nextInt(16);

					jTextArea2.append("\003");
					if (a > 9) {
						jTextArea2.append(String.valueOf(a));
					} else {
						jTextArea2.append("0" + String.valueOf(a));
					}
					jTextArea2.append(",");
					if (b > 9) {
						jTextArea2.append(String.valueOf(b));
					} else {
						jTextArea2.append("0" + String.valueOf(b));
					}

					a = rand.nextInt(2);

					if (a == 1) {
						jTextArea2.append(String.valueOf(Character
								.toUpperCase(alfa.charAt(i))));
					} else {
						jTextArea2.append(String.valueOf(Character
								.toLowerCase(alfa.charAt(i))));
					}
				} else {
					jTextArea2.append("\n");
				}
			}
		}
	}

}
