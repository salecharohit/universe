package com.rohitsalecha.ui.commons;

import com.vaadin.ui.Component;
import com.vaadin.ui.Tree;
import com.vaadin.ui.VerticalLayout;

@org.springframework.stereotype.Component
public class UniverseMenuFactory implements UIComponentBuilder {

	private class UniverseMenu extends VerticalLayout {
		
		private Tree mainMenu ;
		
		public UniverseMenu init() {
			mainMenu = new Tree();
			return this ;
		}
		
		public UniverseMenu layout() {
			setWidth("100%");
			setHeightUndefined();
			
			mainMenu.addItem("STUDENT");
			mainMenu.addItem("UNIVERSITY");
			
			mainMenu.expandItem("STUDENT");
			mainMenu.expandItem("UNIVERSITY");
			
			mainMenu.addItem("Add Student");
			mainMenu.addItem("Remove Student");
			mainMenu.setChildrenAllowed("Add Student", false);
			mainMenu.setChildrenAllowed("Remove Student", false);
			
			mainMenu.setParent("Add Student","STUDENT");
			mainMenu.setParent("Remove Student","STUDENT");
			
			mainMenu.addItem("Operations");
			mainMenu.setChildrenAllowed("Operations",false);
			mainMenu.setParent("Operations","UNIVERSITY");

			addComponent(mainMenu);
			
			return this ;
		}
	}
	
	public Component createComponent() {
		return new UniverseMenu().init().layout();
	}

}
