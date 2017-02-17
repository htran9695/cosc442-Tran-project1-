package edu.towson.cis.cosc442.project1.monopoly.gui;

import edu.towson.cis.cosc442.project1.monopoly.IOwnable;
import edu.towson.cis.cosc442.project1.monopoly.Player;

// TODO: Auto-generated Javadoc
/**
 * The Class CCCellInfoFormatter.
 */
public class CCCellInfoFormatter implements CellInfoFormatter {
    
    /* (non-Javadoc)
     * @see edu.towson.cis.cosc442.project1.monopoly.gui.CellInfoFormatter#format(edu.towson.cis.cosc442.project1.monopoly.IOwnable)
     */
    public String format(IOwnable cell) {
        return "<html><font color='white'><b>" + cell.getName() + "</b></font></html>";
    }

    public String checkOwner(IOwnable cell) {
		Player owner = cell.getTheOwner();
        String ownerName = "";
        if(owner != null) {
        	ownerName = owner.getName();
        }
		return ownerName;
	}
}
