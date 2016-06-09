/**
 * Created by owf on 7 يون، 2016 م.
 */

import java.util.Random;
import java.util.Date;
public class LocationHeadingSpeed {


        private int heading;
        private int longtitude;
        private int latitude;
        private int VehicleSpeed;
        private int acceleration;
        private int speedLimit;
        private String headingLetter;
        Random randomValue = new Random();


        public void setSpeedLimit(int s){
        speedLimit = s;
         }

        public int getSpeedLimit(){
        return this.speedLimit;
         }


        public int getlongtitude() {
            longtitude = randomValue.nextInt(100);
            return this.longtitude; }

        public int getlatitude() {
            latitude = randomValue.nextInt(100);
            return this.latitude;}

        public String showLocation() {
            return " ("+ getlatitude() +" , " + getlongtitude() + ")"; }



        public int speedGenerator(){
            VehicleSpeed  = randomValue.nextInt(100) /4;
            return VehicleSpeed + 5; }

        public void setVehicleSpeed(int speed){
            speed = VehicleSpeed; }

        public int getVehicleSpeed() {
            return VehicleSpeed; }



        public int getRandomHeading (){
            heading = randomValue.nextInt(4);
            return heading; }

        public void setHeading(int randomHeading){
            randomHeading = heading;

            switch (heading) {
                case 0 :
                    headingLetter= "N";
                    break ;
                case 1 :
                    headingLetter= "E";
                    break;
                case 2 :
                    headingLetter= "S";
                    break;
                case 3 :
                    headingLetter= "W";
                    break;
            }
        }

        public String getHeading() {
            return headingLetter;
        }



@Override
public String toString(){
    return "The vehicle is heading "+getHeading()+", travelling at speed "+getVehicleSpeed()+"km, current location is "+showLocation()+", that is on "+ new Date();
}
    }

