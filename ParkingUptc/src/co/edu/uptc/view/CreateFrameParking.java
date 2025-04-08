package co.edu.uptc.view;

import co.edu.uptc.model.Schedule;
import co.edu.uptc.presenter.Presenter;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.border.TitledBorder;

public class CreateFrameParking extends JFrame implements ActionListener {

    private Presenter presenter;

    private JMenuBar menuBarAdmin;
    private JMenu menuAdmin;
    private JMenuItem menuItemParking;
    private JMenuItem menuItemUsuario;

    private JLabel lbtitleParking, lbnameParking, lbaddressParking, lbavailableSpaces, lbweekDay, lbweekDay2,
            lbweekDay3, lbStart, lbEnd, lbtitleUser,  lbDocIdent,lbnameUser,lbLastName,lbPhone,lbAddress,lbEmail;
    private JTextField txnameParking, txaddressParking, txavailableSpaces, txweekDay, txweekDay2,
            txStartHour, txEndHour,txDocUser,txnameUser,txLastName,txPhone, txAddress,txEmail ;
    private JButton btAddParking,btAddUser;

    private JPanel panelAdmin;
    private JPanel panelCentral; // donde cambiaremos los formularios dinámicamente

    public CreateFrameParking() {
        super("Administrador");
        setSize(800, 600);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        presenter = Presenter.getInstance();
        initMenu();
        initMainPanel();
        setVisible(true);
    }

    private void initMenu() {
        menuBarAdmin = new JMenuBar();
        menuAdmin = new JMenu("Funciones");

        menuItemParking = new JMenuItem("Crear Parqueadero");
        menuItemParking.addActionListener(this);

        menuItemUsuario = new JMenuItem("Crear Usuario");
        menuItemUsuario.addActionListener(this);

        menuAdmin.add(menuItemParking);
        menuAdmin.add(menuItemUsuario);
        menuBarAdmin.add(menuAdmin);
        setJMenuBar(menuBarAdmin);
    }

    private void initMainPanel() {
        panelAdmin = new JPanel(new BorderLayout());
        panelAdmin.setBackground(Color.LIGHT_GRAY);

        panelCentral = new JPanel(new BorderLayout());
        panelAdmin.add(panelCentral, BorderLayout.CENTER);

        add(panelAdmin);
    }

    private void showCreateParkingPanel() {
        JPanel panelCreateParking = new JPanel(new GridBagLayout());

        TitledBorder titledBorder = BorderFactory.createTitledBorder(
                BorderFactory.createLineBorder(Color.GRAY, 2),
                "Formulario de Parqueadero",
                TitledBorder.LEFT, TitledBorder.TOP,
                new Font("Arial", Font.BOLD, 14),
                Color.DARK_GRAY);

        panelCreateParking.setBorder(titledBorder);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10); // Espaciado entre componentes

        lbtitleParking = new JLabel("Digite los datos para agregar el parqueadero");
        lbtitleParking.setFont(new Font("Arial", Font.BOLD, 16));
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        panelCreateParking.add(lbtitleParking, gbc);

        lbnameParking = new JLabel("Nombre del Parqueadero:");
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.EAST;
        panelCreateParking.add(lbnameParking, gbc);

        txnameParking = new JTextField(15);
        gbc.gridx = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1.0;
        gbc.anchor = GridBagConstraints.WEST;
        panelCreateParking.add(txnameParking, gbc);

        lbaddressParking = new JLabel("Dirección:");
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.fill = GridBagConstraints.NONE;
        gbc.weightx = 0;
        gbc.anchor = GridBagConstraints.EAST;
        panelCreateParking.add(lbaddressParking, gbc);

        txaddressParking = new JTextField(15);
        gbc.gridx = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1.0;
        gbc.anchor = GridBagConstraints.WEST;
        panelCreateParking.add(txaddressParking, gbc);

        lbavailableSpaces = new JLabel("Espacios disponibles:");
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.fill = GridBagConstraints.NONE;
        gbc.weightx = 0;
        gbc.anchor = GridBagConstraints.EAST;
        panelCreateParking.add(lbavailableSpaces, gbc);

        txavailableSpaces = new JTextField(5);
        gbc.gridx = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1.0;
        gbc.anchor = GridBagConstraints.WEST;
        panelCreateParking.add(txavailableSpaces, gbc);

