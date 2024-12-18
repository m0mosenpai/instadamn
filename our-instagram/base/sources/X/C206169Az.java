package X;

/* renamed from: X.9Az, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C206169Az extends C0T6 {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public final int A04;

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0003. Please report as an issue. */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C206169Az(int r8) {
        /*
            r7 = this;
            r0 = r7
            r7.A04 = r8
            switch(r8) {
                case 1: goto L16;
                case 2: goto L11;
                default: goto L6;
            }
        L6:
            r1 = 0
            r3 = 15
            r5 = 3
        La:
            r2 = r1
            r4 = r1
            r6 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        L11:
            r1 = 0
            r3 = 15
            r5 = 2
            goto La
        L16:
            r1 = 1
            r7.A04 = r1
            r2 = 0
            r3 = r2
            r4 = r2
            r5 = r2
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C206169Az.<init>(int):void");
    }

    public final boolean A00() {
        if (this.A03 != 1.0f || this.A02 != 0.0f || this.A00 != 0.0f || this.A01 != 0.0f) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            int r0 = r2.A04
            switch(r0) {
                case 1: goto La;
                case 2: goto L3a;
                case 3: goto L60;
                default: goto L5;
            }
        L5:
            boolean r0 = super.equals(r3)
            return r0
        La:
            if (r2 == r3) goto L97
            r1 = 1
            boolean r0 = r3 instanceof X.C206169Az
            if (r0 == 0) goto L95
            X.9Az r3 = (X.C206169Az) r3
            int r0 = r3.A04
            if (r0 != r1) goto L95
            float r1 = r2.A02
            float r0 = r3.A02
            int r0 = java.lang.Float.compare(r1, r0)
            if (r0 != 0) goto L95
            float r1 = r2.A03
            float r0 = r3.A03
            int r0 = java.lang.Float.compare(r1, r0)
            if (r0 != 0) goto L95
            float r1 = r2.A01
            float r0 = r3.A01
            int r0 = java.lang.Float.compare(r1, r0)
            if (r0 != 0) goto L95
            float r1 = r2.A00
            float r0 = r3.A00
            goto L8f
        L3a:
            if (r2 == r3) goto L97
            r1 = 2
            boolean r0 = r3 instanceof X.C206169Az
            if (r0 == 0) goto L95
            X.9Az r3 = (X.C206169Az) r3
            int r0 = r3.A04
            if (r0 != r1) goto L95
            float r1 = r2.A03
            float r0 = r3.A03
            int r0 = java.lang.Float.compare(r1, r0)
            if (r0 != 0) goto L95
            float r1 = r2.A02
            float r0 = r3.A02
            int r0 = java.lang.Float.compare(r1, r0)
            if (r0 != 0) goto L95
            float r1 = r2.A00
            float r0 = r3.A00
            goto L85
        L60:
            if (r2 == r3) goto L97
            r1 = 3
            boolean r0 = r3 instanceof X.C206169Az
            if (r0 == 0) goto L95
            X.9Az r3 = (X.C206169Az) r3
            int r0 = r3.A04
            if (r0 != r1) goto L95
            float r1 = r2.A02
            float r0 = r3.A02
            int r0 = java.lang.Float.compare(r1, r0)
            if (r0 != 0) goto L95
            float r1 = r2.A00
            float r0 = r3.A00
            int r0 = java.lang.Float.compare(r1, r0)
            if (r0 != 0) goto L95
            float r1 = r2.A03
            float r0 = r3.A03
        L85:
            int r0 = java.lang.Float.compare(r1, r0)
            if (r0 != 0) goto L95
            float r1 = r2.A01
            float r0 = r3.A01
        L8f:
            int r0 = java.lang.Float.compare(r1, r0)
            if (r0 == 0) goto L97
        L95:
            r0 = 0
            return r0
        L97:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C206169Az.equals(java.lang.Object):boolean");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    public final int hashCode() {
        int floatToIntBits;
        float f;
        int floatToIntBits2;
        float f2;
        switch (this.A04) {
            case 1:
                floatToIntBits2 = ((((Float.floatToIntBits(this.A02) * 31) + Float.floatToIntBits(this.A03)) * 31) + Float.floatToIntBits(this.A01)) * 31;
                f2 = this.A00;
                return floatToIntBits2 + Float.floatToIntBits(f2);
            case 2:
                floatToIntBits = ((Float.floatToIntBits(this.A03) * 31) + Float.floatToIntBits(this.A02)) * 31;
                f = this.A00;
                floatToIntBits2 = (floatToIntBits + Float.floatToIntBits(f)) * 31;
                f2 = this.A01;
                return floatToIntBits2 + Float.floatToIntBits(f2);
            case 3:
                floatToIntBits = ((Float.floatToIntBits(this.A02) * 31) + Float.floatToIntBits(this.A00)) * 31;
                f = this.A03;
                floatToIntBits2 = (floatToIntBits + Float.floatToIntBits(f)) * 31;
                f2 = this.A01;
                return floatToIntBits2 + Float.floatToIntBits(f2);
            default:
                return super.hashCode();
        }
    }

    public C206169Az(int i, float f, float f2, float f3, float f4) {
        this.A04 = i;
        switch (i) {
            case 0:
                this.A01 = f;
                this.A02 = f2;
                this.A03 = f3;
                break;
            case 1:
                this.A02 = f;
                this.A03 = f2;
                this.A01 = f3;
                break;
            case 2:
                this.A03 = f;
                this.A02 = f2;
                this.A00 = f3;
                this.A01 = f4;
                return;
            default:
                this.A02 = f;
                this.A00 = f2;
                this.A03 = f3;
                this.A01 = f4;
                return;
        }
        this.A00 = f4;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C206169Az(float r8, float r9, int r10, float r11, int r12, float r13) {
        /*
            r7 = this;
            r1 = r7
            r6 = r13
            r5 = r11
            r4 = r9
            r3 = r8
            r7.A04 = r12
            r0 = r10 & 1
            switch(r12) {
                case 0: goto L4d;
                case 1: goto L39;
                case 2: goto L24;
                default: goto Lc;
            }
        Lc:
            if (r0 == 0) goto L10
            r3 = 1065353216(0x3f800000, float:1.0)
        L10:
            r0 = r10 & 2
            if (r0 == 0) goto L15
            r4 = 0
        L15:
            r0 = r10 & 4
            if (r0 == 0) goto L1a
            r5 = 0
        L1a:
            r0 = r10 & 8
            if (r0 == 0) goto L1f
            r6 = 0
        L1f:
            r2 = 3
        L20:
            r1.<init>(r2, r3, r4, r5, r6)
            return
        L24:
            if (r0 == 0) goto L28
            r3 = 1065353216(0x3f800000, float:1.0)
        L28:
            r0 = r10 & 2
            if (r0 == 0) goto L2d
            r4 = 0
        L2d:
            r0 = r10 & 4
            if (r0 == 0) goto L32
            r5 = 0
        L32:
            r0 = r10 & 8
            if (r0 == 0) goto L37
            r6 = 0
        L37:
            r2 = 2
            goto L20
        L39:
            if (r0 == 0) goto L3c
            r3 = 0
        L3c:
            r0 = r10 & 2
            if (r0 == 0) goto L41
            r4 = 0
        L41:
            r0 = r10 & 4
            if (r0 == 0) goto L46
            r5 = 0
        L46:
            r0 = r10 & 8
            if (r0 == 0) goto L4b
            r6 = 0
        L4b:
            r2 = 1
            goto L20
        L4d:
            if (r0 == 0) goto L50
            r3 = 0
        L50:
            r0 = r10 & 2
            if (r0 == 0) goto L55
            r4 = 0
        L55:
            r0 = r10 & 4
            if (r0 == 0) goto L5a
            r5 = 0
        L5a:
            r0 = r10 & 8
            if (r0 == 0) goto L5f
            r6 = 0
        L5f:
            r2 = 0
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C206169Az.<init>(float, float, int, float, int, float):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C206169Az(float f) {
        this(1, f, f, f, f);
        this.A04 = 1;
    }
}
