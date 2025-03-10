public class Econo extends Carro {
     public Econo() {
        super("Econo", TipoCombustivel.GASOLINA, 20, 55);
    }

    @Override
    public boolean viaja(int distancia) {
        int reducoes = (getQuilometragem() + distancia) / 5000;
        double novoConsumo = Math.max(20 - reducoes, 10);
        return super.viaja(distancia, novoConsumo);
    }
}