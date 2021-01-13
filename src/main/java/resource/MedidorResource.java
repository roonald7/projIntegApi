package main.java.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import main.java.entity.Medidor;
import main.java.reposistory.MedidorRepository;

@RestController
@RequestMapping(value="/api")
@Api(value="API REST Medidores")
@CrossOrigin(origins="*")
public class MedidorResource {
	
	@Autowired
	MedidorRepository medidorRepository;
	
	@GetMapping("/medidores")
	@ApiOperation(value="Retorna uma lista de Medidores")
	public List<Medidor> listaMedidores(){
		return medidorRepository.findAll();
	}
	
	@GetMapping("/medidor/{id}")
	@ApiOperation(value="Retorna um medidor unico")
	public Medidor listaMedidorUnico(@PathVariable(value="id") long id) {
		return medidorRepository.findById(id);
	}
	
	@PostMapping("/medidor")
	@ApiOperation(value="Salva um medidor")
	public Medidor salvaMedidor(@RequestBody Medidor medidor) {
		return medidorRepository.save(medidor);
	}
		
	@DeleteMapping("/medidor")
	@ApiOperation(value="Deleta um Medidor")
	public void deleteMedidor(@RequestBody Medidor medidor) {
		medidorRepository.delete(medidor);
	}
	
	@DeleteMapping("/medidor/{id}")
	@ApiOperation(value="Deleta um medidor pelo Id")
	public void deleteMedidorById(@PathVariable(value="id") long id) {
		medidorRepository.delete(medidorRepository.findById(id));
		System.out.println("Medidor Deletado");
	}
	
	@DeleteMapping("/medidores")
	@ApiOperation(value="Deleta todos os Medidores do Banco de Dados")
	public void deletarMedidores() {
		medidorRepository.deleteAll();
		System.out.println("Todos os Medidores foram deletados!");
	}
	
	@PutMapping("/medidor")
	@ApiOperation(value="Atualizar os dados de um Medidor")
	public Medidor atualizaMedidor(@RequestBody Medidor medidor) {
		medidorRepository.save(medidor);
		return medidor;
	}

}
