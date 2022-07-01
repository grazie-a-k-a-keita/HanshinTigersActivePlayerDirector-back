FROM gradle

COPY ./ ./
RUN gradle build -x test
ENTRYPOINT [ "java", "-jar", "build/libs/HanshinTigersActivePlayerDirector-0.0.1-SNAPSHOT.jar" ]