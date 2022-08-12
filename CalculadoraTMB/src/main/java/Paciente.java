/**
 *Essa classe  representa um Paciente
 */

public class Paciente {

    private String nome;
    private int idade;
    private int altura;
    private int peso;
    private String profissao;
    private double tbm;

    private int quantidadeTreinos=0;
    private int gastoCalorico1=0;
    private int gastoCalorico2=0;
    private int gastoCalorico3=0;
    private int gastoCalorico4=0;
    int media =0;

    public String calculaGastoMedio(){

        if(this.quantidadeTreinos < 1 || quantidadeTreinos<5){
            media = (gastoCalorico1+gastoCalorico2+gastoCalorico3+gastoCalorico4)/quantidadeTreinos;
            return  "Media de gasto por treino = "+media;
        }
        return "Ocorreu um erro";

    }

    public double calculaGastoDiario(int media, double tbm){
        return media + tbm;
    }


    public double calculaTbm(int peso,int altura,int idade){
        return  tbm = (10 * peso+( 6.25 * altura)-(5 * idade));

    }

    public int getQuantidadeTreinos() {
        return quantidadeTreinos;
    }

    public void setQuantidadeTreinos(int quantidadeTreinos) {
        this.quantidadeTreinos = quantidadeTreinos;
    }

    public int getGastoCalorico1() {
        return gastoCalorico1;
    }

    public void setGastoCalorico1(int gastoCalorico1) {
        this.gastoCalorico1 = gastoCalorico1;
    }

    public int getGastoCalorico2() {
        return gastoCalorico2;
    }

    public void setGastoCalorico2(int gastoCalorico2) {
        this.gastoCalorico2 = gastoCalorico2;
    }

    public int getGastoCalorico3() {
        return gastoCalorico3;
    }

    public int getMedia() {
        return media;
    }

    public void setMedia(int media) {
        this.media = media;
    }

    public void setGastoCalorico3(int gastoCalorico3) {
        this.gastoCalorico3 = gastoCalorico3;
    }

    public int getGastoCalorico4() {
        return gastoCalorico4;
    }

    public void setGastoCalorico4(int gastoCalorico4) {
        this.gastoCalorico4 = gastoCalorico4;
    }

    public String getTipoTreino() {
        return tipoTreino;
    }

    public void setTipoTreino(String tipoTreino) {
        this.tipoTreino = tipoTreino;
    }

    public int getTreinosPorSemana() {
        return treinosPorSemana;
    }

    public void setTreinosPorSemana(int treinosPorSemana) {
        this.treinosPorSemana = treinosPorSemana;
    }

    private String tipoTreino;
    private int treinosPorSemana;

    public String getNome() {
        return nome;
    }

    public double getTbm() {
        return tbm;
    }

    public void setTbm(double tbm) {
        this.tbm = tbm;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getidade() {
        return idade;
    }

    public void setidade(int idade) {
        this.idade = idade;
    }

    public int getaltura() {
        return altura;
    }

    public void setaltura(int altura) {
        this.altura = altura;
    }

    public int getPeso() {
        return peso;
    }

    public void setpeso(int peso) {
        this.peso = peso;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setprofisao(String profissao) {
        this.profissao = profissao;
    }
}
