package X;

import android.text.TextUtils;
import com.facebook.common.dextricks.Constants;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.Thread;
import java.util.HashMap;
import org.webrtc.HardwareVideoEncoderFactory;

/* renamed from: X.06M, reason: invalid class name */
/* loaded from: classes.dex */
public final class C06M implements C0OO {
    public static final InterfaceC05070Or A07 = new InterfaceC05070Or() { // from class: X.07t
    };
    public long A00;
    public C14690oh A01;
    public InterfaceC05070Or A02;
    public boolean A03;
    public final C0LW A04;
    public final InterfaceC05070Or A05;
    public final C0Pe A06;
    public byte[] mOomReservation;

    /* JADX WARN: Removed duplicated region for block: B:14:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A02(java.lang.Thread r12, java.lang.Throwable r13) {
        /*
            r11 = this;
            r3 = 0
            r11.mOomReservation = r3
            long r0 = java.lang.System.currentTimeMillis()
            r11.A00 = r0
            r4 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 / r4
            X.0Pe r4 = r11.A06
            X.01d r5 = r4.A03
            java.lang.String r2 = "Did you call SessionManager.init()?"
            X.C02R.A03(r5, r2)
            boolean r2 = r13 instanceof X.C03410Gt
            if (r2 == 0) goto L38
            X.0MI r2 = X.C0MI.A0F
        L1b:
            r5.A0B(r2)
            X.0bC r2 = r5.A01
            java.io.File r2 = r2.A01
            X.0ME r5 = new X.0ME
            r5.<init>(r2)
            boolean r2 = X.C0PD.A03
            r7 = 1
            r6 = 0
            if (r2 != 0) goto L30
            r5.A05()
        L30:
            r11.A03 = r6
            X.09q r5 = new X.09q
            r5.<init>(r13)
            goto L3b
        L38:
            X.0MI r2 = X.C0MI.A0E
            goto L1b
        L3b:
            X.0hv r2 = X.C0LK.A16     // Catch: java.lang.Throwable -> L6c
            r5.A01(r2, r7)     // Catch: java.lang.Throwable -> L6c
            X.0hv r2 = X.C0LK.A3E     // Catch: java.lang.Throwable -> L6c
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch: java.lang.Throwable -> L6c
            r5.A02(r2, r0)     // Catch: java.lang.Throwable -> L6c
            X.0hu r1 = X.C0LK.A4x     // Catch: java.lang.Throwable -> L6c
            java.lang.String r0 = "exception"
            r5.A03(r1, r0)     // Catch: java.lang.Throwable -> L6c
            java.lang.Throwable r8 = A00(r5, r12, r13)     // Catch: java.lang.Throwable -> L6c
            X.0hv r2 = X.C0LK.A2c     // Catch: java.lang.Throwable -> L6a
            long r9 = android.os.SystemClock.uptimeMillis()     // Catch: java.lang.Throwable -> L6a
            long r0 = r4.A01     // Catch: java.lang.Throwable -> L6a
            long r9 = r9 - r0
            java.lang.Long r0 = java.lang.Long.valueOf(r9)     // Catch: java.lang.Throwable -> L6a
            r5.A02(r2, r0)     // Catch: java.lang.Throwable -> L6a
            boolean r6 = r8 instanceof java.lang.OutOfMemoryError     // Catch: java.lang.Throwable -> L6a
            r11.A03 = r6     // Catch: java.lang.Throwable -> L6a
            goto L80
        L6a:
            r2 = move-exception
            goto L6e
        L6c:
            r2 = move-exception
            r8 = r3
        L6e:
            X.0P8 r1 = X.C0PC.A00()
            java.lang.String r0 = "JavaDetect"
            r1.DEh(r0, r2, r3)
            X.0hu r1 = X.C0LK.A67
            java.lang.String r0 = r2.getMessage()
            r5.A03(r1, r0)
        L80:
            X.0LW r4 = r11.A04
            X.0M6 r3 = X.C0M6.CRITICAL_REPORT
            r4.A0E(r3, r11)
            r4.A08(r5, r3, r11)
            r4.A0D = r7
            if (r6 != 0) goto L91
            r4.A0D(r3, r11)
        L91:
            boolean r0 = X.C0M4.A02
            if (r0 == 0) goto La6
            if (r8 == 0) goto La6
            X.0hu r2 = X.C0LK.A6I
            java.lang.String r1 = X.C0LA.A01(r8)
            r0 = 20000(0x4e20, float:2.8026E-41)
            java.lang.String r0 = X.C0LA.A00(r1, r0)
            r5.A03(r2, r0)
        La6:
            X.0M6 r0 = X.C0M6.LARGE_REPORT
            r4.A0E(r0, r11)
            r4.A08(r5, r0, r11)
            r4.A0E = r7
            if (r6 == 0) goto Lb5
            r4.A0D(r3, r11)
        Lb5:
            r4.A0D(r0, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C06M.A02(java.lang.Thread, java.lang.Throwable):void");
    }

    @Override // X.C0OO
    public final /* synthetic */ C0Z0 BNJ() {
        return null;
    }

