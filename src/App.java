public class App {
    public static void main(String[] args) throws Exception {

        Carro basico = new Carro("Basico", TipoCombustivel.GASOLINA, 10, 55);
        Carro esportivo = new Esportivo("Esportivo", TipoCombustivel.GASOLINA, 6, 45);
        Carro utilitario = new Utilitario("Utilitario", TipoCombustivel.DIESEL, 5, 70);
        Carro suv = new SUV("SUV", TipoCombustivel.FLEX, 8, 55);

        Carro SuvFlex = new SUVFlex();

        Carro econo = new Econo();


        System.out.println("Tipos de veiculos:");
        System.out.println(basico);
        System.out.println(esportivo);
        System.out.println(utilitario);
        System.out.println(econo);
        System.out.println(suv);
        System.out.println(SuvFlex);
       
        System.out.println("\n\n----------------");
        System.out.println("\nAbastencendo carro basico com gasolina");
        basico.abastece(TipoCombustivel.GASOLINA, 55);
        System.out.println(basico);
        System.out.println("\nViajando com o carro basico");
        basico.viaja(250);
        basico.viaja(150);
        System.out.println(basico);
      
        System.out.println("\n\n----------------");
        System.out.println("\nAbastencendo carro esportivo com gasolina");
        esportivo.abastece(TipoCombustivel.GASOLINA, 45);
        System.out.println(esportivo);
        System.out.println("\nViajando com o carro esportivo");
        esportivo.viaja(120);
        System.out.println(esportivo);

        System.out.println("\n\n----------------");
        System.out.println("\nAbastencendo carro utilitario com gasolina");
        utilitario.abastece(TipoCombustivel.DIESEL, 70);
        System.out.println(utilitario);
        System.out.println("\nViajando com o carro utilitario");
        utilitario.viaja(300);
        utilitario.viaja(150);
        System.out.println(utilitario);
      
        System.out.println("\nAbastencendo carro suv com gasolina");
        suv.abastece(TipoCombustivel.FLEX, 55);
        System.out.println(suv);
        System.out.println("\nViajando com o carro suv");
        suv.viaja(240);
        System.out.println(suv);

        System.out.println("\n\n----------------");
        System.out.println("\nAbastencendo carro SUVFlex com gasolina");
        SuvFlex.abastece(TipoCombustivel.GASOLINA, 65);
        System.out.println(SuvFlex);
        System.out.println("\nAbastencendo carro SUVFlex com alcool");
        SuvFlex.abastece(TipoCombustivel.ALCOOL, 65);
        System.out.println(SuvFlex);
        System.out.println("\nViajando com o carro SuvFlex");
        SuvFlex.viaja(200);
        System.out.println(SuvFlex);

        System.out.println("\nAbastencendo carro econo com gasolina");
        econo.abastece(TipoCombustivel.GASOLINA, 55);
        System.out.println(econo);
        System.out.println("\nViajando com o carro econo");
        econo.viaja(3000);
        econo.viaja(10000);
       

    }
}
