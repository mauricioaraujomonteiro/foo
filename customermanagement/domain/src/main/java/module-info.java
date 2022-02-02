open module domain {
    requires static lombok;
    requires spring.context;
    requires org.slf4j;
    requires java.validation;

    requires com.fasterxml.jackson.annotation;
    requires com.fasterxml.jackson.databind;
    exports com.github.mauricioaraujomonteiro.domain.port.spi to infrastructure;
    exports com.github.mauricioaraujomonteiro.domain.port.api to application;
    exports com.github.mauricioaraujomonteiro.domain.data to application, infrastructure;
    exports com.github.mauricioaraujomonteiro.domain.usecases to application;
}