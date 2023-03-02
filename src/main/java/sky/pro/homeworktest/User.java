package sky.pro.homeworktest;

public class User {
    private String login;
    private String email;

    public User(String login, String email) {
        this.login = login;
        this.email = email;
        login = "adelia";
        email = "adelia@bk.ru";

        if (login.length() < 6) {
            System.out.println("Длина строки ,больше 6 символов");
        } else
            System.out.println("Длина строки в норме");

        boolean inEmail;
        if (inEmail = email.contains("@")) {
            System.out.println("email ok, знак @ присутствует");
        } else {
            System.out.println("Ошибка, знак @ отсутствует");
        }
        boolean inEmailDot;
        if (inEmail = email.contains(".")) {
            System.out.println("email ok, знак точка присутствует");
        } else {
            System.out.println("Ошибка, знак точка отсутствует");
        }
    }

    public String getLogin() {
        return login;
    }

    public String getEmail() {
        return email;
    }

}
