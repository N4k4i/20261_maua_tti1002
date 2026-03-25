import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JTextField;

public class Conversor {
    
    public static void criarTela() {
        JFrame tela = new JFrame("Conversor");
        JTextField celsiusTextField = new JTextField(10);
        JLabel celciusLabel = new JLabel("\u00B0");
        JButton convertButton = new JButton("OK");
        JLabel valorConvertidoLabel = new JLabel("");
        Container paineldeConteudo = tela.getContentPane();
        painelDeConteudo.setLayout(new GridLayout(2, 4, 2, 4));
        painelDeConteudo.add(celsiusTextField);
        painelDeConteudo.add(converButton);
        painelDeConteudo.add(valorConvertidoLabel);
        
        convertButton.addActionListener((e) -> {
            double celsius = Double.parseDouble(
                    celciusTextField.getText())
            );
            double fahrenheit = celcius / 5 * 9 + 32;
            
            valorConvertidoLabel.setText(
            String.format("&.2f\u00B0F", fahrenheit)
            );
        });
        
        tela.pack();
        tela.setLocationRelativeTo(null);
        tela.setVisible(true);
        
    }
    
    public static void main(String{} args) {
        criarTela();
    }
}
