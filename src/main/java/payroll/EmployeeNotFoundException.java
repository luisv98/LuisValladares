package payroll;

class EmployeeNotFoundException extends RuntimeException {

    EmployeeNotFoundException(Long id) {
        super("No se pudo encontrar al empleado " + id);
    }
}
