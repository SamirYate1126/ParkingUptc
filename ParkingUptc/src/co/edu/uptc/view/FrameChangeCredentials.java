package co.edu.uptc.view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

public class FrameChangeCredentials extends JFrame {

    public FrameChangeCredentials() {
        setTitle("Parking UPTC - Cambiar Credenciales");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel mainPanelObject = createMainPanel();
        add(mainPanelObject);

        setVisible(true);
    }

    private JPanel createMainPanel() {
        JPanel mainPanelObject = new JPanel(new BorderLayout());
        mainPanelObject.setBackground(Color.WHITE);

        JPanel topPanelObject = createTopPanel();
        JPanel centerPanelObject = createCenterPanel();

        mainPanelObject.add(topPanelObject, BorderLayout.NORTH);
        mainPanelObject.add(centerPanelObject, BorderLayout.CENTER);

        return mainPanelObject;
    }

    private JPanel createTopPanel() {
        JPanel topPanelObject = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 10));
        topPanelObject.setBackground(Color.WHITE);

        JButton backButtonObject = new JButton("Volver al menú");
        topPanelObject.add(backButtonObject);

        return topPanelObject;
    }

    private JPanel createCenterPanel() {
        JPanel centerPanelObject = new JPanel();
        centerPanelObject.setLayout(new javax.swing.BoxLayout(centerPanelObject, javax.swing.BoxLayout.Y_AXIS));
        centerPanelObject.setBackground(Color.WHITE);

        JLabel titleLabelObject = new JLabel("Digite los siguientes datos para cambiar la credencial");
        titleLabelObject.setAlignmentX(Component.CENTER_ALIGNMENT);
        titleLabelObject.setFont(new Font("Arial", Font.BOLD, 16));
        centerPanelObject.add(titleLabelObject);
        centerPanelObject.add(javax.swing.Box.createVerticalStrut(20));

        JPanel formPanelObject = createFormPanel();
        centerPanelObject.add(formPanelObject);
        centerPanelObject.add(javax.swing.Box.createVerticalStrut(20));

        JLabel warningLabelObject = new JLabel("La contraseña debe ser sin caracteres especiales y de 8 dígitos");
        warningLabelObject.setFont(new Font("Arial", Font.PLAIN, 12));
        warningLabelObject.setAlignmentX(Component.CENTER_ALIGNMENT);
        centerPanelObject.add(warningLabelObject);
        centerPanelObject.add(javax.swing.Box.createVerticalStrut(10));

        JButton saveButtonObject = new JButton("Guardar Cambios");
        saveButtonObject.setAlignmentX(Component.CENTER_ALIGNMENT);
        centerPanelObject.add(saveButtonObject);

        return centerPanelObject;
    }

    private JPanel createFormPanel() {
        JPanel formPanelObject = new JPanel(new GridLayout(3, 2, 10, 15));
        formPanelObject.setBackground(Color.WHITE);
        formPanelObject.setMaximumSize(new Dimension(450, 150));

        JLabel docLabelObject = new JLabel("Documento de Identidad:");
        JTextField docFieldObject = new JTextField();

        JLabel passLabelObject = new JLabel("Nueva Contraseña:");
        JPasswordField passFieldObject = new JPasswordField();

        JLabel repeatLabelObject = new JLabel("Repetir Nueva Contraseña:");
        JPasswordField repeatPassFieldObject = new JPasswordField();

        formPanelObject.add(docLabelObject);
        formPanelObject.add(docFieldObject);
        formPanelObject.add(passLabelObject);
        formPanelObject.add(passFieldObject);
        formPanelObject.add(repeatLabelObject);
        formPanelObject.add(repeatPassFieldObject);

        return formPanelObject;
    }
} 
// package co.edu.uptc.view;

// import javax.swing.JButton;
// import javax.swing.JFrame;
// import javax.swing.JLabel;
// import javax.swing.JPanel;
// import javax.swing.JTextField;
// import javax.swing.JPasswordField;
// import javax.swing.Box;
// import javax.swing.BoxLayout;
// import javax.swing.BorderFactory;
// import java.awt.Color;
// import java.awt.Component;
// import java.awt.Dimension;
// import java.awt.Font;
// import java.awt.BorderLayout;

// public class FrameChangeCredentials extends JFrame {

