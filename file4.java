Cookie[] cookies = request.getCookies();
if (cookies != null) {
    for (Cookie cookie : cookies) {
        if (cookie.getName().equals("username")) {
            String username = cookie.getValue();
            // Use the username as needed
        }
    }
}