        lbweekDay = new JLabel("Horario entre semana:");
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.fill = GridBagConstraints.NONE;
        gbc.gridwidth = 2;
        gbc.weightx = 0;
        gbc.anchor = GridBagConstraints.CENTER;
        panelCreateParking.add(lbweekDay, gbc);

        lbweekDay2 = new JLabel("Hora de inicio:");
        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.EAST;
        panelCreateParking.add(lbweekDay2, gbc);

        txweekDay = new JTextField(10);
        gbc.gridx = 1;
        gbc.gridy = 5;
        gbc.anchor = GridBagConstraints.WEST;
        panelCreateParking.add(txweekDay, gbc);

        lbweekDay3 = new JLabel("Hora de cierre:");
        gbc.gridx = 0;
        gbc.gridy = 6;
        gbc.fill = GridBagConstraints.NONE;
        gbc.weightx = 1;
        gbc.anchor = GridBagConstraints.EAST;
        panelCreateParking.add(lbweekDay3, gbc);

        txweekDay2 = new JTextField(10);
        gbc.gridx = 1;
        gbc.gridy = 6;
        gbc.anchor = GridBagConstraints.WEST;
        panelCreateParking.add(txweekDay2, gbc);

        lbStart = new JLabel("Horario fines y festivos:");
        gbc.gridx = 0;
        gbc.gridy = 7;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        panelCreateParking.add(lbStart, gbc);

        lbStart = new JLabel("Hora de inicio:");
        gbc.gridx = 0;
        gbc.gridy = 8;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.EAST;
        panelCreateParking.add(lbStart, gbc);

        txStartHour = new JTextField(10);
        gbc.gridx = 1;
        gbc.gridy = 8;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1.0;
        gbc.anchor = GridBagConstraints.WEST;
        panelCreateParking.add(txStartHour, gbc);

        lbEnd = new JLabel("Hora de cierre  (HH:mm):");
        gbc.gridx = 0;
        gbc.gridy = 9;
        gbc.fill = GridBagConstraints.NONE;
        gbc.anchor = GridBagConstraints.EAST;
        panelCreateParking.add(lbEnd, gbc);

        txEndHour = new JTextField(10);
        gbc.gridx = 1;
        gbc.gridy = 9;
        gbc.weightx = 1.0;
        gbc.anchor = GridBagConstraints.WEST;
        panelCreateParking.add(txEndHour, gbc);

        btAddParking = new JButton("Crear");
        btAddParking.addActionListener(this);
        gbc.gridx = 0;
        gbc.gridy = 10;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.NONE;
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.weightx = 0;
        gbc.weighty = 0;
        panelCreateParking.add(btAddParking, gbc);

