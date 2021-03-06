package com.controller.pkg;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Enumeration;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.jasper.tagplugins.jstl.core.Out;

import com.entity.pkg.Customer;
import com.entity.pkg.Employee;
import com.entity.pkg.Order;
import com.service.pkg.CustomerService;
import com.service.pkg.EmployeeService;
import com.service.pkg.OrderService;
import com.service.pkg.ValidateUser;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/EmployeeRecordOrderServlet")
public class EmployeeRecordOrderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeRecordOrderServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@SuppressWarnings("deprecation")
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out =  response.getWriter();
		Enumeration<String> params = request.getParameterNames(); 
		OrderService service = new OrderService();
		Date date = new Date();
		Calendar cal = Calendar.getInstance();
		cal.set(0, 0, 0);
		//cal.add(Calendar.DATE, +30); 
		
		System.out.println(new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
		System.out.println(cal.getTime());
		service.RecordOrder(new SimpleDateFormat("yyyy-MM-dd").format(new Date()),new SimpleDateFormat("yyyy-MM-dd").format(cal.getTime()) , Integer.parseInt(request.getParameter("accountId")), Integer.parseInt(request.getParameter("cusRepId")), Integer.parseInt(request.getParameter("movieId")));
		RequestDispatcher rd=request.getRequestDispatcher("/employee_admin/html/record_an_order.jsp");  
        rd.forward(request,response); 
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
