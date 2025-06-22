import java.util.Scanner;

public class DiasNoMes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o nome ou número do mês: ");
        String entrada = input.nextLine().trim().toLowerCase();

        int mes = 0;

        
        try {
            mes = Integer.parseInt(entrada);
        } catch (NumberFormatException e) {
            
            switch (entrada) {
                case "janeiro": mes = 1; break;
                case "fevereiro": mes = 2; break;
                case "março": mes = 3; break;
                case "marco": mes = 3; break; 
                case "abril": mes = 4; break;
                case "maio": mes = 5; break;
                case "junho": mes = 6; break;
                case "julho": mes = 7; break;
                case "agosto": mes = 8; break;
                case "setembro": mes = 9; break;
                case "outubro": mes = 10; break;
                case "novembro": mes = 11; break;
                case "dezembro": mes = 12; break;
                default:
                    System.out.println("Mês inválido!");
                    input.close();
                    return;
            }
        }

        int dias;

        switch (mes) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                dias = 31;
                break;
            case 4: case 6: case 9: case 11:
                dias = 30;
                break;
            case 2:
                System.out.print("Digite o ano: ");
                int ano = input.nextInt();
                dias = ehBissexto(ano) ? 29 : 28;
                break;
            default:
                System.out.println("Número de mês inválido!");
                input.close();
                return;
        }

        System.out.println("O mês tem " + dias + " dias.");

        input.close();
    }

    
    public static boolean ehBissexto(int ano) {
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }
}