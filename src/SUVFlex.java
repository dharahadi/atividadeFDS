public class SUVFlex extends Carro() {
    public SUVFlex() {
        super("SUVFlex", TipoCombustivel.FLEX, 8, 65);
    }

    @Override
    public int abastece(TipoCombustivel, tipoCombustivel, int quantidade) {
        if (tipoCombustivel == TipoCombustivel.GASOLINA) {
            motor = new Motor(tipoCombustivel, 8);
        } else if (tipoCombustivel == TipoCombustivel.ALCOOL) {
            motor = new Motor(tipoCombustivel, 6);
        }
        tanque = new TanqueCombustivel(TipoCombustivel.FLEX, 65);
        return super.abastece(tipoCombustivel, quantidade);
    }
}