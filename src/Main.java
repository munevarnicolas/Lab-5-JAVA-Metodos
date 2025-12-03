import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        // Solicitar el peso
        double peso = 0;
        boolean pesoValido = false;

        do
        {
            System.out.print("Ingresa el peso del paquete (kg): ");
            peso = scanner.nextDouble();

            pesoValido = Metodos.validarPeso(peso);

            if (!pesoValido)
            {
                System.out.println("Peso invalido, este debe ser mayor a 0 y menor o igual a 50 kg.");
            }

        }

        while (!pesoValido);


        // Solicitar la distancia
        int distancia = 0;

        do
        {
            System.out.print("Ingrese la distancia de entrega en km): ");
            distancia = scanner.nextInt();

            if (distancia <= 0)
            {
                System.out.println("La distancia debe ser mayor a 0 km.");
            }

        }

        while (distancia <= 0);


        // Solicitar el tipo de envio
        scanner.nextLine();
        String tipo = "";
        double recargoTipo = -1;

        do
        {
            System.out.print("Ingrese el tipo de envio (normal/express/prioritario): ");
            tipo = scanner.nextLine();

            recargoTipo = Metodos.calcularRecargoTipo(tipo);

            if (recargoTipo == -1)
            {
                System.out.println("Tipo invalido, el envio debe ser normal, express o prioritario.");
            }

        }

        while (recargoTipo == -1);

        String resumen = Metodos.generarResumen(peso, distancia, tipo);
        System.out.println(resumen);
    }
}