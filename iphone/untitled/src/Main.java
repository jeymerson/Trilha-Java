import celulares.Iphone;
import celulares.ListaIphone;

public class Main {
    public static void main(String[] args) {

        ListaIphone emLoja = new ListaIphone();

        Iphone celular = new Iphone("Iphone 15", "Branca", 256);
        emLoja.adicionarIphone(celular.getModelo(),celular.getCor(), celular.memoria());
        // ------- Testes
        // - Telefone
        celular.ligar("4002-8922");
        celular.atender();
        celular.iniciarCorreioVoz();
        // - Internet
        celular.exibirPagina("https://web.dio.me/");
        celular.atualizarPagina();
        celular.adicionarNovaAba();
        // - Musica
        celular.selecionarMusica("Admirável novo chip");
        celular.pausar();
        celular.tocar();

        // --- testando List
        emLoja.exibirIphone();


        }
    }
