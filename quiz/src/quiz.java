import java.util.Scanner;

public class quiz {
    
    public static double calcularPesoIdeal(double estatura) {
        if (estatura < 1.0) {
            return -1; // Caso inválido
        }
        return (estatura * 100) - 110;
    }
    
    public static double calcularSobrepeso(double estatura, double pesoActual) {
        double pesoIdeal = calcularPesoIdeal(estatura);
        if (pesoIdeal == -1) {
            return -1; 
        }
        double sobrePeso = pesoActual - pesoIdeal;
        
        if (sobrePeso > 0) {
            return sobrePeso;
        } else {
            return 0; // 
        }
    }
        
    public static double calcularCaloriasQuemar(double sobrePeso) {
        return sobrePeso * 3500;
    }   

    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);

        System.out.print("Digite su peso actual (kg): ");
        double pesoActual = r.nextDouble();

        System.out.print("Digite su estatura actual (m): ");
        double estaturaActual = r.nextDouble();

        System.out.print("Ingrese el número de sesiones de aeróbicos por semana: ");
        double sesionesPorSemana = r.nextDouble();

        double pesoIdeal = calcularPesoIdeal(estaturaActual);
        if (pesoIdeal == -1) {
            System.out.println("Acuda a su médico para más información.");
            
        }

        System.out.println("El peso ideal es: " + pesoIdeal + " kg");

        double sobrePeso = calcularSobrepeso(estaturaActual, pesoActual);
        if (sobrePeso == 0) {
            System.out.println("¡Felicitaciones! No tienes sobrepeso.");
            
        }

        System.out.println("Tienes " + sobrePeso + " kg por encima del peso ideal.");

        double caloriasBajar = calcularCaloriasQuemar(sobrePeso);
        double caloriasPorSesion = (450 * 45) / 60.0; 
        double caloriasSemana = caloriasPorSesion * sesionesPorSemana;

        System.out.println("Debes bajar " + caloriasBajar + " calorías.");
        System.out.println("Cada semana quemas " + caloriasSemana + " calorías.");

        if (caloriasSemana == 0) {
            System.out.println("Si no realizas ejercicio, no bajarás de peso.");
        } else {
            double semanasParaBajar = caloriasBajar / caloriasSemana;
            System.out.println("te demorará proximadamente " + semanasParaBajar + " semanas en alcanzar tu peso ideal.");
        }

        r.close();
    }
}



