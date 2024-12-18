package X;

import java.util.Arrays;

/* renamed from: X.0w1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18740w1 extends C01O {
    public int A00;

    public final void A05() {
        this.A01 = 0;
        long[] jArr = this.A03;
        if (jArr != AbstractC004701m.A00) {
            Arrays.fill(jArr, 0, jArr.length, -9187201950435737472L);
            long[] jArr2 = this.A03;
            int i = super.A00;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i2] = (jArr2[i2] & ((-1) ^ j)) | j;
        }
        A01();
    }

    private final int A00(int i) {
        int i2 = super.A00;
        int i3 = i & i2;
        int i4 = 0;
        while (true) {
            long[] jArr = this.A03;
            int i5 = i3 >> 3;
            int i6 = (i3 & 7) << 3;
            long j = ((jArr[i5 + 1] << (64 - i6)) & ((-i6) >> 63)) | (jArr[i5] >>> i6);
            long j2 = j & (((-1) ^ j) << 7) & (-9187201950435737472L);
            if (j2 != 0) {
                return (i3 + (Long.numberOfTrailingZeros(j2) >> 3)) & i2;
            }
            i4 += 8;
            i3 = (i3 + i4) & i2;
        }
    }

    private final void A01() {
        int i;
        int i2 = super.A00;
        C18590vm c18590vm = AbstractC004701m.A01;
        if (i2 == 7) {
            i = 6;
        } else {
            i = i2 - (i2 / 8);
        }
        this.A00 = i - this.A01;
    }

    public static final void A02(C18740w1 c18740w1, int i) {
        int i2;
        long[] jArr;
        if (i > 0) {
            C18590vm c18590vm = AbstractC004701m.A01;
            i2 = Math.max(7, (-1) >>> Integer.numberOfLeadingZeros(i));
        } else {
            i2 = 0;
        }
        ((C01O) c18740w1).A00 = i2;
        if (i2 == 0) {
            jArr = AbstractC004701m.A00;
        } else {
            int i3 = ((((i2 + 1) + 7) + 7) & (-8)) >> 3;
            jArr = new long[i3];
            Arrays.fill(jArr, 0, i3, -9187201950435737472L);
        }
        c18740w1.A03 = jArr;
        int i4 = i2 >> 3;
        long j = 255 << ((i2 & 7) << 3);
        jArr[i4] = (jArr[i4] & ((-1) ^ j)) | j;
        c18740w1.A01();
        c18740w1.A02 = new int[i2];
    }

    public static final void A03(C18740w1 c18740w1, int i) {
        c18740w1.A01--;
        long[] jArr = c18740w1.A03;
        int i2 = ((C01O) c18740w1).A00;
        int i3 = i >> 3;
        int i4 = (i & 7) << 3;
        long j = (jArr[i3] & ((255 << i4) ^ (-1))) | (254 << i4);
        jArr[i3] = j;
        jArr[(((i - 7) & i2) + (i2 & 7)) >> 3] = j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0075, code lost:
    
        if (((r21 & ((r21 ^ (-1)) << 6)) & (-9187201950435737472L)) == 0) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0077, code lost:
    
        r18 = A00(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007f, code lost:
    
        if (r37.A00 != 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0090, code lost:
    
        if (((r6[r18 >> 3] >> ((r18 & 7) << 3)) & 255) == 254) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0094, code lost:
    
        if (r7 <= 8) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a4, code lost:
    
        if (((r10 * 32) ^ Long.MIN_VALUE) > ((r7 * 25) ^ Long.MIN_VALUE)) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a6, code lost:
    
        r3 = r37.A02;
        X.AbstractC004701m.A01(r6, r7);
        r2 = 0;
        r12 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00af, code lost:
    
        r32 = r2 >> 3;
        r31 = (r2 & 7) << 3;
        r13 = (r6[r32] >> r31) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00bf, code lost:
    
        if (r13 != 128) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c1, code lost:
    
        r12 = r2;
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c5, code lost:
    
        if (r2 != r7) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c7, code lost:
    
        A01();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ca, code lost:
    
        r18 = A00(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0111, code lost:
    
        if (r13 != 254) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0113, code lost:
    
        r24 = r3[r2] * (-862048943);
        r24 = r24 ^ (r24 << 16);
        r13 = r24 >>> 7;
        r23 = A00(r13);
        r13 = r13 & r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0133, code lost:
    
        if ((((r23 - r13) & r7) / 8) != (((r2 - r13) & r7) / 8)) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0135, code lost:
    
        r6[r32] = ((r24 & com.facebook.common.dextricks.StringTreeSet.MAX_SYMBOL_COUNT) << r31) | (((255 << r31) ^ (-1)) & r6[r32]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0144, code lost:
    
        r6[r6.length - 1] = (r6[0] & 72057594037927935L) | Long.MIN_VALUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0153, code lost:
    
        r18 = r23 >> 3;
        r16 = r6[r18];
        r15 = (r23 & 7) << 3;
        r13 = (r16 >> r15) & 255;
        r0 = r24 & com.facebook.common.dextricks.StringTreeSet.MAX_SYMBOL_COUNT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0163, code lost:
    
        if (r13 != 128) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0165, code lost:
    
        r6[r18] = (r16 & ((255 << r15) ^ (-1))) | (r0 << r15);
        r6[r32] = (r6[r32] & ((255 << r31) ^ (-1))) | (128 << r31);
        r3[r23] = r3[r2];
        r3[r2] = 0;
        r12 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0186, code lost:
    
        r6[r18] = (r0 << r15) | (r16 & ((255 << r15) ^ (-1)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0193, code lost:
    
        if (r12 != (-1)) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0195, code lost:
    
        r12 = X.AbstractC004701m.A00(r6, r2 + 1, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x019b, code lost:
    
        r3[r12] = r3[r23];
        r3[r23] = r3[r2];
        r3[r2] = r3[r12];
        r2 = r2 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x014f, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x01aa, code lost:
    
        r0 = X.AbstractC004701m.A01;
        r0 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x01ad, code lost:
    
        if (r7 == 0) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x01af, code lost:
    
        r0 = (r7 * 2) + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x01b3, code lost:
    
        r14 = r37.A02;
        A02(r37, r0);
        r13 = r37.A03;
        r12 = r37.A02;
        r3 = r37.A00;
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x01bf, code lost:
    
        if (r2 >= r7) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01d1, code lost:
    
        if (((r6[r2 >> 3] >> ((r2 & 7) << 3)) & 255) >= 128) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01d3, code lost:
    
        r22 = r14[r2];
        r1 = (-862048943) * r22;
        r21 = A00((r1 ^ (r1 << 16)) >>> 7);
        r20 = r21 >> 3;
        r19 = (r21 & 7) << 3;
        r17 = (r13[r20] & ((255 << r19) ^ (-1))) | ((r1 & com.facebook.common.dextricks.StringTreeSet.MAX_SYMBOL_COUNT) << r19);
        r13[r20] = r17;
        r13[(((r21 - 7) & r3) + (r3 & 7)) >> 3] = r17;
        r12[r21] = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0203, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00ce, code lost:
    
        r12 = r37.A01 + 1;
        r37.A01 = r12;
        r3 = r37.A00;
        r2 = r37.A03;
        r17 = r18 >> 3;
        r15 = r2[r17];
        r8 = (r18 & 7) << 3;
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00e9, code lost:
    
        if (((r15 >> r8) & 255) != 128) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00eb, code lost:
    
        r0 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00ec, code lost:
    
        r37.A00 = r3 - r0;
        r0 = r37.A00;
        r25 = (((255 << r8) ^ (-1)) & r15) | (r4 << r8);
        r2[r17] = r25;
        r2[(((r18 - 7) & r0) + (r0 & 7)) >> 3] = r25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A06(int r38) {
        /*
            Method dump skipped, instructions count: 526
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18740w1.A06(int):boolean");
    }

    public C18740w1() {
        C18590vm c18590vm = AbstractC004701m.A01;
        A02(this, 6);
    }
}
