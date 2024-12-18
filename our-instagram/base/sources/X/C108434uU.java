package X;

import android.content.Context;

/* renamed from: X.4uU, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C108434uU {
    public final Context A00;

    public static boolean A00(C108434uU c108434uU) {
        Context context = c108434uU.A00;
        if ((context.getApplicationInfo().targetSdkVersion < 26 && context.checkCallingOrSelfPermission("android.permission.ACCESS_COARSE_LOCATION") == 0) || context.checkCallingOrSelfPermission("android.permission.ACCESS_FINE_LOCATION") == 0) {
            return true;
        }
        return false;
    }

    public C108434uU(Context context) {
        this.A00 = context;
    }
}
