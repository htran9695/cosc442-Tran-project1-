package edu.towson.cis.cosc442.project1.monopoly.gui;

import edu.towson.cis.cosc442.project1.monopoly.IOwnable;
import edu.towson.cis.cosc442.project1.monopoly.Player;

// TODO: Auto-generated Javadoc
/**
 * The Interface CellInfoFormatter.
 */
public interface CellInfoFormatter {
    
    /**
     * Format.
     *
     * @param cell the cell
     * @return the string
     */
    public String format(IOwnable cell);

	String checkOwner(IOwnable cell);
}
