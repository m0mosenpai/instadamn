package X;

import android.text.TextUtils;
import java.net.UnknownHostException;

/* renamed from: X.2Bo, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC46512Bo {
    public static final Object A01 = new Object();
    public static InterfaceC46522Bp A00 = InterfaceC46522Bp.A00;

    public static String A00(String str, Throwable th) {
        boolean z;
        String replace;
        synchronized (A01) {
            if (th == null) {
                replace = null;
            } else {
                Throwable th2 = th;
                while (true) {
                    if (th2 != null) {
                        if (!(th2 instanceof UnknownHostException)) {
                            th2 = th2.getCause();
                        } else {
                            z = true;
                            break;
                        }
                    } else {
                        z = false;
                        break;
                    }
                }
                if (z) {
                    replace = "UnknownHostException (no network)";
                } else {
                    replace = android.util.Log.getStackTraceString(th).trim().replace("\t", "    ");
                }
            }
        }
        if (!TextUtils.isEmpty(replace)) {
            return AnonymousClass001.A0h(str, "\n  ", replace.replace("\n", "\n  "), '\n');
        }
        return str;
    }

    public static void A01() {
        synchronized (A01) {
        }
    }

    public static void A02() {
        synchronized (A01) {
        }
    }

    public static void A03(String str, String str2) {
        synchronized (A01) {
            android.util.Log.e(str, str2);
        }
    }

    public static void A04(String str, String str2) {
        synchronized (A01) {
            android.util.Log.w(str, str2);
        }
    }

    public static void A05(String str, String str2, Throwable th) {
        A03(str, A00(str2, th));
    }

    public static void A06(String str, String str2, Throwable th) {
        A04(str, A00(str2, th));
    }
}
