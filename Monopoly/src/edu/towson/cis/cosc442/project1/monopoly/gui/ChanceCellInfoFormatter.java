package edu.towson.cis.cosc442.project1.monopoly.gui;

import edu.towson.cis.cosc442.project1.monopoly.IOwnable;

// TODO: Auto-generated Javadoc
/**
 * The Class ChanceCellInfoFormatter.
 */
public class ChanceCellInfoFormatter implements CellInfoFormatter {
    
    /** The Constant CHANCE_CELL_LABEL. */
    public static final String CHANCE_CELL_LABEL = "<html><font color='teal'><b>Chance</b></font></html>";
    
    /* (non-Javadoc)
     * @see edu.towson.cis.cosc442.project1.monopoly.gui.CellInfoFormatter#format(edu.towson.cis.cosc442.project1.monopoly.IOwnable)
     */
    public String format(IOwnable cell) {
        return CHANCE_CELL_LABEL;
    }

	public String checkOwner(IOwnable cell) {
		return null;
	}
}
