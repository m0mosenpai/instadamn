package X;

import android.os.Build;
import android.os.Bundle;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.Collections;
import java.util.concurrent.Executor;

/* renamed from: X.SWy, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62917SWy {
    public final C63342Shx A00;
    public final C63301Sh5 A01;
    public final C63151Sdy A02;
    public final SW7 A03;
    public final Executor A04;

    public static final C5KS A00(final Bundle bundle, final C62917SWy c62917SWy, String str, String str2, String str3) {
        String str4;
        java.util.Set unmodifiableSet;
        java.util.Set unmodifiableSet2;
        String A0T;
        bundle.putString("scope", str3);
        bundle.putString("sender", str2);
        bundle.putString("subtype", str2);
        bundle.putString(PublicKeyCredentialControllerUtility.JSON_KEY_APPID, str);
        C63342Shx c63342Shx = c62917SWy.A00;
        C63342Shx.A01(c63342Shx);
        bundle.putString("gmp_app_id", c63342Shx.A01.A00);
        C63301Sh5 c63301Sh5 = c62917SWy.A01;
        bundle.putString("gmsv", Integer.toString(c63301Sh5.A04()));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", c63301Sh5.A05());
        synchronized (c63301Sh5) {
            if (c63301Sh5.A00 == null) {
                C63301Sh5.A02(c63301Sh5);
            }
            str4 = c63301Sh5.A00;
        }
        bundle.putString("app_ver_name", str4);
        bundle.putString("cliv", "fiid-12451000");
        SW7 sw7 = c62917SWy.A03;
        java.util.Set set = sw7.A00.A00;
        synchronized (set) {
            unmodifiableSet = Collections.unmodifiableSet(set);
        }
        if (unmodifiableSet.isEmpty()) {
            A0T = sw7.A01;
        } else {
            String str5 = sw7.A01;
            synchronized (set) {
                unmodifiableSet2 = Collections.unmodifiableSet(set);
            }
            A0T = AnonymousClass001.A0T(str5, SW7.A00(unmodifiableSet2), ' ');
        }
        bundle.putString("Firebase-Client", A0T);
        final C58411Pup c58411Pup = new C58411Pup();
        c62917SWy.A04.execute(new Runnable(bundle, c58411Pup, c62917SWy) { // from class: X.TQB
            public final Bundle A00;
            public final C58411Pup A01;
            public final C62917SWy A02;

            {
                this.A02 = c62917SWy;
                this.A00 = bundle;
                this.A01 = c58411Pup;
            }

            /* JADX WARN: Code restructure failed: missing block: B:21:0x004a, code lost:
            
                if (((X.Rk4) r1.getCause()).A00 == 4) goto L19;
             */
            /* JADX WARN: Code restructure failed: missing block: B:34:0x0064, code lost:
            
                if (r0 != false) goto L27;
             */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    r7 = this;
                    X.SWy r0 = r7.A02
                    android.os.Bundle r5 = r7.A00
                    X.Pup r3 = r7.A01
                    X.Sdy r4 = r0.A02     // Catch: java.io.IOException -> L6b
                    X.Sh5 r0 = r4.A05     // Catch: java.io.IOException -> L6b
                    int r1 = r0.A04()     // Catch: java.io.IOException -> L6b
                    r0 = 12000000(0xb71b00, float:1.6815582E-38)
                    if (r1 < r0) goto L4c
                    android.content.Context r0 = r4.A03     // Catch: java.io.IOException -> L6b
                    X.Pus r6 = X.C58414Pus.A01(r0)     // Catch: java.io.IOException -> L6b
                    monitor-enter(r6)     // Catch: java.io.IOException -> L6b
                    int r2 = r6.A00     // Catch: java.lang.Throwable -> L30
                    int r0 = r2 + 1
                    r6.A00 = r0     // Catch: java.lang.Throwable -> L30
                    monitor-exit(r6)     // Catch: java.io.IOException -> L6b
                    r1 = 1
                    X.RVT r0 = new X.RVT     // Catch: java.io.IOException -> L6b
                    r0.<init>(r5, r2, r1)     // Catch: java.io.IOException -> L6b
                    X.5KS r0 = X.C58414Pus.A00(r6, r0)     // Catch: java.io.IOException -> L6b
                    java.lang.Object r2 = X.AbstractC58434PvD.A00(r0)     // Catch: java.lang.Throwable -> L33 java.io.IOException -> L6b
                    goto L67
                L30:
                    r0 = move-exception
                    monitor-exit(r6)     // Catch: java.io.IOException -> L6b
                    throw r0     // Catch: java.io.IOException -> L6b
                L33:
                    r1 = move-exception
                    java.lang.String r0 = "FirebaseInstanceId"
                    X.AbstractC58320PtC.A1L(r0, r1)     // Catch: java.io.IOException -> L6b
                    java.lang.Throwable r0 = r1.getCause()     // Catch: java.io.IOException -> L6b
                    boolean r0 = r0 instanceof X.Rk4     // Catch: java.io.IOException -> L6b
                    if (r0 == 0) goto L66
                    java.lang.Throwable r0 = r1.getCause()     // Catch: java.io.IOException -> L6b
                    X.Rk4 r0 = (X.Rk4) r0     // Catch: java.io.IOException -> L6b
                    int r1 = r0.A00     // Catch: java.io.IOException -> L6b
                    r0 = 4
                    if (r1 != r0) goto L66
                L4c:
                    android.os.Bundle r2 = X.C63151Sdy.A00(r5, r4)     // Catch: java.io.IOException -> L6b
                    if (r2 == 0) goto L67
                    java.lang.String r1 = "google.messenger"
                    boolean r0 = r2.containsKey(r1)     // Catch: java.io.IOException -> L6b
                    if (r0 == 0) goto L67
                    android.os.Bundle r2 = X.C63151Sdy.A00(r5, r4)     // Catch: java.io.IOException -> L6b
                    if (r2 == 0) goto L67
                    boolean r0 = r2.containsKey(r1)     // Catch: java.io.IOException -> L6b
                    if (r0 == 0) goto L67
                L66:
                    r2 = 0
                L67:
                    r3.A01(r2)     // Catch: java.io.IOException -> L6b
                    return
                L6b:
                    r0 = move-exception
                    r3.A00(r0)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: X.TQB.run():void");
            }
        });
        return c58411Pup.A00;
    }

    public C62917SWy(C63342Shx c63342Shx, C63301Sh5 c63301Sh5, SW7 sw7, Executor executor) {
        C63342Shx.A01(c63342Shx);
        C63151Sdy c63151Sdy = new C63151Sdy(c63342Shx.A00, c63301Sh5);
        this.A00 = c63342Shx;
        this.A01 = c63301Sh5;
        this.A02 = c63151Sdy;
        this.A04 = executor;
        this.A03 = sw7;
    }
}
