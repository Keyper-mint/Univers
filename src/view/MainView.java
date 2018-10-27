package view;


import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import java.awt.AWTEvent;
import java.awt.BorderLayout;
import java.awt.Color;

import java.awt.EventQueue;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.event.AWTEventListener;

import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.MalformedURLException;
import java.net.URL; 
import java.util.Enumeration;
import java.util.List;
import java.util.Locale;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.JTree;
import javax.swing.KeyStroke;
import javax.swing.ListSelectionModel;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.ToolTipManager;
import javax.swing.TransferHandler;
import javax.swing.UIManager;
import javax.swing.WindowConstants;
import javax.swing.border.EtchedBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreePath;
import javax.swing.tree.TreeSelectionModel;

import view.component.ImageButton;
import constant.Constant;



public class MainView extends JFrame implements ActionListener {

	 private  final int WIDTH = 1400;
	    private final int HEIGHT = 800;
	    protected  JFrame mainFrame = new JFrame();
	    protected static  String titleComplement = " V.1.0";
	    private JPanel rightPanel = new JPanel();
	    private JPanel leftPanel = new JPanel();
	    private JPanel mainPanel = new JPanel();
	    private ImageButton profilButton = new ImageButton("avatar");
	    private ImageButton sacButton = new ImageButton("inventaire");
	    private ImageButton questButton = new ImageButton("quetes");
	    private ImageButton optionButton = new ImageButton("qettings");
	    
	 public static void main(String[] args){

		    MainView mainView = new MainView();
		    try {
	            mainView.componentInitialize();
	        } catch (Exception e) {
	            // Nothing to do
	        }
	        mainView.mainFrame.setVisible(true);

		  }       
	
	  protected void initComponents() {
	
	 int width = WIDTH;
     int height = HEIGHT;
     this.mainFrame.setTitle(Constant.APPLICATION_NAME + MainView.titleComplement);
     this.mainFrame.setSize(new Dimension(width, height));
     this.mainFrame.setLocationRelativeTo(null);
      this.mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      this.mainFrame.setResizable(true);
	       
	  }

	  public void componentInitialize() throws Exception {

	        EventQueue.invokeAndWait(new Runnable() {
	            @Override
	            public void run() {
	            	 setListeners();
	                 initComponents();
	                 setLayouts();
	               
	            }
	        });
	       
	    }

	  @SuppressWarnings("serial")
	    protected void setListeners() {
	  }
	  private void setLayouts() {
		  this.rightPanel.setLayout(new GridBagLayout());
	        this.leftPanel.setLayout(new GridBagLayout());
	        this.mainPanel.setLayout(new GridBagLayout());
	       
	        // Main panel
	        GridBagConstraints constraints = new GridBagConstraints();
	        constraints.fill = GridBagConstraints.BOTH;
	        constraints.weightx = 0.15;
	        constraints.weighty = 1;
	        constraints.gridx = 0;
	        constraints.gridy = 0;
	        constraints.insets = new Insets(20, 20, 20, 10);
	        this.mainPanel.add(this.leftPanel, constraints);
	        constraints.weightx = 0.85;
	        constraints.gridx = 1;
	        constraints.insets = new Insets(10, 0, 10, 10);
	        this.mainPanel.add(this.rightPanel, constraints);

	        // Left panel
	        constraints = new GridBagConstraints();

	        constraints.anchor = GridBagConstraints.NORTHWEST;
	        constraints.insets = new Insets(10, 10, 0, 10);
	        constraints.fill = GridBagConstraints.NONE;
	        constraints.weightx = 0;
	        constraints.weighty = 0;


	        constraints.fill = GridBagConstraints.BOTH;

	        constraints.weightx = 1;
	        constraints.weighty = 1;
	        constraints.gridy = 2;
	        constraints.gridheight = 3;
	        constraints.insets = new Insets(10, 10, 10, 10);

	     

	        // Right panel
	        constraints = new GridBagConstraints();
	        constraints.fill = GridBagConstraints.BOTH;
	        constraints.weightx = 1;
	        constraints.weighty = 0;
	        constraints.gridx = 0;
	        constraints.gridy = 0;
	        constraints.gridwidth = 2;
	        constraints.gridheight = 1;
	        constraints.insets = new Insets(10, 10, 0, 10);
	       
	  }
	  @Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			
		}
	  

	  
}
