public class Main {
    public static void main(String [] args){
        // crear una instancia
        AutoNissan miAutoNiss = new AutoNissan();
        miAutoNiss.iniciarMarcha();
        miAutoNiss.acelerarMaximo();
        miAutoNiss.bTieneMotorTurbo();

        AutoToyota miAutoTo = new AutoToyota();
        miAutoTo.iniciarMarcha();
        miAutoTo.acelerarMaximo();
        /*
        Auto miAuto = new Auto();
        miAuto.iniciarMarcha();
        miAuto.acelerarMaximo();
         */
    }
}
