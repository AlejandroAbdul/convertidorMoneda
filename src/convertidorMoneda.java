import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class convertidorMoneda extends JFrame implements ActionListener {

    public static void main(String[]args){
        convertidorMoneda ventana = new convertidorMoneda();
    }
    private JRadioButton btnPeso;
    private JRadioButton btnEuro;
    private JRadioButton btnDollar;
    private JRadioButton btnAPeso;
    private JRadioButton btnAEuro;
    private JRadioButton btnADollar;
    private JButton btnConvertir;
    private JTextField txtEntrada;
    public convertidorMoneda(){
        btnPeso = new JRadioButton("Pesos");
        btnPeso.setSelected(true);
        btnEuro = new JRadioButton("Euros");
        btnDollar = new JRadioButton("Dollar");
        this.setTitle("Convertor de monedas");
        Container contenedor = this.getContentPane();
        contenedor.setLayout(new GridLayout(3,2));
        JPanel entrada = new JPanel();
        entrada.setLayout(new GridLayout(2,1));
        JLabel labEntrada = new JLabel("Ingrese la cantidad");
        txtEntrada = new JTextField();
        entrada.add(labEntrada);
        entrada.add(txtEntrada);
        contenedor.add(entrada);
        ButtonGroup tipoMoneda = new ButtonGroup();
        tipoMoneda.add(btnPeso);
        tipoMoneda.add(btnEuro);
        tipoMoneda.add(btnDollar);
        JPanel btnTipos = new JPanel();
        btnTipos.add(btnPeso);
        btnTipos.add(btnEuro);
        btnTipos.add(btnDollar);
        contenedor.add(btnTipos);
        JLabel labConvertir = new JLabel("Convertir a:");
        contenedor.add(labConvertir);
        btnAPeso = new JRadioButton("Pesos");
        btnAPeso.setSelected(true);
        btnAEuro = new JRadioButton("Euros");
        btnADollar = new JRadioButton("Dollar");
        ButtonGroup AtipoMoneda = new ButtonGroup();
        AtipoMoneda.add(btnAPeso);
        AtipoMoneda.add(btnAEuro);
        AtipoMoneda.add(btnADollar);
        JPanel btnATipos = new JPanel();
        btnATipos.add(btnAPeso);
        btnATipos.add(btnAEuro);
        btnATipos.add(btnADollar);
        contenedor.add(btnATipos);
        btnConvertir = new JButton("Convertir");
        btnConvertir.addActionListener(this);
        contenedor.add(btnConvertir);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
        this.setResizable(false);
    }
    public void actionPerformed(ActionEvent e){
        if(btnPeso.isSelected())
            convPesos();
        if(btnEuro.isSelected())
            convEuros();
        if(btnDollar.isSelected())
            convDollar();
    }
    public void convPesos(){
        if(btnAPeso.isSelected())
            JOptionPane.showMessageDialog(null,"no puede convertir a la misma moneda");
        if(btnAEuro.isSelected()){
            double cantidad = Double.parseDouble(txtEntrada.getText());
            JOptionPane.showMessageDialog(null, "la cantidad en Euros es de "+cantidad*0.0438873766);
        }
        if(btnADollar.isSelected()){
            double cantidad = Double.parseDouble(txtEntrada.getText());
            JOptionPane.showMessageDialog(null, "la cantidad en Dolares es de "+cantidad*0.05401);
        }
    }
    public void convEuros(){
        if(btnAEuro.isSelected())
            JOptionPane.showMessageDialog(null,"no puede convertir a la misma moneda");
        if(btnAPeso.isSelected()){
            double cantidad = Double.parseDouble(txtEntrada.getText());
            JOptionPane.showMessageDialog(null, "la cantidad en Pesos es de "+cantidad*22.7855953);
        }
        if(btnADollar.isSelected()){
            double cantidad = Double.parseDouble(txtEntrada.getText());
            JOptionPane.showMessageDialog(null, "la cantidad en Dolares es de "+cantidad*1.23065);
        }
    }
    public void convDollar(){
        if(btnADollar.isSelected())
            JOptionPane.showMessageDialog(null,"no puede convertir a la misma moneda");
        if(btnAPeso.isSelected()){
            double cantidad = Double.parseDouble(txtEntrada.getText());
            JOptionPane.showMessageDialog(null, "la cantidad en Pesos es de "+cantidad*18.5150898);
        }
        if(btnAEuro.isSelected()){
            double cantidad = Double.parseDouble(txtEntrada.getText());
            JOptionPane.showMessageDialog(null, "la cantidad en Euros es de "+cantidad*0.812578719);
        }
    }


}