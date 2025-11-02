public class App {
    public static void main(String[] args) throws Exception {
        int altura = Integer.parseInt(System.console().readLine("Por favor, introduzca la altura de la altura: "));
        //String relleno = System.console().readLine("Introduzca el carácter de relleno: ");
        int longitudFila = 1;
        int planta = 1;
        int espacios = altura-1;

        while(planta <= altura){
            for(int i = 0; i<espacios; i++){
                System.out.print(" ");                
            }
            for(int i = 1; i<=longitudFila; i++){
                System.out.print(i);
            }
            System.out.println();
            planta++;
            longitudFila +=2;
            espacios--;
        }     
    }
}
