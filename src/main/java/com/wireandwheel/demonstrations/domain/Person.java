package com.wireandwheel.demonstrations.domain;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;
import javax.validation.constraints.NotNull;
import javax.persistence.Column;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
public class Person {

    /**
     */
    @NotNull
    private String firstname;

    /**
     */
    @NotNull
    private String lastname;

    /**
     */
    @NotNull
    @Column(unique = true)
    private String email;

    /**
     */
    private String organization;
}
