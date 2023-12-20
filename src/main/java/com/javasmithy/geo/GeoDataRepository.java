package com.javasmithy.geo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GeoDataRepository extends JpaRepository<GeoData, Long> {

    GeoData findByPostalCode(String postalCode);

}
