package com.swp.project.dto;

import com.swp.project.entity.product.ProductUnit;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ViewProductUnitRequestDetailDto {

    public ViewProductUnitRequestDetailDto(ProductUnit oldProductUnit, ProductUnit newProductUnit) {
        this.newId = newProductUnit.getId() != null ? String.valueOf(newProductUnit.getId()) : "N/A";
        this.newName = newProductUnit.getName();
        this.newAllowDecimal = String.valueOf(newProductUnit.isAllowDecimal());
        this.newActive = String.valueOf(newProductUnit.isActive());

        if (oldProductUnit == null) {
            return;
        }

        if (!oldProductUnit.getName().equals(newProductUnit.getName())) {
            oldName = oldProductUnit.getName();
        }
        if (oldProductUnit.isAllowDecimal() != newProductUnit.isAllowDecimal()) {
            oldAllowDecimal = String.valueOf(oldProductUnit.isAllowDecimal());
        }
        if (oldProductUnit.isActive() != newProductUnit.isActive()) {
            oldActive = String.valueOf(oldProductUnit.isActive());
        }
    }

    private String oldName;
    private String oldAllowDecimal;
    private String oldActive;

    private String newId;
    private String newName;
    private String newAllowDecimal;
    private String newActive;
}
