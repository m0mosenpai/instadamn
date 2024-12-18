package X;

import android.content.SharedPreferences;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.Fgy, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35264Fgy {
    public static final FF2 A00;
    public static final FF2 A01;
    public static final FF3 A02;
    public static final C1QJ A03;
    public static final C1QJ A04;
    public static final C1QK A05;

    static {
        SharedPreferences sharedPreferences = AbstractC12290kX.A00.getSharedPreferences("unauthenticated", 0);
        C14360o3.A0B(sharedPreferences, 1);
        C17320tT c17320tT = new C17320tT(sharedPreferences, null);
        A00 = new FF2(c17320tT);
        A03 = new C1QJ(c17320tT, "last_log_in_token");
        A01 = new FF2(c17320tT);
        A02 = new FF3(c17320tT);
        A05 = new C1QK(c17320tT, "last_attempt_time_stamp");
        A04 = new C1QJ(c17320tT, "last_user_profile_photo_url");
    }

    public static synchronized int A00() {
        int A012;
        synchronized (C35264Fgy.class) {
            long currentTimeMillis = System.currentTimeMillis();
            InterfaceC19630xq interfaceC19630xq = A05.A00;
            if (interfaceC19630xq.getLong("last_attempt_time_stamp", 0L) + 604800000 < currentTimeMillis || interfaceC19630xq.getLong("last_attempt_time_stamp", 0L) > currentTimeMillis) {
                InterfaceC19610xo ARD = A02.A00.ARD();
                ARD.E7D("number_of_login_attempts", 0);
                ARD.apply();
            }
            A012 = AbstractC31172DnG.A01(A02.A00, "number_of_login_attempts");
        }
        return A012;
    }

    public static synchronized String A01() {
        String string;
        synchronized (C35264Fgy.class) {
            string = A03.A00.getString("last_log_in_token", null);
        }
        return string;
    }

    public static synchronized void A02() {
        InterfaceC19610xo ARD;
        synchronized (C35264Fgy.class) {
            A05.A00(AbstractC31173DnH.A0g());
            InterfaceC19630xq interfaceC19630xq = A02.A00;
            int A012 = AbstractC31172DnG.A01(interfaceC19630xq, "number_of_login_attempts") + 1;
            if (Integer.valueOf(A012) == null) {
                ARD = interfaceC19630xq.ARD();
                ARD.EEj("number_of_login_attempts");
            } else {
                ARD = interfaceC19630xq.ARD();
                ARD.E7D("number_of_login_attempts", A012);
            }
            ARD.apply();
        }
    }

    public static synchronized void A03(ImageUrl imageUrl, String str) {
        synchronized (C35264Fgy.class) {
            A03.A00(str);
            InterfaceC19610xo ARD = A00.A00.ARD();
            ARD.E77("did_facebook_sso", true);
            ARD.apply();
            A04.A00(imageUrl.getUrl());
        }
    }

    public static synchronized void A04(String str) {
        synchronized (C35264Fgy.class) {
            A03.A00(str);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0014, code lost:
    
        if (A01() != null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized boolean A05() {
        /*
            java.lang.Class<X.Fgy> r2 = X.C35264Fgy.class
            monitor-enter(r2)
            X.FF2 r0 = X.C35264Fgy.A00     // Catch: java.lang.Throwable -> L19
            X.0xq r1 = r0.A00     // Catch: java.lang.Throwable -> L19
            java.lang.String r0 = "did_facebook_sso"
            boolean r0 = X.AbstractC31172DnG.A1a(r1, r0)     // Catch: java.lang.Throwable -> L19
            if (r0 != 0) goto L16
            java.lang.String r1 = A01()     // Catch: java.lang.Throwable -> L1b
            r0 = 0
            if (r1 == 0) goto L17
        L16:
            r0 = 1
        L17:
            monitor-exit(r2)
            return r0
        L19:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L1b
        L1b:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35264Fgy.A05():boolean");
    }

    public static synchronized boolean A06() {
        boolean A1a;
        synchronized (C35264Fgy.class) {
            A1a = AbstractC31172DnG.A1a(A01.A00, "registration_push_sent_v2");
        }
        return A1a;
    }
}
