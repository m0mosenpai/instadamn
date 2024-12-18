package X;

/* renamed from: X.U5s, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66248U5s extends C0T6 {
    public float A00;
    public float A01;
    public float A02;
    public int A03;
    public final int A04;

    public C66248U5s(float f, float f2, float f3, int i, int i2) {
        this.A04 = i2;
        switch (i2) {
            case 0:
            case 1:
                this.A00 = f;
                this.A01 = f2;
                this.A02 = f3;
                break;
            default:
                this.A02 = f;
                this.A00 = f2;
                this.A01 = f3;
                break;
        }
        this.A03 = i;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            int r0 = r2.A04
            switch(r0) {
                case 0: goto L38;
                case 1: goto L3c;
                default: goto L5;
            }
        L5:
            if (r2 == r3) goto L62
            r1 = 2
            boolean r0 = r3 instanceof X.C66248U5s
            if (r0 == 0) goto L36
            X.U5s r3 = (X.C66248U5s) r3
            int r0 = r3.A04
            if (r0 != r1) goto L36
            float r1 = r2.A02
            float r0 = r3.A02
            int r0 = java.lang.Float.compare(r1, r0)
            if (r0 != 0) goto L36
            float r1 = r2.A00
            float r0 = r3.A00
            int r0 = java.lang.Float.compare(r1, r0)
            if (r0 != 0) goto L36
            float r1 = r2.A01
            float r0 = r3.A01
        L2a:
            int r0 = java.lang.Float.compare(r1, r0)
            if (r0 != 0) goto L36
            int r1 = r2.A03
            int r0 = r3.A03
            if (r1 == r0) goto L62
        L36:
            r0 = 0
            return r0
        L38:
            if (r2 == r3) goto L62
            r1 = 0
            goto L3f
        L3c:
            if (r2 == r3) goto L62
            r1 = 1
        L3f:
            boolean r0 = r3 instanceof X.C66248U5s
            if (r0 == 0) goto L36
            X.U5s r3 = (X.C66248U5s) r3
            int r0 = r3.A04
            if (r0 != r1) goto L36
            float r1 = r2.A00
            float r0 = r3.A00
            int r0 = java.lang.Float.compare(r1, r0)
            if (r0 != 0) goto L36
            float r1 = r2.A01
            float r0 = r3.A01
            int r0 = java.lang.Float.compare(r1, r0)
            if (r0 != 0) goto L36
            float r1 = r2.A02
            float r0 = r3.A02
            goto L2a
        L62:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66248U5s.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int A00;
        float f;
        if (2 - this.A04 != 0) {
            A00 = AbstractC166997dE.A00(Float.floatToIntBits(this.A00) * 31, this.A01);
            f = this.A02;
        } else {
            A00 = AbstractC166997dE.A00(Float.floatToIntBits(this.A02) * 31, this.A00);
            f = this.A01;
        }
        return AbstractC166997dE.A00(A00, f) + this.A03;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C66248U5s() {
        this(0.0f, 0.0f, 0.0f, 0, 2);
        this.A04 = 2;
    }
}
