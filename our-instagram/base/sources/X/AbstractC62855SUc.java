package X;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: X.SUc, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC62855SUc {
    public static final C03190Dc A00;
    public static final C03190Dc A01;

    public static boolean A00(Context context, String str) {
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(str, 0);
            if (!A01.A02(context, applicationInfo.uid)) {
                if (!A00.A02(context, applicationInfo.uid)) {
                    return false;
                }
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    static {
        new C0B5("-sYXRdwJA3hvue3mKpYrOZ9zSPC7b4mbgzJmdZEDO5w");
        HashSet A1H = AbstractC166987dD.A1H();
        A1H.add(AbstractC08760ce.A0d);
        A1H.add(AbstractC08760ce.A0m);
        A1H.add(AbstractC08760ce.A1G);
        A1H.add(AbstractC08760ce.A1h);
        A01 = AbstractC08590cN.A02(Collections.unmodifiableSet(A1H));
        HashMap A1G = AbstractC166987dD.A1G();
        A1G.put(AbstractC08760ce.A0h, "com.facebook.study");
        A1G.put(AbstractC08760ce.A0A, "com.facebook.viewpoints");
        A00 = AbstractC08590cN.A01(Collections.unmodifiableMap(A1G));
    }
}
