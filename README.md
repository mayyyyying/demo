# demo


### PREREQUISITE 
I start mysql locally by docker using
```bash
docker pull mysql
docker run -d -p 3306:3306 --name demo-mysql -e MYSQL_ROOT_PASSWORD=123456 -d mysql:latest
```

Accessing database can be
```bash
mysql -h xxx.xxx.xxx.xxx -p3306 -uroot -p123456
```

### TEST APP
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

### SCREENSHOTS

![Screenshot 2024-03-04 at 20 03 10](https://github.com/mayyyyying/demo/assets/7453845/4d4e7444-201c-47b2-87fb-ac0b006dd2b5)

![Screenshot 2024-03-05 at 23 33 48](https://github.com/mayyyyying/demo/assets/7453845/686d9a96-d89e-4e6e-b3c1-50657c0d7eae)

<img width="1241" alt="Screenshot 2024-03-05 at 23 38 42" src="https://github.com/mayyyyying/demo/assets/7453845/fb244bde-db5d-48bb-a756-b8ead07e8b7d">

<img width="598" alt="Screenshot 2024-03-05 at 23 44 16" src="https://github.com/mayyyyying/demo/assets/7453845/053ccd16-a6dc-43b2-a50c-f1830899614d">








