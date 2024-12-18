package X;

import android.os.Build;

/* renamed from: X.SRn, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62793SRn {
    public static void A00() {
        if (!Build.FINGERPRINT.contains("vbox")) {
            StringBuilder A1C = AbstractC166987dD.A1C();
            A1C.append(Build.MODEL);
            A1C.append(" - ");
            A1C.append(Build.VERSION.RELEASE);
            A1C.append(" - API ");
            A1C.append(Build.VERSION.SDK_INT);
            A1C.toString();
        }
    }
}
