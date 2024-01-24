public class avtomat {
    public static double diamBaka=5,visotaBaka=25,plotnosty=1000,vyzkozt=123,radiuspokryt=2;

    public static void main(String[] args) {
        double d=0.25*Math.sqrt(diamBaka/visotaBaka);
        //  double d=2;
        double A=Math.PI*Math.pow(diamBaka/2,2);
        d=Math.sqrt((4*A)/Math.PI);
        int N=(int) Math.ceil(A/(Math.PI*Math.pow(d/2,2)));
        double angle=Math.atan(visotaBaka/(2*d/2));
        double H0=visotaBaka/2-d/2*Math.cos(angle);
        double p=plotnosty*10*H0;
        double speedNozzle=Math.sqrt(2*p/plotnosty);
        double Q=A*speedNozzle;


        System.out.println(String.format("Количество сопел= %d\nДиаметр сопла = %.4f \nУгол сопла = %.2f \nДавление сопла=%.2f\n" +
                "Расход жидкости = %.4f\nВысота сопел=%.4f ",N,d,angle,p,Q,H0));
    }
}
