package X;

import android.content.Context;

/* renamed from: X.0yH, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C19870yH {
    public static C09530e4 A00;

    public static final synchronized C09530e4 A00() {
        C09530e4 c09530e4;
        long j;
        String str;
        synchronized (C19870yH.class) {
            c09530e4 = A00;
            if (c09530e4 == null) {
                Context context = AbstractC12290kX.A00;
                C14360o3.A07(context);
                String A03 = C20150ym.A03(AbstractC20070ye.A00(18863741177233566L));
                boolean A07 = C20150ym.A07(AbstractC20070ye.A00(2324143800438164580L));
                boolean A072 = C20150ym.A07(AbstractC20070ye.A00(2324143800438754407L));
                synchronized (C06580Wl.class) {
                    C14360o3.A0B(A03, 1);
                    boolean z = false;
                    if (!C06580Wl.A01(A03, C06580Wl.A00(context))) {
                        str = "country_check";
                    } else if (A07 && C0Wm.A00(context)) {
                        str = "vpn_in_use";
                    } else {
                        if (A072) {
                            String property = System.getProperty("http.proxyHost");
                            String property2 = System.getProperty("https.proxyHost");
                            if (property != null || property2 != null) {
                                str = "system_proxy_in_use";
                            }
                        }
                        if (C06580Wl.A00(context).equalsIgnoreCase("ru")) {
                            j = 18300791225257065L;
                        } else {
                            j = 2324143800438819944L;
                        }
                        z = Boolean.valueOf(C20150ym.A07(AbstractC20070ye.A00(j)));
                        str = "mc";
                    }
                    c09530e4 = new C09530e4(z, str);
                    C0K8.A0P("proxy_service", "Should proxy traffic: %b (%s)", c09530e4.A00, c09530e4.A01);
                }
                A00 = c09530e4;
            }
        }
        return c09530e4;
    }

    public static final synchronized boolean A01() {
        boolean booleanValue;
        synchronized (C19870yH.class) {
            booleanValue = ((Boolean) A00().A00).booleanValue();
        }
        return booleanValue;
    }
}
