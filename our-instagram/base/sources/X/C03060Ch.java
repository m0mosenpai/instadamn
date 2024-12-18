package X;

import java.io.File;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* renamed from: X.0Ch, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C03060Ch implements C0OO {
    public final C0LW A00;
    public final int A01;
    public final C0Pe A02;
    public final InterfaceC08830cm A03;
    public final boolean A04;

    @Override // X.C0OO
    public final /* synthetic */ C0Z0 BNJ() {
        return null;
    }

    public static void A00(final C03060Ch c03060Ch, File file, File file2, int i) {
        long lastModified;
        File file3 = new File(file, "anr_state.txt");
        final C024209q c024209q = new C024209q(null);
        if (i > 0) {
            c024209q.A01(C0LK.A16, i);
        }
        C10860hv c10860hv = C0LK.A3E;
        if (file2 != null) {
            lastModified = file2.lastModified();
        } else {
            lastModified = file3.lastModified();
        }
        c024209q.A02(c10860hv, Long.valueOf(lastModified / 1000));
        c024209q.A02(C0LK.A1X, Long.valueOf(System.currentTimeMillis() / 1000));
        if (file2 != null) {
            c024209q.A04(C0LP.A02, C0M6.CRITICAL_REPORT, file2);
        }
        if (C0PD.A03) {
            c024209q.A00(C0LK.A0C, true);
        }
        int i2 = C0M4.A01;
        if (i2 != 2 && !C0M4.A00()) {
            if (i2 == 1) {
                C0LW c0lw = c03060Ch.A00;
                C0M6 c0m6 = C0M6.CRITICAL_REPORT;
                c0lw.A0E(c0m6, c03060Ch);
                c0lw.A08(c024209q, c0m6, c03060Ch);
                Executors.newScheduledThreadPool(1).schedule(new Runnable() { // from class: X.0Of
                    @Override // java.lang.Runnable
                    public final void run() {
                        C03060Ch c03060Ch2 = C03060Ch.this;
                        if (!C0LW.A0J.contains("AnrAppDeathDetector")) {
                            c03060Ch2.A00.A0D(C0M6.CRITICAL_REPORT, c03060Ch2);
                        }
                    }
                }, 1200L, TimeUnit.MILLISECONDS);
                return;
            }
            return;
        }
        if (C0M4.A03) {
            C04590Mb.A04.execute(new Runnable() { // from class: X.0Oe
                @Override // java.lang.Runnable
                public final void run() {
                    C03060Ch c03060Ch2 = c03060Ch;
                    C024209q c024209q2 = c024209q;
                    C0LW c0lw2 = c03060Ch2.A00;
                    C0M6 c0m62 = C0M6.CRITICAL_REPORT;
                    c0lw2.A0E(c0m62, c03060Ch2);
                    c0lw2.A08(c024209q2, c0m62, c03060Ch2);
                    c0lw2.A0D(c0m62, c03060Ch2);
                }
            });
            return;
        }
        C0LW c0lw2 = c03060Ch.A00;
        C0M6 c0m62 = C0M6.CRITICAL_REPORT;
        c0lw2.A0E(c0m62, c03060Ch);
        c0lw2.A08(c024209q, c0m62, c03060Ch);
        c0lw2.A0D(c0m62, c03060Ch);
    }

    @Override // X.C0OO
    public final C0OP BW2() {
        return C0OP.A06;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x008e  */
    @Override // X.C0OO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void start() {
        /*
            r11 = this;
            X.0cm r0 = r11.A03
            java.lang.Object r4 = r0.get()
            X.0MF r4 = (X.C0MF) r4
            boolean r0 = r4.A06
            if (r0 == 0) goto Lb5
            X.0Pe r1 = r11.A02
            java.lang.String r0 = r1.A07
            java.io.File r3 = r1.A02(r0)
            if (r3 == 0) goto Lb5
            java.lang.String r10 = ""
            r1 = 1
            X.0oD r0 = new X.0oD
            r0.<init>(r11, r1)
            java.io.File[] r9 = r3.listFiles(r0)
            r2 = 0
            if (r9 == 0) goto L47
            r8 = -1
            int r7 = r9.length
            r6 = 0
        L28:
            if (r6 >= r7) goto L47
            r5 = r9[r6]
            java.lang.String r1 = r5.getName()     // Catch: java.lang.NumberFormatException -> L44
            java.lang.String r0 = "anr_report_"
            java.lang.String r1 = r1.replace(r0, r10)     // Catch: java.lang.NumberFormatException -> L44
            java.lang.String r0 = ".dmp"
            java.lang.String r0 = r1.replace(r0, r10)     // Catch: java.lang.NumberFormatException -> L44
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> L44
            if (r0 <= r8) goto L44
            r2 = r5
            r8 = r0
        L44:
            int r6 = r6 + 1
            goto L28
        L47:
            boolean r0 = X.C0PD.A03
            if (r0 != 0) goto L87
            boolean r0 = r4.A05
            if (r0 != 0) goto L87
            java.util.Properties r5 = new java.util.Properties
            r5.<init>()
            if (r2 == 0) goto L6c
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch: java.io.IOException -> L6c
            r0.<init>(r2)     // Catch: java.io.IOException -> L6c
            r5.load(r0)     // Catch: java.lang.Throwable -> L62
            r0.close()     // Catch: java.io.IOException -> L6c
            goto L6c
        L62:
            r1 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L67
            goto L6b
        L67:
            r0 = move-exception
            X.AnonymousClass083.A00(r1, r0)     // Catch: java.io.IOException -> L6c
        L6b:
            throw r1     // Catch: java.io.IOException -> L6c
        L6c:
            X.0hu r0 = X.C0LK.A3X
            java.lang.String r0 = "anr_started_in_foreground_v2"
            java.lang.String r1 = r5.getProperty(r0)
            java.lang.String r0 = "true"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L87
            boolean r0 = r11.A04
            if (r0 != 0) goto Lb5
            int r5 = r11.A01
            if (r5 > 0) goto L88
            r5 = 0
            goto L88
        L87:
            r5 = 1
        L88:
            boolean r0 = r4.A03()
            if (r0 == 0) goto Lb5
            X.0OP r0 = X.C0OP.A06
            X.C0Pe.A09 = r0
            java.lang.String r1 = "1"
            java.lang.String r0 = "detected"
            java.util.Map r1 = java.util.Collections.singletonMap(r0, r1)
            java.lang.String r0 = "AnrAppDeathEarlyDetector"
            X.C0PA.A00(r0, r1)
            int r1 = X.C0M4.A01
            r0 = 4
            if (r1 != r0) goto Lb1
            boolean r0 = r4.A05
            if (r0 != 0) goto Lb1
            X.0Og r0 = new X.0Og
            r0.<init>()
            X.C0LW.A0F = r0
            return
        Lb1:
            A00(r11, r3, r2, r5)
            return
        Lb5:
            java.lang.String r1 = "0"
            java.lang.String r0 = "detected"
            java.util.Map r1 = java.util.Collections.singletonMap(r0, r1)
            java.lang.String r0 = "AnrAppDeathEarlyDetector"
            X.C0PA.A00(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03060Ch.start():void");
    }

    public C03060Ch(C0LW c0lw, C0Pe c0Pe, InterfaceC08830cm interfaceC08830cm, int i, boolean z) {
        this.A02 = c0Pe;
        this.A00 = c0lw;
        this.A03 = interfaceC08830cm;
        this.A04 = z;
        this.A01 = i;
    }

    @Override // X.C0OO
    public final /* synthetic */ int BDP() {
        return 100000;
    }
}
