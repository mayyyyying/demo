# demo


### Prerequisite 
I start mysql locally by docker using
```bash
docker pull mysql
docker run -d -p 3306:3306 --name demo-mysql -e MYSQL_ROOT_PASSWORD=123456 -d mysql:latest
```

Accessing database can be
```bash
mysql -h xxx.xxx.xxx.xxx -p3306 -uroot -p123456
```


you can test this program by clean and run
```bash
mvn clean install
mvn spring-boot:run
```

Then, application can be accessed by
```bash
localhost:8080
```

There is a submit button there can trigger
```bash
localhost:8080/save
```

