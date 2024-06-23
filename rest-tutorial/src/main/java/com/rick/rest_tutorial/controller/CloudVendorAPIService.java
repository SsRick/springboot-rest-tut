package com.rick.rest_tutorial.controller;

import com.rick.rest_tutorial.model.CloudVendor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorAPIService {

    CloudVendor cloudVendor;


    @GetMapping("{vendorId}")
    public CloudVendor getCloudVendorDetails(String vendorId) {
//        return new CloudVendor("CV1", "Microsoft",
//                "Belandur, Bengaluru","+919000090000");
        return cloudVendor;
    }

    @PostMapping
    public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor)
    {
        this.cloudVendor = cloudVendor;
        return "Cloud vendor created successfully";
    }

    @PutMapping
    public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor)
    {
        this.cloudVendor = cloudVendor;
        return "Cloud vendor updated successfully";
    }

    @DeleteMapping("{vendorId}")
    public String deleteCloudVendorDetails(String vendorId)
    {
        cloudVendor = null;
        return "Cloud vendor deleted successfully";
    }

}
