<%@ page import="java.util.*" %>
<%@ page import="java112.project3.*" %>
<!DOCTYPE html>
<html lang="en" dir="ltr">
    <head>
        <meta charset="utf-8">
        <title>Log Miles Bro</title>
        <link href="css/normalize.css" type="text/css" rel="stylesheet">
        <link href="css/styles.css" type="text/css" rel="stylesheet"/>
    </head>
    <body>
        <nav>
            <img src="images/logo.png">
            <ul>
                <li><a>Home</a></li>
                <li><a>Diagram</a></li>
            </ul>
        </nav>

        <form action="lmb" method="post">
            <input type="text" name="activity" placeholder="Activity"><br/>
            <input type="text" name="location" placeholder="Location"><br/>
            <input type="text" name="miles" placeholder="Miles"><br/><br/>

            <input type="submit" value="Submit">
        </form>



        <table>
            <tr><th></th><th>Activity</th><th>Location</th><th>Distance (Miles)</th></tr>
            <%-- <tr><td>1</td><td>${bean.activity}</td><td>${bean.location}</td><td>${bean.miles}</td></tr> --%>

            <%

            List<MVCBean> beans = (ArrayList<MVCBean>) request.getAttribute("beans");
            // out.println(beans);

            
            for (MVCBean bean : beans) {
                out.print(bean.getActivity());
            }


            %>
        </table>
    </body>
</html>
