package org.xtext.example.mydsl.ui;

import org.eclipse.xtext.builder.smap.StratumBreakpointAdapterFactory;
import org.eclipse.xtext.resource.XtextResource;

public class MyDslStratumBreakpointAdapterFactory extends StratumBreakpointAdapterFactory {
	
	@Override
	protected String getClassNamePattern(XtextResource state) {
		String name = "demo.Greeter_"+state.getURI().trimFileExtension().lastSegment()+"*";
		return name;
	}
	
	public Object getAdapter(Object adaptableObject, Class adapterType) {
		if (adaptableObject instanceof MyDslEditor) {
			return this;
		}
		return null;
	}

}
