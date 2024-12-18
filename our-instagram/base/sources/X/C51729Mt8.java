package X;

/* renamed from: X.Mt8, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51729Mt8 extends C0T6 {
    public final int A00;
    public final int A01;
    public final boolean A02;

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C51729Mt8(int r4, int r5, boolean r6) {
        /*
            r3 = this;
            r3.A00 = r5
            switch(r5) {
                case 0: goto L1c;
                case 1: goto L5;
                case 2: goto L15;
                default: goto L5;
            }
        L5:
            r2 = 0
            boolean r1 = X.MSX.A1T(r4, r6)
            r0 = r4 & 2
            if (r0 == 0) goto L10
            r2 = 50
        L10:
            r0 = 5
        L11:
            r3.<init>(r2, r1, r0)
            return
        L15:
            r2 = 0
            boolean r1 = X.MSX.A1T(r4, r6)
            r0 = 2
            goto L11
        L1c:
            r0 = 0
            r3.<init>(r0, r6, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51729Mt8.<init>(int, int, boolean):void");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x001e A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            int r0 = r2.A00
            switch(r0) {
                case 0: goto L20;
                case 1: goto L24;
                case 2: goto L28;
                case 3: goto L2c;
                case 4: goto L30;
                case 5: goto L34;
                case 6: goto L38;
                default: goto L5;
            }
        L5:
            if (r2 == r3) goto L50
            r1 = 7
        L8:
            boolean r0 = r3 instanceof X.C51729Mt8
            if (r0 == 0) goto L1e
            X.Mt8 r3 = (X.C51729Mt8) r3
            int r0 = r3.A00
            if (r0 != r1) goto L1e
            boolean r1 = r2.A02
            boolean r0 = r3.A02
            if (r1 != r0) goto L1e
            int r1 = r2.A01
            int r0 = r3.A01
        L1c:
            if (r1 == r0) goto L50
        L1e:
            r0 = 0
            return r0
        L20:
            if (r2 == r3) goto L50
            r1 = 0
            goto L8
        L24:
            if (r2 == r3) goto L50
            r1 = 1
            goto L3b
        L28:
            if (r2 == r3) goto L50
            r1 = 2
            goto L8
        L2c:
            if (r2 == r3) goto L50
            r1 = 3
            goto L3b
        L30:
            if (r2 == r3) goto L50
            r1 = 4
            goto L3b
        L34:
            if (r2 == r3) goto L50
            r1 = 5
            goto L8
        L38:
            if (r2 == r3) goto L50
            r1 = 6
        L3b:
            boolean r0 = r3 instanceof X.C51729Mt8
            if (r0 == 0) goto L1e
            X.Mt8 r3 = (X.C51729Mt8) r3
            int r0 = r3.A00
            if (r0 != r1) goto L1e
            int r1 = r2.A01
            int r0 = r3.A01
            if (r1 != r0) goto L1e
            boolean r1 = r2.A02
            boolean r0 = r3.A02
            goto L1c
        L50:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51729Mt8.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i;
        int i2;
        switch (this.A00) {
            case 1:
            case 3:
            case 4:
            case 6:
                i = this.A01 * 31;
                i2 = 1237;
                if (this.A02) {
                    i2 = 1231;
                    break;
                }
                break;
            case 2:
            case 5:
            default:
                i = AbstractC25225BEi.A08(this.A02);
                i2 = this.A01;
                break;
        }
        return i + i2;
    }

    public final String toString() {
        if (5 - this.A00 != 0) {
            return super.toString();
        }
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("RtcTouchUpModel(enabled=");
        A1C.append(this.A02);
        A1C.append(", strength=");
        return AbstractC25236BEt.A0Z(A1C, this.A01);
    }

    public C51729Mt8(int i, boolean z, int i2) {
        this.A00 = i2;
        this.A01 = i;
        this.A02 = z;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C51729Mt8() {
        this(0, false, 4);
        this.A00 = 4;
    }
}
