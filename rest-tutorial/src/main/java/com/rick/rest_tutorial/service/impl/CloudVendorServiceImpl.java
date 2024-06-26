package com.rick.rest_tutorial.service.impl;

import com.rick.rest_tutorial.model.CloudVendor;
import com.rick.rest_tutorial.repository.CloudVendorRepository;
import com.rick.rest_tutorial.service.CloudVendorService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CloudVendorServiceImpl implements CloudVendorService {

    CloudVendorRepository cloudVendorRepository;

    public CloudVendorServiceImpl(CloudVendorRepository cloudVendorRepository) {
        this.cloudVendorRepository = cloudVendorRepository;
    }

    @Override
    public String createCloudVendor(CloudVendor cloudVendor) {
        cloudVendorRepository.save(cloudVendor);
        return "Success";
    }

    @Override
    public String updateCloudVendor(CloudVendor cloudVendor) {
        cloudVendorRepository.save(cloudVendor);
        return "Success";
    }

    @Override
    public String deleteCloudVendor(String vendorId) {
        if(cloudVendorRepository.findById(vendorId).isPresent()) {
            cloudVendorRepository.deleteById(vendorId);
            return "Success";
        }
        return "Failure";
    }

    @Override
    public CloudVendor getCloudVendor(String vendorId) {
        if(cloudVendorRepository.findById(vendorId).isPresent()) {
            return cloudVendorRepository.findById(vendorId).get();
        }

        return null;
    }

    @Override
    public List<CloudVendor> getAllCloudVendors() {
        return cloudVendorRepository.findAll();
    }
}
