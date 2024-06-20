package model;

import java.util.ArrayList;
import java.util.List;

public class Banco {


	private static List<Conta> listaBanco = new ArrayList<>();


	// Metodo ADD CLIENTE NA LIST
	public void adicionarConta(Conta conta) {
		// TODO Auto-generated method stub
		listaBanco.add(conta);
	}

	public List<Conta> listarBanco() {
		return new ArrayList<>(listaBanco);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Banco{");
		sb.append(" contas=[");

		for (Conta conta : listaBanco) {
			sb.append(conta); // Aqui assume-se que a classe Conta também tem um método toString()
								// implementado
			sb.append(", ");
		}

		// Removendo a última vírgula e espaço extra, se houver
		if (!listaBanco.isEmpty()) {
			sb.setLength(sb.length() - 2);
		}

		sb.append("]}");
		return sb.toString();
	}
}