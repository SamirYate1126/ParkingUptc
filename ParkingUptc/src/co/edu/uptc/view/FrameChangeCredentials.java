package co.edu.uptc.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrameChangeCredentials extends JFrame {

    private JTextField docFieldObject;
    private JPasswordField passFieldObject;
    private JPasswordField repeatPassFieldObject;

    public FrameChangeCredentials() {
        setTitle("Parking UPTC - Cambiar Credenciales");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel mainPanelObject = createMainPanel();
        add(mainPanelObject);

        setVisible(false);
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
        centerPanelObject.setLayout(new BoxLayout(centerPanelObject, BoxLayout.Y_AXIS));
        centerPanelObject.setBackground(Color.WHITE);

        JLabel titleLabelObject = new JLabel("Digite los siguientes datos para cambiar la credencial");
        titleLabelObject.setAlignmentX(Component.CENTER_ALIGNMENT);
        titleLabelObject.setFont(new Font("Arial", Font.BOLD, 16));
        centerPanelObject.add(titleLabelObject);
        centerPanelObject.add(Box.createVerticalStrut(20));

        JPanel formPanelObject = createFormPanel();
        centerPanelObject.add(formPanelObject);
        centerPanelObject.add(Box.createVerticalStrut(20));

        JLabel warningLabelObject = new JLabel("La contraseña debe ser sin caracteres especiales y de 8 dígitos");
        warningLabelObject.setFont(new Font("Arial", Font.PLAIN, 12));
        warningLabelObject.setAlignmentX(Component.CENTER_ALIGNMENT);
        centerPanelObject.add(warningLabelObject);
        centerPanelObject.add(Box.createVerticalStrut(10));

        JButton saveButtonObject = new JButton("Guardar Cambios");
        saveButtonObject.setAlignmentX(Component.CENTER_ALIGNMENT);
        saveButtonObject.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                validarYGuardar();
            }
        });
        centerPanelObject.add(saveButtonObject);

        return centerPanelObject;
    }

    private JPanel createFormPanel() {
        JPanel formPanelObject = new JPanel(new GridLayout(3, 2, 10, 15));
        formPanelObject.setBackground(Color.WHITE);
        formPanelObject.setMaximumSize(new Dimension(450, 150));

        JLabel docLabelObject = new JLabel("Documento de Identidad:");
        docFieldObject = new JTextField();

        JLabel passLabelObject = new JLabel("Nueva Contraseña:");
        passFieldObject = new JPasswordField();

        JLabel repeatLabelObject = new JLabel("Repetir Nueva Contraseña:");
        repeatPassFieldObject = new JPasswordField();

        formPanelObject.add(docLabelObject);
        formPanelObject.add(docFieldObject);
        formPanelObject.add(passLabelObject);
        formPanelObject.add(passFieldObject);
        formPanelObject.add(repeatLabelObject);
        formPanelObject.add(repeatPassFieldObject);

        return formPanelObject;
    }

    private void validarYGuardar() {
        String pass = new String(passFieldObject.getPassword());
        String repeatPass = new String(repeatPassFieldObject.getPassword());

        if (!pass.equals(repeatPass)) {
            JOptionPane.showMessageDialog(this, "Las contraseñas no coinciden.");
            return;
        }

        // Regex: exactamente 8 dígitos sin letras ni símbolos
        if (!pass.matches("\\d{8}")) {
            JOptionPane.showMessageDialog(this, "La contraseña debe tener exactamente 8 dígitos numéricos y sin símbolos.");
            return;
        }

        // Si todo está bien
        JOptionPane.showMessageDialog(this, "Contraseña cambiada exitosamente.");
        // Aquí podrías llamar al método del presenter para guardar los cambios en la base de datos
    }
}
