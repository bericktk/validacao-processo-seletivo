package candidatura;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        selecaoCandidatos();
    }

    static void selecaoCandidatos(){
        String [] candidatos = {"Felipe", "João", "Maria", "José", "Ana"};

        int candidatosSelecionados = 0;
        int candidatosAtuais = 0;
        double salarioBase = 2000.0;
        while (candidatosSelecionados < 5) {
            String candidato = candidatos[candidatosAtuais];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " Solicitou este valor de salário:" + salarioPretendido);
            if(salarioBase >= salarioPretendido){
                System.out.println("O Candidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecionados++;
            }
            candidatosAtuais++;
        }
    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;

        if(salarioBase > salarioPretendido){
            System.out.println("Ligar para o candidato");
            
        }else if(salarioBase == salarioPretendido){

           System.out.println("Ligar para o candidato com contra proposta");

        }else{

           System.out.println("Aguardando resultado demais candidatos");

        }
    }
}
