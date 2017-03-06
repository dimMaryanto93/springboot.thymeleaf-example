# Spring Web MVC

Spring Boot, Pada dasarnya menyediakan template yang bisa digunakan seperti:

- [thymeleaf.org](http://www.thymeleaf.org/)
- JSP
- [velocity.apache.org](http://velocity.apache.org/)
- [freemarker.org/](http://freemarker.org/)

Dari ke-empat itu sebenarnya yang paling update yaitu [thymeleaf.org](http://www.thymeleaf.org/) maka dari itu kita akan menggunakan template engine Thymeleaf.

Untuk menggunakannya di spring-boot sangat mudah cukup dengan tambahkan dependency seperti berikut:

**pom.xml**

```xml
<dependencies>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-thymeleaf</artifactId>
    </dependency>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
    </dependency>
</dependencies>
```

**application.properties**

```properties
spring.thymeleaf.prefix=classpath:/templates/
spring.thymeleaf.suffix=.html
spring.thymeleaf.mode=HTML5
spring.thymeleaf.encoding=UTF-8
spring.thymeleaf.cache=false
```

Dengan begitu kita cukup membuat file dengan extension `.html` dengan menabahkan tag seperti berikut:

```html
<html xmlns:th="http://www.thymeleaf.org" lang="en"
            xmlns="http://www.w3.org/1999/xhtml>
</html>
```

Dan yang perlu dicatat adalah **semua tag harus ditutup semuanya `<open></open>` atau `<open />`**.

