package br.com.cadaluno.model;

import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

import javax.swing.JFormattedTextField;

// Está classe posiciona o cursor no inicio do campo nos JFormattedTextField
// quando recebem o foco inicial

public class CaretPosition extends FocusAdapter {

	@Override
	public void focusGained(FocusEvent e) {

		JFormattedTextField jTextF = (JFormattedTextField) e.getSource();
		jTextF.setCaretPosition(0);
	}
}
