
public class TBM {


    public static void main(String[] args) {
    Paciente paciente= new Paciente();
    paciente.setNome("Caio Fressatti");
    paciente.setidade(22);
    paciente.setaltura(165);
    paciente.setpeso(75);
    //calcula TBM
    paciente.calculaTbm(paciente.getPeso(),paciente.getaltura(),paciente.getidade());
    // Calcula Gasto Treino
    paciente.setQuantidadeTreinos(3);
    paciente.setGastoCalorico1(257);
    paciente.setGastoCalorico2(54);
    paciente.setGastoCalorico3(845);
    paciente.setGastoCalorico4(0);







    System.out.println("Paciente: " + paciente.getNome()+"\nidade: "
            + paciente.getidade() + "\naltura/peso: " +paciente.getaltura()+"/" + paciente.getPeso() + " KG, cm");
        System.out.println("Taxa Metabolica Basal "+ paciente.getTbm()+ " Kcal");
        System.out.println(paciente.calculaGastoMedio());
        System.out.println(paciente.calculaGastoDiario(paciente.getMedia(),paciente.getTbm()) + " Kcal Total");
    }
}
    //Como Calcular Taxa Metabólica Basal (TMB) para HOMENS:

    //TMB (métrica) = (10 × peso em kg) + (6,25 × altura em cm) - (5 × idade em anos) + 5

