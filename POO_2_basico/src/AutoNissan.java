public class AutoNissan extends Auto {
    boolean bMotorTurboNissan = true;
    double dVelMax = 231;

    public AutoNissan(){
        super.dVelMax = 230;
        super.dPesoBruto = 6000;
        super.sNombre =" Nissan ";
        System.out.println("Hola desde el constructor peso bruto de "+dPesoBruto);
    }
    void bTieneMotorTurbo(){
        if (this.bMotorTurboNissan){
            System.out.println("Tiene motor turbo Nissan ");
        }else {
            System.out.println("No tiene motor turbo Nissan ");
        }
    }
}
