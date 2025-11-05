package com.swp.project.dto;

import com.swp.project.entity.product.Category;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ViewCategoryRequestDetailDto {

    public ViewCategoryRequestDetailDto(Category oldCategory, Category newCategory) {
        this.newId = newCategory.getId() != null ? String.valueOf(newCategory.getId()) : "N/A";
        this.newName = newCategory.getName();
        this.newActive = String.valueOf(newCategory.isActive());

        if (oldCategory == null) {
            return;
        }

        if (!oldCategory.getName().equals(newCategory.getName())) {
            oldName = oldCategory.getName();
        }
        if (oldCategory.isActive() != newCategory.isActive()) {
            oldActive = String.valueOf(oldCategory.isActive());
        }
    }

    private String oldName;
    private String oldActive;

    private String newId;
    private String newName;
    private String newActive;
}
