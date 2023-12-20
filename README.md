# GeosmithAPI

This is a simple Spring Boot REST App intended to be used with the <a href="https://github.com/phydesmith/WeathersmithFX/tree/main">WeathersmithFX App</a>.

This accepts a postal code and returns a "GeoData" object with information relating to it, including the latitude and longitude which are required to use the <a href="https://www.weather.gov/documentation/services-web-api>weather.gov</a> API.

This will need a PostgreSQL db created and populated with /data/us_geodata.csv to work. Username and password will have to be configured in the application.properties file.   

## To run 
- make sure mvnw is executable if on linux (use chmod +x)
- `./mvnw clean compile package`
- `mvn spring-boot:run`
- service should start and be listening on port 8080
- navigate to `http://<ip>:8080/geosmith/v1/geodata/90210`
- should recieve a response like the one below:

![image](https://github.com/phydesmith/GeosmithAPI/assets/31049044/5fdbabbe-5af2-4190-ab39-a9922f6db936)

