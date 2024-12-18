package X;

import java.util.Arrays;

/* renamed from: X.SaS, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63004SaS {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final String A04;
    public final boolean A05;
    public final byte[] A06;
    public final char[] A07;

    public final String toString() {
        return this.A04;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C63004SaS(java.lang.String r10, char[] r11) {
        /*
            r9 = this;
            r8 = 128(0x80, float:1.8E-43)
            byte[] r7 = new byte[r8]
            r6 = -1
            java.util.Arrays.fill(r7, r6)
            r5 = 0
            r4 = 0
        La:
            int r0 = r11.length
            if (r4 >= r0) goto L49
            char r3 = r11[r4]
            r2 = 1
            boolean r0 = X.AbstractC167007dF.A1Q(r3, r8)
            java.lang.String r1 = "Non-ASCII character: %s"
            if (r0 == 0) goto L38
            r0 = r7[r3]
            if (r0 == r6) goto L1d
            r2 = 0
        L1d:
            java.lang.String r1 = "Duplicate character: %s"
            if (r2 == 0) goto L27
            byte r0 = (byte) r4
            r7[r3] = r0
            int r4 = r4 + 1
            goto La
        L27:
            java.lang.Character r0 = java.lang.Character.valueOf(r3)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r0 = X.S2W.A00(r1, r0)
            java.lang.IllegalArgumentException r0 = X.AbstractC166987dD.A12(r0)
            throw r0
        L38:
            java.lang.Character r0 = java.lang.Character.valueOf(r3)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r0 = X.S2W.A00(r1, r0)
            java.lang.IllegalArgumentException r0 = X.AbstractC166987dD.A12(r0)
            throw r0
        L49:
            r9.<init>(r10, r7, r11, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63004SaS.<init>(java.lang.String, char[]):void");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C63004SaS)) {
            return false;
        }
        C63004SaS c63004SaS = (C63004SaS) obj;
        if (this.A05 != c63004SaS.A05 || !Arrays.equals(this.A07, c63004SaS.A07)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        boolean z = this.A05;
        int hashCode = Arrays.hashCode(this.A07);
        int i = 1231;
        if (true != z) {
            i = 1237;
        }
        return hashCode + i;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0015. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006a A[LOOP:0: B:17:0x0066->B:19:0x006a, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C63004SaS(java.lang.String r6, byte[] r7, char[] r8, boolean r9) {
        /*
            r5 = this;
            r5.<init>()
            r5.A04 = r6
            r8.getClass()
            r5.A07 = r8
            int r4 = r8.length     // Catch: java.lang.ArithmeticException -> L79
            java.math.RoundingMode r1 = java.math.RoundingMode.UNNECESSARY     // Catch: java.lang.ArithmeticException -> L79
            if (r4 <= 0) goto L2a
            int[] r0 = X.S7G.A00     // Catch: java.lang.ArithmeticException -> L79
            int r0 = X.AbstractC58318PtA.A06(r1, r0)     // Catch: java.lang.ArithmeticException -> L79
            switch(r0) {
                case 1: goto L1d;
                case 2: goto L3b;
                case 3: goto L3b;
                case 4: goto L32;
                case 5: goto L32;
                case 6: goto L42;
                case 7: goto L42;
                case 8: goto L42;
                default: goto L18;
            }     // Catch: java.lang.ArithmeticException -> L79
        L18:
            java.lang.AssertionError r1 = X.AbstractC58318PtA.A0V()     // Catch: java.lang.ArithmeticException -> L79
        L1c:
            throw r1     // Catch: java.lang.ArithmeticException -> L79
        L1d:
            int r0 = r4 + (-1)
            r0 = r0 & r4
            if (r0 == 0) goto L3b
            java.lang.String r0 = "mode was UNNECESSARY, but rounding was necessary"
            java.lang.ArithmeticException r1 = new java.lang.ArithmeticException     // Catch: java.lang.ArithmeticException -> L79
            r1.<init>(r0)     // Catch: java.lang.ArithmeticException -> L79
            goto L1c
        L2a:
            java.lang.String r0 = "x (0) must be > 0"
            java.lang.IllegalArgumentException r1 = X.AbstractC166987dD.A12(r0)     // Catch: java.lang.ArithmeticException -> L79
            goto L1c
        L32:
            int r0 = r4 + (-1)
            int r0 = java.lang.Integer.numberOfLeadingZeros(r0)     // Catch: java.lang.ArithmeticException -> L79
            int r3 = 32 - r0
            goto L50
        L3b:
            int r0 = java.lang.Integer.numberOfLeadingZeros(r4)     // Catch: java.lang.ArithmeticException -> L79
            int r3 = 31 - r0
            goto L50
        L42:
            r1 = -1257966797(0xffffffffb504f333, float:-4.9527733E-7)
            int r0 = java.lang.Integer.numberOfLeadingZeros(r4)     // Catch: java.lang.ArithmeticException -> L79
            int r1 = r1 >>> r0
            int r3 = 31 - r0
            int r1 = r1 - r4
            int r0 = r1 >>> 31
            int r3 = r3 + r0
        L50:
            r5.A01 = r3     // Catch: java.lang.ArithmeticException -> L79
            int r2 = java.lang.Integer.numberOfTrailingZeros(r3)
            int r1 = 3 - r2
            r0 = 1
            int r0 = r0 << r1
            r5.A02 = r0
            int r3 = r3 >> r2
            r5.A03 = r3
            int r0 = r4 + (-1)
            r5.A00 = r0
            r5.A06 = r7
            r3 = 0
        L66:
            int r0 = r5.A03
            if (r3 >= r0) goto L76
            int r2 = r3 * 8
            int r1 = r5.A01
            java.math.RoundingMode r0 = java.math.RoundingMode.CEILING
            X.S2Z.A00(r0, r2, r1)
            int r3 = r3 + 1
            goto L66
        L76:
            r5.A05 = r9
            return
        L79:
            r2 = move-exception
            int r1 = r8.length
            java.lang.String r0 = "Illegal alphabet length "
            java.lang.String r1 = X.AnonymousClass001.A0O(r0, r1)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63004SaS.<init>(java.lang.String, byte[], char[], boolean):void");
    }
}
