package fr.mds.tp2.entity;

import java.util.Arrays;
import java.util.List;

public class ShapeMaker {
	public static final String CIRCLE = null;
	private static List<Facade> facades = Arrays.asList(new Circle(), new Rectangle(), new Square());
	
	

	public void drawCircle() {
		for(Facade facade: facades) {
			if(facade instanceof Circle) {
				facade.draw();
			}
		}
	}

	public void drawRectangle() {
		for(Facade facade: facades) {
			if(facade instanceof Rectangle) {
				facade.draw();
			}
		}
	}

	public void drawSquare() {
		for(Facade facade: facades) {
			if(facade instanceof Square) {
				facade.draw();
			}
		}
	}
}
