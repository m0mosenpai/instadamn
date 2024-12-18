package X;

import java.util.concurrent.TimeUnit;

/* renamed from: X.4Qz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C95394Qz {
    public long A00;
    public long A01;
    public boolean A02;
    public final AbstractC95374Qx A03;

    public final long A00(TimeUnit desiredUnit) {
        long j;
        if (this.A02) {
            j = (this.A03.A00() - this.A01) + this.A00;
        } else {
            j = this.A00;
        }
        return desiredUnit.convert(j, TimeUnit.NANOSECONDS);
    }

    public final void A01() {
        this.A00 = 0L;
        this.A02 = false;
    }

    public final void A02() {
        C18C.A0H(!this.A02, "This stopwatch is already running.");
        this.A02 = true;
        this.A01 = this.A03.A00();
    }

    public final void A03() {
        long A00 = this.A03.A00();
        C18C.A0H(this.A02, "This stopwatch is already stopped.");
        this.A02 = false;
        this.A00 += A00 - this.A01;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004f, code lost:
    
        if (r6.convert(r3, r5) > 0) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            r9 = this;
            boolean r0 = r9.A02
            if (r0 == 0) goto L7e
            X.4Qx r0 = r9.A03
            long r3 = r0.A00()
            long r0 = r9.A01
            long r3 = r3 - r0
            long r0 = r9.A00
            long r3 = r3 + r0
        L10:
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.DAYS
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r1 = r6.convert(r3, r5)
            r7 = 0
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 > 0) goto L51
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.HOURS
            long r1 = r6.convert(r3, r5)
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 > 0) goto L51
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.MINUTES
            long r1 = r6.convert(r3, r5)
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 > 0) goto L51
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.SECONDS
            long r1 = r6.convert(r3, r5)
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 > 0) goto L51
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r1 = r6.convert(r3, r5)
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 > 0) goto L51
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.MICROSECONDS
            long r1 = r6.convert(r3, r5)
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            r7 = r5
            if (r0 <= 0) goto L52
        L51:
            r7 = r6
        L52:
            double r0 = (double) r3
            r2 = 1
            long r4 = r5.convert(r2, r7)
            double r2 = (double) r4
            double r0 = r0 / r2
            java.util.Locale r2 = java.util.Locale.ROOT
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            java.lang.String r0 = "%.4g"
            java.lang.String r3 = java.lang.String.format(r2, r0, r1)
            java.lang.String r2 = " "
            int[] r1 = X.AbstractC47143Ksc.A00
            int r0 = r7.ordinal()
            r0 = r1[r0]
            switch(r0) {
                case 1: goto L81;
                case 2: goto L84;
                case 3: goto L87;
                case 4: goto L8a;
                case 5: goto L8d;
                case 6: goto L90;
                case 7: goto L93;
                default: goto L78;
            }
        L78:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L7e:
            long r3 = r9.A00
            goto L10
        L81:
            java.lang.String r0 = "ns"
            goto L95
        L84:
            java.lang.String r0 = "μs"
            goto L95
        L87:
            java.lang.String r0 = "ms"
            goto L95
        L8a:
            java.lang.String r0 = "s"
            goto L95
        L8d:
            java.lang.String r0 = "min"
            goto L95
        L90:
            java.lang.String r0 = "h"
            goto L95
        L93:
            java.lang.String r0 = "d"
        L95:
            java.lang.String r0 = X.AnonymousClass001.A0g(r3, r2, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C95394Qz.toString():java.lang.String");
    }

    public C95394Qz(AbstractC95374Qx ticker) {
        this.A03 = ticker;
    }

    public C95394Qz() {
        this.A03 = AbstractC95374Qx.A00;
    }
}
