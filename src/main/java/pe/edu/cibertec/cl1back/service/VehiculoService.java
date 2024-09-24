package pe.edu.cibertec.cl1back.service;

import org.springframework.stereotype.Service;
import pe.edu.cibertec.cl1back.dto.VehiculoDTO;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

@Service
public class VehiculoService {

    public VehiculoDTO encontrarVehiculo(String placa) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(
                getClass().getClassLoader().getResourceAsStream("vehiculos.txt")))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] data = linea.split(";");
                if (data.length == 7 && data[1].equalsIgnoreCase(placa)) {
                    VehiculoDTO vehiculo = new VehiculoDTO();
                    vehiculo.setMarca(data[2]);
                    vehiculo.setModelo(data[3]);
                    vehiculo.setNumero(Integer.parseInt(data[4]));
                    vehiculo.setPrecio(Double.parseDouble(data[5]));
                    vehiculo.setColor(data[6]);
                    System.out.println(vehiculo);
                    return vehiculo;
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
}
