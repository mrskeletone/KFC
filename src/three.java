
public class three {
    public static double D=5,H=25,plotnosty=1000;

    public static void main(String[] args) {
        //D = √((4*A)/π)
        //D = (√((P - Pa) / ρ) * V)
        double nozzleDiameter = 0.65*Math.sqrt(D/H);
        double g=9.8;
        double P=plotnosty*g*H;
        double v=Math.sqrt((2*(P-Math.pow(10,5)))/plotnosty);
        int N=(int)Math.ceil((Math.PI*H)/(nozzleDiameter*0.3*H));
        double h=H-0.3*D;
        double angle=Math.atan(h/(D/2));
        double Q=(N*Math.PI*Math.pow(nozzleDiameter,2)*v)/4;
        System.out.println(String.format("d=%.4f\nP=%.4f\nv=%.4f\nN=%d\nh=%.4f\nangle=%.4f\nQ=%.4f",nozzleDiameter,P,v,N,H-h,angle,Q));
    }
}
