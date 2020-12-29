package web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import metier.CreditMetierImp;
import metier.ICreditMetier;

@WebServlet(name="cs",urlPatterns={"/hello"})
public class ControleurServlet extends HttpServlet {
	ICreditMetier metier;
	@Override
		public void init() throws ServletException {
		metier=new CreditMetierImp();
		}

@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
	req.setAttribute("mensu", new CreditModel());
req.getRequestDispatcher("VueCredit.jsp").forward(req, resp);
}
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
	double m=Double.parseDouble(req.getParameter("montant")) ;
	double t=Double.parseDouble(req.getParameter("taux")) ;
	int d=Integer.parseInt(req.getParameter("duree")); 
	CreditModel model=new CreditModel(m, d, t);
	
	double mensu=metier.calculMensu(m, t, d);
	model.setMensualite(mensu);
	req.setAttribute("mensu", model);
	
	req.getRequestDispatcher("VueCredit.jsp").forward(req, resp);
}
}
