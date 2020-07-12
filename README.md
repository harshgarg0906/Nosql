# Nosql

container 

sudo docker build -t springboot-mongodb:1.0 .

sudo docker run -p 8080:8080 --name springboot-mongodb --link mymongodb:mongo -d springboot-mongodb:1.0


sudo docker run -d -p 27017:27017 --name mymongodb mongo:latest


