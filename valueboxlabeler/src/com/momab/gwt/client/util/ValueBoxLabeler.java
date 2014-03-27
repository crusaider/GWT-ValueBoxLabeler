package com.momab.gwt.client.util;

import com.google.gwt.event.dom.client.BlurEvent;
import com.google.gwt.event.dom.client.BlurHandler;
import com.google.gwt.event.dom.client.FocusEvent;
import com.google.gwt.event.dom.client.FocusHandler;
import com.google.gwt.user.client.ui.ValueBoxBase;

/**
 * <p>
 * Adds the title of a ValueBox based widget as a background in the text box as
 * long as the user has not entered any value in the widget.
 * </p>
 * <p>
 * When the user enter (focuses) the widget, the background text is removed,
 * when the user leaves (blurs) the widget the background is added again if the
 * text box contains no value.
 * </p>
 * <p>
 * The text displayed in the box is defined using the widgets title attribute.
 * The appearance of the background text is controlled trough the CSS class
 * "Labeled-Text-Box".
 * </p>
 * <p>
 * Use the class by instantiating a object of it suppling the widget to be
 * labeled to the constructor.
 * </p>
 * <p>
 * Solution inspiration from <a href=
 * "http://viralpatel.net/blogs/default-text-label-textbox-javascript-jquery/"
 * >this blog post</a> by <a
 * href="https://plus.google.com/+ViralPatel1/about">Viral Patel</a>.
 * </p>
 * @author Jonas Andreasson
 * 
 */
public class ValueBoxLabeler {

	private final static String STYLE_NAME = "Labeled-Text-Box";

	public ValueBoxLabeler(final ValueBoxBase<?> target) {
		target.setText(target.getTitle());
		target.addStyleName(STYLE_NAME);

		target.addFocusHandler(new FocusHandler() {

			@Override
			public void onFocus(FocusEvent event) {
				if (target.getText().contentEquals(target.getTitle())) {
					target.setText("");
					target.removeStyleName(STYLE_NAME);
				}
			}
		});

		target.addBlurHandler(new BlurHandler() {

			@Override
			public void onBlur(BlurEvent event) {
				if (target.getText().isEmpty()) {
					target.setText(target.getTitle());
					target.addStyleName(STYLE_NAME);
				}
			}
		});
	}

}
