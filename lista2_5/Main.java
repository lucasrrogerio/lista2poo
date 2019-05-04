package lista2_5;

public class Main {
	public static void main(String[] args) {

		/* TESTE 1 */
		Universidade ul = new Universidade("UFF");
		Pessoa pessoa = new Pessoa("Lucas");
		pessoa.setUniversidade(ul);
		pessoa.getNomeUniversidade();

		/* TESTE 2 
		pessoa.setDepartamento("RH");
		System.out.println(pessoa.getDepartamento().getNome());
*/
		/* TESTE 3 
		Departamento dep = new Departamento("RH");
		ul.adicionarDepartamento(dep);
		pessoa.setDepartamento(dep);
*/
	}
}
