package candidatura;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        String [] candidatos = {"Felipe", "Marcia", "Julia", "João", "Maria"};
        for(String candidato: candidatos){
            entrandoEmContato(candidato);
        }
    }

    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        
        do{
            atendeu = atender();
            continuarTentando = !atendeu;
            if(continuarTentando){
                tentativasRealizadas++;
            }else{
                System.out.println("Contato Realizado com Sucesso!");
            }
        }while(continuarTentando && tentativasRealizadas < 3);
        
        if(atendeu){
            System.out.println("Conseguimos contato com " + candidato + " Na " + tentativasRealizadas + " tentativa");
        }else{
            System.out.println("Não conseguimos contato com " + candidato + " Após " + tentativasRealizadas + " tentativas");
        }
    }

    static boolean atender(){
        return new Random().nextInt(3)==1;
    }

    static void imprimirSelecionados(){
        String [] candidatos = {"Felipe", "Marcia", "Julia", "João", "Maria"};
        System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");
        for(int indice = 0; indice < candidatos.length; indice++){
            System.out.println("O candidato de numero " + (indice+1) + " é: " + candidatos[indice]);
        }

        System.out.println("Forma abreviada de interação com for each");

        for(String candidato: candidatos){
            System.out.println("O candidato é: " + candidato);
        }
    }

    static void selecaoCandidatos(){
        String [] candidatos = {"Felipe", "João", "Maria", "José", "Ana", "Carlos", "Pedro", "Paulo", "Lucas", "Mariana"};

        int candidatosSelecionados = 0;
        int candidatosAtuais = 0;
        double salarioBase = 2000.0;
        while (candidatosSelecionados < 5 && candidatosAtuais < candidatos.length){
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
