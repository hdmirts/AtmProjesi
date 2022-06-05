import java.util.Scanner;
public class atm {
    public static void main(String[] args){
        String userName, password;
        Scanner input = new Scanner(System.in);
        int right = 3;
        double balance = 1500;
        double price;
        int select;
        
        while(right > 0){
            System.out.print("Kullanıcı Adını Girin :");
            userName = input.nextLine();

            System.out.print("Parolanız :");
            password = input.nextLine();

            if((userName.equals("patika") && (password.equals("dev123")) ))  {
                System.out.println("Merhaba, Kodluyoruz Bankasına Hoşgeldiniz\n Lütfen Yapmak İstediğiniz İşlemi Seçin :");
                do {
                    
                    System.out.println("Yapmak istediğiniz işlemi seçiniz :\n" + "1-Para Yatırma\n"+"2-Para Çekme\n"+"3-Bakiye Sorgula\n"+"4-Çıkış Yap");
                    select = input.nextInt();

                    switch (select) {
                        case 1:
                        System.out.print("Yatıracağınız tutar:");
                        price = input.nextDouble();
                        balance += price;
                        break;

                        case 2:
                        System.out.print("Çekeceğiniz tutar :");
                        price = input.nextDouble();
                        if(price > balance){
                            System.out.println("Yetersiz Bakiye");
                        } else {
                            System.out.println("Kalan tutar :" + (balance -=price));
                            
                        }
                        break;

                        case 3:
                        System.out.println("Bakiyeniz :" + balance);
                        break;
                    }

                } while(select !=4);
                System.out.println("Görüşmek üzere");
                break;
                
            }else {
                right--;
                System.out.println("Kullanıcı adı veya şifre hatalı. Lütfen Tekrar Deneyin");
                if(right == 0) {
                    System.out.println("Hesabınız bloke edildi. Banka ile iletişime geçiniz.");

                } else {
                    System.out.println("Kalan Hakkınız :" + right);
                }
            }
        }
    }
    
}
