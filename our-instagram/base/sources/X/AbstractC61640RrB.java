package X;

import android.content.Context;
import android.telephony.TelephonyManager;

/* renamed from: X.RrB, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC61640RrB {
    public static void A00(Context context, C63176Seb c63176Seb) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            telephonyManager.getClass();
            C58706Q3v c58706Q3v = new C58706Q3v(c63176Seb);
            telephonyManager.registerTelephonyCallback(context.getMainExecutor(), c58706Q3v);
            telephonyManager.unregisterTelephonyCallback(c58706Q3v);
        } catch (RuntimeException unused) {
            C63176Seb.A01(c63176Seb, 5);
        }
    }
}
