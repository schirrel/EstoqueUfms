package com.br.ufms.schirrel.panels;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.Format;
import java.text.SimpleDateFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.text.DateFormatter;

import com.br.ufms.schirrel.UI.EUButton;
import com.br.ufms.schirrel.classes.EntradaPermanente;

public class MostrarInfoPermanente extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1612517913044249516L;
	DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
	Format shortDate = DateFormat.getDateInstance(DateFormat.SHORT);
	DateFormatter formatter;

	/**
	 * Create the panel.
	 */
	public MostrarInfoPermanente(EntradaPermanente ep) {
		
		formatter = new DateFormatter(format);
		format.setLenient(false);
		formatter.setAllowsInvalid(false);
		formatter.setOverwriteMode(true);
		setBackground(Color.WHITE);
		JPanel panelItem = new JPanel();
		panelItem.setBorder(
				new TitledBorder(null, "Item", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(24, 135, 180)));
		panelItem.setBounds(12, 12, 235, 49);
		add(panelItem);
		panelItem.setBackground(Color.WHITE);
		panelItem.setLayout(null);
		setBackground(Color.WHITE);
		JLabel lblItem = new JLabel(ep.getItem().getItem());
		lblItem.setBounds(12, 12, 211, 25);
		panelItem.add(lblItem);

		JPanel panelQtd = new JPanel();
		panelQtd.setBorder(new TitledBorder(null, "Quantidade", TitledBorder.LEADING, TitledBorder.TOP, null,
				new Color(24, 135, 180)));
		panelQtd.setBounds(495, 109, 137, 49);
		panelQtd.setLayout(null);
		add(panelQtd);
		panelQtd.setBackground(Color.WHITE);
		JLabel lblQtd = new JLabel(ep.getQtd() + "");
		lblQtd.setBounds(12, 12, 125, 25);
		panelQtd.add(lblQtd);

		JPanel panelEntrada = new JPanel();
		panelEntrada.setBorder(new TitledBorder(null, "Entrada", TitledBorder.LEADING, TitledBorder.TOP, null,
				new Color(24, 135, 180)));
		panelEntrada.setBounds(495, 62, 137, 49);
		panelEntrada.setLayout(null);
		add(panelEntrada);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		panelEntrada.setBackground(Color.WHITE);
		JLabel lblEntrada = new JLabel(sdf.format(ep.getDataEntrada()));
		lblEntrada.setBounds(12, 12, 125, 25);
		panelEntrada.add(lblEntrada);

		JPanel panelDep = new JPanel();
		panelDep.setBorder(
				new TitledBorder(null, "Dep", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(24, 135, 180)));
		panelDep.setBounds(562, 160, 72, 49);
		panelDep.setLayout(null);
		add(panelDep);
		panelDep.setBackground(Color.WHITE);
		JLabel lblDep = new JLabel(ep.getDeposito() + "");
		lblDep.setBounds(12, 12, 60, 25);
		panelDep.add(lblDep);

		JPanel panelLab = new JPanel();
		panelLab.setBorder(
				new TitledBorder(null, "Lab", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(24, 135, 180)));
		panelLab.setBounds(562, 210, 72, 49);
		panelLab.setLayout(null);
		add(panelLab);
		panelLab.setBackground(Color.WHITE);
		JLabel lblLab = new JLabel(ep.getLaboratorio() + "");
		lblLab.setBounds(12, 12, 60, 25);
		panelLab.add(lblLab);

		JPanel panelPatrimonio = new JPanel();
		panelPatrimonio.setBorder(new TitledBorder(null, "Patrimonio", TitledBorder.LEADING, TitledBorder.TOP, null,
				new Color(24, 135, 180)));
		panelPatrimonio.setBounds(246, 12, 239, 49);
		add(panelPatrimonio);
		panelPatrimonio.setLayout(null);
		panelPatrimonio.setBackground(Color.WHITE);
		JLabel lblPatrimonio = new JLabel(ep.getPatrimonio());
		lblPatrimonio.setBounds(12, 12, 227, 25);
		panelPatrimonio.add(lblPatrimonio);

		JPanel panelDescricao = new JPanel();
		panelDescricao.setBorder(new TitledBorder(null, "Descri\u00E7\u00E3o", TitledBorder.LEADING, TitledBorder.TOP,
				null, new Color(24, 135, 180)));
		panelDescricao.setBounds(12, 62, 481, 96);
		panelDescricao.setLayout(null);
		add(panelDescricao);
		panelDescricao.setBackground(Color.WHITE);
		JLabel lblDescricao = new JLabel(ep.getDescricao());
		lblDescricao.setBounds(12, 12, 457, 72);
		panelDescricao.add(lblDescricao);

		JPanel panelObs = new JPanel();
		panelObs.setBorder(
				new TitledBorder(null, "Obs", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(24, 135, 180)));
		panelObs.setBounds(12, 157, 550, 152);
		panelObs.setLayout(null);
		add(panelObs);
		panelObs.setBackground(Color.WHITE);
		JLabel lblObs = new JLabel(ep.getObs());
		lblObs.setBounds(12, 12, 526, 128);
		panelObs.add(lblObs);

		JPanel panelEstado = new JPanel();
		panelEstado.setBorder(new TitledBorder(new LineBorder(new Color(184, 207, 229)), "Estado", TitledBorder.LEADING,
				TitledBorder.TOP, null, new Color(24, 135, 180)));
		panelEstado.setBounds(485, 12, 146, 49);
		panelEstado.setLayout(null);
		add(panelEstado);
		panelEstado.setBackground(Color.WHITE);
		JLabel lblEstado = new JLabel(ep.getEstadoString());
		lblEstado.setBounds(12, 12, 134, 25);
		panelEstado.add(lblEstado);

		JButton btOk = new EUButton("OK");
		btOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btOk.setBounds(564, 262, 68, 42);
		btOk.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);

			}
		});
		add(btOk);

		setBounds(0, 60, 650, 350);
		setLayout(null);
		
		setBackground(Color.WHITE);
		getContentPane().setBackground(Color.WHITE);
		setVisible(true);
	}
}
