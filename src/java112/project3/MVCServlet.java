package java112.project3;

import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

/**
 *  The controller for the MVC Challenge - LMB Mileage Tracker
 *
 *@author    mkcummins
 */
@WebServlet(
    name = "MVCServlet",
    urlPatterns = { "/mvc", "/lmb" }
)
public class MVCServlet extends HttpServlet {

    /**
     *  Handles HTTP GET requests.
     *
     *@param  request                   the HttpServletRequest object
     *@param  response                   the HttpServletResponse object
     *@exception  ServletException  if there is a Servlet failure
     *@exception  IOException       if there is an IO failure
     */
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        ArrayList<MVCBean> beans = new ArrayList<MVCBean>();

        MVCBean newBean = new MVCBean();

        newBean.setActivity(request.getParameter("activity"));

        newBean.setLocation(request.getParameter("location"));

        double miles = Double.parseDouble(request.getParameter("miles"));

        newBean.setMiles(miles);

        beans.add(newBean);

        request.setAttribute("bean", newBean);

        String url = "/lmb.jsp";

        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);

        // System.out.println(newBean.getActivity());
        // System.out.println(newBean.getLocation());
        // System.out.println(newBean.getMiles());

    }

}
