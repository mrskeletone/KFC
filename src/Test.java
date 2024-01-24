import java.util.Scanner;

public class Test {
    public static double diamBaka=5,visotaBaka=25,plotnosty=1000,vyzkozt=123,radiuspokryt=2;
    public static void main(String[] args) {
//        Scanner sc =new Scanner(System.in);
//        System.out.print("Введите диаметр бака:");
//        diamBaka=sc.nextDouble();
//        System.out.print("Введите высоту бака:");
//        visotaBaka=sc.nextDouble();
//        System.out.print("Введите плотность жидкости:");
//        plotnosty=sc.nextDouble();
//        System.out.print("Введите вяскозть жидкости:");
//        vyzkozt=sc.nextDouble();
//        System.out.print("Введите радиус покрытия:");
//        radiuspokryt=sc.nextDouble();
        double davlenieSopla=plotnosty*10*visotaBaka;
        double speedNozzle=Math.sqrt(2*davlenieSopla/plotnosty);
        //[ R = \frac{{V_0 \cdot \sin(\theta)}}{{\sqrt{\frac{g}{{\rho}}}}} ]
        double d=0.25*Math.sqrt(diamBaka/visotaBaka);
        double A=Math.PI*Math.pow(d,2)/4;
        double q=A*speedNozzle;
        //  int N=(int) Math.ceil()
        int N= (int) Math.ceil(Math.pow(diamBaka/radiuspokryt,2));

        double angle=Math.toDegrees(Math.toRadians(360)/N);
        double h=radiuspokryt*Math.cos(Math.toRadians(angle));
        System.out.println(String.format("Количество сопел= %d\nДиаметр сопла = %.4f \nУгол сопла = %.2f \nДавление сопла=%.2f\n" +
                        "Расход жидкости = %.4f ",N,d,angle,davlenieSopla,q));
        System.out.println(String.format("Высота=%.2f",h));
    }
}
