package pe.edu.cibertec.DSWII_EF_SOAP_XXX.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

@Configuration
public class MascotaWsdlConfig {

    @Bean(name = "mascotas")
    public DefaultWsdl11Definition mascotaWsdl11Definition(XsdSchema mascotaEsquema) {
        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setPortTypeName("MascotasPort");
        wsdl11Definition.setLocationUri("/ws/mascotas");
        wsdl11Definition.setTargetNamespace("http://www.cibertec.edu.pe/ws/objects");
        wsdl11Definition.setSchema(mascotaEsquema);

        return wsdl11Definition;
    }

    @Bean
    public XsdSchema mascotaEsquema() {
        return new SimpleXsdSchema(new ClassPathResource("xsd/mascota.xsd"));
    }

}
