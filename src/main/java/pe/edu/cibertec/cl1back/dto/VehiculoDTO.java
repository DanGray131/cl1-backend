package pe.edu.cibertec.cl1back.dto;

public class VehiculoDTO {
    private String placa;
    private String marca;
    private String modelo;
    private int numero;
    private double precio;
    private String color;

    public VehiculoDTO(String placa, String marca, String modelo, int numero, double precio, String color) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.numero = numero;
        this.precio = precio;
        this.color = color;
    }

    public VehiculoDTO() {
    }

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

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
