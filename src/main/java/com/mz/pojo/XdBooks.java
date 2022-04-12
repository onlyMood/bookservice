package com.mz.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class XdBooks {
    private String name;
    private String author;
    private  int counts;
    private String detial;
    private String location;
    private String outdate;
    private String returndate;
}
