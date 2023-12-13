import java.util.Scanner;

public class Kasir {

    public void Login() {
        String Username = "Harsya";
        String Password = "270704";
        String Captcha  = "LvYApR";
        Boolean loginBenar = false;
        Boolean inputcaptchaBenar = false;
        String usernameBenar, passwordBenar,captchaBenar;
 
        Scanner scanner = new Scanner(System.in); {

            while (!loginBenar) {
                System.out.print("Masukkan username  : ");
                usernameBenar = scanner.nextLine();
                System.out.print("Masukkan password  : ");
                passwordBenar = scanner.nextLine();

                if (usernameBenar.equals(Username) && passwordBenar.equals(Password)) {
                    break;
                } else {
                    System.out.println("Username atau Password Salah!");
                }
            }    

            while (!inputcaptchaBenar){
                System.out.println("Kode Captcha : " + Captcha);
                System.out.print("Entry Captcha : ");
                captchaBenar = scanner.nextLine();

                if (captchaBenar.equals(Captcha)) {
                    System.out.println("Login berhasil!");
                    break;
                } else {
                    System.out.println("Captcha Salah!");
                }
            }  
        }    
    }  
}  

