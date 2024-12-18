package X;

import android.content.Context;
import android.os.Build;
import com.facebook.R;

/* renamed from: X.Sfc, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC63225Sfc {
    public static boolean A00(Context context, String str) {
        if (Build.VERSION.SDK_INT >= 30 || str == null) {
            return false;
        }
        for (String str2 : context.getResources().getStringArray(R.array.assume_strong_biometrics_models)) {
            if (str.equals(str2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean A01(Context context, String str) {
        if (Build.VERSION.SDK_INT != 29 || str == null) {
            return false;
        }
        for (String str2 : context.getResources().getStringArray(R.array.delay_showing_prompt_models)) {
            if (str.equals(str2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean A02(Context context, String str) {
        if (Build.VERSION.SDK_INT != 28 || str == null) {
            return false;
        }
        for (String str2 : context.getResources().getStringArray(R.array.hide_fingerprint_instantly_prefixes)) {
            if (str.startsWith(str2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean A03(Context context, String str, String str2) {
        if (Build.VERSION.SDK_INT != 28) {
            return false;
        }
        if (str != null) {
            for (String str3 : context.getResources().getStringArray(R.array.crypto_fingerprint_fallback_vendors)) {
                if (str.equalsIgnoreCase(str3)) {
                    break;
                }
            }
        }
        if (str2 == null) {
            return false;
        }
        for (String str4 : context.getResources().getStringArray(R.array.crypto_fingerprint_fallback_prefixes)) {
            if (str2.startsWith(str4)) {
                return true;
            }
        }
        return false;
    }
}
