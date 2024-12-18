package X;

import android.content.Context;
import android.os.Build;
import android.provider.Telephony;
import android.telephony.TelephonyManager;

/* renamed from: X.RsD, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC61696RsD {
    public static boolean A00(Context context) {
        if (C02G.A00(context, "android.permission.READ_PHONE_NUMBERS") == 0 || (((Build.VERSION.SDK_INT < 30 || context.getApplicationContext().getApplicationInfo().targetSdkVersion < 30) && C02G.A00(context, "android.permission.READ_PHONE_STATE") == 0) || C02G.A00(context, "android.permission.READ_SMS") == 0 || context.getPackageName().equals(Telephony.Sms.getDefaultSmsPackage(context)))) {
            return true;
        }
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        return telephonyManager != null && telephonyManager.hasCarrierPrivileges();
    }
}
