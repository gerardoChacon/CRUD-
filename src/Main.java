import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int option;
        Scanner scanner = new Scanner(System.in);
        ChacList products = new ChacList();
       do{
           System.out.println("Selecciona la acción que deseas realizar:");
           System.out.println("""
                                [1]Agregar
                                [2]Eliminar
                                [3]Actualizar
                                [4]Deshacer
                                [5]Rehacer
                                [6]Log
                                [7]Imprimir
                                [0]Salir
                                """);
           option = scanner.nextInt();

           switch (option){
               case 1:
                   System.out.println("Ingresa la clave del producto: ");
                   int key = scanner.nextInt();
                   scanner.nextLine();
                   System.out.println("Ingresa la descripción del producto: ");
                   String description = scanner.nextLine();
                   System.out.println("Ingresa el precio del producto: " );
                   float price = scanner.nextFloat();
                   scanner.nextLine();
                   System.out.println("Ingresa la cantidad de stock del producto: ");
                   int stock = scanner.nextInt();
                   scanner.nextLine();

                   ChacNode newNode = new ChacNode(key, description, price, stock);
                   products.add(newNode);
                   System.out.println("Producto agregado existosamente");
                   break;
               case 2:
                   if(products.isEmpty()){
                       System.out.println("La lista está vacía");
                       break;
                   }
                   System.out.println("Ingresa la clave del producto que deseas eliminar: ");
                   int deleatingKey = scanner.nextInt();
                   boolean deleated = products.removeByKey(deleatingKey);
                   if(deleated){
                       System.out.println("Producto eliminado existosamente");
                   } else System.out.println("No se encontró el producto, intente nuevamente.");
                   break;
               case 3:
                   System.out.println("Funcion en desarrollo");
                   break;
               case 4:
                   System.out.println("Funcion en desarrollo");
                   break;
               case 5:
                   System.out.println("Funcion en desarrollo");
                   break;
               case 6:
                   System.out.println("Funcion en desarrollo");
                   break;
               case 7:
                   products.print();
                   break;
               case 0:
                   System.out.println("Gracias por visitranos. Vuelva pronto");
               default:
                   System.out.println("Opción no válida");
           }
       } while (option != 0);
       scanner.close();
    }
}