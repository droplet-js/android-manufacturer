package manufacturer.android;

import android.os.Build;
import android.text.TextUtils;

import java.lang.reflect.Method;

public class Flyme {

    public static boolean isFlyme() {
        try {
            // Invoke Build.hasSmartBar()
            final Method method = Build.class.getMethod("hasSmartBar");
            return method != null || TextUtils.equals("Meizu", Build.MANUFACTURER);
        } catch (NoSuchMethodException e) {
        }
        return TextUtils.equals("Meizu", Build.MANUFACTURER);
    }
}
