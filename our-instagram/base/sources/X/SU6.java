package X;

import android.content.Context;
import android.content.pm.PackageManager;

/* loaded from: classes10.dex */
public abstract class SU6 {
    public static final C62442SBv A00 = new C62442SBv("CommonUtils", "");

    public static String A00(Context context) {
        try {
            return String.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
        } catch (PackageManager.NameNotFoundException e) {
            C62442SBv c62442SBv = A00;
            String concat = "Exception thrown when trying to get app version ".concat(e.toString());
            if (android.util.Log.isLoggable("CommonUtils", 6)) {
                String str = c62442SBv.A00;
                if (str != null) {
                    concat = str.concat(concat);
                }
                android.util.Log.e("CommonUtils", concat);
                return "";
            }
            return "";
        }
    }
}
