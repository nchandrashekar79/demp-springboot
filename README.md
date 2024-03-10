# demp-springboot

# Build docker image

docker build -t spring-boot:v1 .

# run docker image
docker run -d -p 9090:9090 spring-boot:v1 

#Test application 

http://localhost:9090/demo/api/v1