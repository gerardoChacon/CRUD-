public class ChacList {
    ChacNode firstElement;
    ChacNode lastElement;
    int size;

    ChacList() {
        firstElement = lastElement = null;
        size = 0;
    }

    public void add(ChacNode node) { //Agrega al principio, ¿Cómo puedo agregar al final o en una posición exacta?
        if (isEmpty()) {
            firstElement = lastElement = node;
        } else {
            node.nextProduct = firstElement;
            firstElement = node;

        }
        size++;
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("La lista está vacía");
        } else {
            ChacNode temp = firstElement;
            while (temp != null) {
                System.out.println(temp);
                temp = temp.nextProduct;
            }
        }
    }

    public boolean removeByKey(int key) { //¿Cómo elimino por index, por objeto? Según CleanCode las funciones no deben ser mayores a 5-10 lineas de código y no puede hacer más de una cosa , toca refactorizar está función.
        if (isEmpty()) return false;

        ChacNode curr = firstElement;
        ChacNode prev = null;

        while (curr != null) {
            if (curr.productKey == key) {
                if (prev == null) {
                    firstElement = curr.nextProduct;
                } else {
                    prev.nextProduct = curr.nextProduct;
                }
                if (curr == lastElement) {
                    lastElement = prev;
                }
                curr.nextProduct = null;
                size--;
                return true;
            }
            prev = curr;
            curr = curr.nextProduct;
        }
        return false;
    }

    public boolean isEmpty() { return size == 0; }



}







