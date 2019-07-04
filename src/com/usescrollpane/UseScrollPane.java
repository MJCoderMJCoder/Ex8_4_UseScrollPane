package com.usescrollpane;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class UseScrollPane {

	public static void main(String[] args) {
		//创建窗体
		JFrame frm = new JFrame();
		//设置窗体标题
		frm.setTitle("使用JScrollPane");
		//设置窗体关闭方式
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//创建结果输出框，2行32列，不可编辑
		JTextArea output = new JTextArea();
		output.setRows(2);
		output.setColumns(32);
		
		//创建滚动面板并设置显示策略等
		JScrollPane outputScrollPane = new JScrollPane();
		//垂直滚动条需要时显示
		outputScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		frm.getContentPane().add(outputScrollPane); //获得内容面板，并向内容面板添加组件
		outputScrollPane.setViewportView(output); //设置在滚动面板中显示的组件对象
		output.setText("这是JScrollPane使用示例！\n\r请输入或删除多行字符观察显示区的变化！");
		
		//设置结构（JFrame）的位置与大小并显示
		frm.setBounds(450, 230, 400, 80);
		frm.setVisible(true);
		
	}

}
