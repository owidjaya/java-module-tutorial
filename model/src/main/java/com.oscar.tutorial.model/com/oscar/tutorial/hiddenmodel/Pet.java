package com.oscar.tutorial.hiddenmodel;

public class Pet {
   private String name; 
   private int age;
   private boolean canBark;

   public String getName() {
       return name;
   }

   public void setName(String name) {
       this.name = name;
   }

   public int getAge() {
       return age;
   }

   public void setAge(int age) {
       this.age = age;
   }

   public boolean isCanBark() {
       return canBark;
   }

   public void setCanBark(boolean canBark) {
       this.canBark = canBark;
   }

   @Override
   public int hashCode() {
       final int prime = 31;
       int result = 1;
       result = prime * result + age;
       result = prime * result + (canBark ? 1231 : 1237);
       result = prime * result + ((name == null) ? 0 : name.hashCode());
       return result;
   }

   @Override
   public boolean equals(Object obj) {
       if (this == obj)
           return true;
       if (obj == null)
           return false;
       if (getClass() != obj.getClass())
           return false;
       Pet other = (Pet) obj;
       if (age != other.age)
           return false;
       if (canBark != other.canBark)
           return false;
       if (name == null) {
           if (other.name != null)
               return false;
       } else if (!name.equals(other.name))
           return false;
       return true;
   }

   @Override
   public String toString() {
       return "Pet [age=" + age + ", canBark=" + canBark + ", name=" + name + "]";
   }

   
}
