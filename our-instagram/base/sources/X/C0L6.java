package X;

import android.app.ActivityManager;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: X.0L6, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0L6 {
    public static volatile C04670Mj A04;
    public static volatile String A05;
    public static volatile boolean A06;
    public static final ExecutorService A03 = Executors.newSingleThreadExecutor();
    public static final java.util.Set A02 = new HashSet();
    public static final java.util.Set A01 = new HashSet();
    public static final List A00 = new ArrayList();

    public static String A00() {
        if (A04 == null) {
            return "";
        }
        return A04.A02;
    }

    public static String A01() {
        String str;
        if (A04 == null || (str = A04.A04) == null) {
            return "unknown";
        }
        return str;
    }

    public static synchronized void A02(C0L2 c0l2) {
        synchronized (C0L6.class) {
            A01.add(c0l2);
        }
    }

    public static synchronized void A03(C0L3 c0l3, boolean z) {
        synchronized (C0L6.class) {
            A02.add(c0l3);
            if (z && A06) {
                final HashSet hashSet = new HashSet();
                hashSet.add(c0l3);
                A03.execute(new Runnable() { // from class: X.0Ky
                    @Override // java.lang.Runnable
                    public final void run() {
                        java.util.Set set = hashSet;
                        boolean z2 = C0L6.A06;
                        Iterator it = set.iterator();
                        while (it.hasNext()) {
                            ((C0L3) it.next()).Cwx();
                        }
                    }
                });
            }
        }
    }

    public static void A04(C0LE c0le) {
        if (A04 != null) {
            C04770Mv.A00.A01(c0le, C0M6.CRITICAL_REPORT);
        }
    }

    public static void A05(C0LE c0le, String str) {
        if (A04 != null) {
            C04770Mv.A00.A02(c0le, C0M6.CRITICAL_REPORT, str);
        }
    }

    public static boolean A06() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        if (runningAppProcessInfo.importance != 100) {
            return false;
        }
        return true;
    }

    public static boolean A07() {
        if (A04 == null) {
            return false;
        }
        return A04.A05;
    }
}
