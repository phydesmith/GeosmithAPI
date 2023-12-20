# GeosmithAPI

This is a simple Spring Boot REST App. It listens on port 8080 and has a single endpoint at /geosmith/v1/geodata/{postalcode}.

This accepts a postal code and returns a "GeoData" object with information relating to it, including the latitude and longitude which are required to use the <a href="https://www.weather.gov/documentation/services-web-api>weather.gov</a> API.

This will need a PostgreSQL db created and populated with /data/us_geodata.csv to work. Username and password will have to be configured in the application.properties file.   