package com.mycompany.proyectofinal;
import java.util.Date;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

// Clase para representar un usuario
class Usuario {
    private int id;
    private String nombre;
    private String apellidos;
    private String contraseña;

    // Constructor
    public Usuario(int id, String nombre, String apellidos, String contraseña) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.contraseña = contraseña;
    }

    // Getters y setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
}

// Clase para representar una caja de productos en el almacén
class Caja {
    private int correlativo;
    private Date fechaIngreso;

    // Constructor
    public Caja(int correlativo, Date fechaIngreso) {
        this.correlativo = correlativo;
        this.fechaIngreso = fechaIngreso;
    }

    // Getters y setters
    public int getCorrelativo() {
        return correlativo;
    }

    public void setCorrelativo(int correlativo) {
        this.correlativo = correlativo;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }
}

// Clase para representar un cliente
class Cliente {
    private int cui;
    private String nombre;
    private String apellidos;
    private String telefono;
    private String direccion;

    // Constructor
    public Cliente(int cui, String nombre, String apellidos, String telefono, String direccion) {
        this.cui = cui;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    // Getters y setters

    public int getCui() {
        return cui;
    }

    public void setCui(int cui) {
        this.cui = cui;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}

// Clase para representar un repartidor
class Repartidor {
    private int cui;
    private String nombre;
    private String apellidos;
    private String licencia;
    private String telefono;

    // Constructor
    public Repartidor(int cui, String nombre, String apellidos, String licencia, String telefono) {
        this.cui = cui;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.licencia = licencia;
        this.telefono = telefono;
    }

    // Getters y setters

    public int getCui() {
        return cui;
    }

    public void setCui(int cui) {
        this.cui = cui;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getLicencia() {
        return licencia;
    }

    public void setLicencia(String licencia) {
        this.licencia = licencia;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}

// Clase para representar un vehículo
class Vehiculo {
    private String placa;
    private String marca;
    private String modelo;
    private String color;
    private int año;

    // Constructor
    public Vehiculo(String placa, String marca, String modelo, String color, int año) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.año = año;
    }

    // Getters y setters

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
}

// Clase para representar un pedido
class Pedido {
    private int numeroPedido;
    private String departamentoOrigen;
    private String departamentoDestino;
    private Date fechaHoraInicio;
    private Cliente cliente;
    private Repartidor repartidor;
    private Vehiculo vehiculo;
    // Puedes agregar más atributos según sea necesario

    // Constructor
    public Pedido(int numeroPedido, String departamentoOrigen, String departamentoDestino, Date fechaHoraInicio, Cliente cliente, Repartidor repartidor, Vehiculo vehiculo) {
        this.numeroPedido = numeroPedido;
        this.departamentoOrigen = departamentoOrigen;
        this.departamentoDestino = departamentoDestino;
        this.fechaHoraInicio = fechaHoraInicio;
        this.cliente = cliente;
        this.repartidor = repartidor;
        this.vehiculo = vehiculo;
    }

    // Getters y setters

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public String getDepartamentoOrigen() {
        return departamentoOrigen;
    }

    public void setDepartamentoOrigen(String departamentoOrigen) {
        this.departamentoOrigen = departamentoOrigen;
    }

    public String getDepartamentoDestino() {
        return departamentoDestino;
    }

    public void setDepartamentoDestino(String departamentoDestino) {
        this.departamentoDestino = departamentoDestino;
    }

    public Date getFechaHoraInicio() {
        return fechaHoraInicio;
    }

    public void setFechaHoraInicio(Date fechaHoraInicio) {
        this.fechaHoraInicio = fechaHoraInicio;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Repartidor getRepartidor() {
        return repartidor;
    }

    public void setRepartidor(Repartidor repartidor) {
        this.repartidor = repartidor;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
}

// Controlador del API
class ApiController {
    // Lista para almacenar usuarios
    private List<Usuario> usuarios = new ArrayList<>();
    // Pila para almacenar cajas
    private Stack<Caja> cajas = new Stack<>();
    // Lista para almacenar clientes
    private List<Cliente> clientes = new ArrayList<>();
    // Cola para almacenar repartidores
    private Queue<Repartidor> repartidores = new LinkedList<>();
    // Cola para almacenar vehículos
    private Queue<Vehiculo> vehiculos = new LinkedList<>();
    // Lista para almacenar pedidos
    private List<Pedido> pedidos = new ArrayList<>();

    // Método para cargar usuarios desde un archivo CSV
    public void cargarUsuariosDesdeCSV(String archivo) {
        String linea;
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(";");
                // Parsear los datos y crear un nuevo usuario
                int id = Integer.parseInt(datos[0]);
                String nombre = datos[1];
                String apellidos = datos[2];
                String contraseña = datos[3];
                Usuario usuario = new Usuario(id, nombre, apellidos, contraseña);
                usuarios.add(usuario);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Método para cargar cajas desde un archivo CSV
    public void cargarCajasDesdeCSV(String archivo) {
        String linea;
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            while ((linea = br.readLine()) != null) {
                int correlativo = Integer.parseInt(linea.trim());
                Date fechaIngreso = new Date(); // Se asume que la fecha de ingreso es la actual
                Caja caja = new Caja(correlativo, fechaIngreso);
                cajas.push(caja);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    // Método para obtener la lista de usuarios
    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    // agregar metodos 
}

public class ProyectoFinal {
    public static void main(String[] args) {
        // Crear una instancia de ApiController
        ApiController apiController = new ApiController();

        // Cargar datos desde archivos CSV
        apiController.cargarUsuariosDesdeCSV("C:\\Users\\Hans Rustrian\\Desktop\\usuarios.csv");
        //apiController.cargarCajasDesdeCSV("cajas.csv");

        // Llamado a otros métodos para cargar datos de otras entidades

        // Ejemplo de cómo acceder a los datos cargados
        // Imprimir la lista de usuarios cargados
        System.out.println("Usuarios cargados:");
        for (Usuario usuario : apiController.getUsuarios()) {
            System.out.println(usuario.getId() + ": " + usuario.getNombre() + " " + usuario.getApellidos());
        }

        // continuar aplicacion
    }
}

