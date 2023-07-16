package org.example.lot.Models;

import lombok.Getter;

import javax.xml.crypto.Data;
import java.util.Date;

@Getter
public abstract class BaseModel {
    private Long id;
    private Date createdAt;
    private Date updatedAt;

}