        panelCentral.removeAll();
        panelCentral.add(panelCreateParking, BorderLayout.CENTER);
        panelCentral.revalidate();
        panelCentral.repaint();
    }

    private void showCreateUserPanel() {
        JPanel panelUser = new JPanel();
        panelUser.setLayout(new GridBagLayout());
        TitledBorder titledBorder = BorderFactory.createTitledBorder(
                BorderFactory.createLineBorder(Color.GRAY, 2),
                "Formulario crear usuario",
                TitledBorder.LEFT, TitledBorder.TOP,
                new Font("Arial", Font.BOLD, 14),
                Color.DARK_GRAY);
        panelUser.setBorder(titledBorder);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);

        lbtitleUser = new JLabel("Digite los datos para crear usuario");
        lbtitleUser.setFont(new Font("Arial", Font.BOLD, 16));
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        panelUser.add(lbtitleUser, gbc);

        lbDocIdent = new JLabel("Documento de identidad:");
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.EAST;
        panelUser.add( lbDocIdent, gbc);

        txDocUser = new JTextField(15);
        gbc.gridx = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1.0;
        gbc.anchor = GridBagConstraints.WEST;
        panelUser.add(txDocUser, gbc);

        lbnameUser = new JLabel("Nombre");
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.fill = GridBagConstraints.NONE;
        gbc.weightx = 0;
        gbc.anchor = GridBagConstraints.EAST;
        panelUser.add(lbnameUser, gbc);

        txnameUser = new JTextField(15);
        gbc.gridx = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1.0;
        gbc.anchor = GridBagConstraints.WEST;
        panelUser.add(txnameUser, gbc);

        lbLastName = new JLabel("Apellidos:");
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.fill = GridBagConstraints.NONE;
        gbc.weightx = 0;
        gbc.anchor = GridBagConstraints.EAST;
        panelUser.add(lbLastName, gbc);

        txLastName = new JTextField(5);
        gbc.gridx = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1.0;
        gbc.anchor = GridBagConstraints.WEST;
        panelUser.add(txLastName, gbc);

        lbPhone = new JLabel("Telefono:");
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.fill = GridBagConstraints.NONE;
         gbc.weightx=0;
        gbc.anchor = GridBagConstraints.EAST;
        panelUser.add(lbPhone, gbc);

        txPhone = new JTextField(5);
        gbc.gridx = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1.0;
        gbc.anchor = GridBagConstraints.WEST;
        panelUser.add(txPhone, gbc);

        lbAddress = new JLabel("Direccion");
        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.fill = GridBagConstraints.NONE;
         gbc.weightx=0;
        gbc.anchor = GridBagConstraints.EAST;
        panelUser.add(lbAddress, gbc);

        txAddress = new JTextField(10);
        gbc.gridx = 1;
        gbc.gridy = 5;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1.0;
        gbc.anchor = GridBagConstraints.WEST;
        panelUser.add( txAddress, gbc);

        lbEmail = new JLabel("E-mail");
        gbc.gridx = 0;
        gbc.gridy = 6;
        gbc.fill = GridBagConstraints.NONE;
        gbc.weightx = 1;
        gbc.anchor = GridBagConstraints.EAST;
        panelUser.add(lbEmail, gbc);

        txEmail = new JTextField(10);
        gbc.gridx = 1;
        gbc.gridy = 6;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.anchor = GridBagConstraints.WEST;
        panelUser.add(txEmail , gbc);

        btAddUser = new JButton("Crear ");
        btAddUser.addActionListener(this);
        gbc.gridx = 0;
        gbc.gridy = 10;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.NONE;
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.weightx = 0;
        gbc.weighty = 0;
        panelUser.add(btAddUser, gbc);


        panelCentral.removeAll();
        panelCentral.add(panelUser, BorderLayout.CENTER);
        panelCentral.revalidate();
        panelCentral.repaint();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
    
        if (source == menuItemParking) {
            showCreateParkingPanel();
        } else if (source == menuItemUsuario) {
            showCreateUserPanel();
        } else if (source == btAddParking) {
            try {
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("H:mm");
    
                String weekdays = "Lunes a Viernes";
                LocalTime startWeek = LocalTime.parse(txweekDay.getText().trim(), formatter);
                LocalTime endWeek = LocalTime.parse(txweekDay2.getText().trim(), formatter);
    
                String weekends = "Sábado, Domingo y Festivos";
                LocalTime startWeekend = LocalTime.parse(txStartHour.getText().trim(), formatter);
                LocalTime endWeekend = LocalTime.parse(txEndHour.getText().trim(), formatter);
    
                Schedule horarioSemana = new Schedule(weekdays, startWeek, endWeek);
                Schedule horarioFinde = new Schedule(weekends, startWeekend, endWeekend);
    
                Schedule[] schedules = { horarioSemana, horarioFinde };
    
                boolean resp = presenter.addParking(
                        txnameParking.getText(),
                        txaddressParking.getText(),
                        Integer.parseInt(txavailableSpaces.getText()),
                        schedules);
    
                if (resp) {
                    JOptionPane.showMessageDialog(this, "Parqueadero creado exitosamente!");
                } else {
                    JOptionPane.showMessageDialog(this, "¡No se pudo crear el parqueadero!");
                }
    
            } catch (Exception ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error al crear el parqueadero: " + ex.getMessage());
            }
        } else if (source == btAddUser) {
            boolean resp = presenter.addUser(txDocUser.getText(),
                    txnameUser.getText(),
                    txLastName.getText(),
                    txAddress.getText(),
                    txPhone.getText(),
                    txEmail.getText());
    
            if (resp) {
                JOptionPane.showMessageDialog(this, "Usuario creado exitosamente!");
            } else {
                JOptionPane.showMessageDialog(this, "¡No se pudo crear el usuario!");
            }
        }
    }
}

