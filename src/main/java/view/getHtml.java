package view;

public class getHtml {
    public static String form = "<html><body>" +
            "<form method=\"POST\">\n" +
            "  username:<br>\n" +
            "  <input type=\"text\" name=\"username\" required=\"required\">\n" +
            "  <br>\n" +
            "  password:<br>\n" +
            "  <input type=\"text\" name=\"password\" required=\"required\">\n" +
            "  <br><br>\n" +
            "  <input type=\"submit\" value=\"Sign in\">\n" +
            "</form> " +
            "</body></html>";

    public static String badCredentials = form + "Bad username or password";

    public static String mainPage(String username, String sessionId) {
        return "<html><body>Hello " + username + " Your session ID: " + sessionId +
                "<form action=\"logout()\">" +
                "    <input type=\"submit\" value=\"Log out\" />" +
                "</form>" +
                "<script>function logout() {" +
                    "document.cookie = \'sessionId=" + sessionId + "\' + '=; expires=Thu, 01 Jan 1970 00:00:01 GMT;';" +
                "location.href=\"/logout\";" +
                "}<script>";
    }
}


