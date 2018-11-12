package java112.mvc;

import java.io.*;
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
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

              BeanOne newBean = new MVCBean();

              newBean.setData("I'm special!");

              request.setAttribute("myCoolBean", myBean);

              String url = "/lmb.jsp";

              RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
                      dispatcher.forward(request, response);
    }

}