//     private JPanel mainPanelObject;
//     private JPanel contentPanelObject;
//     private JButton backButtonObject;
//     private JLabel titleLabelObject;
//     private JTextField docFieldObject;
//     private JPasswordField passFieldObject;
//     private JPasswordField repeatPassFieldObject;
//     private JLabel warningLabelObject;
//     private JButton saveButtonObject;

//     public FrameChangeCredentials() {
//         createFrame();
//         createMainPanel();
//         createTopBar();
//         createContent();
//         createWarning();
//         createSaveButton();

//         setVisible(true);
//     }

//     private void createFrame() {
//         setTitle("Parking UPTC - Cambiar Credenciales");
//         setSize(800, 600);
//         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         setLocationRelativeTo(null);
//     }

//     private void createMainPanel() {
//         mainPanelObject = new JPanel(new BorderLayout());
//         mainPanelObject.setBackground(Color.WHITE);
//         add(mainPanelObject);
//     }

//     private void createTopBar() {
//         JPanel topBarObject = new JPanel();
//         topBarObject.setBackground(Color.WHITE);
//         topBarObject.setLayout(new BoxLayout(topBarObject, BoxLayout.X_AXIS));

//         backButtonObject = new JButton("Volver al menú");
//         backButtonObject.setAlignmentX(Component.LEFT_ALIGNMENT);
//         topBarObject.add(Box.createHorizontalStrut(10));
//         topBarObject.add(backButtonObject);
//         topBarObject.add(Box.createHorizontalGlue());

//         mainPanelObject.add(topBarObject, BorderLayout.NORTH);
//     }

//     private void createContent() {
//         contentPanelObject = new JPanel();
//         contentPanelObject.setBackground(Color.WHITE);
//         contentPanelObject.setLayout(new BoxLayout(contentPanelObject, BoxLayout.Y_AXIS));
//         contentPanelObject.setBorder(BorderFactory.createEmptyBorder(30, 100, 30, 100));

//         titleLabelObject = new JLabel("Digite los siguientes datos para cambiar la credencial");
//         titleLabelObject.setFont(new Font("Arial", Font.BOLD, 16));
//         titleLabelObject.setAlignmentX(Component.CENTER_ALIGNMENT);
//         contentPanelObject.add(titleLabelObject);
//         contentPanelObject.add(Box.createVerticalStrut(30));

//         contentPanelObject.add(createFormRow("Documento de Identidad:", docFieldObject = new JTextField()));
//         contentPanelObject.add(Box.createVerticalStrut(15));
//         contentPanelObject.add(createFormRow("Nueva Contraseña:", passFieldObject = new JPasswordField()));
//         contentPanelObject.add(Box.createVerticalStrut(15));
//         contentPanelObject.add(createFormRow("Repetir Nueva Contraseña:", repeatPassFieldObject = new JPasswordField()));
//         contentPanelObject.add(Box.createVerticalStrut(20));

//         mainPanelObject.add(contentPanelObject, BorderLayout.CENTER);
//     }

//     private JPanel createFormRow(String labelText, JTextField fieldObject) {
//         JPanel rowPanelObject = new JPanel();
//         rowPanelObject.setLayout(new BoxLayout(rowPanelObject, BoxLayout.X_AXIS));
//         rowPanelObject.setBackground(Color.WHITE);

//         JLabel labelObject = new JLabel(labelText);
//         labelObject.setPreferredSize(new Dimension(200, 25));
//         fieldObject.setMaximumSize(new Dimension(Short.MAX_VALUE, 25));

//         rowPanelObject.add(labelObject);
//         rowPanelObject.add(Box.createHorizontalStrut(10));
//         rowPanelObject.add(fieldObject);

//         return rowPanelObject;
//     }

//     private void createWarning() {
//         warningLabelObject = new JLabel("La contraseña debe ser sin caracteres especiales y de 8 dígitos");
//         warningLabelObject.setFont(new Font("Arial", Font.PLAIN, 12));
//         warningLabelObject.setAlignmentX(Component.CENTER_ALIGNMENT);
//         contentPanelObject.add(warningLabelObject);
//         contentPanelObject.add(Box.createVerticalStrut(10));
//     }

//     private void createSaveButton() {
//         saveButtonObject = new JButton("Guardar Cambios");
//         saveButtonObject.setAlignmentX(Component.CENTER_ALIGNMENT);
//         contentPanelObject.add(saveButtonObject);
//     }
// }
