package manufacturer.android;

import android.text.TextUtils;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MIUI {

    public static final int MIUI_UNKNOWN =  -1;
    public static final int MIUI_V5 = 3;
    public static final int MIUI_V6 = 4;
    public static final int MIUI_V7 = 5;
    public static final int MIUI_V8 = 6;
    public static final int MIUI_V9 = 7;

    private static final String KEY_MIUI_VERSION_NAME = "ro.miui.ui.version.name";
    private static final String KEY_MIUI_VERSION_CODE = "ro.miui.ui.version.code";
    private static final String KEY_MIUI_NOTCH = "ro.miui.notch";

    public static boolean isMIUI() {
        try {
            Class<?> c = Class.forName("android.os.SystemProperties");
            Method m = c.getDeclaredMethod("get", String.class, String.class);
            m.setAccessible(true);
            // SystemProperties.get(KEY_MIUI_VERSION_NAME, "");
            String property = (String) m.invoke(null, KEY_MIUI_VERSION_NAME, "");
            return !TextUtils.isEmpty(property);
        } catch (ClassNotFoundException e) {
        } catch (NoSuchMethodException e) {
        } catch (IllegalAccessException e) {
        } catch (InvocationTargetException e) {
        }
        return false;
    }

    public static int getMIUIVersion() {
        try {
            Class<?> c = Class.forName("android.os.SystemProperties");
            Method m = c.getDeclaredMethod("getInt", String.class, int.class);
            m.setAccessible(true);
            // SystemProperties.getInt(KEY_MIUI_VERSION_CODE, MIUI_UNKNOWN);
            int property = (int) m.invoke(null, KEY_MIUI_VERSION_CODE, MIUI_UNKNOWN);
            return property;
        } catch (ClassNotFoundException e) {
        } catch (NoSuchMethodException e) {
        } catch (IllegalAccessException e) {
        } catch (InvocationTargetException e) {
        }
        return MIUI_UNKNOWN;
    }

    public static boolean hasNotch() {
        try {
            Class<?> c = Class.forName("android.os.SystemProperties");
            Method m = c.getDeclaredMethod("getInt", String.class, int.class);
            m.setAccessible(true);
            // SystemProperties.getInt(KEY_MIUI_NOTCH, 0)
            int property = (int) m.invoke(null, KEY_MIUI_NOTCH, 0);
            return property == 1;
        } catch (ClassNotFoundException e) {
        } catch (NoSuchMethodException e) {
        } catch (IllegalAccessException e) {
        } catch (InvocationTargetException e) {
        }
        return false;
    }
}
