package X;

import android.content.Context;
import android.provider.Settings;

/* renamed from: X.0Lz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC04570Lz {
    public static String A00(Context context) {
        try {
            String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
            return string != null ? string : "0";
        } catch (Exception e) {
            C0PC.A00().DEh("GetAndroidID", e, null);
            C0K8.A0F("lacrima", "Failed to fetch the constant field ANDROID_ID", e);
            return "0";
        }
    }
}
