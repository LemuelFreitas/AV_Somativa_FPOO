package AV_SOMATIVA;

public class Principal extends pedido{

	public static void main(String[] args) {
		pedido pedido1 = new pedido(1,"livro",3);
		System.out.println("ID: "+pedido1.getId());
		System.out.println("Produto: "+pedido1.getProduto());
		System.out.println("Quantidade: "+pedido1.getQuantidade());

	}

}
