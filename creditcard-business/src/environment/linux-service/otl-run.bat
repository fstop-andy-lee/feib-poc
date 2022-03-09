C:\java\jdk-15.0.1\bin\java ^
    -javaagent:lib/opentelemetry-javaagent.jar ^
    -Dotel.resource.attributes=service.name=creditcard-business ^
    -Dotel.traces.exporter=jaeger ^
    -cp conf;lib/* ^
    -Dspring.application.admin.enabled=false ^
    -Dfile.encoding=UTF8 ^
    -Djava.awt.headless=true ^
    -Dlogger.file=conf/logback.xml ^
    -Dloader.main=com.feib.business.api.FeibCreditCardBusinessServiceApplication ^
    -Dspring.profiles.active=dev ^
    -Xms256m ^
    -Xmx1024m ^
    -XX:+HeapDumpOnOutOfMemoryError ^
    org.springframework.boot.loader.PropertiesLauncher
