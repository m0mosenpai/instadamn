package X;

import android.content.Context;
import android.telephony.TelephonyManager;

/* renamed from: X.5fJ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC121675fJ {
    public static void A00(Context context, C4VV c4vv) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            telephonyManager.getClass();
            C121685fK c121685fK = new C121685fK(c4vv);
            telephonyManager.registerTelephonyCallback(context.getMainExecutor(), c121685fK);
            telephonyManager.unregisterTelephonyCallback(c121685fK);
        } catch (RuntimeException unused) {
            C4VV.A00(c4vv, 5);
        }
    }
}
