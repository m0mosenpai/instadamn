package X;

import android.app.Application;
import java.io.File;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* renamed from: X.0C6, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0C6 implements C0OO {
    public final C0LW A00;
    public final Application A01;
    public final C0Pe A02;
    public final InterfaceC08830cm A03;

    public static void A00(final C0C6 c0c6, File file, File file2) {
        long lastModified;
        File file3 = new File(file, "native_state.txt");
        final C024209q c024209q = new C024209q(null);
        try {
            c024209q.A01(C0LK.A16, 1);
            c024209q.A03(C0LK.A4x, "native_crash");
            c024209q.A02(C0LK.A1X, Long.valueOf(System.currentTimeMillis() / 1000));
            C10860hv c10860hv = C0LK.A3E;
            if (file2 != null) {
                lastModified = file2.lastModified();
            } else {
                lastModified = file3.lastModified();
            }
            c024209q.A02(c10860hv, Long.valueOf(lastModified / 1000));
            if (file2 != null) {
                c024209q.A02(C0LK.A2I, Long.valueOf(file2.lastModified()));
            }
        } catch (Throwable th) {
            c024209q.A03(C0LK.A67, th.getMessage());
        }
        if (C0PD.A03) {
            c024209q.A00(C0LK.A0C, true);
        }
        int i = C0M4.A01;
        if (i != 2 && !C0M4.A00()) {
            if (i == 1) {
                C0LW c0lw = c0c6.A00;
                C0M6 c0m6 = C0M6.CRITICAL_REPORT;
                c0lw.A0E(c0m6, c0c6);
                c0lw.A08(c024209q, c0m6, c0c6);
                Executors.newScheduledThreadPool(1).schedule(new Runnable() { // from class: X.0Ol
                    @Override // java.lang.Runnable
                    public final void run() {
                        C0C6 c0c62 = C0C6.this;
                        if (!C0LW.A0J.contains("NativeCrashDetector")) {
                            c0c62.A00.A0D(C0M6.CRITICAL_REPORT, c0c62);
                        }
                    }
                }, 1200L, TimeUnit.MILLISECONDS);
                return;
            }
            return;
        }
        if (C0M4.A03) {
            C04590Mb.A04.execute(new Runnable() { // from class: X.0Ok
                @Override // java.lang.Runnable
                public final void run() {
                    C0C6 c0c62 = c0c6;
                    C024209q c024209q2 = c024209q;
                    C0LW c0lw2 = c0c62.A00;
                    C0M6 c0m62 = C0M6.CRITICAL_REPORT;
                    c0lw2.A0E(c0m62, c0c62);
                    c0lw2.A08(c024209q2, c0m62, c0c62);
                    c0lw2.A0D(c0m62, c0c62);
                }
            });
            return;
        }
        C0LW c0lw2 = c0c6.A00;
        C0M6 c0m62 = C0M6.CRITICAL_REPORT;
        c0lw2.A0E(c0m62, c0c6);
        c0lw2.A08(c024209q, c0m62, c0c6);
        c0lw2.A0D(c0m62, c0c6);
    }

    @Override // X.C0OO
    public final /* synthetic */ C0Z0 BNJ() {
        return null;
    }

    @Override // X.C0OO
    public final C0OP BW2() {
        return C0OP.A0O;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0060, code lost:
    
        if (r4.A04 == '0') goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0064, code lost:
    
        if (X.C0PD.A03 != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006a, code lost:
    
        if (r4.A04 != '9') goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006e, code lost:
    
        if (r4.A05 != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x008d, code lost:
    
        X.C0Pe.A09 = X.C0OP.A0O;
        X.C0PA.A00("NativeAppDeathEarlyDetector", java.util.Collections.singletonMap("detected", com.instagram.realtimeclient.RealtimeSubscription.GRAPHQL_MQTT_VERSION));
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a2, code lost:
    
        if (X.C0M4.A01 != 4) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a6, code lost:
    
        if (r4.A05 != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a8, code lost:
    
        X.C0LW.A0H = new X.C0Om(r14, r3, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00af, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b0, code lost:
    
        A00(r14, r3, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b3, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008a, code lost:
    
        if (X.C0MG.A02(X.C05F.A0C, r4.A01) == false) goto L22;
     */
    @Override // X.C0OO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void start() {
        /*
            r14 = this;
            X.0Pe r1 = r14.A02
            java.lang.String r0 = "NativeCrashDetector"
            X.C0PB.A00(r0)
            X.0cm r0 = r14.A03
            java.lang.Object r4 = r0.get()
            X.0MF r4 = (X.C0MF) r4
            boolean r0 = r4.A06
            if (r0 == 0) goto L70
            java.lang.String r0 = r1.A07
            java.io.File r3 = r1.A02(r0)
            if (r3 == 0) goto L70
            android.app.Application r1 = r14.A01
            java.lang.String r5 = r3.getName()
            java.lang.String r0 = "minidumps"
            r13 = 0
            java.io.File r2 = r1.getDir(r0, r13)
            r1 = 3
            X.0p6 r0 = new X.0p6
            r0.<init>(r1)
            java.io.File[] r12 = r2.listFiles(r0)
            r2 = 0
            if (r12 == 0) goto L82
            r0 = 45
            int r0 = r5.indexOf(r0)
            int r0 = r0 + 1
            java.lang.String r11 = r5.substring(r0)
            int r10 = r12.length
        L43:
            if (r13 >= r10) goto L82
            r9 = r12[r13]
            java.lang.String r1 = r9.getName()
            long r7 = r9.length()
            r5 = 0
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 == 0) goto L82
            boolean r0 = r1.contains(r11)
            if (r0 == 0) goto L7f
            r2 = r9
            char r1 = r4.A04
            r0 = 48
            if (r1 != r0) goto L82
        L62:
            boolean r0 = X.C0PD.A03
            if (r0 != 0) goto L8d
            char r1 = r4.A04
            r0 = 57
            if (r1 != r0) goto L8d
            boolean r0 = r4.A05
            if (r0 != 0) goto L8d
        L70:
            java.lang.String r1 = "0"
            java.lang.String r0 = "detected"
            java.util.Map r1 = java.util.Collections.singletonMap(r0, r1)
            java.lang.String r0 = "NativeAppDeathEarlyDetector"
            X.C0PA.A00(r0, r1)
            return
        L7f:
            int r13 = r13 + 1
            goto L43
        L82:
            char r1 = r4.A01
            java.lang.Integer r0 = X.C05F.A0C
            boolean r0 = X.C0MG.A02(r0, r1)
            if (r0 != 0) goto L62
            goto L70
        L8d:
            X.0OP r0 = X.C0OP.A0O
            X.C0Pe.A09 = r0
            java.lang.String r1 = "1"
            java.lang.String r0 = "detected"
            java.util.Map r1 = java.util.Collections.singletonMap(r0, r1)
            java.lang.String r0 = "NativeAppDeathEarlyDetector"
            X.C0PA.A00(r0, r1)
            int r1 = X.C0M4.A01
            r0 = 4
            if (r1 != r0) goto Lb0
            boolean r0 = r4.A05
            if (r0 != 0) goto Lb0
            X.0Om r0 = new X.0Om
            r0.<init>()
            X.C0LW.A0H = r0
            return
        Lb0:
            A00(r14, r3, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0C6.start():void");
    }

    public C0C6(Application application, C0LW c0lw, C0Pe c0Pe, InterfaceC08830cm interfaceC08830cm) {
        this.A01 = application;
        this.A02 = c0Pe;
        this.A00 = c0lw;
        this.A03 = interfaceC08830cm;
    }

    @Override // X.C0OO
    public final /* synthetic */ int BDP() {
        return 100000;
    }
}
