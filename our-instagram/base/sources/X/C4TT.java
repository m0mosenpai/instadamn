package X;

/* renamed from: X.4TT, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4TT {
    public static final C4TT A02;
    public static final C4TT A03;
    public static final C4TT A04;
    public static final C4TT A05;
    public static final C4TT A06;
    public final long A00;
    public final long A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C4TT c4tt = (C4TT) obj;
            if (this.A01 != c4tt.A01 || this.A00 != c4tt.A00) {
                return false;
            }
        }
        return true;
    }

    static {
        C4TT c4tt = new C4TT(0L, 0L);
        A04 = c4tt;
        A02 = new C4TT(Long.MAX_VALUE, Long.MAX_VALUE);
        A06 = new C4TT(Long.MAX_VALUE, 0L);
        A05 = new C4TT(0L, Long.MAX_VALUE);
        A03 = c4tt;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0034, code lost:
    
        if (r14 > r5) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long A00(long r12, long r14, long r16) {
        /*
            r11 = this;
            long r3 = r11.A01
            r9 = 0
            int r0 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r0 != 0) goto Lf
            long r0 = r11.A00
            int r2 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r2 != 0) goto Lf
            return r12
        Lf:
            long r7 = r12 - r3
            long r3 = r3 ^ r12
            long r1 = r12 ^ r7
            long r1 = r1 & r3
            int r0 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r0 >= 0) goto L1b
            r7 = -9223372036854775808
        L1b:
            long r3 = r11.A00
            long r5 = r12 + r3
            long r1 = r12 ^ r5
            long r3 = r3 ^ r5
            long r1 = r1 & r3
            int r0 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r0 >= 0) goto L2c
            r5 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L2c:
            r2 = 1
            int r0 = (r7 > r14 ? 1 : (r7 == r14 ? 0 : -1))
            if (r0 > 0) goto L36
            int r0 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            r1 = 1
            if (r0 <= 0) goto L37
        L36:
            r1 = 0
        L37:
            int r0 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1))
            if (r0 > 0) goto L54
            int r0 = (r16 > r5 ? 1 : (r16 == r5 ? 0 : -1))
            if (r0 > 0) goto L54
        L3f:
            if (r1 == 0) goto L56
            if (r2 == 0) goto L53
            long r0 = r14 - r12
            long r3 = java.lang.Math.abs(r0)
            long r0 = r16 - r12
            long r1 = java.lang.Math.abs(r0)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L59
        L53:
            return r14
        L54:
            r2 = 0
            goto L3f
        L56:
            if (r2 != 0) goto L59
            return r7
        L59:
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4TT.A00(long, long, long):long");
    }

    public final int hashCode() {
        return (((int) this.A01) * 31) + ((int) this.A00);
    }

    public C4TT(long j, long j2) {
        C4B8.A03(j >= 0);
        C4B8.A03(j2 >= 0);
        this.A01 = j;
        this.A00 = j2;
    }
}
