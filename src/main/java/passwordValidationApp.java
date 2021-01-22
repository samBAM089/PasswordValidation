public class passwordValidationApp2 {

    public static void main(String[] args) {
        String pw = "muenchen089";
        int min = 7;
        System.out.println("The password is long enough: " + longEnough(min, pw));
    }

    public static boolean longEnough(int minLength, String password) {

        if (password.length() >= minLength) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean includeNumber(String password) {

        if (password.matches("[a-zA-Z ]*\\d+.*")) {
            return true;
        } else {
            return false;
        }

    }
}




