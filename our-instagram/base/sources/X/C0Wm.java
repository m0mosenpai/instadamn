package X;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;

/* renamed from: X.0Wm, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C0Wm {
    public static final boolean A00(Context context) {
        C14360o3.A0B(context, 0);
        Object systemService = context.getSystemService("connectivity");
        C14360o3.A0C(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
        try {
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
            if (networkCapabilities != null) {
                return networkCapabilities.hasTransport(4);
            }
        } catch (SecurityException | RuntimeException unused) {
        }
        return false;
    }
}
