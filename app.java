public class app{
 public static void main(String[] args) {
     Computer objDesk = ComputerFactory.getComputer(ComputerType.DESKTOP, "16 GB", "8 core", "1 TB");
     Computer objPC = ComputerFactory.getComputer(ComputerType.PC, "32 GB", "16 core","1 TB");
     System.out.println(objDesk.toString());
     System.out.println(objPC.toString());   
 }

}