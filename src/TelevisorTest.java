public class TelevisorTest {
    public static void main(String[] args) {
      Televisor tvSet1 = new Televisor("Panasonic","FullHD",false);
      tvSet1.showStatus();
      tvSet1.turnOn();
      tvSet1.showStatus();
      tvSet1.turnOff();
      tvSet1.showStatus();
    }

}
