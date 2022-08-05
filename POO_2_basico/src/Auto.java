public class Auto {
    int iNroRuedad = 4;
    String sColor = "gris ";
    double dPesoBruto;
    double dVel = 0;
    double dVelMax = 130;
    String sNombre = "";
    void iniciarMarcha (){
        System.out.println("Iniciaste la marcha del auto "+ sNombre +" ......");
    }
    void acelerarMaximo(){
        System.out.println("Mi auto "+ sNombre +" Acelerando hasta...."+this.dVelMax);
    }
    void deteneCompleto(){
        System.out.println("se Detuvo la marcha del auto "+ sNombre +"  ...... ");
    }
    void  ensendidoLuces(boolean bEncender){
        if (bEncender){
            System.out.println("luces Encendidas....");
        }else {
            System.out.println("Luces Apagadas....");
        }
    }
}
