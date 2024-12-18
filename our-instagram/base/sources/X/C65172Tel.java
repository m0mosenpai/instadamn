package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.net.SocketTimeoutException;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Tel, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C65172Tel extends C63030Sb2 {
    public static C65172Tel A03;
    public static final long A04;
    public static final long A05;
    public long A00;
    public C65172Tel A01;
    public boolean A02;

    static {
        long millis = TimeUnit.SECONDS.toMillis(60L);
        A04 = millis;
        A05 = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0070 A[Catch: all -> 0x0075, TRY_LEAVE, TryCatch #0 {, blocks: (B:11:0x001b, B:13:0x001f, B:14:0x002e, B:17:0x0038, B:18:0x004e, B:19:0x0054, B:20:0x005a, B:22:0x005e, B:24:0x0065, B:26:0x0068, B:28:0x0070, B:36:0x0050, B:37:0x0049, B:38:0x004d), top: B:10:0x001b }] */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, X.Tel] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A08() {
        /*
            r10 = this;
            boolean r0 = r10.A02
            if (r0 != 0) goto L78
            long r3 = r10.A01()
            boolean r5 = r10.A07()
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L15
            if (r5 != 0) goto L15
            return
        L15:
            r0 = 1
            r10.A02 = r0
            java.lang.Class<X.Tel> r9 = X.C65172Tel.class
            monitor-enter(r9)
            X.Tel r0 = X.C65172Tel.A03     // Catch: java.lang.Throwable -> L75
            if (r0 != 0) goto L2e
            X.Tel r0 = new X.Tel     // Catch: java.lang.Throwable -> L75
            r0.<init>()     // Catch: java.lang.Throwable -> L75
            X.C65172Tel.A03 = r0     // Catch: java.lang.Throwable -> L75
            X.TXy r0 = new X.TXy     // Catch: java.lang.Throwable -> L75
            r0.<init>()     // Catch: java.lang.Throwable -> L75
            r0.start()     // Catch: java.lang.Throwable -> L75
        L2e:
            long r7 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L75
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L42
            if (r5 == 0) goto L42
            long r0 = r10.A00()     // Catch: java.lang.Throwable -> L75
            long r0 = r0 - r7
            long r3 = java.lang.Math.min(r3, r0)     // Catch: java.lang.Throwable -> L75
            goto L4e
        L42:
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L4e
            if (r5 == 0) goto L49
            goto L50
        L49:
            java.lang.AssertionError r0 = X.AbstractC58318PtA.A0V()     // Catch: java.lang.Throwable -> L75
            throw r0     // Catch: java.lang.Throwable -> L75
        L4e:
            long r3 = r3 + r7
            goto L54
        L50:
            long r3 = r10.A00()     // Catch: java.lang.Throwable -> L75
        L54:
            r10.A00 = r3     // Catch: java.lang.Throwable -> L75
            long r3 = r3 - r7
            X.Tel r6 = X.C65172Tel.A03     // Catch: java.lang.Throwable -> L75
            r5 = r6
        L5a:
            X.Tel r0 = r6.A01     // Catch: java.lang.Throwable -> L75
            if (r0 == 0) goto L68
            long r1 = r0.A00     // Catch: java.lang.Throwable -> L75
            long r1 = r1 - r7
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L68
            X.Tel r6 = r6.A01     // Catch: java.lang.Throwable -> L75
            goto L5a
        L68:
            X.Tel r0 = r6.A01     // Catch: java.lang.Throwable -> L75
            r10.A01 = r0     // Catch: java.lang.Throwable -> L75
            r6.A01 = r10     // Catch: java.lang.Throwable -> L75
            if (r6 != r5) goto L73
            r9.notify()     // Catch: java.lang.Throwable -> L75
        L73:
            monitor-exit(r9)
            return
        L75:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        L78:
            java.lang.String r0 = "Unbalanced enter/exit"
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A14(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65172Tel.A08():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0012, code lost:
    
        r1.A01 = r3.A01;
        r3.A01 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x001c, code lost:
    
        r0 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A0A() {
        /*
            r3 = this;
            boolean r1 = r3.A02
            r0 = 0
            if (r1 == 0) goto L24
            r3.A02 = r0
            java.lang.Class<X.Tel> r2 = X.C65172Tel.class
            monitor-enter(r2)
            X.Tel r1 = X.C65172Tel.A03     // Catch: java.lang.Throwable -> L21
        Lc:
            if (r1 == 0) goto L1e
            X.Tel r0 = r1.A01     // Catch: java.lang.Throwable -> L21
            if (r0 != r3) goto L1a
            X.Tel r0 = r3.A01     // Catch: java.lang.Throwable -> L21
            r1.A01 = r0     // Catch: java.lang.Throwable -> L21
            r0 = 0
            r3.A01 = r0     // Catch: java.lang.Throwable -> L21
            goto L1c
        L1a:
            r1 = r0
            goto Lc
        L1c:
            r0 = 0
            goto L1f
        L1e:
            r0 = 1
        L1f:
            monitor-exit(r2)
            return r0
        L21:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L24:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65172Tel.A0A():boolean");
    }

    public final void A09() {
        if (A0A()) {
            throw new SocketTimeoutException(PublicKeyCredentialControllerUtility.JSON_KEY_TIMEOUT);
        }
    }
}
