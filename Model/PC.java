public class PC extends Computer{
   private String ram;
   private String cpu;
   private String hd;
   
   public PC(String ram, String cpu, String hd){
     this.ram = ram;
     this.cpu = cpu;
     this.hd = hd;
   }

   @Override
   public void setRAM(String ram){
    this.ram = ram;
   }
   @Override
   public void setCPU(String cpu){
    this.cpu = cpu;
   }
   @Override
   public void setHD(String hd){
     this.hd= hd;
   }
   @Override
   public String getRAM(){
     return this.ram;
   }
   @Override 
   public String getCPU(){
    return this.cpu;
   }
   @Override
   public String getHD(){
    return this.hd;
   }

}