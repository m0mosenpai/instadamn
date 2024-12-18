package X;

import java.util.Arrays;

/* renamed from: X.0vo, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18610vo extends AbstractC004401j {
    public int A00;

    private final int A00(int i) {
        int i2 = super.A00;
        int i3 = i & i2;
        int i4 = 0;
        while (true) {
            long[] jArr = this.A02;
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

    public static final void A01(C18610vo c18610vo, int i) {
        int i2;
        long[] jArr;
        int i3;
        if (i > 0) {
            C18590vm c18590vm = AbstractC004701m.A01;
            i2 = Math.max(7, (-1) >>> Integer.numberOfLeadingZeros(i));
        } else {
            i2 = 0;
        }
        ((AbstractC004401j) c18610vo).A00 = i2;
        if (i2 == 0) {
            jArr = AbstractC004701m.A00;
        } else {
            int i4 = ((((i2 + 1) + 7) + 7) & (-8)) >> 3;
            jArr = new long[i4];
            Arrays.fill(jArr, 0, i4, -9187201950435737472L);
        }
        c18610vo.A02 = jArr;
        int i5 = i2 >> 3;
        long j = 255 << ((i2 & 7) << 3);
        jArr[i5] = (jArr[i5] & ((-1) ^ j)) | j;
        int i6 = ((AbstractC004401j) c18610vo).A00;
        C18590vm c18590vm2 = AbstractC004701m.A01;
        if (i6 == 7) {
            i3 = 6;
        } else {
            i3 = i6 - (i6 / 8);
        }
        c18610vo.A00 = i3 - c18610vo.A01;
        c18610vo.A04 = new Object[i2];
        c18610vo.A03 = new long[i2];
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0075, code lost:
    
        if (((r16 & ((r16 ^ (-1)) << 6)) & (-9187201950435737472L)) == 0) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0077, code lost:
    
        r16 = A00(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007f, code lost:
    
        if (r39.A00 != 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0081, code lost:
    
        r7 = r39.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0092, code lost:
    
        if (((r7[r16 >> 3] >> ((r16 & 7) << 3)) & 255) == 254) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0094, code lost:
    
        r6 = r39.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0098, code lost:
    
        if (r6 <= 8) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00aa, code lost:
    
        if (((r39.A01 * 32) ^ Long.MIN_VALUE) > ((r6 * 25) ^ Long.MIN_VALUE)) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ac, code lost:
    
        r9 = r39.A04;
        r3 = r39.A03;
        X.AbstractC004701m.A01(r7, r6);
        r2 = 0;
        r11 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b7, code lost:
    
        r32 = r2 >> 3;
        r31 = (r2 & 7) << 3;
        r12 = (r7[r32] >> r31) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00c7, code lost:
    
        if (r12 != 128) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c9, code lost:
    
        r11 = r2;
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00cd, code lost:
    
        if (r2 != r6) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00cf, code lost:
    
        r1 = r39.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d2, code lost:
    
        if (r1 != 7) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d4, code lost:
    
        r1 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d5, code lost:
    
        r39.A00 = r1 - r39.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00da, code lost:
    
        r16 = A00(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0125, code lost:
    
        r1 = r1 - (r1 / 8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x012b, code lost:
    
        if (r12 != 254) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x012d, code lost:
    
        r0 = r9[r2];
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x012f, code lost:
    
        if (r0 == null) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0131, code lost:
    
        r28 = r0.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0135, code lost:
    
        r28 = r28 * (-862048943);
        r28 = r28 ^ (r28 << 16);
        r0 = r28 >>> 7;
        r23 = A00(r0);
        r0 = r0 & r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0153, code lost:
    
        if ((((r23 - r0) & r6) / 8) != (((r2 - r0) & r6) / 8)) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0155, code lost:
    
        r7[r32] = ((r28 & com.facebook.common.dextricks.StringTreeSet.MAX_SYMBOL_COUNT) << r31) | (((255 << r31) ^ (-1)) & r7[r32]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0165, code lost:
    
        r7[r7.length - 1] = (r7[0] & 72057594037927935L) | Long.MIN_VALUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0174, code lost:
    
        r18 = r23 >> 3;
        r16 = r7[r18];
        r14 = (r23 & 7) << 3;
        r12 = (r16 >> r14) & 255;
        r0 = r28 & com.facebook.common.dextricks.StringTreeSet.MAX_SYMBOL_COUNT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0184, code lost:
    
        if (r12 != 128) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0186, code lost:
    
        r7[r18] = (r16 & ((255 << r14) ^ (-1))) | (r0 << r14);
        r7[r32] = (r7[r32] & ((255 << r31) ^ (-1))) | (128 << r31);
        r9[r23] = r9[r2];
        r9[r2] = null;
        r3[r23] = r3[r2];
        r3[r2] = 0;
        r11 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x01ae, code lost:
    
        r7[r18] = (r0 << r14) | (r16 & ((255 << r14) ^ (-1)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x01bb, code lost:
    
        if (r11 != (-1)) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x01bd, code lost:
    
        r11 = X.AbstractC004701m.A00(r7, r2 + 1, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x01c3, code lost:
    
        r9[r11] = r9[r23];
        r9[r23] = r9[r2];
        r9[r2] = r9[r11];
        r3[r11] = r3[r23];
        r3[r23] = r3[r2];
        r3[r2] = r3[r11];
        r2 = r2 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01de, code lost:
    
        r28 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0170, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01e2, code lost:
    
        r0 = X.AbstractC004701m.A01;
        r0 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01e5, code lost:
    
        if (r6 == 0) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01e7, code lost:
    
        r0 = (r6 * 2) + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01eb, code lost:
    
        r14 = r39.A04;
        r13 = r39.A03;
        A01(r39, r0);
        r12 = r39.A02;
        r11 = r39.A04;
        r9 = r39.A03;
        r3 = r39.A00;
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01fb, code lost:
    
        if (r2 >= r6) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x020d, code lost:
    
        if (((r7[r2 >> 3] >> ((r2 & 7) << 3)) & 255) >= 128) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x020f, code lost:
    
        r23 = r14[r2];
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0211, code lost:
    
        if (r23 == null) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0213, code lost:
    
        r1 = r23.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0217, code lost:
    
        r1 = r1 * (-862048943);
        r22 = A00((r1 ^ (r1 << 16)) >>> 7);
        r21 = r22 >> 3;
        r20 = (r22 & 7) << 3;
        r0 = ((r1 & com.facebook.common.dextricks.StringTreeSet.MAX_SYMBOL_COUNT) << r20) | (r12[r21] & ((255 << r20) ^ (-1)));
        r12[r21] = r0;
        r12[(((r22 - 7) & r3) + (r3 & 7)) >> 3] = r0;
        r11[r22] = r23;
        r9[r22] = r13[r2];
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x024b, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x024e, code lost:
    
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00de, code lost:
    
        r39.A01++;
        r3 = r39.A00;
        r2 = r39.A02;
        r14 = r16 >> 3;
        r12 = r2[r14];
        r11 = (r16 & 7) << 3;
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00f9, code lost:
    
        if (((r12 >> r11) & 255) != 128) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00fb, code lost:
    
        r0 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00fc, code lost:
    
        r39.A00 = r3 - r0;
        r0 = r39.A00;
        r24 = (((255 << r11) ^ (-1)) & r12) | (r4 << r11);
        r2[r14] = r24;
        r2[(((r16 - 7) & r0) + (r0 & 7)) >> 3] = r24;
        r1 = r16 ^ (-1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A04(java.lang.Object r40, long r41) {
        /*
            Method dump skipped, instructions count: 600
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18610vo.A04(java.lang.Object, long):void");
    }

    public C18610vo() {
        C18590vm c18590vm = AbstractC004701m.A01;
        A01(this, 6);
    }
}
