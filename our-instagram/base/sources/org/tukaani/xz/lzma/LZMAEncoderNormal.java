package org.tukaani.xz.lzma;

import X.C20440zL;
import X.C20450zM;
import X.C20520zT;

/* loaded from: classes.dex */
public final class LZMAEncoderNormal extends LZMAEncoder {
    public int A00;
    public int A01;
    public C20520zT A02;
    public final C20440zL A03;
    public final C20450zM[] A04;
    public final int[] A05;

    @Override // org.tukaani.xz.lzma.LZMAEncoder, X.AbstractC20480zP
    public final void A01() {
        this.A00 = 0;
        this.A01 = 0;
        super.A01();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.0zL, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public LZMAEncoderNormal(org.tukaani.xz.rangecoder.RangeEncoder r18, int r19, int r20, int r21, int r22, int r23, int r24, int r25) {
        /*
            r17 = this;
            r14 = 4096(0x1000, float:5.74E-42)
            r0 = r22
            int r13 = java.lang.Math.max(r0, r14)
            org.tukaani.xz.lz.LZEncoder r0 = org.tukaani.xz.lz.LZEncoder.$redex_init_class
            r3 = 4
            r9 = r21
            r10 = r23
            r1 = r24
            r16 = r25
            if (r1 == r3) goto L4c
            r0 = 20
            if (r1 != r0) goto L55
            X.0mc r5 = new X.0mc
            r11 = r5
            r12 = r9
            r15 = r10
            r11.<init>(r12, r13, r14, r15, r16)
        L21:
            r4 = r17
            r6 = r18
            r7 = r19
            r8 = r20
            r4.<init>(r5, r6, r7, r8, r9, r10)
            X.0zM[] r2 = new X.C20450zM[r14]
            r4.A04 = r2
            r1 = 0
            r4.A00 = r1
            r4.A01 = r1
            int[] r0 = new int[r3]
            r4.A05 = r0
            X.0zL r0 = new X.0zL
            r0.<init>()
            r4.A03 = r0
        L40:
            X.0zM r0 = new X.0zM
            r0.<init>()
            r2[r1] = r0
            int r1 = r1 + 1
            if (r1 < r14) goto L40
            return
        L4c:
            org.tukaani.xz.lz.HC4 r5 = new org.tukaani.xz.lz.HC4
            r11 = r5
            r12 = r9
            r15 = r10
            r11.<init>(r12, r13, r14, r15, r16)
            goto L21
        L55:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.tukaani.xz.lzma.LZMAEncoderNormal.<init>(org.tukaani.xz.rangecoder.RangeEncoder, int, int, int, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:190:0x0414 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:240:0x02b0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0431 A[LOOP:25: B:242:0x0431->B:244:0x043b, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0585  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x05ad  */
    @Override // org.tukaani.xz.lzma.LZMAEncoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int A02() {
        /*
            Method dump skipped, instructions count: 1733
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.tukaani.xz.lzma.LZMAEncoderNormal.A02():int");
    }

    static {
        try {
            Class.forName("org.tukaani.xz.lzma.LZMAEncoderNormal");
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError().initCause(e);
        }
    }
}
