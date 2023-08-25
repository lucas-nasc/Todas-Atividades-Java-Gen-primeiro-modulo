public class SensoKpop {
    public static void main(String[] args) {

        grupos novoDado = new grupos();
        //set armazenar um dado
        //get = retorno desse dado

        //Varios item do objeto

        novoDado.setQuantidadeMembros(4);
        novoDado.setNomeGrupo("Aespa");
        novoDado.setNacionalidade("Coreanas e Chinesas");
        novoDado.setQTAAlbuns("Três");
        novoDado.setAnoDeBut(2021);
        novoDado.setNumerosF(2000000000);

        System.out.println("Nome do grupo: " + novoDado.getNomeGrupo());
        System.out.println("Nacionalidade dos membros" + novoDado.getNacionalidade());
        System.out.println("Quantidade de membros no grupo: " + novoDado.getQuantidadeMembros());
        System.out.println("Quantidade de albuns: "+ novoDado.getQTAAlbuns());
        System.out.println("Quantidade de alguns" + novoDado.getAnoDeBut());
        System.out.println("Quantidade de fãs"+ novoDado.getNumerosF());

    }
}
