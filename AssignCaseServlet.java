

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cb.beans.AddNewCaseBean;
import com.cb.beans.RegistrationBean;

/**
 * Servlet implementation class AssignCaseServlet
 */
@WebServlet("/AssignCaseServlet")
public class AssignCaseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AssignCaseServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		System.out.println(request.getParameter("CaseID"));
		int CaseID = Integer.parseInt(request.getParameter("CaseID"));
		String Agent_Email = request.getParameter("Agent_Email");
		
		System.out.println(CaseID + " " + Agent_Email);
		AddNewCaseBean tb = new AddNewCaseBean();
		tb.setCaseID(CaseID);
		tb.setAgent_Email(Agent_Email);
		AddNewCaseDAO td = new AddNewCaseDAO();
		if(td.assign(tb)){
			response.sendRedirect("CaseAssign.jsp"); 
		}else{
			out.println("ERROR");
		}
			
	}

}
