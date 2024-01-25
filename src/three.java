
public class three {
    public static double diamBaka=5,visotaBaka=25,plotnosty=1000;

    public static void main(String[] args) {
        double nozzleDiameter = 0.65*Math.sqrt(diamBaka/visotaBaka);
        double P=plotnosty*10*visotaBaka;
        double v=Math.sqrt((2*(P-Math.pow(10,5)))/plotnosty);
        int N=(int)Math.ceil((Math.PI*diamBaka)/(nozzleDiameter*0.3*diamBaka));
        double h=visotaBaka-0.3*diamBaka;
        double angle=Math.atan(h/(diamBaka/2));
        double Q=(N*Math.PI*Math.pow(nozzleDiameter,2)*v)/4;
        System.out.println(String.format("d=%.4f\nP=%.4f\nv=%.4f\nN=%d\nh=%.4f\nangle=%.4f\nQ=%.4f",nozzleDiameter,P,v,N,visotaBaka-h,angle,Q));
    }
}
