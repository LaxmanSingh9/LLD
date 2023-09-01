public class ComputerFactory{
   public static Computer getComputer(ComputerType type, String ram, String cpu, String hd){
       
      if(ComputerType.PC == type){
        return new PC(ram, cpu, hd);
      }
      else if(ComputerType.DESKTOP == type){
        return new Desktop(ram, cpu, hd);
      }
      else{
        return null;
      }

   }

}