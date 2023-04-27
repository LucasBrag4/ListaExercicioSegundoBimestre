
package exercicio1;


public class valorIngresso {

    public static void main(String[] args) {      
        Menu();
    }
    public static void Menu (){
        Ingresso iniciarIngresso = new Ingresso();
        IngressoVIP iniciarIngressoVIP = new IngressoVIP();
        
        System.out.println(iniciarIngressoVIP.toString());
        System.out.println(iniciarIngresso.toString());   
    }  
}
