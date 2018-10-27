package view.component;

import java.awt.Dimension;

import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import constant.Constant;

public class ImageButton extends JButton {
    private static final long serialVersionUID = 1L;

    private int size;

    private String iconName = null;

    public ImageButton(String iconName) {
        this(iconName, 32);
    }

    public ImageButton(String iconName, int size) {
        this.iconName = iconName;
        this.size = size;
    }

    @Override
    public void setAction(Action action) {
        super.setAction(action);

        Dimension dim = new Dimension(this.size, this.size);

        this.setMaximumSize(dim);
        this.setMinimumSize(dim);
        this.setPreferredSize(dim);
        String png = ".png";
        this.setIcon(new ImageIcon(Constant.RESOURCES_DIR + this.iconName + png));
        this.setDisabledIcon(new ImageIcon(Constant.RESOURCES_DIR  + this.iconName + "_grey" + png));
        this.setRolloverIcon(new ImageIcon(Constant.RESOURCES_DIR +  this.iconName + "_blue" + png));
        this.setOpaque(false);
        this.setBorderPainted(false);
        this.setFocusPainted(false);
        this.setContentAreaFilled(false);
        this.setText("");
        this.setToolTipText((String)action.getValue(Action.NAME));
    }
}
