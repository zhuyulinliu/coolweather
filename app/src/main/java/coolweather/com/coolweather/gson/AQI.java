package coolweather.com.coolweather.gson;

/**
 * Created by zhuyulin on 2017/4/22.
 */

public class AQI {
    public AQICity city;

    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
