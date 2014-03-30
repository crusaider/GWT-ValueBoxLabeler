#GWT-ValueBoxLabeler

A utillity class that adds whatever text is defined in the title attribute as a background in the text box as long as the user has not entered any value in the widget. The background text can be added to any of the ValueBox based GWT widgets. 

![Sample text box](https://raw.githubusercontent.com/crusaider/GWT-ValueBoxLabeler/master/sample-text-box.PNG "Sample text box")

When the user enters (focuses) the widget, the background text is removed, when the user leaves (blurs) the widget the background is added again if the text box contains no value.

The text displayed text in the box is defined using the widgets title attribute.
The appearance of the background text is controlled trough the CSS class
`Labeled-Text-Box`.

Use the class by instantiating a object of it suppling the widget to be
labeled to the constructor.

Solution inspiration from [this blog post] (http://viralpatel.net/blogs/default-text-label-textbox-javascript-jquery/)
by [Viral Patel](https://plus.google.com/+ViralPatel1/about)

##Usage

Either simply copy the file ValueBoxLabeler.java file into your project,
possibly adjusting the package, or put the the `valueboxlabeler-x.x.x.jar`
on your class path.

If you choose to use the jar you will also have to have a `inherits` line
in your module(s):


`<inherits name='com.momab.gwt.util'/>`

To add a label to a textbox widget, set the title attribute of the widget,
instanciate a instance of the ValueBoxLabel class suppying the text box
widget to the constructor. 
```
TextBox textbox = new TextBox();
textbox.setTitle("Label shown in textbox");

new ValueBoxLabeler(textbox);
```




