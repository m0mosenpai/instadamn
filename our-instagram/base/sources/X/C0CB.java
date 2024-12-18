package X;

import android.os.PowerManager;
import java.lang.ref.WeakReference;

/* renamed from: X.0CB, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0CB {
    public long A01;
    public long A02;
    public final String A07;
    public final WeakReference A08;
    public boolean A06 = true;
    public boolean A05 = false;
    public int A00 = 0;
    public long A04 = Long.MAX_VALUE;
    public long A03 = -1;

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000f, code lost:
    
        if (r0 != 0) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean A00(X.C0CB r6, long r7) {
        /*
            boolean r0 = r6.A05
            r5 = 0
            if (r0 == 0) goto L11
            boolean r0 = r6.A06
            r4 = 1
            if (r0 == 0) goto L12
            int r0 = r6.A00
            int r0 = r0 - r4
            r6.A00 = r0
            if (r0 == 0) goto L12
        L11:
            return r5
        L12:
            r6.A03 = r7
            long r2 = r6.A02
            long r0 = r6.A01
            long r7 = r7 - r0
            long r2 = r2 + r7
            r6.A02 = r2
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r6.A04 = r0
            r6.A05 = r5
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0CB.A00(X.0CB, long):boolean");
    }

    public C0CB(PowerManager.WakeLock wakeLock, String str) {
        this.A07 = str;
        this.A08 = new WeakReference(wakeLock);
    }
}
