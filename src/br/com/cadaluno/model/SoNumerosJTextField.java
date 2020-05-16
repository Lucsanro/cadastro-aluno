package br.com.cadaluno.model;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

//Está classe limita a quantidade de caracteres de um JTextField
//E só permite a inserção de NÚMEROS

public class SoNumerosJTextField extends PlainDocument {
	private int tamanhoMax = 10;

	public SoNumerosJTextField(int tamanhoMax) {
		super();
		this.tamanhoMax = tamanhoMax;
	}

	@Override
	public void insertString(int offset, String str, AttributeSet attr) throws BadLocationException {

		if (str == null)
			return;

		String stringAntiga = getText(0, getLength());
		int tamanhoNovo = stringAntiga.length() + str.length();

		if (tamanhoNovo <= tamanhoMax) {
			super.insertString(offset, str.replaceAll("[^0-9]", ""), attr);
		} else {
			super.insertString(offset, "", attr);
		}
	}
}
