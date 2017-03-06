# SpringBoot Thymeleaf Form

Dengan menggunakan template engine di Thymeleaf, kita tidak perlu menggunakan extension lagi,
seperti JSTL di Java Server Page (JSP) karena thymeleaf ini sudah lumanyan lengkap mulai dari:

- Menampilkan Text `th:text`
- Menampilkan link
    - `th:action="@{/path/url}"`
    - `th:href="@{/path/url}"`
    - `th:src="@{/path/url}"`
- Seleksi 
    - `th:if` 
    - `th:unless` 
    - `th:switch`
    - `th:case`
- Perulangan 
    - `th:each`
    - `th:for`
- format taggal, uang dll.
