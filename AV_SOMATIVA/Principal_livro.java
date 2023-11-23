package AV_SOMATIVA;

public class Principal_livro{
	public static void main(String[] args) {
		livro produto1 = new livro("livro das provas", "Professores", 105);
		System.out.println("Nome: "+ produto1.getNome());
		System.out.println("Autores: "+ produto1.getAutor());
		System.out.println("Quantidade de paginas: "+ produto1.getPaginas());

}}
