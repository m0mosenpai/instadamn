package X;

import java.io.IOException;
import java.util.Arrays;

/* renamed from: X.Sai, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63018Sai {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final String A04;
    public final boolean A05;
    public final byte[] A06;
    public final char[] A07;
    public final boolean[] A08;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C63018Sai(java.lang.String r9, char[] r10) {
        /*
            r8 = this;
            r7 = 128(0x80, float:1.8E-43)
            byte[] r6 = new byte[r7]
            r5 = -1
            java.util.Arrays.fill(r6, r5)
            r4 = 0
        L9:
            int r0 = r10.length
            if (r4 >= r0) goto L48
            char r3 = r10[r4]
            r2 = 1
            boolean r0 = X.AbstractC167007dF.A1Q(r3, r7)
            java.lang.String r1 = "Non-ASCII character: %s"
            if (r0 == 0) goto L37
            r0 = r6[r3]
            if (r0 == r5) goto L1c
            r2 = 0
        L1c:
            java.lang.String r1 = "Duplicate character: %s"
            if (r2 == 0) goto L26
            byte r0 = (byte) r4
            r6[r3] = r0
            int r4 = r4 + 1
            goto L9
        L26:
            java.lang.Character r0 = java.lang.Character.valueOf(r3)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r0 = com.google.common.base.Strings.A00(r1, r0)
            java.lang.IllegalArgumentException r0 = X.AbstractC166987dD.A12(r0)
            throw r0
        L37:
            java.lang.Character r0 = java.lang.Character.valueOf(r3)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r0 = com.google.common.base.Strings.A00(r1, r0)
            java.lang.IllegalArgumentException r0 = X.AbstractC166987dD.A12(r0)
            throw r0
        L48:
            r0 = 0
            r8.<init>(r9, r6, r10, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63018Sai.<init>(java.lang.String, char[]):void");
    }

    public final int A00(char ch) {
        if (ch <= 127) {
            byte b = this.A06[ch];
            if (b == -1) {
                if (ch > ' ' && ch != 127) {
                    throw new IOException(AnonymousClass001.A0C("Unrecognized character: ", ch));
                }
                throw new IOException(AnonymousClass001.A0R("Unrecognized character: 0x", Integer.toHexString(ch)));
            }
            return b;
        }
        throw new IOException(AnonymousClass001.A0R("Unrecognized character: 0x", Integer.toHexString(ch)));
    }

    public final boolean equals(Object other) {
        if (!(other instanceof C63018Sai)) {
            return false;
        }
        C63018Sai c63018Sai = (C63018Sai) other;
        if (this.A05 != c63018Sai.A05 || !Arrays.equals(this.A07, c63018Sai.A07)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.A07) + AbstractC58322PtE.A02(this.A05 ? 1 : 0);
    }

    public final String toString() {
        return this.A04;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x001b. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007c A[LOOP:0: B:17:0x0078->B:19:0x007c, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C63018Sai(java.lang.String r7, byte[] r8, char[] r9, boolean r10) {
        /*
            r6 = this;
            r6.<init>()
            r7.getClass()
            r6.A04 = r7
            r9.getClass()
            r6.A07 = r9
            int r3 = r9.length     // Catch: java.lang.ArithmeticException -> L90
            java.math.RoundingMode r1 = java.math.RoundingMode.UNNECESSARY     // Catch: java.lang.ArithmeticException -> L90
            java.lang.String r4 = "x"
            if (r3 <= 0) goto L30
            int[] r0 = X.S7X.A00     // Catch: java.lang.ArithmeticException -> L90
            int r0 = X.AbstractC58318PtA.A06(r1, r0)     // Catch: java.lang.ArithmeticException -> L90
            switch(r0) {
                case 1: goto L23;
                case 2: goto L51;
                case 3: goto L51;
                case 4: goto L58;
                case 5: goto L58;
                case 6: goto L3e;
                case 7: goto L3e;
                case 8: goto L3e;
                default: goto L1e;
            }     // Catch: java.lang.ArithmeticException -> L90
        L1e:
            java.lang.AssertionError r1 = X.AbstractC58318PtA.A0V()     // Catch: java.lang.ArithmeticException -> L90
        L22:
            throw r1     // Catch: java.lang.ArithmeticException -> L90
        L23:
            int r0 = r3 + (-1)
            r0 = r0 & r3
            if (r0 == 0) goto L51
            java.lang.String r0 = "mode was UNNECESSARY, but rounding was necessary"
            java.lang.ArithmeticException r1 = new java.lang.ArithmeticException     // Catch: java.lang.ArithmeticException -> L90
            r1.<init>(r0)     // Catch: java.lang.ArithmeticException -> L90
            goto L22
        L30:
            java.lang.String r2 = " ("
            r1 = 0
            java.lang.String r0 = ") must be > 0"
            java.lang.String r0 = X.AnonymousClass001.A06(r1, r4, r2, r0)     // Catch: java.lang.ArithmeticException -> L90
            java.lang.IllegalArgumentException r1 = X.AbstractC166987dD.A12(r0)     // Catch: java.lang.ArithmeticException -> L90
            goto L22
        L3e:
            int r1 = java.lang.Integer.numberOfLeadingZeros(r3)     // Catch: java.lang.ArithmeticException -> L90
            r0 = -1257966797(0xffffffffb504f333, float:-4.9527733E-7)
            int r0 = r0 >>> r1
            int r2 = 31 - r1
            int r0 = r0 - r3
            r0 = r0 ^ (-1)
            r0 = r0 ^ (-1)
            int r0 = r0 >>> 31
            int r2 = r2 + r0
            goto L60
        L51:
            int r0 = java.lang.Integer.numberOfLeadingZeros(r3)     // Catch: java.lang.ArithmeticException -> L90
            int r2 = 31 - r0
            goto L60
        L58:
            int r0 = r3 + (-1)
            int r0 = java.lang.Integer.numberOfLeadingZeros(r0)     // Catch: java.lang.ArithmeticException -> L90
            int r2 = 32 - r0
        L60:
            r6.A00 = r2     // Catch: java.lang.ArithmeticException -> L90
            int r1 = java.lang.Integer.numberOfTrailingZeros(r2)
            int r0 = 3 - r1
            r5 = 1
            int r0 = r5 << r0
            r6.A02 = r0
            int r2 = r2 >> r1
            r6.A01 = r2
            int r3 = r3 - r5
            r6.A03 = r3
            r6.A06 = r8
            boolean[] r4 = new boolean[r0]
            r3 = 0
        L78:
            int r0 = r6.A01
            if (r3 >= r0) goto L8b
            int r2 = r3 * 8
            int r1 = r6.A00
            java.math.RoundingMode r0 = java.math.RoundingMode.CEILING
            int r0 = X.AbstractC63123SdR.A01(r0, r2, r1)
            r4[r0] = r5
            int r3 = r3 + 1
            goto L78
        L8b:
            r6.A08 = r4
            r6.A05 = r10
            return
        L90:
            r2 = move-exception
            java.lang.String r1 = "Illegal alphabet length "
            int r0 = r9.length
            java.lang.String r1 = X.AnonymousClass001.A0O(r1, r0)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63018Sai.<init>(java.lang.String, byte[], char[], boolean):void");
    }
}
