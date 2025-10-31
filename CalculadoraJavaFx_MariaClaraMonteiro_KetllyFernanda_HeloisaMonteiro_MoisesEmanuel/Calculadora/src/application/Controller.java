package application;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller implements Initializable {
	
	double valor1;
	double valor2;
	double resultado;
	String operacao = "";
	
	@FXML
	private TextField tela;
	
	@FXML
	private Button botaoZero;
	
	@FXML
	private Button botaoUm;
	
	@FXML
	private Button botaoDois;
	
	@FXML
	private Button botaoTres;
	
	@FXML
	private Button botaoQuatro;
	
	@FXML
	private Button botaoCinco;
	
	@FXML
	private Button botaoSeis;
	
	@FXML
	private Button botaoSete;
	
	@FXML
	private Button botaoOito;
	
	@FXML
	private Button botaoNove;
	
	@FXML
	private Button botaoSoma;
	
	@FXML
	private Button botaoSubtracao;
	
	@FXML
	private Button botaoMultiplicacao;
	
	@FXML
	private Button botaoDivisao;
	
	@FXML
	private Button botaoIgual;
	
	@FXML
	private Button botaoApagar;
	
	@FXML
	private Button botaoPonto;
	
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		
		botaoZero.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				tela.setText(tela.getText() + "0");
			}
		});
		
		botaoUm.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				tela.setText(tela.getText() + "1");
			}
		});
		
		botaoDois.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				tela.setText(tela.getText() + "2");
			}
		});
		
		botaoTres.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				tela.setText(tela.getText() + "3");
			}
		});
		
		botaoQuatro.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				tela.setText(tela.getText() + "4");
			}
		});
		
		botaoCinco.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				tela.setText(tela.getText() + "5");
			}
		});
		
		botaoSeis.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				tela.setText(tela.getText() + "6");
			}
		});
		
		botaoSete.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				tela.setText(tela.getText() + "7");
			}
		});
		
		botaoOito.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				tela.setText(tela.getText() + "8");
			}
		});
		
		botaoNove.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				tela.setText(tela.getText() + "9");
			}
		});
		
		botaoSoma.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				valor1 = Double.parseDouble(tela.getText());
				tela.setText("");
				operacao = "+";
			}
		});
		
		botaoSubtracao.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				valor1 = Double.parseDouble(tela.getText());
				tela.setText("");
				operacao = "-";
			}
		});
		
		botaoMultiplicacao.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				valor1 = Double.parseDouble(tela.getText());
				tela.setText("");
				operacao = "*";
			}
		});
		
		botaoDivisao.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				valor1 = Double.parseDouble(tela.getText());
				tela.setText("");
				operacao = "/";
			}
		});
		
		botaoApagar.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				tela.setText("");
				valor1 = 0;
				valor2 = 0;
				operacao = "";
			}
		});
		
		botaoPonto.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				tela.setText(tela.getText() + ".");
			}
		});
		
		botaoIgual.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				valor2 = Double.parseDouble(tela.getText());
				
				switch(operacao) {
					case "+":
						resultado = valor1 + valor2;
						tela.setText(String.valueOf(resultado));
						break;
					case "-":
						resultado = valor1 - valor2;
						tela.setText(String.valueOf(resultado));
						break;
					case "*":
						resultado = valor1 * valor2;
						tela.setText(String.valueOf(resultado));
						break;
					case "/":
						resultado = valor1 / valor2;
						tela.setText(String.valueOf(resultado));
						break;
				}
				
				operacao = "";
				valor1 = 0;
				valor2 = 0;
			}
		});
		
	}

}