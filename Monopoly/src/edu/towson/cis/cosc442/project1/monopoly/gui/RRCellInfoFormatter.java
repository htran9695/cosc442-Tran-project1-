package edu.towson.cis.cosc442.project1.monopoly.gui;

import edu.towson.cis.cosc442.project1.monopoly.IOwnable;
import edu.towson.cis.cosc442.project1.monopoly.Player;
import edu.towson.cis.cosc442.project1.monopoly.RailRoadCell;

// TODO: Auto-generated Javadoc
/**
 * The Class RRCellInfoFormatter.
 */
public class RRCellInfoFormatter implements CellInfoFormatter {
    
    /* (non-Javadoc)
     * @see edu.towson.cis.cosc442.project1.monopoly.gui.CellInfoFormatter#format(edu.towson.cis.cosc442.project1.monopoly.IOwnable)
     */
    public String format(IOwnable cell) {
        RailRoadCell c = (RailRoadCell)cell;
        StringBuffer buf = new StringBuffer();
        String ownerName = checkOwner(cell);
        buf.append("<html><b><font color='lime'>")
                .append(cell.getName())
                .append("</font></b><br>")
                .append("$").append(c.getPrice())
				.append("<br>Owner: ").append(ownerName)
                .append("</html>");
        return buf.toString();
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
