package com.marcbless.ccdreflector.client;

import com.google.gwt.user.client.ui.TextArea;

public class StatusArea extends TextArea {

	StatusArea(String message) {
		super();
		setCharacterWidth(80);
		setVisibleLines(10);
		setText(message);
	}

	public void addStatus(String message) {
		String newStatusText = getText();
		newStatusText += "\r";
		newStatusText += message;
		setText(newStatusText);
	}
}

