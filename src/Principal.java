import java.util.Scanner;
import java.util.InputMismatchException;

public class Principal {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        String menu = "****************************************\n" +
                "¡Bienvenido al conversor de divisas! \n\n" +
                "1) Dólar -> Peso argentino\n" +
                "2) Peso argentino -> Dólar\n" +
                "3) Dólar -> Real brasileño\n" +
                "4) Real brasileño -> Dólar\n" +
                "5) Dólar -> Peso colombiano\n" +
                "6) Peso colombiano -> Dólar\n" +
                "7) Dólar -> Peso mexicano\n" +
                "8) Peso mexicano -> Dólar\n" +
                "9) Salir\n" +
                "\n" +
                "Ingresa la divisa a intercambiar: ";

        Consulta consulta = new Consulta();
        int opcion = 0;

        try{
            while (opcion != 9){
                System.out.print(menu);
                opcion = leer.nextInt();
                String divisaBase = "", divisObjetivo = "";
                boolean bandera = false;
                switch (opcion){
                    case 1:
                            divisaBase = "usd"; divisObjetivo = "ars";
                        break;
                    case 2:
                        divisaBase = "ars"; divisObjetivo = "usd";
                        break;
                    case 3:
                        divisaBase = "usd"; divisObjetivo = "brl";
                        break;
                    case 4:
                        divisaBase = "brl"; divisObjetivo = "usd";
                        break;
                    case 5:
                        divisaBase = "usd"; divisObjetivo = "cop";
                        break;
                    case 6:
                        divisaBase = "cop"; divisObjetivo = "usd";
                        break;
                    case 7:
                        divisaBase = "usd"; divisObjetivo = "mxn";
                        break;
                    case 8:
                        divisaBase = "mxn"; divisObjetivo = "usd";
                        break;
                    case 9:
                        System.out.println("Gracias por usar el sistema.\n" +
                                "¡Hasta pronto!");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("\nERROR. Ingrese una opción valida\n");
                        bandera = true;
                        break;

                }
                if (!bandera) {
                    Moneda moneda = consulta.conversion(divisaBase, divisObjetivo);
                    System.out.println(moneda);
                }
            }
        }catch (InputMismatchException  e){
            System.out.println("Error. Ingrese solo números.");
        }
    }
}
