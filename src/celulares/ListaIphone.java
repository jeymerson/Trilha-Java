package celulares;

import java.util.ArrayList;
import java.util.List;

public class ListaIphone {
    List<Iphone> ModelosEmLoja;

    public ListaIphone() {
        ModelosEmLoja = new ArrayList<>();
    }
    public void adicionarIphone(String modelo,String cor,int memoria){
        ModelosEmLoja.add(new Iphone(modelo, cor, memoria));
    }
    public void exibirIphone() {
        System.out.println(ModelosEmLoja);
    }

}
