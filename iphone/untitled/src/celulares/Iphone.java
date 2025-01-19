package celulares;

import interfaces.AparelhoTelefonico;
import interfaces.NavegadorInternet;
import interfaces.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

    //atributos
    private string modelo;
    private string cor;
    private integer memoriaRam;
    private integer armazenamento;

    public Iphone(string modelo, string cor, integer memoriaRam, integer armazenamento) {
        this.modelo = modelo;
        this.cor = cor;
        this.memoriaRam = memoriaRam;
        this.armazenamento = armazenamento;
    }

    public string getModelo() {
        return modelo;
    }

    public string getCor() {
        return cor;
    }

    public integer getMemoriaRam() {
        return memoriaRam;
    }

    public integer getArmazenamento() {
        return armazenamento;
    }

    @java.lang.Override
    public void ligar(String numero) {

    }

    @java.lang.Override
    public void atender() {

    }

    @java.lang.Override
    public void iniciarCorreioVoz() {

    }

    @java.lang.Override
    public void exibirPagina(String url) {

    }

    @java.lang.Override
    public void adicionarNovaAba() {

    }

    @java.lang.Override
    public void atualizarPagina() {

    }

    @java.lang.Override
    public void tocar() {

    }

    @java.lang.Override
    public void pausar() {

    }

    @java.lang.Override
    public void selecionarMusica(String musica) {

    }
}
