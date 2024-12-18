package X;

import android.content.Context;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.SLh, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62670SLh {
    public final Context A00;
    public final C3UW A01 = C3UW.A02;
    public final ConcurrentHashMap A02 = AbstractC58318PtA.A14();

    /* JADX WARN: Removed duplicated region for block: B:14:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.AbstractC64515THi A00(java.lang.Class r5, java.lang.String r6) {
        /*
            r4 = this;
            r3 = 0
            r1 = 0
        L2:
            int r2 = r1 + 1
            r0 = 3
            if (r1 >= r0) goto L28
            java.util.concurrent.ConcurrentHashMap r1 = r4.A02
            java.lang.Object r3 = r1.get(r5)
            if (r3 != 0) goto L24
            android.content.Context r0 = r4.A00
            java.lang.Object r3 = r0.getSystemService(r6)     // Catch: java.lang.Exception -> L1e
            if (r3 == 0) goto L1e
            boolean r0 = r5.isInstance(r3)     // Catch: java.lang.Exception -> L1e
            if (r0 == 0) goto L1e
            goto L1f
        L1e:
            r3 = 0
        L1f:
            if (r3 == 0) goto L24
            r1.putIfAbsent(r5, r3)
        L24:
            r1 = r2
            if (r3 != 0) goto L37
            goto L2
        L28:
            java.lang.String r0 = r5.getName()
            java.lang.Object[] r2 = new java.lang.Object[]{r0}
            java.lang.String r1 = "SystemServiceManager"
            java.lang.String r0 = "Cannot get system service after MAX_RETRIES: %s"
            X.C0K8.A0P(r1, r0, r2)
        L37:
            if (r3 != 0) goto L3c
            X.R6j r0 = X.C60546R6j.A00
            return r0
        L3c:
            X.R6k r0 = new X.R6k
            r0.<init>(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62670SLh.A00(java.lang.Class, java.lang.String):X.THi");
    }

    public C62670SLh(Context context) {
        this.A00 = context;
    }
}
