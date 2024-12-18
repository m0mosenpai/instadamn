package X;

import java.util.Arrays;

/* renamed from: X.0vt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18660vt extends C01X {
    public int A00;

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

    public static final void A01(C18660vt c18660vt) {
        int i;
        int i2 = ((C01X) c18660vt).A00;
        C18590vm c18590vm = AbstractC004701m.A01;
        if (i2 == 7) {
            i = 6;
        } else {
            i = i2 - (i2 / 8);
        }
        c18660vt.A00 = i - c18660vt.A01;
    }

    public static final void A02(C18660vt c18660vt, int i) {
        int i2;
        long[] jArr;
        if (i > 0) {
            C18590vm c18590vm = AbstractC004701m.A01;
            i2 = Math.max(7, (-1) >>> Integer.numberOfLeadingZeros(i));
        } else {
            i2 = 0;
        }
        ((C01X) c18660vt).A00 = i2;
        if (i2 == 0) {
            jArr = AbstractC004701m.A00;
        } else {
            int i3 = ((((i2 + 1) + 7) + 7) & (-8)) >> 3;
            jArr = new long[i3];
            Arrays.fill(jArr, 0, i3, -9187201950435737472L);
        }
        c18660vt.A03 = jArr;
        int i4 = i2 >> 3;
        long j = 255 << ((i2 & 7) << 3);
        jArr[i4] = (jArr[i4] & ((-1) ^ j)) | j;
        A01(c18660vt);
        c18660vt.A02 = new long[i2];
        c18660vt.A04 = new Object[i2];
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0077, code lost:
    
        if (((r18 & ((r18 ^ (-1)) << 6)) & (-9187201950435737472L)) == 0) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0079, code lost:
    
        r15 = A00(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0081, code lost:
    
        if (r39.A00 != 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0092, code lost:
    
        if (((r4[r15 >> 3] >> ((r15 & 7) << 3)) & 255) == 254) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0096, code lost:
    
        if (r5 <= 8) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a8, code lost:
    
        if (((r39.A01 * 32) ^ Long.MIN_VALUE) > ((r5 * 25) ^ Long.MIN_VALUE)) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00aa, code lost:
    
        r7 = r39.A02;
        r3 = r39.A04;
        X.AbstractC004701m.A01(r4, r5);
        r2 = 0;
        r8 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b5, code lost:
    
        r31 = r2 >> 3;
        r30 = (r2 & 7) << 3;
        r11 = (r4[r31] >> r30) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c5, code lost:
    
        if (r11 != 128) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c7, code lost:
    
        r8 = r2;
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00cb, code lost:
    
        if (r2 != r5) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00cd, code lost:
    
        A01(r39);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00d0, code lost:
    
        r15 = A00(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0117, code lost:
    
        if (r11 != 254) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0119, code lost:
    
        r0 = r7[r2];
        r11 = ((int) (r0 ^ (r0 >>> 32))) * (-862048943);
        r11 = r11 ^ (r11 << 16);
        r0 = r11 >>> 7;
        r23 = A00(r0);
        r0 = r0 & r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x013c, code lost:
    
        if ((((r23 - r0) & r5) / 8) != (((r2 - r0) & r5) / 8)) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x013e, code lost:
    
        r4[r31] = ((r11 & com.facebook.common.dextricks.StringTreeSet.MAX_SYMBOL_COUNT) << r30) | (((255 << r30) ^ (-1)) & r4[r31]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x014d, code lost:
    
        r4[r4.length - 1] = (r4[0] & 72057594037927935L) | Long.MIN_VALUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x015c, code lost:
    
        r18 = r23 >> 3;
        r16 = r4[r18];
        r15 = (r23 & 7) << 3;
        r12 = (r16 >> r15) & 255;
        r0 = r11 & com.facebook.common.dextricks.StringTreeSet.MAX_SYMBOL_COUNT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x016c, code lost:
    
        if (r12 != 128) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x016e, code lost:
    
        r4[r18] = (r16 & ((255 << r15) ^ (-1))) | (r0 << r15);
        r4[r31] = (r4[r31] & ((255 << r30) ^ (-1))) | (128 << r30);
        r7[r23] = r7[r2];
        r7[r2] = 0;
        r3[r23] = r3[r2];
        r3[r2] = null;
        r8 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0196, code lost:
    
        r4[r18] = (r0 << r15) | (r16 & ((255 << r15) ^ (-1)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01a3, code lost:
    
        if (r8 != (-1)) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01a5, code lost:
    
        r8 = X.AbstractC004701m.A00(r4, r2 + 1, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01ab, code lost:
    
        r7[r8] = r7[r23];
        r7[r23] = r7[r2];
        r7[r2] = r7[r8];
        r3[r8] = r3[r23];
        r3[r23] = r3[r2];
        r3[r2] = r3[r8];
        r2 = r2 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0158, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x01c6, code lost:
    
        r0 = X.AbstractC004701m.A01;
        r0 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x01c9, code lost:
    
        if (r5 == 0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x01cb, code lost:
    
        r0 = (r5 * 2) + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x01cf, code lost:
    
        r15 = r39.A02;
        r13 = r39.A04;
        A02(r39, r0);
        r8 = r39.A03;
        r11 = r39.A02;
        r7 = r39.A04;
        r3 = r39.A00;
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x01df, code lost:
    
        if (r2 >= r5) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x01f1, code lost:
    
        if (((r4[r2 >> 3] >> ((r2 & 7) << 3)) & 255) >= 128) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01f3, code lost:
    
        r22 = r15[r2];
        r12 = ((int) (r22 ^ (r22 >>> 32))) * (-862048943);
        r12 = r12 ^ (r12 << 16);
        r21 = A00(r12 >>> 7);
        r0 = r12 & com.facebook.common.dextricks.StringTreeSet.MAX_SYMBOL_COUNT;
        r20 = r21 >> 3;
        r12 = (r21 & 7) << 3;
        r18 = (r8[r20] & ((255 << r12) ^ (-1))) | (r0 << r12);
        r8[r20] = r18;
        r8[(((r21 - 7) & r3) + (r3 & 7)) >> 3] = r18;
        r11[r21] = r22;
        r7[r21] = r13[r2];
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x022b, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00d4, code lost:
    
        r39.A01++;
        r5 = r39.A00;
        r2 = r39.A03;
        r14 = r15 >> 3;
        r12 = r2[r14];
        r11 = (r15 & 7) << 3;
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00ef, code lost:
    
        if (((r12 >> r11) & 255) != 128) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00f1, code lost:
    
        r0 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00f2, code lost:
    
        r39.A00 = r5 - r0;
        r0 = r39.A00;
        r24 = (((255 << r11) ^ (-1)) & r12) | (r9 << r11);
        r2[r14] = r24;
        r2[(((r15 - 7) & r0) + (r0 & 7)) >> 3] = r24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A04(long r40, java.lang.Object r42) {
        /*
            Method dump skipped, instructions count: 566
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18660vt.A04(long, java.lang.Object):void");
    }

    public C18660vt() {
        C18590vm c18590vm = AbstractC004701m.A01;
        A02(this, 6);
    }
}
