package payroll;

class OrderNotFoundException extends RuntimeException {

    OrderNotFoundException(Long id) {
        super("No se pudo encontrar el pedido " + id);
    }
}