package X;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* renamed from: X.4OT, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C4OT {
    public static final boolean A00(Context context) {
        C14360o3.A0B(context, 0);
        try {
            Object systemService = context.getSystemService("connectivity");
            C14360o3.A0C(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                return false;
            }
            if (!activeNetworkInfo.isConnected()) {
                return false;
            }
            return true;
        } catch (RuntimeException e) {
            C0K8.A0F("NetworkUtils", "Unable to check internet", e);
            return false;
        }
    }
}
