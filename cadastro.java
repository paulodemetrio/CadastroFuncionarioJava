import java.util.Scanner;
    public class cadastroFuncionario{
        public static void main (String args[]){
            Scanner in = new Scanner (System.in);
            String nome, cargo;
            int id, contador;
            double salario; 
            do{
                System.out.println("Digite [1] para cadastrar um novo funcionário: ");
                System.out.println("Digite [2] para sair: ");
                contador = in.nextInt();
                switch(contador){
                case 1:
                    System.out.println("Digite o id do funcionário: ");
                    id = in.nextInt();
                    System.out.println("Digite o nome do funcionário: ");
                    nome = in.next();
                    System.out.println("Digite o cargo do funcionário: ");
                    cargo = in.next();
                    System.out.println("Digite o salário do funcionário: ");
                    salario = in.nextDouble();
                    System.out.println("************************");
                    System.out.println("Nome: " +nome);
                    System.out.println("Id: " +id);
                    System.out.println("Cargo: " +cargo);
                    System.out.println("Salário reajustado(+15%): " +(salario+(salario*0.15)));
                    System.out.println("************************");
                    break;
                   
                case 2:
                    System.out.println("Sistema encerrado!");
                }
            }while(contador==1);
        }
    }