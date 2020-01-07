package modelo;
import java.util.List;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
public class PacienteDAO {
	Conexion cn = new Conexion();
	Connection conn;
	PreparedStatement ps;
	ResultSet rs;
	Paciente p = new Paciente();
	public List<Paciente> listar() {
		List<Paciente> lista = new ArrayList<>();
		String sql = "SELECT * FROM paciente";
		try {
			conn = cn.getConnection();
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				Paciente p = new Paciente();
				p.setNombre(rs.getString(1));
				p.setEdad(rs.getString(2));
				p.setGenero(rs.getString(3));
				p.setTelefono(rs.getString(4));
				p.setAlergia(rs.getString(5));
				lista.add(p);
			}
		}catch(Exception x) {}
		return lista;
	}
 public void agregar(
		 Paciente p) {
	 String sql = "INSERT INTO paciente(nombre, edad, genero, telefono, alergia) VALUES(?, ?, ?, ?, ?)";
 conn = cn.getConnection();
 try {
 ps = conn.prepareStatement(sql);
 ps.setString(1, p.getNombre());
 ps.setString(2, p.getEdad());
 ps.setString(3, p.getGenero());
 ps.setString(4, p.getTelefono());
 ps.setString(5, p.getAlergia()); 
 ps.executeUpdate();
 }catch(Exception x) {}
 
 }
}
