package com.javasmithy.geo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.http.HttpStatus;

@RestController
@RequestMapping("/geosmith/v1")
public class GeoDataController {

    @Autowired
    private GeoDataRepository geoDataRepository;

    @GetMapping("/geodata/{postalCode}")
    public ResponseEntity<GeoData> getGeoDataByPostalCode(@PathVariable( value = "postalCode") String postalCode) {
        return new ResponseEntity<GeoData>(geoDataRepository.findByPostalCode(postalCode), HttpStatus.OK);
    }

}
