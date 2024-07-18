import java.util.Scanner;

public class Banco {
    public static void main (String[] args){
        Scanner ler = new Scanner(System.in);
        double add = 0;
        double saldo = 5000;
        int opcao = 0 ;
        double trasferencia=0;
        System.out.printf("""
                ****************************************************
                nome do Clinte : Pedri 
                tipo de conta : corrente 
                saldo : %.2f
                *****************************************************
                """, saldo);
        int vasco = 0;
        while(vasco != -1){
            System.out.printf("""
                ****************************************************
                1-Consultar Saldo
                2-Receber Valor
                3-Trasferir valor
                4-sair
                *****************************************************%n1
                
               
                """);
            opcao = ler.nextInt();
            if (opcao == 1){
                System.out.printf("Seu saldo é %.2f%n",saldo);
            } else if (opcao == 2) {
                System.out.printf("quanto vai receber ?%n");
                add = ler.nextDouble();
                saldo += add;
                System.out.printf("novo saldo é %.2f%n",saldo);

            } else if (opcao == 3) {
                System.out.printf("Quanto vai trasferir %n");
                trasferencia = ler.nextDouble();
                if (saldo < trasferencia) {
                    System.out.printf("nao é possivel trasferir %n");
                }else {
                    System.out.printf("trasferencai feita%n");
                    saldo -= trasferencia;
                    System.out.printf("novo saldo é %.2f%n",saldo);

                }


            }else if (opcao == 4){
                System.out.printf("saindo......%n");
                vasco = -1;
            }else {
                System.out.printf("numero invalido%n");
            }


        }





    }
}
