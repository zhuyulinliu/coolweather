package coolweather.com.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by zhuyulin on 2017/4/22.
 */

public class Forecast {
    public String date;

    @SerializedName("tmp")
    public Temperature temperature;

    @SerializedName("cond")
    public More more;


    public class Temperature{
        String max;
        String min;
    }

    public class More{
        @SerializedName("txt_d")
        public String info;
    }
}
