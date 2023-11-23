package AV_SOMATIVA;

public class livro extends Produto_Livro{
private String autor;
private int paginas;
public livro(String nome, String autor, int paginas) {
	super(nome);
	this.autor = autor;
	this.paginas = paginas;
}

public String getAutor() {
	return autor;
}
public void setAutor(String autor) {
	this.autor = autor;
}
public int getPaginas() {
	return paginas;
}
public void setPaginas(int paginas) {
	this.paginas = paginas;
}

}
 