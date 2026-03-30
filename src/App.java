import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== YU-GI-OH! DUELO ===");
        System.out.print("Nombre del Jugador 1: ");
        String nombre1 = scanner.nextLine();
        
        System.out.print("Nombre del Jugador 2: ");
        String nombre2 = scanner.nextLine();
        
        Duelo duelo = new Duelo(nombre1, nombre2);
        duelo.iniciar();
        
        scanner.close();
    }
}
    