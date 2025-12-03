public class Metodos {

    // Validacion del peso
    public static boolean validarPeso(double peso)
    {
        if (peso > 0 && peso <= 50)
        {
            return true;
        }

        else
        {
            return false;
        }
    }


    // Calculo de la tarifa
    public static double calcularTarifaBase(double peso)
    {
        double tarifa = 0;

        if (peso > 0 && peso <= 1)
        {
            tarifa = 5;
        }

        else if (peso > 1 && peso <= 5)
        {
            tarifa = 10;
        }

        else if (peso > 5 && peso <= 20)
        {
            tarifa = 20;
        }

        else if (peso > 20 && peso <= 50)
        {
            tarifa = 50;
        }

        return tarifa;
    }


    // Calculo recargo x distancia
    public static double calcularRecargoDistancia(int km)
    {
        double recargo = 0;

        if (km < 10)
        {
            recargo = 0;
        }

        else if (km >= 10 && km < 50)
        {
            recargo = 5;
        }

        else if (km >= 50 && km < 200)
        {
            recargo = 15;
        }

        else if (km >= 200)
        {
            recargo = 30;
        }

        return recargo;
    }


    // Calculo recargo tipo de envio
    public static double calcularRecargoTipo(String tipo)
    {
        double recargo = -1;

        if (tipo.equalsIgnoreCase("normal"))
        {
            recargo = 0;
        }

        else if (tipo.equalsIgnoreCase("express"))
        {
            recargo = 15;
        }

        else if (tipo.equalsIgnoreCase("prioritario"))
        {
            recargo = 30;
        }

        return recargo;
    }


    // Resumen
    public static String generarResumen(double peso, int distancia, String tipo)
    {
        double tarifaBase = calcularTarifaBase(peso);
        double recargoDistancia = calcularRecargoDistancia(distancia);
        double recargoTipo = calcularRecargoTipo(tipo);
        double total = tarifaBase + recargoDistancia + recargoTipo;

        String linea = "";
        for (int i = 0; i < 40; i++)
        {
            linea = linea + "-";
        }

        // Armar el resumen
        String resumen = "\n" + linea + "\n";
        resumen = resumen + "RESUMEN DEL ENVIO\n";
        resumen = resumen + linea + "\n";
        resumen = resumen + "Peso: " + peso + " kg\n";
        resumen = resumen + "Distancia: " + distancia + " km\n";
        resumen = resumen + "Tipo: " + tipo + "\n";
        resumen = resumen + linea + "\n";
        resumen = resumen + "Tarifa base es de: $" + tarifaBase + "\n";
        resumen = resumen + "Recargo por distancia es de: $" + recargoDistancia + "\n";
        resumen = resumen + "Recargo por tipo es de: $" + recargoTipo + "\n";
        resumen = resumen + linea + "\n";
        resumen = resumen + "Total de: $" + total + "\n";
        resumen = resumen + linea + "\n";

        return resumen;
    }
}
