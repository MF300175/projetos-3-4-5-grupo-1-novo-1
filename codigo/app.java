
import java.util.Scanner;

public class app {

    public static void main(String[] args) throws Exception {
        Scanner obj = new Scanner(System.in);
        Frota virtual = new Frota();

        String opcao = "";

        opcao = menu(opcao);

        while (opcao != "F") {

            switch (opcao) {

                case "1":
                    String localPadraoCarregar = "C:/FROTA/Veiculos_ler.txt";

                    System.out.println("Carregar um conjunto de veículos de um arquivo:\n");
                    System.out.println("Carregando lista de livros em: " + localPadraoCarregar);
                    // virtual.carregarVeiculosArquivo(localPadraoCarregar, virtual);
                    // virtual.imprimeVeiculosFrota();

                    opcao = menu(opcao);
                    break;
                case "2":
                    String localPadraoSalvar = "C:/FROTA/ListaVeiculosSalvos.txt";
                    System.out.println("Salvar um conjunto de veículos em um arquivo:\n");
                    System.out.println("conjunto de veículos:" + localPadraoSalvar);

                    // virtual.salvaVeiculosFrota(localPadraoSalvar);
                    opcao = menu(opcao);
                    break;

                case "3":
                    System.out.println("Incluir um novo veículo:\n");
                    System.out.println("\nEntre com um veiculo para incluir:");
                    String veiculoIncluir = obj.nextLine().toUpperCase();
                    // Frota.incluirVeiculo(veiculoIncluir);
                    opcao = menu(opcao);

                    break;

                case "4":

                    System.out.println("Incluir rotas para um veículo:\n");
                    System.out.println("\nEntre com uma rota para icluir:");
                    String rotaIncluir = obj.nextLine().toUpperCase();
                    // Frota.incluirRota(rotaIncluir);
                    opcao = menu(opcao);

                    break;

                case "5":

                    System.out.println("Localizar um veículo da frota.\n");
                    System.out.println("\nEntre com veiculo para localizar:\n");
                    String localizarVeiculo = obj.nextLine().toUpperCase();
                    // Veiculo vendido = virtual.retornaVeiculo(localizarVeiculo);
                    opcao = menu(opcao);

                    break;
                case "6":

                    System.out.println("Imprimir um relatório do veículo com seus gastos até o momento.\n");
//                    virtual.exibirGastosVeiculo();
                    System.out.println("\nEntre co veiculo para imrpimir gastos:");
                    int imorimirVeiculo = obj.nextInt();
                    // virtual.imprimirVeiculo(imorimirVeiculo);
                    opcao = menu(opcao);
                    break;

                case "F":

                    System.out.println("Finalizado!");
                    opcao = "F";
                    break;

                default:
                    System.out.println("opção invalida!");
                    opcao = menu(opcao);
                    break;
            }
        }
        obj.close();
    }

    public static String menu(String opc) {
        Scanner objt = new Scanner(System.in);

        System.out.println("\n\nLIVRARIA LOJA VIRTUAL:\n");
        System.out.println("1 -  Carregar um conjunto de veículos de um arquivo.");
        System.out.println("2 -  Salvar um conjunto de veículos em um arquivo.");
        System.out.println("3 -  Incluir um novo veículo.");
        System.out.println("4 -  Incluir rotas para um veículo.");
        System.out.println("5 -  Localizar um veículo da frota.");
        System.out.println("6 -  Imprimir um relatório do veículo com seus gastos até o momento.");

        System.out.println("\nEntre com o número correspondente à função ou 'f' para finalizar:\n");
        opc = objt.nextLine().toUpperCase();
        // objt.close();
        return opc;
    }
}