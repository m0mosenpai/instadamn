package X;

import android.content.Context;
import android.os.Handler;
import com.facebook.react.modules.appstate.AppStateModule;

/* loaded from: classes9.dex */
public final class MTF {
    public static Runnable A08;
    public static final Object A09 = new Object();
    public boolean A00;
    public boolean A01;
    public final Context A04;
    public final C58428Pv7 A06;
    public final MTD A07;
    public final Handler A05 = AbstractC167007dF.A0J();
    public boolean A02 = true;
    public final int A03 = 34668546;

    public MTF(Context context, C58428Pv7 c58428Pv7, MTD mtd) {
        String str;
        this.A07 = mtd;
        this.A04 = context;
        this.A06 = c58428Pv7;
        mtd.A05.get(0);
        synchronized (this) {
            C006802i c006802i = C006802i.A0p;
            MTD mtd2 = this.A07;
            int i = mtd2.A00;
            EnumC27091Ti enumC27091Ti = (EnumC27091Ti) mtd2.A05.get(0);
            c006802i.markerStart(34668546, i);
            c006802i.markerAnnotate(34668546, i, "module_name", enumC27091Ti.A00);
            c006802i.markerAnnotate(34668546, i, "google", AbstractC26751Re.A00(this.A04));
            switch (mtd2.A04.intValue()) {
                case 0:
                    str = "foreground";
                    break;
                case 1:
                    str = AppStateModule.APP_STATE_BACKGROUND;
                    break;
                default:
                    str = "prefetch";
                    break;
            }
            c006802i.markerAnnotate(34668546, i, "use_case", str);
            c006802i.markerAnnotate(34668546, i, "is_downloaded", C1RQ.A00().A05(enumC27091Ti));
            c006802i.markerAnnotate(34668546, i, "is_loaded", C1RQ.A00().A06(enumC27091Ti));
            c006802i.markerAnnotate(34668546, i, "built_in", false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0076 A[Catch: all -> 0x0086, TryCatch #1 {, blocks: (B:17:0x0059, B:20:0x0069, B:22:0x0076, B:23:0x007e, B:24:0x007b, B:37:0x0085, B:5:0x0002, B:7:0x0006, B:11:0x0009, B:13:0x0010, B:16:0x0055, B:25:0x001f, B:27:0x0027, B:29:0x002d, B:31:0x0037, B:32:0x003f, B:34:0x0045), top: B:3:0x0002, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007e A[Catch: all -> 0x0086, TRY_LEAVE, TryCatch #1 {, blocks: (B:17:0x0059, B:20:0x0069, B:22:0x0076, B:23:0x007e, B:24:0x007b, B:37:0x0085, B:5:0x0002, B:7:0x0006, B:11:0x0009, B:13:0x0010, B:16:0x0055, B:25:0x001f, B:27:0x0027, B:29:0x002d, B:31:0x0037, B:32:0x003f, B:34:0x0045), top: B:3:0x0002, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean A01(boolean r9) {
        /*
            r8 = this;
            r7 = r8
            monitor-enter(r7)
            boolean r0 = r8.A02     // Catch: java.lang.Throwable -> L84
            if (r0 != 0) goto L9
            boolean r0 = r8.A01     // Catch: java.lang.Throwable -> L84
            goto L82
        L9:
            r4 = 0
            r8.A02 = r4     // Catch: java.lang.Throwable -> L84
            boolean r0 = X.AbstractC167007dF.A1N(r9)
            X.02i r6 = X.C006802i.A0p     // Catch: java.lang.Throwable -> L84
            X.MTD r3 = r8.A07     // Catch: java.lang.Throwable -> L84
            int r5 = r3.A00     // Catch: java.lang.Throwable -> L84
            r2 = 2
            if (r0 == 0) goto L1f
            r1 = 34668546(0x2110002, float:1.065292E-37)
            r0 = 461(0x1cd, float:6.46E-43)
            goto L55
        L1f:
            X.Pv7 r1 = r8.A06     // Catch: java.lang.Throwable -> L84
            boolean r0 = r1.A07()     // Catch: java.lang.Throwable -> L84
            if (r0 == 0) goto L3f
            java.lang.Object r0 = r1.A04()     // Catch: java.lang.Throwable -> L84
            if (r0 == 0) goto L3f
            java.lang.Object r0 = r1.A04()     // Catch: java.lang.Throwable -> L84
            X.5kd r0 = (X.C124725kd) r0     // Catch: java.lang.Throwable -> L84
            boolean r0 = r0.A03     // Catch: java.lang.Throwable -> L84
            if (r0 == 0) goto L3f
            r0 = 34668546(0x2110002, float:1.065292E-37)
            r6.markerEnd(r0, r5, r2)     // Catch: java.lang.Throwable -> L84
            r0 = 1
            goto L59
        L3f:
            java.lang.Exception r0 = r1.A03()     // Catch: java.lang.Throwable -> L84
            if (r0 == 0) goto L51
            r2 = 34668546(0x2110002, float:1.065292E-37)
            java.lang.String r1 = "error"
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L84
            r6.markerAnnotate(r2, r5, r1, r0)     // Catch: java.lang.Throwable -> L84
        L51:
            r1 = 34668546(0x2110002, float:1.065292E-37)
            r0 = 3
        L55:
            r6.markerEnd(r1, r5, r0)     // Catch: java.lang.Throwable -> L84
            r0 = 0
        L59:
            r8.A01 = r0     // Catch: java.lang.Throwable -> L86
            java.util.List r0 = r3.A05     // Catch: java.lang.Throwable -> L86
            r0.get(r4)     // Catch: java.lang.Throwable -> L86
            android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L86
            X.8do r0 = r3.A03     // Catch: java.lang.Throwable -> L86
            if (r9 == 0) goto L7b
            if (r0 == 0) goto L7b
            X.80A r2 = new X.80A     // Catch: java.lang.Throwable -> L86
            r2.<init>()     // Catch: java.lang.Throwable -> L86
            java.lang.Integer r1 = X.MTE.A00(r3)     // Catch: java.lang.Throwable -> L86
            java.lang.Integer r0 = X.C05F.A00     // Catch: java.lang.Throwable -> L86
            if (r1 != r0) goto L7e
            android.os.Handler r0 = r8.A05     // Catch: java.lang.Throwable -> L86
            r0.post(r2)     // Catch: java.lang.Throwable -> L86
        L7b:
            boolean r0 = r8.A01     // Catch: java.lang.Throwable -> L86
            goto L82
        L7e:
            r2.run()     // Catch: java.lang.Throwable -> L86
            goto L7b
        L82:
            monitor-exit(r7)
            return r0
        L84:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L86
        L86:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MTF.A01(boolean):boolean");
    }

    public final void A00() {
        MTD mtd = this.A07;
        if (MTE.A00(mtd) == C05F.A00 && mtd.A02 != null) {
            synchronized (this) {
                if (this.A00) {
                    this.A05.post(new PN5(this));
                } else {
                    synchronized (A09) {
                        Runnable runnable = A08;
                        if (runnable != null) {
                            this.A05.removeCallbacks(runnable);
                            A08 = null;
                        }
                    }
                }
            }
        }
    }
}
