public abstract Computer {
   /*
    * Getters and Setters
    */
   public String getRAM();
   public String setRAM();
   public String getCPU();
   public String setCPU();
   public String getHD();
   public String setHD();
   public void toString(){
      System.out.println("RAM"+ram+"\n"+ "CPU"+ cpu +"\n"+ "HD"+ hd);
   }

}