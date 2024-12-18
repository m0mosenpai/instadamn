package X;

import java.util.Random;

/* renamed from: X.2nB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C59102nB {
    public final int A00;
    public final int A01;
    public final boolean A02;
    public final boolean A03;
    public final int A04;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0009, code lost:
    
        if (X.C21A.A02() != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A00(int r4) {
        /*
            r3 = this;
            boolean r0 = r3.A02
            if (r0 != 0) goto Lb
            boolean r1 = X.C21A.A02()
            r0 = 0
            if (r1 == 0) goto Lc
        Lb:
            r0 = 1
        Lc:
            r2 = 0
            if (r0 == 0) goto L21
            boolean r1 = X.C21A.A02()
            r0 = 1
            if (r1 != 0) goto L22
            int r0 = r3.A01
            int r4 = r4 % r0
            if (r4 >= 0) goto L1c
            int r4 = r4 + r0
        L1c:
            int r0 = r3.A04
            if (r4 != r0) goto L21
            r2 = 1
        L21:
            return r2
        L22:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59102nB.A00(int):boolean");
    }

    public C59102nB(int i, int i2, boolean z, boolean z2) {
        this.A02 = z;
        this.A01 = i;
        this.A00 = i2;
        this.A03 = z2;
        this.A04 = new Random().nextInt(i);
    }
}
