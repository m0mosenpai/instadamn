package X;

/* renamed from: X.VzF, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC69995VzF {
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001c, code lost:
    
        if (r1 == '+') goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C192428fk A00(java.lang.String r11) {
        /*
            r8 = 10
            r0 = 0
            int r7 = r11.length()
            r10 = 0
            if (r7 == 0) goto L1e
            r9 = 0
            char r1 = r11.charAt(r0)
            r0 = 48
            int r0 = X.C14360o3.A00(r1, r0)
            r6 = 1
            if (r0 >= 0) goto L1f
            if (r7 == r6) goto L1e
            r0 = 43
            if (r1 == r0) goto L20
        L1e:
            return r10
        L1f:
            r6 = 0
        L20:
            r5 = 119304647(0x71c71c7, float:1.1769572E-34)
            r4 = 119304647(0x71c71c7, float:1.1769572E-34)
        L26:
            if (r6 >= r7) goto L59
            char r0 = r11.charAt(r6)
            int r3 = java.lang.Character.digit(r0, r8)
            if (r3 < 0) goto L1e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r9 ^ r2
            r0 = r4 ^ r2
            if (r1 == r0) goto L4a
            if (r1 < r0) goto L4a
            if (r4 != r5) goto L1e
            r4 = 429496729(0x19999999, float:1.5881867E-23)
            r1 = r9 ^ r2
            r0 = -1717986919(0xffffffff99999999, float:-1.5881867E-23)
            if (r1 == r0) goto L4a
            if (r1 >= r0) goto L1e
        L4a:
            int r1 = r9 * 10
            int r3 = r3 + r1
            r0 = r3 ^ r2
            r1 = r1 ^ r2
            if (r0 == r1) goto L55
            if (r0 >= r1) goto L55
            return r10
        L55:
            int r6 = r6 + 1
            r9 = r3
            goto L26
        L59:
            X.8fk r0 = new X.8fk
            r0.<init>(r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC69995VzF.A00(java.lang.String):X.8fk");
    }

    public static final C192358fd A01(String str) {
        int length = str.length();
        if (length != 0) {
            int i = 0;
            char charAt = str.charAt(0);
            if (C14360o3.A00(charAt, 48) < 0) {
                if (length != 1 && charAt == '+') {
                    i = 1;
                }
            }
            long j = 0;
            long j2 = 512409557603043100L;
            while (i < length) {
                int digit = Character.digit((int) str.charAt(i), 10);
                if (digit >= 0) {
                    if ((j ^ Long.MIN_VALUE) > (j2 ^ Long.MIN_VALUE)) {
                        if (j2 == 512409557603043100L) {
                            int i2 = 1;
                            long j3 = (((-1) >>> 1) / 10) << 1;
                            if ((((-1) - (j3 * 10)) ^ Long.MIN_VALUE) < -9223372036854775798L) {
                                i2 = 0;
                            }
                            j2 = j3 + i2;
                            if ((j ^ Long.MIN_VALUE) > (j2 ^ Long.MIN_VALUE)) {
                            }
                        }
                    }
                    long j4 = j * 10;
                    long j5 = (digit & 4294967295L) + j4;
                    if ((j5 ^ Long.MIN_VALUE) >= (j4 ^ Long.MIN_VALUE)) {
                        i++;
                        j = j5;
                    }
                }
            }
            return new C192358fd(j);
        }
        return null;
    }
}
