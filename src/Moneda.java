import java.util.Map;

public record Moneda(String base_code,
                     String target_code,
                     Double conversion_rate) {

    @Override
    public String toString() {
        return "\n*************************************" +
                "\nDivisa base: " + base_code +
                "\nDivisa objetivo: " + target_code +
                "\nTasa de conversión: " + conversion_rate +
                "\n";
    }
}
