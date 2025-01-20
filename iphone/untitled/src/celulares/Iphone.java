package celulares;

import interfaces.AparelhoTelefonico;
import interfaces.NavegadorInternet;
import interfaces.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

    //atributos
    private String modelo;
    private String cor;
    private int memoria;

    public Iphone(String modelo, String cor, int memoria) {
        this.modelo = modelo;
        this.cor = cor;
        this.memoria = memoria;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public int memoria() {
        return memoria;
    }



    //implementação do Aparelho telefonico
    @java.lang.Override
    public void ligar(String numero) {
        System.out.println("Ligando para o número " + numero);

    }

    @java.lang.Override
    public void atender() {
        System.out.println("Atendendo...");

    }

    @java.lang.Override
    public void iniciarCorreioVoz() {
        System.out.println("Correio de voz..");

    }

    //implementação do Navegador de Internet

    @java.lang.Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo pagina de url = " +url);

    }

    @java.lang.Override
    public void adicionarNovaAba() {
        System.out.println("Nova Aba!");

    }

    @java.lang.Override
    public void atualizarPagina() {
        System.out.println("Atualizando pagina");

    }

    //implementação do Reprodutor Musical

    @java.lang.Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando a musica " + musica);

    }

    @java.lang.Override
    public void tocar() {
        System.out.println("Tocando....");

    }

    @java.lang.Override
    public void pausar() {
        System.out.println("Pausando a música...");

    }

    @Override
    public String toString() {
        return "Iphone{" +
                "modelo='" + modelo + '\'' +
                ", cor='" + cor + '\'' +
                ", memoria=" + memoria +
                '}';
    }
}
