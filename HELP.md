# How to  Use

Run the spring boot application which runs on port 8080

Swagger is enabled on this at http://localhost:8080/swagger-ui.html

Open the upload controller and there is one endpoint to upload the codes file

The sample file is located in the source code under resources folder with name codes.txt

Once the file is uploaded, all the codes in the text file will be saved into embedded H2 in memory database

Open the H2 DB console at http://localhost:8080/h2-console

jdbc URL: jdbc:h2:mem:testdb
username: sa
password: sa

Once you log into the DB, you will see a table with name "TBL_CODES". All the codes in the file will be saved into this table




