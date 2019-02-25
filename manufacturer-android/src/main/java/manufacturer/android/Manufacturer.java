package manufacturer.android;

import android.os.Build;
import android.text.TextUtils;

import java.util.Locale;

public enum Manufacturer {
    UNKNOWN("未知", ""),
    HUAWEI("华为", "huawei"),
    MEIZU("魅族", "meizu"),
    XIAOMI("小米", "xiaomi"),
    OPPO("OPPO", "oppo"),
    VIVO("VIVO", "vivo"),
    SAMSUNG("三星", "samsung"),
    SONY("索尼", "sony"),
    LG("LG", "lg"),
    LETV("乐视", "letv"),
    ZTE("中兴", "zte"),
    YULONG("酷派", "yulong"),
    LENOVO("联想", "lenovo");

    private final String alias;
    private final String manufacturer;

    Manufacturer(String alias, String manufacturer) {
        this.alias = alias;
        this.manufacturer = manufacturer;
    }

    public static Manufacturer recognizer() {
        Manufacturer recognizer = UNKNOWN;
        for (Manufacturer manufacturer : Manufacturer.values()) {
            if (manufacturer != UNKNOWN) {
                if (TextUtils.equals(manufacturer.manufacturer, Build.MANUFACTURER.toLowerCase(Locale.getDefault()))) {
                    recognizer = manufacturer;
                    break;
                }
            }
        }
        return recognizer;
    }
}
