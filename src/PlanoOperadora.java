public class PlanoOperadora {
    public static void main(String[] args) {
        String plano = "M"; 

        switch (plano){
            case "T":{
                System.out.println("5G Youtube");
            }
            case "M":{
                System.out.println("Whatsapp e Instagran grátis");
            }
            case "B":{
                System.out.println("100 minutos de ligação");
            }
        }


        // if(plano == "B"){
        //     System.out.println("100 minutos de ligações");
        
        // }else if (plano == "M"){
        //     System.out.println("100 minutos de ligação");
        //     System.out.println("Whatsapp e Instagran grátis");
        // }
        // else if (plano == "T"){
        //     System.out.println("100 minutos de ligação");
        //     System.out.println("Whatsapp e Instagran grátis");
        //     System.out.println("5G Youtube");
        // }       
    }
}
