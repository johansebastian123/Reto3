package com.grupoG32.reto3.dbo;

import com.grupoG32.reto3.model.ClientModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReportClientsDbo {
    public Integer total;
    public ClientModel client;
}
