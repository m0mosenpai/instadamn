package X;

import android.text.TextUtils;
import java.net.UnknownHostException;

/* renamed from: X.Sil, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC63374Sil {
    public static final Object A01 = AbstractC58318PtA.A0b();
    public static InterfaceC65601Tnq A00 = InterfaceC65601Tnq.A00;

    public static String A00(String str, Throwable th) {
        boolean z;
        String replace;
        if (th == null) {
            replace = null;
        } else {
            synchronized (A01) {
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

    public static void A01(String str) {
        synchronized (A01) {
            A00(str, null);
        }
    }

    public static void A02(String str) {
        synchronized (A01) {
            A00(str, null);
        }
    }

    public static void A03(String str, String str2) {
        synchronized (A01) {
            android.util.Log.e(str, A00(str2, null));
        }
    }

    public static void A04(String str, String str2) {
        synchronized (A01) {
            android.util.Log.w(str, A00(str2, null));
        }
    }

    public static void A05(String str, String str2, Throwable th) {
        synchronized (A01) {
            android.util.Log.e(str, A00(str2, th));
        }
    }

    public static void A06(String str, String str2, Throwable th) {
        synchronized (A01) {
            android.util.Log.w(str, A00(str2, th));
        }
    }
}
