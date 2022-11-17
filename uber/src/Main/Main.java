package Main;

import entidades.*;
import servicos.CarroServico;
import servicos.CorridaServico;
import servicos.MotoristaServico;
import servicos.PassageiroServico;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	
        CorridaServico corridaServico = new CorridaServico();
        MotoristaServico motoristaServico = new MotoristaServico();
        PassageiroServico passageiroServico = new PassageiroServico();

        Carro carro1 = new Carro("ford", "qwe123");
        Motorista motorista1 = new Motorista("agostinho carrara", "789789789");
        motoristaServico.adicionarMotorista(motorista1);
        Corrida corrida1 = new Corrida(motorista1, carro1);
        corridaServico.adicionarCorrida(corrida1);


        Carro carro2 = new Carro("fiat", "qwe234");
        Motorista motorista2 = new Motorista("ze tonhao", "789789789");
        motoristaServico.adicionarMotorista(motorista2);
        Corrida corrida2 = new Corrida(motorista2, carro2);
        corridaServico.adicionarCorrida(corrida2);


        Carro carro3 = new Carro("chevrolet", "qwe543");
        Motorista motorista3 = new Motorista("ronaldo fenomeno", "789789789");
        motoristaServico.adicionarMotorista(motorista3);
        Corrida corrida3 = new Corrida(motorista3, carro3);
        corridaServico.adicionarCorrida(corrida3);
        
                
        
       /*  Carro carro4 = new Carro("teste", "qwe543");  add carro/ motorista junto
        Motorista motorista4 = new Motorista("test", "789789789");
        motoristaServico.adicionarMotorista(motorista4);
        Corrida corrida4 = new Corrida(motorista4, carro4);
        corridaServico.adicionarCorrida(corrida4); */

        Passageiro passageiro1 = new Passageiro("Lucas", "111111");
        passageiroServico.adicionarPassageiro(passageiro1);
        Passageiro passageiro2 = new Passageiro("junior", "222222");
        passageiroServico.adicionarPassageiro(passageiro2);
        Passageiro passageiro3 = new Passageiro("henrique", "333333");
        passageiroServico.adicionarPassageiro(passageiro3);
        Passageiro passageiro4 = new Passageiro("tathy", "444444");
        passageiroServico.adicionarPassageiro(passageiro4);
     

        // vamos simular o sistema tendo varias corridas em aberto para o usuario selecionar
        // vamos tambem deixar varios passageiros cadastrados no sistema

        //primeiro, exibimos a lista de usuarios no sistema, e perguntamos quem está procurando uma corrida;

        System.out.println("\n");
        System.out.println("======================================= 1 ======================================");
        System.out.println("Bem-vindo ao Uber. Digite o seu cpf para prosseguir com a  corrida:");
        System.out.println("================================================================================");
        System.out.println(passageiroServico.listarPassageiros());
        System.out.println("================================================================================");

        Scanner sc = new Scanner(System.in);// scanner é o que ler para identificar o passageiro
        Passageiro passageiroEncontrado;
        System.out.println("CPF: ");

        String cpf = sc.nextLine();
        passageiroEncontrado = passageiroServico.procurarPassageiro(cpf);

        if (passageiroEncontrado == null) {
            System.out.println("cpf nao encontrado");
        } else {
            System.out.println("\n");
            System.out.println("Passageiro encontrado:");
            System.out.println(passageiroEncontrado);
            System.out.println("\n");
            System.out.println("======================================= 2 ======================================");
            System.out.println("Agora, escolha uma dos motoristas disponiveis:\n");
            System.out.println(corridaServico.listarCorridasDisponiveis());
            System.out.println("codigo da corrida: ");

            Corrida corridaEncontrada;

            int codigoCorrida = Integer.parseInt(sc.nextLine());
            corridaEncontrada = corridaServico.procurarCorrida(codigoCorrida);

            if (corridaEncontrada == null) {
                System.out.println("corrida nao encontrada.");
            } else {
                System.out.println("\n");
                System.out.println("Motorista encontrado:");
                System.out.println(corridaEncontrada);
                corridaEncontrada.setPassageiro(passageiroEncontrado); // adiciona o passageiro na corrida;

                System.out.println("======================================= 3 ======================================");
                System.out.println("Digite a origem da corrida:");
                String origem = sc.nextLine();
                corridaEncontrada.setOrigem(origem); // adiciona a origem na corrida;
                System.out.println("Digite o destino da corrida:");
                String destino = sc.nextLine();
                corridaEncontrada.setDestino(destino); // adiciona o destino na corrida;
                System.out.println("Digite o tipo de corrida(se é comum, ou uber black):");
                String tipo = sc.nextLine();
                corridaEncontrada.setTipoCorrida(tipo); // adiciona o tipo de corrida na corrida;

                System.out.println("\nO valor da corrida ficou em 24 reais");

                System.out.println("Qual a forma de pagamento, Dinheiro ou Cartao:");
                String formaPagamento = sc.nextLine();
                Pagamento pagamento = new Pagamento(formaPagamento, 24, corridaEncontrada);

                System.out.println("==================================== Final ======================================");
                System.out.println("Confira os dados da corrida:");
                System.out.println(corridaEncontrada);
                System.out.println("forma de pagamento:");
                System.out.println(pagamento);
                System.out.println("################### Pedido de corrida feito com sucesso #########################");
            }
        }
        sc.close();
    }
}
