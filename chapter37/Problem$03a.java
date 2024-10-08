package chapter_thirty_seven;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * *37.3 (Visit count) Develop a servlet that displays the number of visits
 * on the servlet. Also
 * display the client’s host name and IP address, as shown in Figure 37.26.
 * Implement this program in three different ways:
 * 1. Use an instance variable to store count. When the servlet is created for the
 * first time, count is 0. count is incremented every time the servlet’s doGet
 * method is invoked. When the Web server stops, count is lost.
 * 2. Store the count in a file named Exercise39_3.dat, and use RandomAccessFile
 * to read the count in the servlet’s init method. The count is incremented
 * every time the servlet’s doGet method is invoked. When the Web server stops,
 * store the count back to the file.
 * 3. Instead of counting total visits from all clients, count the visits by each client
 * identified by the client’s IP address. Use Map to store a pair of IP addresses and
 * visit counts. For the first visit, an entry is created in the map. For subsequent
 * visits, the visit count is updated.
 *
 *
 * @ Mojtaba Sayadi
 * */
public class Problem$03a extends HttpServlet
{
    private int count;

    @Override
    public void init() throws ServletException
    {
        count = 0;
    }

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("you are visitor number " + ++count);
        out.println("<br>Host name: " + request.getRemoteHost() + "<br>");
        out.println("IP Address: " + request.getRemoteAddr());
    }
}
