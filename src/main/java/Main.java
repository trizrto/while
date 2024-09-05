import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite sua senha: ");
    int senha = sc.nextInt();
    int senha1 = 2022;
   
    
    if (senha == senha1){
      System.out.println("Acesso permitido");

      while (senha != 2022){
        System.out.println("Acesso negado");
      }
    }
    else{
      System.out.println("Acesso negado");
    }
   
    
    



    sc.close();
  }

 
}