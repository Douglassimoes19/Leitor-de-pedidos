package entities;

public class Itens {
	private String nomeItem;
	private double precoItem;

	public Itens() {}
	public Itens(String nomeItem, Double precoItem) {
		this.nomeItem = nomeItem;
		this.precoItem = precoItem;
	}

	public String getNomeItem() {
		return nomeItem;
	}
	public void setNomeItem(String nomeItem) {
		this.nomeItem = nomeItem;
	}
	public Double getPrecoItem() {
		return precoItem;
	}
	public void setPrecoItem(Double precoItem) {
		this.precoItem = precoItem;
	}
	
	@Override
	public String toString() {
		return nomeItem + "        $" + String.format("%.2f", precoItem);
	}
}