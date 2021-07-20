package com.antonio.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Product {

    @Id
    private Integer id;

    //El atributo columnDefinition = "nvarchar"... es para definir que tipo de dato va a ser en la bbdd, si se crea con ddl-auto=update
    @Column(length = 30)
    private String name;

    public void setId(Integer id) {
        this.id = id;
      }
      
      public void setName(String name) {
        this.name = name;
      }
      
      public boolean equals(Object o) {
        if (o == this)
          return true; 
        if (!(o instanceof com.antonio.demo.Product))
          return false; 
        com.antonio.demo.Product other = (com.antonio.demo.Product)o;
        if (!other.canEqual(this))
          return false; 
        Object this$id = getId(), other$id = other.getId();
        if ((this$id == null) ? (other$id != null) : !this$id.equals(other$id))
          return false; 
        Object this$name = getName(), other$name = other.getName();
        return !((this$name == null) ? (other$name != null) : !this$name.equals(other$name));
      }
      
      protected boolean canEqual(Object other) {
        return other instanceof com.antonio.demo.Product;
      }
      
      public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Object $id = getId();
        result = result * 59 + (($id == null) ? 43 : $id.hashCode());
        Object $name = getName();
        return result * 59 + (($name == null) ? 43 : $name.hashCode());
      }
      
      public String toString() {
        return "Product(id=" + getId() + ", name=" + getName() + ")";
      }
      
      public Product(Integer id, String name) {
        this.id = id;
        this.name = name;
      }
      
      public Product() {}
      
      public Integer getId() {
        return this.id;
      }
      
      public String getName() {
        return this.name;
      }

}
