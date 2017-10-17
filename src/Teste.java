
import dao.ClienteDao;
import dao.DataSource;
import model.Cliente;

public class Teste {

    public static void main(String[] args) {
       DataSource dc = new DataSource();
       ClienteDao dao = new ClienteDao(dc);
       Cliente cliente = new Cliente();
       cliente.setNome("Vinicius");
       cliente.setEmail("vinifrancasilva@hotmail.com");
       cliente.setTelefone("91234.5678");
       dao.inserirCliente(cliente);
       dc.closeConnection();
    }
    
}
