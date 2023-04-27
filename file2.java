public void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
    response.setContentType("text/html");
    PrintWriter out = response.getWriter();

    out.println("<html>");
    out.println("<head>");
    out.println("<title>Adding Two Numbers</title>");
    out.println("</head>");
    out.println("<body>");
    out.println("<h1>Addition</h1>");
    out.println("<form method=\"post\">");
    out.println("Num1: <input type=\"text\" name=\"num1\"><br>");
    out.println("Num2: <input type=\"text\" name=\"num2\"><br>");
    out.println("<input type=\"submit\" value=\"Add\">");
    out.println("</form>");

    String num1Str = request.getParameter("num1");
    String num2Str = request.getParameter("num2");
    if (num1Str != null && num2Str != null) {
        int num1 = Integer.parseInt(num1Str);
        int num2 = Integer.parseInt(num2Str);
        int sum = num1 + num2;
        out.println("<h2>The sum of " + num1 + " and " + num2 + " is " + sum + "</h2>");
    }

    out.println("</body>");
    out.println("</html>");
}
