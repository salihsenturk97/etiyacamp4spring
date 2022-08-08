package com.etiya.northwind.business.concretes;

import com.etiya.northwind.business.abstracts.SupplierService;
import com.etiya.northwind.business.responses.products.SupplierListResponse;
import com.etiya.northwind.dataAccess.abstracts.SupplierRepository;
import com.etiya.northwind.entities.concretes.Supplier;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SupplierManager implements SupplierService {
    private SupplierRepository supplierRepository;

    @Autowired
    public SupplierManager(SupplierRepository supplierRepository) {
        this.supplierRepository = supplierRepository;
    }

    @Override
    public List<SupplierListResponse> getAll() {
        List<Supplier> result = this.supplierRepository.findAll();
        List<SupplierListResponse> responses = new ArrayList<>();
        for (Supplier supplier : result) {
            SupplierListResponse response = new SupplierListResponse();
            response.setSupplierId(supplier.getSupplierId());
            response.setContactName(supplier.getContactName());
            response.setCompanyName(supplier.getCompanyName());
            response.setContactTitle(supplier.getContactTitle());
            responses.add(response);

        }
        return responses;
    }
}
