
package edu.towson.cis.cosc442.project1.monopoly;

public class GameBoardFreeParking extends GameBoard {
	public GameBoardFreeParking() {
		super();
		Cell jail = new JailCell();
		Cell freeParking = new FreeParkingCell();
		GoToJailCell goToJail = new GoToJailCell();
		addCell(jail);
		addCell(freeParking);
		addCell(goToJail);

	}
}
