public class ResultadoEscolar {

    public static void main(String[] args) {
        int nota = 5 ;
        String resultado = nota >=7 ? "Aprovado" : nota >= 5 && nota <7 ?"Recuperação"  :"Reprovado";
        System.out.println(resultado);
    }

    // public static void main(String[] args) {

    //     int nota = 6 ;

    //     if (nota >= 7 ) //true
    //     System.out.println("Aprovado");

    //     else if (nota >= 5 && nota < 7) // true or false
    //     System.out.println("Prova de Recuperação");

    //     else
    //     System.out.println("Reprovado");
    // }
}
