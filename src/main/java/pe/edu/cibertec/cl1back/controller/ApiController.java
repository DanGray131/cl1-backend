package pe.edu.cibertec.cl1back.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.edu.cibertec.cl1back.dto.VehiculoDTO;
import pe.edu.cibertec.cl1back.dto.VehiculoRequestDTO;
import pe.edu.cibertec.cl1back.service.VehiculoService;

import java.io.IOException;

@RestController
@RequestMapping("/api")
public class ApiController {

    @Autowired
    private VehiculoService vehiculoService;

    @PostMapping("/buscar")
    public ResponseEntity<VehiculoDTO> buscar(@RequestBody VehiculoRequestDTO request) {
        VehiculoDTO vehiculo = vehiculoService.encontrarVehiculo(request.getPlaca());
        if (vehiculo != null) {
            return ResponseEntity.ok(vehiculo);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}

