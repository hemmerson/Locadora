package org.hemmersonrosa.servicos;

import jakarta.jws.WebService;
import jakarta.xml.ws.Endpoint;
import org.hemmersonrosa.modelos.Pessoa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@WebService
public class PessoaService {

    public List<Pessoa> listarPessoas() {
        Pessoa elijahWood = new Pessoa("Elijah", "Wood");
        Pessoa ianMcKellen = new Pessoa("Ian", "McKellen");
        Pessoa viggoMortensen = new Pessoa("Viggo", "Mortensen");
        return new ArrayList<>(Arrays.asList(elijahWood, ianMcKellen, viggoMortensen));
    }

    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8080/pessoas", new PessoaService());
    }
}
