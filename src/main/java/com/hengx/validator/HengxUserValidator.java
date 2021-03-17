package com.hengx.validator;


import com.hengx.model.HengxUser;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 * @Author xcp
 * @date 2020/11/23 21:52
 */
@Component
public class HengxUserValidator  implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
        return HengxUser.class.equals(clazz);
    }

    @Override
    public void validate(Object obj, Errors e) {
        ValidationUtils.rejectIfEmpty(e,"name","name.empty");
        HengxUser p = (HengxUser) obj;
        if(p.getAge()<0){
            e.rejectValue("age","年龄不能小于0岁");
        }else if(p.getAge()>150){
            e.rejectValue("age","年龄不能大于150岁");
        }


    }
}
