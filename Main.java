import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        Conta banco = new Conta();
        //double saldoAtual = banco.getSaldo();
       
        System.out.println("Deseja criar uma conta?");
        System.out.println("1 - Sim!");
        System.out.println("2 - Não!");
        int opcao = scanner.nextInt();
        scanner.nextLine();
            if(opcao == 1){
                banco.abrirConta();
            
          
           System.out.println("Digite o nome do titular: ");
            
            //scanner.nextLine(); //testes meu
           String titularDaConta = scanner.nextLine();
           banco.setdonoNome(titularDaConta);
            

        
                System.out.println("Escolha o tipo de conta: ");
                System.out.println("1 - Conta Corrente");
                System.out.println("2 - Conta Poupança");
                int opcao2 = scanner.nextInt();

                    if(opcao2 == 1){
                    
                    System.out.println("Certo! Você receberá mais R$50,00 de bônus!"); 
                    
                    //saldoAtual += 50;
                    banco.setSaldo(50);
                    banco.contaCorrente();
                }
                else{
                //System.out.println("Okay! Vamos começar!");
                banco.contaPoupanca();
                }
            
            System.out.println("Sua conta esta ativa agora!");
            //System.out.print(banco.status);
            banco.abrirConta();

            System.out.println("Comece a navegar");
            System.out.println("--------------------");
            System.out.println("\n"); //criar o menu
            System.out.println("\n");
            System.out.println("testando");//teste funcionou para melhor visibilidade do menu. Não esqueça de usar SwitchCase na hora do menu
            System.out.println("\n");
            System.out.println("\n");
            System.out.println("Funcionou?");


        }
        else{
            System.out.println("Então adeus!");
            banco.fecharConta(); //possivel alteração para outra função depois
        }

    }      
}
