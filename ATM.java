import java.util.Scanner;
public class ATM {
    public static void main(String[] args) {

        String userName, password;
        Scanner input = new Scanner(System.in);
        int right = 3;
        int balance = 1500;
        int select;
        while (right > 0) {
            System.out.print("Kullanıcı Adınız :");
            userName = input.nextLine();
            System.out.print("Parolanız : ");
            password = input.nextLine();

            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Merhaba, Kodluyoruz Bankasına Hoşgeldiniz!");
                do {
                    System.out.println("1-Para yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgula\n" +
                            "4-Çıkış Yap");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                    select = input.nextInt();

                    switch (select) {
                        case 1:
                            System.out.print("\nPara miktarı : ");
                            int price = input.nextInt();
                            balance += price;
                            break;
                        case 2:
                            System.out.print("\nPara miktarı : ");
                            price = input.nextInt();
                            if (price > balance) {
                                System.out.println("\nBakiye yetersiz.");
                            } else {
                                balance -= price;
                            }
                            break;
                        case 3:
                            System.out.println("\nBakiyeniz : " + balance + "\n");
                            break;
                        case 4:
                            System.out.println("Tekrar görüşmek üzere.");
                            break;
                    }
                }
                    while (select != 4) ;
                    System.out.println("Tekrar görüşmek üzere.");
                    break;
                    }
                else{
                    right--;
                }
            System.out.println("Hatalı kullanıcı adı veya şifre girdiniz. Tekrar deneyiziniz.");
                if (right == 0){
                    System.out.println("Hesabınız bloke olmuştur, banka ile iletişime geçiniz");
                }else{
                    System.out.print("Kalan Hakkınız: " + right);
                }
        }
    }
}


