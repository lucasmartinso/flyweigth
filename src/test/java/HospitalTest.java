import org.example.Hospital;
import org.example.Medico;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class HospitalTest {
    @Test
    void deveRetornarMedicos() {
        Hospital hospital = new Medico();
        hospital.contratar("teste1", "zona da mata", "jf");
        hospital.contratar("teste2", "regiao dos lagoa", "cf");

        List<String> listaMedicos = Arrays.asList(
                "teste1", "teste2"
        );

        assertEquals(listaMedicos, hospital.obterMedicos());
    }
}
