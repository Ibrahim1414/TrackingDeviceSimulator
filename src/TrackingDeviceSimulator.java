/**
 * Created by owf on 7 يون، 2016 م.
 */
import java.util.Date;
import java.util.Scanner;
public class TrackingDeviceSimulator {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("**** Welcome to Vehicle Tracking Application ****");
        Thread.sleep(1000);
        Scanner input = new Scanner(System.in);
        LocationHeadingSpeed HeadingObj = new LocationHeadingSpeed();
        System.out.print("Enter the speed limit: ");
        int limit =  input.nextInt();
        HeadingObj.setSpeedLimit(limit);


        while(true){
                        HeadingObj.setVehicleSpeed(HeadingObj.speedGenerator());
                        HeadingObj.setHeading(HeadingObj.getRandomHeading());

                        if (HeadingObj.getVehicleSpeed() <= limit){
                            System.out.println(HeadingObj);
                        } else {
                            System.out.println(HeadingObj + "       SPEED ALERT");
                        }

                        Thread.sleep(2000);
        }

    }
}

