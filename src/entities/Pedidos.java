package entities;

import java.util.ArrayList;
import java.util.List;

public class Pedidos {
	private String viagem;
	private Cliente cliente;
	private List<Itens> itens = new ArrayList<Itens>();
	
	public Pedidos() {
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public String getViagem() {
		return viagem;
	}
	public void setViagem(String viagem) {
		this.viagem = viagem;
	}
	
	public Integer calcularQtd() {
		return itens.size();
	}
	
	public void addItem(Itens item) {
		itens.add(item);
	}
	
	public double total() {
		double soma = 0.0;
		for (Itens it : itens) {
			soma += it.getPrecoItem();
		}
		return soma;
	}
	
	@Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Situação: ").append(viagem).append("\n");
        builder.append("Quantidade de Itens: ").append(calcularQtd()).append("\n");
        builder.append("\nItens:\n");
        for (Itens item : itens) {
            builder.append("- ").append(item.toString()).append("\n");
        }
        builder.append("\nTotal $" + String.format("%.2f", total()));
        return builder.toString();
    }
}