package inf.unibz.it.obda.gui.swing.constraints.treemodel;

import inf.unibz.it.obda.api.controller.APIController;
import inf.unibz.it.obda.gui.swing.preferences.OBDAPreferences;
import inf.unibz.it.obda.gui.swing.preferences.OBDAPreferences.MappingManagerPreferences;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.GridBagLayout;

import javax.swing.Icon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTree;
import javax.swing.SwingConstants;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;

public class ConstraintsTreeCellRenderer extends
DefaultTreeCellRenderer {

	/**
	 * 
	 */
	private static final long serialVersionUID = -994467893316869991L;
	
	/**
	 * the label showing the icon
	 */
	private JLabel						label	 = null;
	/**
	 * The text pane showing the assertion
	 */
	private JLabel					area							= null;
	/**
	 * the panel containing label and text pane
	 */
	private JPanel						panel							= null;
	/**
	 * The API controller
	 */
	private APIController	apic;
	
	/**
	 * the icon for functional dependencies
	 */
	
	private MappingManagerPreferences	pref	=null;
	
	/**
	 * Creates a new instance of the DependencyAssertionTreeCellRenderer
	 * @param apic
	 */
	public ConstraintsTreeCellRenderer(APIController apic){
		
		this.apic = apic;
		pref = OBDAPreferences.getOBDAPreferences().getMappingsPreference();
	}
	
	public Component getTreeCellRendererComponent(JTree tree, Object value, boolean sel, boolean expanded, boolean leaf, int row,
			boolean hasFocus) {

		DefaultMutableTreeNode node = (DefaultMutableTreeNode) value;
		return createComponent(node, tree, sel);
	}
	
	/**
	 * returns the default icon for tree nodes
	 */
	public Icon getIcon() {
		return super.getIcon();
	}
	
	/**
	 * creates the panel, which will be added to the tree
	 * 
	 * @param node the node
	 * @param t the tree
	 * @param selected is the node selected
	 * @return a panel, which can be added to the tree
	 */
	private JPanel createComponent(DefaultMutableTreeNode node, JTree t, boolean selected) {
		
		try {
			java.awt.GridBagConstraints grid;
			GridBagLayout l = new GridBagLayout();
			panel = new JPanel();
			panel.setLayout(l);
			label = new JLabel();
			area = new JLabel();
			panel.setBackground(Color.white);
			label.setBackground(Color.white);
			label.setHorizontalAlignment(SwingConstants.LEFT);
			JLabel ph = new JLabel();
			ph.setVisible(false);
			ph.setHorizontalAlignment(SwingConstants.LEADING);		
			
			String font = pref.getFontFamily(MappingManagerPreferences.DEPENDENCIES_FONTFAMILY);
			int size = pref.getFontSize(MappingManagerPreferences.DEPENDENCIES_FONTSIZE);
			boolean bold = pref.isBold(MappingManagerPreferences.DEPENDENCIES_ISBOLD);
			int style = 0;
			if(bold){
				style = 1;
			}
			
			
			area.setFont(new Font(font, style, size));
			
			Object assertion = node.getUserObject();
			if(assertion != null){
				area.setText(assertion.toString());
			}else{
				area.setText("");
			}
		
			label.setIcon(super.getIcon());
			
			Color bg = new Color(220, 230, 240);

			if (selected) {

				panel.setBackground(bg);
				area.setBackground(bg);
				label.setBackground(bg);
			}

			grid = new java.awt.GridBagConstraints();
			grid.gridx = 0;
			grid.gridy = 0;
			grid.gridwidth = 1;
			grid.weightx = 0;
			grid.weighty = 0;
			grid.fill = java.awt.GridBagConstraints.VERTICAL;
			panel.add(label, grid);

			grid = new java.awt.GridBagConstraints();
			grid.gridx = 1;
			grid.gridy = 0;
			grid.gridwidth = java.awt.GridBagConstraints.REMAINDER;
			grid.fill = java.awt.GridBagConstraints.BOTH;
			grid.weightx = 1.0;
			grid.weighty = 1.0;
			panel.add(area, grid);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return panel;
	}
}