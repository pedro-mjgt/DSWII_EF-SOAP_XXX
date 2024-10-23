package pe.edu.cibertec.DSWII_EF_SOAP_XXX.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

@Configuration
public class VeterinarioWsdlConfig {

    @Bean(name = "veterinarios")
    public DefaultWsdl11Definition domicilioWsdl11Definition(XsdSchema veterinarioEsquema) {
        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setPortTypeName("VeterinariosPort");
        wsdl11Definition.setLocationUri("/ws/veterinarios");
        wsdl11Definition.setTargetNamespace("http://www.cibertec.edu.pe/ws/objects");
        wsdl11Definition.setSchema(veterinarioEsquema);

        return wsdl11Definition;
    }

    @Bean
    public XsdSchema veterinarioEsquema() {
        return new SimpleXsdSchema(new ClassPathResource("xsd/veterinario.xsd"));
    }

}
