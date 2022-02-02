open module infrastructure {
    requires domain;

    requires static lombok;
    requires com.fasterxml.jackson.annotation;
    requires com.fasterxml.jackson.databind;
    requires spring.data.commons;
    requires spring.data.mongodb;
    requires spring.context;
    requires org.mapstruct;
    requires java.compiler;

    exports com.github.mauricioaraujomonteiro.infrastructure.adapter;
}