package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Paciente;
import modelo.PacienteDAO;
import java.util.List;

/**
 * Servlet implementation class Controller
 */
@WebServlet("/Controller")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       Paciente p = new Paciente();
       PacienteDAO dao = new PacienteDAO();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String accion = request.getParameter("accion");
		switch(accion) {
		case "Listar":
			List <Paciente> lista = dao.listar();
			request.setAttribute("lista", lista);
			request.getRequestDispatcher("index.jsp").forward(request, response);
			break;
		case "Nuevo":
			request.getRequestDispatcher("agregar.jsp").forward(request, response);;
			break;
		case "Guardar":
			String nom= request.getParameter("txtNombre");
			String eda= request.getParameter("txtEdad");
			String gene= request.getParameter("txtGenero");
			String telefo= request.getParameter("txtTelefono");
			String ale= request.getParameter("txtalergia");
			p.setNombre(nom);
			p.setEdad(eda);
			p.setGenero(gene);
			p.setTelefono(telefo);
			p.setAlergia(ale);
			dao.agregar(p);
			request.getRequestDispatcher("Controller?accion=Listar").forward(request, response);
			break;
			default:
				request.getRequestDispatcher("Controller?accion=Listar").forward(request, response);
		}
		
	}

}
