package com.rick.rest_tutorial.repository;

import com.rick.rest_tutorial.model.CloudVendor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CloudVendorRepository extends JpaRepository<CloudVendor, String> {
}