    public static Throwable A00(C024209q c024209q, Thread thread, Throwable th) {
        String A0R;
        String valueOf;
        String A01;
        PrintWriter printWriter;
        try {
            StringWriter stringWriter = C0LA.A01;
            synchronized (C0LA.class) {
                if (C0LA.A01 != null && (printWriter = C0LA.A00) != null) {
                    th.printStackTrace(printWriter);
                    C0LA.A00.close();
                    A01 = C0LA.A01.toString();
                    C0LA.A00 = null;
                    C0LA.A01 = null;
                } else {
                    A01 = C0LA.A01(th);
                }
            }
            A0R = "No stack trace";
            if (A01.length() < 10 && TextUtils.isEmpty(A01.trim())) {
                C0K8.A0D("lacrima", "No stack trace");
            } else {
                A0R = C0LA.A00(A01, HardwareVideoEncoderFactory.QCOM_VP8_KEY_FRAME_INTERVAL_ANDROID_M_MS);
            }
        } catch (Throwable th2) {
            A0R = AnonymousClass001.A0R(th.toString(), ": truncated trace");
            C0PC.A00().DEh("JavaDetectorStacktrace", th2, null);
        }
        c024209q.A03(C0LK.A6L, A0R);
        c024209q.A03(C0LK.A6N, th.getClass().getName());
        c024209q.A03(C0LK.A6O, th.getMessage());
        if (thread == null) {
            valueOf = "unknown";
        } else {
            valueOf = String.valueOf(thread.getName());
        }
        c024209q.A03(C0LK.A6P, valueOf);
        while (th.getCause() != null) {
            th = th.getCause();
        }
        c024209q.A03(C0LK.A6G, th.getClass().getName());
        if (!C0M4.A02) {
            c024209q.A03(C0LK.A6I, C0LA.A01(th));
        }
        c024209q.A03(C0LK.A6H, th.getMessage());
        return th;
    }

    public static void A01(C0LR c0lr, C0LW c0lw, C0M6 c0m6) {
        C0OO A05 = c0lw.A05(C06M.class);
        if (A05 == null) {
            HashMap hashMap = new HashMap();
            hashMap.put("CollectorName", C0LX.A00(c0lr.BW4()));
            hashMap.put("ReportCategory", c0m6.A00);
            C0PC.A00().DEh("JavaCrashDetector.addExtraCollector", new RuntimeException("Unable to add extra collector to JavaCrashDetector"), hashMap);
            C0K8.A0D("lacrima", "Cannot find registered detector");
            return;
        }
        c0lw.A07(c0lr, c0m6, A05);
    }

    @Override // X.C0OO
    public final C0OP BW2() {
        return C0OP.A0I;
    }

    @Override // X.C0OO
    public final void start() {
        C0PB.A00("JavaCrashDetector");
        if (C03400Gs.A01() != null) {
            C03400Gs.A03(new InterfaceC03430Gv() { // from class: X.07l
                @Override // X.InterfaceC03430Gv
                public final int handleUncaughtException(Thread thread, Throwable th, C0Gl c0Gl) {
                    C06M.this.A02(thread, th);
                    return 0;
                }
            }, 100);
        } else {
            final Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
            Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: X.0Oq
                @Override // java.lang.Thread.UncaughtExceptionHandler
                public final void uncaughtException(Thread thread, Throwable th) {
                    C06M.this.A02(thread, th);
                    defaultUncaughtExceptionHandler.uncaughtException(thread, th);
                }
            });
        }
        this.mOomReservation = new byte[Constants.LOAD_RESULT_PGO_ATTEMPTED];
    }

    public C06M(C0LW c0lw, C14690oh c14690oh, InterfaceC05070Or interfaceC05070Or, InterfaceC05070Or interfaceC05070Or2, C0Pe c0Pe) {
        this.A06 = c0Pe;
        this.A04 = c0lw;
        this.A01 = c14690oh;
        this.A02 = interfaceC05070Or;
        this.A05 = interfaceC05070Or2;
    }

    @Override // X.C0OO
    public final /* synthetic */ int BDP() {
        return 100000;
    }
}
