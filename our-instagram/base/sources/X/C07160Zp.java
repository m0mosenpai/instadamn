package X;

import android.app.Application;
import java.util.HashMap;

/* renamed from: X.0Zp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C07160Zp implements C0OO {
    public final Application A00;
    public final C0LW A01;
    public final C0Pe A02;
    public final InterfaceC08830cm A03;

    @Override // X.C0OO
    public final /* synthetic */ C0Z0 BNJ() {
        return null;
    }

    public static void A00(C0LR c0lr, C0LW c0lw, C0M6 c0m6) {
        C0OO A05 = c0lw.A05(C07160Zp.class);
        if (A05 == null) {
            HashMap hashMap = new HashMap();
            hashMap.put("CollectorName", C0LX.A00(c0lr.BW4()));
            hashMap.put("ReportCategory", c0m6.A00);
            C0PC.A00().DEh("NativeCrashDetector.addExtraCollector", new RuntimeException("Unable to add extra collector to NativeCrashDetector"), hashMap);
            C0K8.A0D("lacrima", "Cannot find registered detector");
            return;
        }
        c0lw.A07(c0lr, c0m6, A05);
    }

    @Override // X.C0OO
    public final C0OP BW2() {
        return C0OP.A0N;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00b0, code lost:
    
        if (r8.A04 == '0') goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008a, code lost:
    
        if (X.C0MG.A02(X.C05F.A0C, r8.A01) != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b4, code lost:
    
        if (X.C0PD.A03 != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ba, code lost:
    
        if (r8.A04 != '9') goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00be, code lost:
    
        if (r8.A05 != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c1, code lost:
    
        X.C0PA.A00("NativeCrashDetector", java.util.Collections.singletonMap("detected", com.instagram.realtimeclient.RealtimeSubscription.GRAPHQL_MQTT_VERSION));
        r10 = new java.io.File(r2, "native_state.txt");
        r3 = new X.C024209q(null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00de, code lost:
    
        if (X.C0M4.A00() != false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0126, code lost:
    
        if (X.C0M4.A01 != 4) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0128, code lost:
    
        r0 = X.C0LW.A0H;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x012a, code lost:
    
        if (r0 == null) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x012c, code lost:
    
        r0.run();
        X.C0LW.A0H = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00e0, code lost:
    
        r3.A01(X.C0LK.A16, 1);
        r3.A03(X.C0LK.A4x, "native_crash");
        r3.A02(X.C0LK.A1X, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() / 1000));
        r2 = X.C0LK.A3E;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ff, code lost:
    
        if (r5 == null) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0101, code lost:
    
        r0 = r5.lastModified();
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0105, code lost:
    
        r3.A02(r2, java.lang.Long.valueOf(r0 / 1000));
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0113, code lost:
    
        if (r5 == null) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0115, code lost:
    
        r3.A02(X.C0LK.A2I, java.lang.Long.valueOf(r5.lastModified()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x010e, code lost:
    
        r0 = r10.lastModified();
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0132, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0133, code lost:
    
        X.C0PC.A00().DEh("NativeCrashDetectorStart", r2, null);
        r3.A03(X.C0LK.A67, r2.getMessage());
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0080, code lost:
    
        if (r5 == null) goto L28;
     */
    @Override // X.C0OO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void start() {
        /*
            Method dump skipped, instructions count: 375
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C07160Zp.start():void");
    }

    public C07160Zp(Application application, C0LW c0lw, C0Pe c0Pe, InterfaceC08830cm interfaceC08830cm) {
        this.A00 = application;
        this.A02 = c0Pe;
        this.A01 = c0lw;
        this.A03 = interfaceC08830cm;
    }

    @Override // X.C0OO
    public final /* synthetic */ int BDP() {
        return 100000;
    }
}
