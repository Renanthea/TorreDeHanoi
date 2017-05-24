

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

class Interface extends JFrame implements ActionListener {

	private JButton tiraA;
	private JButton poeA;
	private JButton tiraB;
	private JButton poeB;
	private JButton tiraC;
	private JButton poeC;
	private JTextField texto;
	private JTextField texto2;
	private JLabel etiqueta;
	private JLabel etiqueta2;
	private int cont;

	Pilha a = new Pilha(3);
	Pilha b = new Pilha(3);
	Pilha c = new Pilha(3);

	public Interface() {

		super("Torre De Hanoi");
		tiraA = new JButton("Tira A");
		tiraB = new JButton("Tira B");
		poeB = new JButton("Põe B");
		poeA = new JButton("Põe A");
		tiraC = new JButton("Tira C");
		poeC = new JButton("Põe C");
		etiqueta = new JLabel("Valor Contido:");
		etiqueta2 = new JLabel("Tentativas:");
		texto = new JTextField(10);
		texto2 = new JTextField(10);

		cont = 0;

		tiraA.addActionListener(this);
		tiraB.addActionListener(this);
		poeB.addActionListener(this);
		poeA.addActionListener(this);
		tiraC.addActionListener(this);
		poeC.addActionListener(this);

		Container caixa = getContentPane();

		caixa.setLayout(new FlowLayout());
		caixa.add(etiqueta);
		caixa.add(texto, BorderLayout.CENTER);
		caixa.add(tiraA);
		caixa.add(tiraB);
		caixa.add(tiraC);
		caixa.add(poeA);
		caixa.add(poeB);
		caixa.add(poeC);
		caixa.add(etiqueta2);
		caixa.add(texto2, BorderLayout.CENTER);

		setSize(230, 200);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setLocationRelativeTo(null);

		a.push(3);
		a.push(2);
		a.push(1);

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == tiraA) {

			tiraA();

		} else if (e.getSource() == poeA) {

			poeA();

		} else if (e.getSource() == tiraB) {

			tiraB();

		} else if (e.getSource() == poeB) {

			poeB();

		} else if (e.getSource() == tiraC) {

			tiraC();

		} else if (e.getSource() == poeC) {

			poeC();

		}
	}

	public void poeA() {

		if (b.size() != 3) {
			String x = texto.getText();

			if (a.size() == 0) {
				texto.setText("");
				a.push(Integer.parseInt(x));
				System.out.println("O topo de A agora é: " + a.top());
				System.out.println("O tamanho de A agora é: " + a.size());
			}

			else if (Integer.parseInt(x) < a.top()) {
				texto.setText("");
				a.push(Integer.parseInt(x));
				System.out.println("O topo de A agora é: " + a.top());
				System.out.println("O tamanho de A agora é: " + a.size());
			}

			else {
				System.out.println("Nao é possivel fazer esse movimento");
			}
		} else {
			System.out.println("Parabéns");
		}
	}

	public void tiraA() {

		if (b.size() != 3) {
			texto.setText("" + a.pop());
			System.out.println("O tamanho de A agora é: " + a.size());
			cont++;
			texto2.setText("" + cont);
		} else {
			System.out.println("Parabéns");
		}
	}

	public void poeB() {

		if (b.size() != 3) {
			String x = texto.getText();

			if (b.size() == 0) {
				texto.setText("");
				b.push(Integer.parseInt(x));
				System.out.println("O topo de B agora é: " + b.top());
				System.out.println("O tamanho de B agora é: " + b.size());
			}

			else if (Integer.parseInt(x) < b.top()) {
				texto.setText("");
				b.push(Integer.parseInt(x));
				System.out.println("O topo de B agora é: " + b.top());
				System.out.println("O tamanho de B agora é: " + b.size());
			} else {
				System.out.println("Nao é possivel fazer esse movimento");
			}
		} else {
			System.out.println("Parabéns");
		}
	}

	public void tiraB() {

		if (b.size() != 3) {
			texto.setText("" + b.pop());

			System.out.println("O tamanho de B agora é: " + b.size());
			cont++;
			texto2.setText("" + cont);

		}

		else {
			System.out.println("Parabéns");
		}

	}

	public void poeC() {

		if (b.size() != 3) {
			String x = texto.getText();

			if (c.size() == 0) {
				texto.setText("");
				c.push(Integer.parseInt(x));
				System.out.println("O topo de C agora é: " + c.top());
				System.out.println("O tamanho de C agora é: " + c.size());
			}

			else if (Integer.parseInt(x) < c.top()) {
				texto.setText("");
				c.push(Integer.parseInt(x));
				System.out.println("O topo de C agora é: " + c.top());
				System.out.println("O tamanho de C agora é: " + c.size());
			} else {
				System.out.println("Nao é possivel fazer esse movimento");
			}
		} else {
			System.out.println("Parabéns");
		}
	}

	public void tiraC() {

		if (b.size() != 3) {
			texto.setText("" + c.pop());

			System.out.println("O tamanho de C agora é: " + c.size());
			cont++;
			texto2.setText("" + cont);
		} else {
			System.out.println("Parabéns");
		}
	}

	public static void main(String[] args) {

		Interface inter = new Interface();
	}

}
