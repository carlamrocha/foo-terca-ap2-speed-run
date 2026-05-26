import java.util.ArrayList;

public class MenuCompaniaAerea {

    ArrayList<CompaniaAerea> companiaAereas = new ArrayList<>();
    public void inicio(){
        int opcao = 0;

        do {
            System.out.println("Menu Compania Aerea");
            System.out.println("1 - Adicionar");
            System.out.println("2 - Editar");
            System.out.println("3 - Remover");
            System.out.println("4 - Listar");
            System.out.println("0 - Sair");
            opcao = Integer.parseInt(IO.readln("opcao desejada: "));

            switch (opcao){

                case 1:
                    this.adicionar();
                    break;

                case 2:
                    this.editar();
                    break;

                case 3:
                    this.remover();
                    break;

                case 4:
                    this.listar();
                    break;

                case 0:
                    break;

                default:
                    System.out.println("Opção Inválida");
                    break;
            }


        } while (opcao !=0);
    }

    public void adicionar(){
        String nome = IO.readln("Adicionar nome da compania aerea: ");
        String descricao = IO.readln("Digite a descição da compania aerea: ");
        CompaniaAerea companiaAerea = new CompaniaAerea(nome, descricao);
        companiaAereas.add(companiaAerea);
        MenuAviao.inicio(companiaAerea);

    }
    public void listar(){
        for (int i = 0; i <companiaAereas.size(); i++) {
            System.out.println("Indice da Compania aerea: " + i);
            System.out.println(companiaAereas.get(i).toString());
        }
    }

    public void editar(){
        this.listar();
        int indice = Integer.parseInt(IO.readln("Digite o Indice que deseja editar: "));
        companiaAereas.get(indice).setNome(IO.readln("Digite o novo nome da compania aerea: "));
        companiaAereas.get(indice).setDescricao(IO.readln("Digite a nova descrição da compania aerea: "));
        MenuAviao.inicio(companiaAereas.get(indice));
    }

    public void remover(){
        this.listar();
        int indice = Integer.parseInt(IO.readln("Digite o Indice que deseja remover"));
        companiaAereas.remove(indice);
        System.out.println("Compania aerea removida com sucesso");
    }
}
