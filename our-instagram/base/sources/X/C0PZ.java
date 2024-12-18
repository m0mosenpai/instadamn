package X;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.SystemClock;
import com.facebook.proxygen.LigerSamplePolicy;

/* renamed from: X.0PZ, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C0PZ {
    public static long A00;
    public static boolean A01;

    public static boolean A00(Context context) {
        boolean z;
        NetworkInfo activeNetworkInfo;
        if (SystemClock.uptimeMillis() - A00 < LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT) {
            return A01;
        }
        boolean z2 = false;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager != null && (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) != null && activeNetworkInfo.isAvailable()) {
                if (activeNetworkInfo.isConnected()) {
                    z2 = true;
                }
            }
            z = z2;
        } catch (Throwable th) {
            C0K8.A0F("lacrima", "Connectivity check failed", th);
            C0PC.A00().DEh("CheckNetwork", th, null);
            z = false;
        }
        A01 = z2;
        A00 = SystemClock.uptimeMillis();
        return z;
    }
}
