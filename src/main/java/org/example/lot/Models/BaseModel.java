package org.example.lot.Models;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.xml.crypto.Data;
import java.util.Date;

@Getter
@Setter
@SuperBuilder
public abstract class BaseModel {
    private Long id;
    private Date createdAt;
    private Date updatedAt;

}
