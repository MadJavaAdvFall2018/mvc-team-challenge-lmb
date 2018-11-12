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
                <li><a>My Miles</a></li>
            </ul>
        </nav>

        <form action="lmb" method="post">
            <input type="text" name="activity" placeholder="Activity"><br/>
            <input type="text" name="location" placeholder="Location"><br/>
            <input type="text" name="miles" placeholder="Miles"><br/><br/>

            <input type="submit" value="Submit">
        </form>

        <%@ page import="java.util.*" %>

        <table>
            <tr><th></th><th>Activity</th><th>Location</th><th>Distance (Miles)</th></tr>
            <!--<tr><td>1</td><td>${bean.activity}</td><td>${bean.location}</td><td>${bean.miles}</td></tr>-->
            <%
            ArrayList<Object> list = new ArrayList<Object>();
            list.add(${bean});
            for (Object bobj : list) { %>
                <tr><td>1</td><td><%=bobj.activity%></td><td><%=bobj.activity%></td><td><%=bobj.activity%></td></tr>
            <% } %>
        </table>
    </body>
</html>
