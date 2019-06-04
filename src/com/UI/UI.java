package com.UI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;

import org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper;

import com.Util.Util;

public class UI extends JFrame{
	public static JLabel HitokotoText = new JLabel();
	public static JLabel Creator = new JLabel();
	public UI() {
		JPanel panel = new JPanel();
		Creator.setFont(new Font("ºÚÌå",Font.PLAIN,20));
		Creator.setForeground(Color.white);
		HitokotoText.setFont(new Font("ºÚÌå",Font.PLAIN,20));
		HitokotoText.setForeground(Color.white);
		this.setSize(800, 150);
		this.setVisible(true);
		this.add(HitokotoText,BorderLayout.CENTER);
		this.add(Creator,BorderLayout.EAST);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
