package X;

import org.tukaani.xz.lz.LZEncoder;

/* renamed from: X.0mc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13500mc extends LZEncoder {
    public int A00;
    public int A01;
    public final int A02;
    public final int A03;
    public final C13120ly A04;
    public final C20520zT A05;
    public final int[] A06;

    public C13500mc(int i, int i2, int i3, int i4, int i5) {
        super(i, i2, i3, i4);
        this.A00 = -1;
        int i6 = i + 1;
        this.A02 = i6;
        this.A01 = i6;
        this.A04 = new C13120ly(i);
        this.A06 = new int[i6 * 2];
        this.A05 = new C20520zT(i4 - 1);
        this.A03 = i5 <= 0 ? (i4 / 2) + 16 : i5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002f, code lost:
    
        if (r8[r2 - r9] == r8[r2]) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0031, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0035, code lost:
    
        if (r3 != r16) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0044, code lost:
    
        r2 = r7 + r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004c, code lost:
    
        if (r8[r2 - r9] == r8[r2]) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0037, code lost:
    
        r1 = r15.A06;
        r1[r14] = r1[r10];
        r1[r13] = r1[r10 + 1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0043, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004e, code lost:
    
        r7 = r7 + r3;
        r2 = r8[r7 - r9] & 255;
        r1 = r8[r7] & 255;
        r0 = r15.A06;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005b, code lost:
    
        if (r2 >= r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005d, code lost:
    
        r0[r14] = r17;
        r14 = r10 + 1;
        r17 = r0[r14];
        r4 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0066, code lost:
    
        r0[r13] = r17;
        r17 = r0[r10];
        r13 = r10;
        r5 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006d, code lost:
    
        r0 = r15.A06;
        r0[r13] = 0;
        r0[r14] = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0073, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A01(int r16, int r17) {
        /*
            r15 = this;
            int r0 = r15.A03
            int r6 = r15.A00
            int r14 = r6 << 1
            int r13 = r14 + 1
            r12 = 0
            r5 = 0
            r4 = 0
        Lb:
            int r9 = r15.A01
            int r9 = r9 - r17
            int r11 = r0 + (-1)
            if (r0 == 0) goto L6d
            int r1 = r15.A02
            if (r9 >= r1) goto L6d
            int r0 = r6 - r9
            if (r9 > r6) goto L1c
            r1 = 0
        L1c:
            int r0 = r0 + r1
            int r10 = r0 << 1
            int r3 = java.lang.Math.min(r5, r4)
            byte[] r8 = r15.A08
            int r7 = r15.A02
            int r2 = r7 + r3
            int r0 = r2 - r9
            r1 = r8[r0]
            r0 = r8[r2]
            if (r1 != r0) goto L4e
        L31:
            int r3 = r3 + 1
            r0 = r16
            if (r3 != r0) goto L44
            int[] r1 = r15.A06
            r0 = r1[r10]
            r1[r14] = r0
            int r0 = r10 + 1
            r0 = r1[r0]
            r1[r13] = r0
            return
        L44:
            int r2 = r7 + r3
            int r0 = r2 - r9
            r1 = r8[r0]
            r0 = r8[r2]
            if (r1 == r0) goto L31
        L4e:
            int r7 = r7 + r3
            int r0 = r7 - r9
            r0 = r8[r0]
            r2 = r0 & 255(0xff, float:3.57E-43)
            r0 = r8[r7]
            r1 = r0 & 255(0xff, float:3.57E-43)
            int[] r0 = r15.A06
            if (r2 >= r1) goto L66
            r0[r14] = r17
            int r14 = r10 + 1
            r17 = r0[r14]
            r4 = r3
        L64:
            r0 = r11
            goto Lb
        L66:
            r0[r13] = r17
            r17 = r0[r10]
            r13 = r10
            r5 = r3
            goto L64
        L6d:
            int[] r0 = r15.A06
            r0[r13] = r12
            r0[r14] = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C13500mc.A01(int, int):void");
    }

    private int A00() {
        int i = this.A07;
        int i2 = super.A02 + 1;
        super.A02 = i2;
        int i3 = super.A03 - i2;
        if (i3 < i) {
            if (i3 < 4 || !super.A04) {
                super.A00++;
                return 0;
            }
        } else if (i3 == 0) {
            return i3;
        }
        int i4 = this.A01 + 1;
        this.A01 = i4;
        if (i4 == Integer.MAX_VALUE) {
            int i5 = Integer.MAX_VALUE - this.A02;
            C13120ly c13120ly = this.A04;
            LZEncoder.A03(c13120ly.A03, i5);
            LZEncoder.A03(c13120ly.A04, i5);
            LZEncoder.A03(c13120ly.A05, i5);
            LZEncoder.A03(this.A06, i5);
            this.A01 = i4 - i5;
        }
        int i6 = this.A00 + 1;
        this.A00 = i6;
        if (i6 != this.A02) {
            return i3;
        }
        this.A00 = 0;
        return i3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00cc, code lost:
    
        if (r7[r16 - r14] == r7[r16]) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ce, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00d0, code lost:
    
        if (r2 >= r11) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00d2, code lost:
    
        r16 = r6 + r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00da, code lost:
    
        if (r7[r16 - r14] == r7[r16]) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00de, code lost:
    
        if (r2 <= r22) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00e0, code lost:
    
        r9.A02[r1] = r2;
        r9.A01[r1] = r14 - 1;
        r1 = r1 + 1;
        r9.A00 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00ee, code lost:
    
        if (r2 < r8) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00fd, code lost:
    
        r22 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00f0, code lost:
    
        r1 = r23.A06;
        r1[r12] = r1[r17];
        r1[r21] = r1[r17 + 1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00fc, code lost:
    
        return r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00ff, code lost:
    
        r16 = r6 + r2;
        r15 = r7[r16 - r14] & 255;
        r14 = r7[r16] & 255;
        r0 = r23.A06;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x010d, code lost:
    
        if (r15 >= r14) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x010f, code lost:
    
        r0[r12] = r4;
        r12 = r17 + 1;
        r4 = r0[r12];
        r19 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x011a, code lost:
    
        r0[r21] = r4;
        r4 = r0[r17];
        r21 = r17;
        r20 = r2;
     */
    @Override // org.tukaani.xz.lz.LZEncoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C20520zT A05() {
        /*
            Method dump skipped, instructions count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C13500mc.A05():X.0zT");
    }

    @Override // org.tukaani.xz.lz.LZEncoder
    public final void A06(int i) {
        while (true) {
            int i2 = i - 1;
            if (i > 0) {
                int i3 = this.A07;
                int A00 = A00();
                if (A00 < i3) {
                    if (A00 != 0) {
                        i3 = A00;
                    } else {
                        i = i2;
                    }
                }
                C13120ly c13120ly = this.A04;
                c13120ly.A01(this.A08, super.A02);
                int i4 = c13120ly.A05[c13120ly.A02];
                c13120ly.A00(this.A01);
                A01(i3, i4);
                i = i2;
            } else {
                return;
            }
        }
    }
}
