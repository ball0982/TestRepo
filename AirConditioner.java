package com.example.javaball;

class AirConditioner {

        private final int MIN_TEMPERATURE = 20;
        private final int MAX_TEMPERATURE = 30;
        private final int MAX_FAN_SPEED  = 2;
        private final int MIN_FAN_SPEED =0;
        private boolean airOn;
        private boolean fanOn;
        private int targetTemperature;
        private int fanSpeed;

        public AirConditioner(int targetTemperature , int fanSpeed){
            this.targetTemperature = targetTemperature;
            this.fanSpeed = fanSpeed;
            if(this.targetTemperature >MAX_TEMPERATURE){this.targetTemperature =MAX_TEMPERATURE;}
            if(this.targetTemperature < MIN_TEMPERATURE){this.targetTemperature =MIN_TEMPERATURE;}
            if(this.fanSpeed > MAX_FAN_SPEED){this.fanSpeed=MAX_FAN_SPEED;}
            if(this.fanSpeed < MIN_FAN_SPEED){this.fanSpeed = MIN_FAN_SPEED;}
        }

        public boolean isAirOn() {
            return airOn;
        }

        public int getTargetTemperature(){
            return targetTemperature;
        }

        public void turnAirOnOff(){
            if(airOn == false && fanOn == false){
                airOn = true;
                fanOn=true;
            }else {airOn=false;
                fanOn=false;

            }
        }

        public void increaseTemperature(){
            if(targetTemperature > MAX_TEMPERATURE){targetTemperature=MAX_TEMPERATURE;}


        }

        public void decreaseTemperature(){
            if(targetTemperature<MIN_TEMPERATURE){targetTemperature=MIN_TEMPERATURE;}
        }
        public void changeSpeed(){
            if(fanSpeed>MAX_FAN_SPEED){fanSpeed=MIN_FAN_SPEED;}
        }

    @Override
    public String toString() {
        return "Air Conditioner {"+"Status:"+isAirOn()+"} "+"Air Conditioner {"+"Status:"+isAirOn()+"Temp "+getTargetTemperature()+"Fan "+fanSpeed+"}" ;
    }
}

