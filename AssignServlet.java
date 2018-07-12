
import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cb.beans.AddNewCaseBean;
import com.cb.beans.RegistrationBean;

/**
 * 
 * Servlet implementation class AssignServlet
 */
@WebServlet("/AssignServlet")
public class AssignServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AssignServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		AddNewCaseDAO td = new AddNewCaseDAO();
		RegistrationDAOImpl ed = new RegistrationDAOImpl();
		ArrayList<AddNewCaseBean> openCases = td.getUnassignedCases();
		ArrayList<RegistrationBean> agentlist = ed.getAllAgentMails();
		request.setAttribute("CaseIDList", openCases);
		request.setAttribute("AgentList", agentlist);
		request.getRequestDispatcher("AssignCase.jsp").forward(request, response);
		
	}

}