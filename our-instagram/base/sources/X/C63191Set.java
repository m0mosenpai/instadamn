package X;

/* renamed from: X.Set, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63191Set {
    public static final int[] A04 = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, C3OO.FLAG_MOVED};
    public int A00;
    public boolean A01;
    public final float A02;
    public final float[] A03;

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0020, code lost:
    
        if (r6 == 3) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x002d, code lost:
    
        if ((r3 & r2[8]) != 0) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:9:0x000f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float A00(int r6) {
        /*
            r5 = this;
            r0 = 4
            if (r6 == r0) goto L34
            r0 = 5
            if (r6 == r0) goto L34
            switch(r6) {
                case 9: goto L34;
                case 10: goto L34;
                case 11: goto L34;
                default: goto L9;
            }
        L9:
            float r4 = r5.A02
        Lb:
            int r3 = r5.A00
            if (r3 == 0) goto L37
            int[] r2 = X.C63191Set.A04
            r0 = r2[r6]
            r0 = r0 & r3
            if (r0 != 0) goto L2f
            boolean r0 = r5.A01
            if (r0 == 0) goto L37
            r0 = 1
            if (r6 == r0) goto L22
            r1 = 3
            r0 = r6
            r6 = 6
            if (r0 != r1) goto L23
        L22:
            r6 = 7
        L23:
            r0 = r2[r6]
            r0 = r0 & r3
            if (r0 != 0) goto L2f
            r6 = 8
            r0 = r2[r6]
            r3 = r3 & r0
            if (r3 == 0) goto L37
        L2f:
            float[] r0 = r5.A03
            r0 = r0[r6]
            return r0
        L34:
            r4 = 2143289344(0x7fc00000, float:NaN)
            goto Lb
        L37:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63191Set.A00(int):float");
    }

    public final void A01(float f, int i) {
        float[] fArr = this.A03;
        boolean z = false;
        if (!C62795SRp.A00(fArr[i], f)) {
            fArr[i] = f;
            boolean A00 = C3e2.A00(f);
            int i2 = this.A00;
            int[] iArr = A04;
            int i3 = iArr[i];
            int i4 = i3 | i2;
            if (A00) {
                i4 = (i3 ^ (-1)) & i2;
            }
            this.A00 = i4;
            if ((iArr[8] & i4) != 0 || (iArr[7] & i4) != 0 || (iArr[6] & i4) != 0 || (i4 & iArr[9]) != 0) {
                z = true;
            }
            this.A01 = z;
        }
    }

    public C63191Set(float f) {
        float[] A00 = C62796SRq.A00();
        this.A02 = f;
        this.A03 = A00;
    }

    public C63191Set() {
        float[] A00 = C62796SRq.A00();
        this.A02 = 0.0f;
        this.A03 = A00;
    }
}
