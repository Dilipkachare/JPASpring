package dilip.com.service;

import java.io.IOException;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import dilip.com.repository.EmployeeRepository;
import dilip.com.util.ExcelHelper;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EmployeeService {

    private final EmployeeRepository repo;

    public void save(MultipartFile file) {
        try {
            repo.saveAll(
                ExcelHelper.excelToEmployees(file.getInputStream())
            );
        } catch (IOException e) {
            throw new RuntimeException("Failed to read Excel file", e);
        }
    }
}
