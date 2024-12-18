package X;

/* renamed from: X.9B2, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9B2 extends C0T6 {
    public int A00;
    public int A01;
    public final int A02;

    public C9B2(int i, int i2, int i3) {
        this.A02 = i3;
        switch (i3) {
            case 0:
            case 1:
            case 2:
            case 4:
                this.A01 = i;
                this.A00 = i2;
                return;
            case 3:
            default:
                this.A00 = i;
                this.A01 = i2;
                return;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x001e A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            int r0 = r2.A02
            switch(r0) {
                case 0: goto L20;
                case 1: goto L24;
                case 2: goto L28;
                case 3: goto L2c;
                default: goto L5;
            }
        L5:
            if (r2 == r3) goto L44
            r1 = 4
        L8:
            boolean r0 = r3 instanceof X.C9B2
            if (r0 == 0) goto L1e
            X.9B2 r3 = (X.C9B2) r3
            int r0 = r3.A02
            if (r0 != r1) goto L1e
            int r1 = r2.A01
            int r0 = r3.A01
            if (r1 != r0) goto L1e
            int r1 = r2.A00
            int r0 = r3.A00
        L1c:
            if (r1 == r0) goto L44
        L1e:
            r0 = 0
            return r0
        L20:
            if (r2 == r3) goto L44
            r1 = 0
            goto L8
        L24:
            if (r2 == r3) goto L44
            r1 = 1
            goto L8
        L28:
            if (r2 == r3) goto L44
            r1 = 2
            goto L8
        L2c:
            if (r2 == r3) goto L44
            r1 = 3
            boolean r0 = r3 instanceof X.C9B2
            if (r0 == 0) goto L1e
            X.9B2 r3 = (X.C9B2) r3
            int r0 = r3.A02
            if (r0 != r1) goto L1e
            int r1 = r2.A00
            int r0 = r3.A00
            if (r1 != r0) goto L1e
            int r1 = r2.A01
            int r0 = r3.A01
            goto L1c
        L44:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9B2.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i;
        int i2;
        if (3 - this.A02 != 0) {
            i = this.A01 * 31;
            i2 = this.A00;
        } else {
            i = this.A00 * 31;
            i2 = this.A01;
        }
        return i + i2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C9B2() {
        this(0, 0, 1);
        this.A02 = 1;
    }
}
