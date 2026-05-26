public class MenuAviao {

    public static void inicio(CompaniaAerea companiaAerea){
        int opcao = 0;

        do {
            System.out.println("Menu Avião");
            System.out.println("1 - Adicionar");
            System.out.println("2 - Editar");
            System.out.println("3 - Remover");
            System.out.println("4 - Listar");
            System.out.println("0 - Sair");
            opcao = Integer.parseInt(IO.readln("opcao desejada: "));

            switch (opcao){

                case 1:
                    MenuAviao.adicionar(companiaAerea);
                    break;

                case 2:
                    MenuAviao.editar(companiaAerea);
                    break;

                case 3:
                    MenuAviao.remover(companiaAerea);
                    break;

                case 4:
                    MenuAviao.listar(companiaAerea);
                    break;

                case 0:
                    break;

                default:
                    System.out.println("Opção Inválida");
                    break;
            }


        } while (opcao !=0);
    }

    public static void adicionar(CompaniaAerea companiaAerea){
        String modelo = IO.readln("Adicionar o modelo do avião:  ");
        String tamanhoTanqueEmLitros = IO.readln("Adicionar a capacidade do tanque em litros: ");
        Aviao aviao = new Aviao(modelo,tamanhoTanqueEmLitros);
        companiaAerea.getAviaos().add(aviao);

    }
    public static void listar(CompaniaAerea companiaAerea){
        for (int i = 0; i <companiaAerea.getAviaos().size(); i++) {
            System.out.println("Indice do avião: " + i);
            System.out.println(companiaAerea.getAviaos().get(i).toString());

        }
    }

    public static void editar(CompaniaAerea companiaAerea){
        MenuAviao.listar(companiaAerea);
        int indice = Integer.parseInt(IO.readln("Digite o Indice que deseja editar: "));
        companiaAerea.getAviaos().get(indice).setModelo(IO.readln("Digite o novo modelo do avião: "));
        companiaAerea.getAviaos().get(indice).setTamanhoTanqueEmLitros(Float.parseFloat(IO.readln("Digite a nova especialidade: ")));

    }

    public static void remover(CompaniaAerea companiaAerea){
        MenuAviao.listar(companiaAerea);
        int indice = Integer.parseInt(IO.readln("Digite o Indice que deseja remover"));
        companiaAerea.getAviaos().remove(indice);
        System.out.println("Avião removido com sucesso");
    }
}
