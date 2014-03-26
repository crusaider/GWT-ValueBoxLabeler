package com.sample.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;

public class SampleApp implements EntryPoint {

	public void onModuleLoad() {
		TextBox textbox = new TextBox();
		textbox.setTitle("Label shown in textbox");
		
		new ValueBoxLabeler(textbox);
		
		RootPanel.get("textbox").add(textbox);
	}
}
