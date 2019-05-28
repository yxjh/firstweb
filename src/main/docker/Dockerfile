# 获取jdk基础镜像sailing.com/base/alpine-base:latest
FROM java:8
VOLUME /tmp
ADD first-web.jar first-web.jar
ENV JAVA_HOME /usr/lib/jvm/default-jvm
ENV PATH ${PATH}:${JAVA_HOME}/bin
ENV TZ=Asia/Shanghai
RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone
EXPOSE 7777
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","first-web.jar"]