package cuentas;

// JOSE LUIS IZQUIERDO, PRIMERA PRUEBA GITHUB

public class Main {

    public static void main(String[] args) {
        CCuenta cuenta1;
		operativa_metodo(0);
        double saldoActual;
        
        cuenta1 = new CCuenta("Antonio L�pez","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );
        System.out.println("Saldo generado autom�ticamente" );

        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }

	private static void operativa_metodo(float cantidad) {
		CCuenta cuenta1;
	}
}
