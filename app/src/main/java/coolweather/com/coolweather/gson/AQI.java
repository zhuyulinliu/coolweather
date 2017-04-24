package coolweather.com.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by zhuyulin on 2017/4/22.
 */

public class AQI {
    public AQICity city;

    public class AQICity{
        public String aqi;
        public String pm25;
        @SerializedName("qlty")
        public String airQuality;
    }
}
