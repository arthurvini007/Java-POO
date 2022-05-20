package classes;

import java.util.Scanner;

public class ProdutoVet {

    public static void main(String[] args, int j) { 
    try (Scanner sc = new Scanner(System.in)) {
        HOTEL h = new HOTEL();
        char resp ;

        System.out.println("Ola , deseja fazer uma reserva S/N");
        resp = sc.next().charAt(0);


        Object[] pousada;
        int i;
        switch (resp) {
            case 'S':
            System.out.println("Ola , vamos la :\n");
            System.out.println("Quantos Quartos voce deseja reservar");
            var tot = sc.nextInt();
            for (i = 0 ; i < tot ; i++) {
                pousada[i] = new Pousada();
                System.out.println("Innforme seu nome:");
                h.setNome(sc.next());
                System.out.println("Innforme seu E-mail para a reserva:");
                h.setEmail(sc.next());
                System.out.println("------------Seus Dados sao --------------");
                System.out.println("Nome:" + h.getNome());
                System.out.println("Email:" + h.getEmail());
            }
        System.out.println("--------------Suas Reservas sao ------------");
        System.out.println("--------------------------------------");
        System.out.printf("%d: \n", +1);
        System.out.println("Nome: " + ((HOTEL) pousada[i]).getNome());
        System.out.println("Email: " + ((HOTEL) pousada[i]).getEmail());
             
            break;
            case 'N':
            System.out.println("OK, obrigado!");
            break;
        }
    }
}
}