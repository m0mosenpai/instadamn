package X;

import android.content.Context;
import java.util.TreeSet;

/* renamed from: X.4eN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C100004eN {
    public static C100004eN A01;
    public static final java.util.Set A02;
    public static final String[] A03;
    public final Context A00;

    static {
        TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
        A02 = treeSet;
        A03 = new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"};
        treeSet.add("com.instagram.android");
    }

    public static synchronized C100004eN A00(Context context) {
        C100004eN c100004eN;
        synchronized (C100004eN.class) {
            c100004eN = A01;
            if (c100004eN == null) {
                c100004eN = new C100004eN(context);
                A01 = c100004eN;
            }
        }
        return c100004eN;
    }

    public final boolean A01() {
        String[] strArr = A03;
        int i = 0;
        do {
            try {
                if (this.A00.checkCallingOrSelfPermission(strArr[i]) == 0) {
                    return true;
                }
            } catch (Throwable th) {
                C0K8.A0F("GeoApiAppPermissionChecker", "Runtime exception in accessing OS permissions [%s]", th);
            }
            i++;
        } while (i < 2);
        return false;
    }

    public final boolean A02() {
        try {
            if (this.A00.checkCallingOrSelfPermission("android.permission.ACCESS_FINE_LOCATION") != 0) {
                return false;
            }
            return true;
        } catch (Throwable th) {
            C0K8.A0F("GeoApiAppPermissionChecker", "Runtime exception in accessing OS permissions [%s]", th);
            return false;
        }
    }

    public C100004eN(Context context) {
        A02.contains(context.getApplicationContext().getPackageName());
        this.A00 = context.getApplicationContext();
    }
}
