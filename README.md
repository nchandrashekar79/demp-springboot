# demp-springboot

# Build docker image

docker build -t spring-boot:v1 .

# run docker image
docker run -d -p 9090:9090 spring-boot:v1 

#Test application 
http://localhost:9090/demo/api/v1

# Docker hub

docker tag <spring-boot:v1> test/springboot-docker:v1

docker push test/springboot-docker:v1


