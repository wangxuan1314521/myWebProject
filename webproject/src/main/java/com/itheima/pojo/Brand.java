package com.itheima.pojo;


/**
 * @author shkstart
 * @create 2023-02-18 13:54
 */
public class Brand {


    private Integer id;
    private String brandName;
    private String companyName;
    private Integer ordered;
    private String description;
    private Integer status;

    public Brand() {
    }

    public Brand(Integer id, String brandName, String companyName
, Integer ordered, String description, Integer status) {
        this.id = id;
        this.brandName
 = brandName
;
        this.companyName
 = companyName
;
        this.ordered = ordered;
        this.description = description;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getbrandName
() {
        return brandName
;
    }

    public void setbrandName
(String brandName
) {
        this.brandName
 = brandName
;
    }

    public String getcompanyName
() {
        return companyName
;
    }

    public void setcompanyName
(String companyName
) {
        this.companyName
 = companyName
;
    }

    public Integer getOrdered() {
        return ordered;
    }

    public void setOrdered(Integer ordered) {
        this.ordered = ordered;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Brand{" +
                "id=" + id +
                ", brandName ='" + brandName
 + '\'' +
                ", companyName ='" + companyName
 + '\'' +
                ", ordered=" + ordered +
                ", description='" + description + '\'' +
                ", status=" + status +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Brand brand = (Brand) o;

        if (id != null ? !id.equals(brand.id) : brand.id != null) return false;
        if (brandName
 != null ? !brandName
.equals(brand.brandName
) : brand.brandName
 != null) return false;
        if (companyName
 != null ? !companyName
.equals(brand.companyName
) : brand.companyName
 != null) return false;
        if (ordered != null ? !ordered.equals(brand.ordered) : brand.ordered != null) return false;
        if (description != null ? !description.equals(brand.description) : brand.description != null) return false;
        return status != null ? status.equals(brand.status) : brand.status == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (brandName
 != null ? brandName
.hashCode() : 0);
        result = 31 * result + (companyName
 != null ? companyName
.hashCode() : 0);
        result = 31 * result + (ordered != null ? ordered.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        return result;
    }
}
