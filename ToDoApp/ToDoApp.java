import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ToDoApp extends JFrame {
    
    private DefaultListModel<String> toDoListModel = new DefaultListModel<String>();
    private JList<String> toDoList = new JList<String>(toDoListModel);
    private JTextField toDoTextField = new JTextField(10);
    private JButton addButton = new JButton("Add");
    private JButton removeButton = new JButton("Remove");
    
    public ToDoApp() {
        setTitle("To-Do App");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel topPanel = new JPanel(new FlowLayout());
        topPanel.add(toDoTextField);
        topPanel.add(addButton);
        topPanel.add(removeButton);
        
        add(topPanel, BorderLayout.NORTH);
        add(new JScrollPane(toDoList), BorderLayout.CENTER);
        
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String toDoItem = toDoTextField.getText();
                if (toDoItem != null && !toDoItem.isEmpty()) {
                    toDoListModel.addElement("<html>&bull; " + toDoItem + "</html>");
                    toDoTextField.setText("");
                }
            }
        });
        
        removeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int[] selectedIndices = toDoList.getSelectedIndices();
                for (int i = selectedIndices.length - 1; i >= 0; i--) {
                    toDoListModel.removeElementAt(selectedIndices[i]);
                }
            }
        });
        
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new ToDoApp();
    }

}
