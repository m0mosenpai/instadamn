package X;

/* loaded from: classes4.dex */
public final class AGJ {
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final float A04;
    public final boolean A05;
    public final boolean A06;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AGJ() {
        /*
            r9 = this;
            r1 = 0
            r7 = 0
            r6 = 255(0xff, float:3.57E-43)
            r0 = r9
            r2 = r1
            r3 = r1
            r4 = r1
            r5 = r1
            r8 = r7
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AGJ.<init>():void");
    }

    public /* synthetic */ AGJ(float f, float f2, float f3, float f4, float f5, int i, boolean z, boolean z2) {
        f = (i & 1) != 0 ? 0.0f : f;
        f2 = (i & 2) != 0 ? 0.0f : f2;
        f3 = (i & 4) != 0 ? 1.0f : f3;
        f4 = (i & 8) != 0 ? 1.0f : f4;
        z = (i & 16) != 0 ? false : z;
        boolean z3 = (i & 32) == 0 ? z2 : false;
        float f6 = (i & 128) == 0 ? f5 : 1.0f;
        this.A01 = f;
        this.A02 = f2;
        this.A03 = f3;
        this.A04 = f4;
        this.A05 = z;
        this.A06 = z3;
        this.A00 = f6;
    }
}
