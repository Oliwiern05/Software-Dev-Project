import javax.swing.*;

public class MainFrame extends JFrame {
    public MainFrame() {
        setTitle("Inventory & Customer Management System");
        setSize(800, 600); //set the width and height
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centers the window

        // Create Tabs
        JTabbedPane tabbedPane = new JTabbedPane();
        //this is the tabs themselves
        tabbedPane.addTab("Customers", new CustomerPanel());
        tabbedPane.addTab("Products", new ProductPanel());
        tabbedPane.addTab("Invoices", new InvoicePanel());

        add(tabbedPane);
        setVisible(true);
    }

    public static void main(String[] args) {
        // Run the GUI on the Event Dispatch Thread
        SwingUtilities.invokeLater(() -> new MainFrame());
    }
}
