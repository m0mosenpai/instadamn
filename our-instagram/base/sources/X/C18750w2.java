package X;

import com.facebook.common.dextricks.StringTreeSet;
import java.util.Arrays;

/* renamed from: X.0w2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18750w2 extends C01M {
    public int A00;

    public final void A06() {
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
        AbstractC06960Yn.A0V(this.A04, 0, super.A00);
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

    private final void A02(int i) {
        int i2;
        long[] jArr;
        if (i > 0) {
            C18590vm c18590vm = AbstractC004701m.A01;
            i2 = Math.max(7, (-1) >>> Integer.numberOfLeadingZeros(i));
        } else {
            i2 = 0;
        }
        super.A00 = i2;
        if (i2 == 0) {
            jArr = AbstractC004701m.A00;
        } else {
            int i3 = ((((i2 + 1) + 7) + 7) & (-8)) >> 3;
            jArr = new long[i3];
            Arrays.fill(jArr, 0, i3, -9187201950435737472L);
        }
        this.A03 = jArr;
        int i4 = i2 >> 3;
        long j = 255 << ((i2 & 7) << 3);
        jArr[i4] = (jArr[i4] & ((-1) ^ j)) | j;
        A01();
        this.A02 = new int[i2];
        this.A04 = new Object[i2];
    }

    public C18750w2(int i) {
        int i2;
        if (i >= 0) {
            C18590vm c18590vm = AbstractC004701m.A01;
            if (i == 7) {
                i2 = 8;
            } else {
                i2 = i + ((i - 1) / 7);
            }
            A02(i2);
            return;
        }
        AbstractC005601v.A00("Capacity must be a positive value.");
        throw C00O.createAndThrow();
    }

    public final void A07(int i) {
        int i2 = (-862048943) * i;
        int i3 = i2 ^ (i2 << 16);
        int i4 = i3 & StringTreeSet.MAX_SYMBOL_COUNT;
        int i5 = super.A00;
        int i6 = (i3 >>> 7) & i5;
        int i7 = 0;
        while (true) {
            long[] jArr = this.A03;
            int i8 = i6 >> 3;
            int i9 = (i6 & 7) << 3;
            long j = ((jArr[i8 + 1] << (64 - i9)) & ((-i9) >> 63)) | (jArr[i8] >>> i9);
            long j2 = (i4 * 72340172838076673L) ^ j;
            for (long j3 = (j2 ^ (-1)) & (j2 - 72340172838076673L) & (-9187201950435737472L); j3 != 0; j3 &= j3 - 1) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i6) & i5;
                if (this.A02[numberOfTrailingZeros] == i) {
                    if (numberOfTrailingZeros >= 0) {
                        this.A01--;
                        int i10 = numberOfTrailingZeros >> 3;
                        int i11 = (numberOfTrailingZeros & 7) << 3;
                        long j4 = (jArr[i10] & ((255 << i11) ^ (-1))) | (254 << i11);
                        jArr[i10] = j4;
                        jArr[(((numberOfTrailingZeros - 7) & i5) + (i5 & 7)) >> 3] = j4;
                        this.A04[numberOfTrailingZeros] = null;
                        return;
                    }
                    return;
                }
            }
            if ((j & ((j ^ (-1)) << 6) & (-9187201950435737472L)) != 0) {
                return;
            }
            i7 += 8;
            i6 = (i6 + i7) & i5;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0071, code lost:
    
        if (((r21 & ((r21 ^ (-1)) << 6)) & (-9187201950435737472L)) == 0) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0073, code lost:
    
        r16 = A00(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x007b, code lost:
    
        if (r37.A00 != 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x008c, code lost:
    
        if (((r6[r16 >> 3] >> ((r16 & 7) << 3)) & 255) == 254) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0090, code lost:
    
        if (r7 <= 8) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a2, code lost:
    
        if (((r37.A01 * 32) ^ Long.MIN_VALUE) > ((r7 * 25) ^ Long.MIN_VALUE)) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a4, code lost:
    
        r10 = r37.A02;
        r5 = r37.A04;
        X.AbstractC004701m.A01(r6, r7);
        r4 = 0;
        r11 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00af, code lost:
    
        r32 = r4 >> 3;
        r31 = (r4 & 7) << 3;
        r12 = (r6[r32] >> r31) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00bf, code lost:
    
        if (r12 != 128) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c1, code lost:
    
        r11 = r4;
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c5, code lost:
    
        if (r4 != r7) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c7, code lost:
    
        A01();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ca, code lost:
    
        r16 = A00(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0111, code lost:
    
        if (r12 != 254) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0113, code lost:
    
        r28 = r10[r4] * (-862048943);
        r28 = r28 ^ (r28 << 16);
        r0 = r28 >>> 7;
        r23 = A00(r0);
        r0 = r0 & r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0133, code lost:
    
        if ((((r23 - r0) & r7) / 8) != (((r4 - r0) & r7) / 8)) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0135, code lost:
    
        r6[r32] = ((r28 & com.facebook.common.dextricks.StringTreeSet.MAX_SYMBOL_COUNT) << r31) | (((255 << r31) ^ (-1)) & r6[r32]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0145, code lost:
    
        r6[r6.length - 1] = (r6[0] & 72057594037927935L) | Long.MIN_VALUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0154, code lost:
    
        r18 = r23 >> 3;
        r16 = r6[r18];
        r14 = (r23 & 7) << 3;
        r12 = (r16 >> r14) & 255;
        r0 = r28 & com.facebook.common.dextricks.StringTreeSet.MAX_SYMBOL_COUNT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0164, code lost:
    
        if (r12 != 128) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0166, code lost:
    
        r6[r18] = (r16 & ((255 << r14) ^ (-1))) | (r0 << r14);
        r6[r32] = (r6[r32] & ((255 << r31) ^ (-1))) | (128 << r31);
        r10[r23] = r10[r4];
        r10[r4] = 0;
        r5[r23] = r5[r4];
        r5[r4] = null;
        r11 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x018e, code lost:
    
        r6[r18] = (r0 << r14) | (r16 & ((255 << r14) ^ (-1)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x019b, code lost:
    
        if (r11 != (-1)) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x019d, code lost:
    
        r11 = X.AbstractC004701m.A00(r6, r4 + 1, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01a3, code lost:
    
        r10[r11] = r10[r23];
        r10[r23] = r10[r4];
        r10[r4] = r10[r11];
        r5[r11] = r5[r23];
        r5[r23] = r5[r4];
        r5[r4] = r5[r11];
        r4 = r4 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0150, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x01be, code lost:
    
        r0 = X.AbstractC004701m.A01;
        r0 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x01c1, code lost:
    
        if (r7 == 0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x01c3, code lost:
    
        r0 = (r7 * 2) + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x01c7, code lost:
    
        r14 = r37.A02;
        r13 = r37.A04;
        A02(r0);
        r12 = r37.A03;
        r11 = r37.A02;
        r10 = r37.A04;
        r5 = r37.A00;
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x01d7, code lost:
    
        if (r4 >= r7) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x01e9, code lost:
    
        if (((r6[r4 >> 3] >> ((r4 & 7) << 3)) & 255) >= 128) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01eb, code lost:
    
        r23 = r14[r4];
        r1 = (-862048943) * r23;
        r22 = A00((r1 ^ (r1 << 16)) >>> 7);
        r21 = r22 >> 3;
        r20 = (r22 & 7) << 3;
        r0 = ((r1 & com.facebook.common.dextricks.StringTreeSet.MAX_SYMBOL_COUNT) << r20) | (r12[r21] & ((255 << r20) ^ (-1)));
        r12[r21] = r0;
        r12[(((r22 - 7) & r5) + (r5 & 7)) >> 3] = r0;
        r11[r22] = r23;
        r10[r22] = r13[r4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0221, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00ce, code lost:
    
        r37.A01++;
        r7 = r37.A00;
        r4 = r37.A03;
        r14 = r16 >> 3;
        r12 = r4[r14];
        r11 = (r16 & 7) << 3;
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00e9, code lost:
    
        if (((r12 >> r11) & 255) != 128) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00eb, code lost:
    
        r0 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00ec, code lost:
    
        r37.A00 = r7 - r0;
        r0 = r37.A00;
        r24 = (((255 << r11) ^ (-1)) & r12) | (r2 << r11);
        r4[r14] = r24;
        r4[(((r16 - 7) & r0) + (r0 & 7)) >> 3] = r24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A08(int r38, java.lang.Object r39) {
        /*
            Method dump skipped, instructions count: 554
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18750w2.A08(int, java.lang.Object):void");
    }

    public C18750w2() {
        this(6);
    }
}
