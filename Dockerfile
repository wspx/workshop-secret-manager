# Imagem base leve com JRE Alpine
FROM eclipse-temurin:25-jre-alpine

# Instala dependências necessárias para baixar e executar o Infisical CLI
RUN apk add --no-cache curl bash

# Baixa e instala o Infisical CLI (standalone binary, versão mais recente)
# Você pode fixar uma versão específica se preferir (ex: substituindo latest por uma tag)
RUN curl -1sLf 'https://dl.cloudsmith.io/public/infisical/infisical-cli/setup.alpine.sh' | bash \
    && apk add --no-cache infisical

WORKDIR /app

# Copia o JAR da sua aplicação Spring Boot (buildado previamente com mvn package)
COPY target/*.jar app.jar
COPY startup.sh /app

EXPOSE 8080

# ENTRYPOINT usando infisical run para injetar segredos e depois rodar a app
ENTRYPOINT ["./startup.sh"]