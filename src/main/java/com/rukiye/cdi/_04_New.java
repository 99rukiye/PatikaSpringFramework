package com.rukiye.cdi;

import com.rukiye.StudentDto;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Instance;
import jakarta.enterprise.inject.Produces;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import lombok.Getter;

@Named(value = "newtuto")
@ApplicationScoped
public class _04_New {

    // StudentDto üretmek için Instance<T> kullanılıyor (CDI 4'te @New kaldırıldı)
    @Inject
    private Instance<StudentDto> studentDtoInstance;

    // Üretilecek veri
    @Produces
    public String uretilenData() {
        StudentDto studentDto = studentDtoInstance.get(); // Yeni bir StudentDto nesnesi al
        studentDto.setStudentId(0L);
        studentDto.setStudentName("student Adi");
        return studentDto.getStudentName();
    }

    // Üretilen veriyi başka yerlerde kullanmak için enjekte ediyoruz
    @Getter
    @Inject
    private String tuketilenData;
}
