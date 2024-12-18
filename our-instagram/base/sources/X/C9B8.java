package X;

/* renamed from: X.9B8, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9B8 extends C0T6 {
    public int A00;
    public int A01;
    public boolean A02;
    public final int A03;

    public C9B8(boolean z, int i, int i2, int i3) {
        this.A03 = i3;
        this.A02 = z;
        if (i3 != 0) {
            this.A01 = i;
            this.A00 = i2;
        } else {
            this.A00 = i;
            this.A01 = i2;
        }
    }

    public final boolean equals(Object obj) {
        int i;
        int i2;
        if (this.A03 != 0) {
            if (this != obj) {
                if (obj instanceof C9B8) {
                    C9B8 c9b8 = (C9B8) obj;
                    if (c9b8.A03 == 1 && this.A02 == c9b8.A02 && this.A01 == c9b8.A01) {
                        i = this.A00;
                        i2 = c9b8.A00;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else if (this != obj) {
            if (!(obj instanceof C9B8)) {
                return false;
            }
            C9B8 c9b82 = (C9B8) obj;
            if (c9b82.A03 != 0 || this.A02 != c9b82.A02 || this.A00 != c9b82.A00) {
                return false;
            }
            i = this.A01;
            i2 = c9b82.A01;
        } else {
            return true;
        }
        if (i != i2) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3 = this.A03;
        boolean z = this.A02;
        int i4 = 1237;
        if (i3 != 0) {
            if (z) {
                i4 = 1231;
            }
            i = ((i4 * 31) + this.A01) * 31;
            i2 = this.A00;
        } else {
            if (z) {
                i4 = 1231;
            }
            i = ((i4 * 31) + this.A00) * 31;
            i2 = this.A01;
        }
        return i + i2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C9B8(int r2, int r3, int r4, int r5, boolean r6) {
        /*
            r1 = this;
            r1.A03 = r5
            r0 = r4 & 1
            if (r5 == 0) goto L1a
            if (r0 == 0) goto L9
            r6 = 1
        L9:
            r0 = r4 & 2
            if (r0 == 0) goto Le
            r2 = 0
        Le:
            r0 = r4 & 4
            if (r0 == 0) goto L15
            r3 = 2131165248(0x7f070040, float:1.7944708E38)
        L15:
            r0 = 1
        L16:
            r1.<init>(r6, r2, r3, r0)
            return
        L1a:
            if (r0 == 0) goto L1d
            r6 = 0
        L1d:
            r0 = r4 & 2
            if (r0 == 0) goto L22
            r2 = 0
        L22:
            r0 = r4 & 4
            if (r0 == 0) goto L27
            r3 = 0
        L27:
            r0 = 0
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9B8.<init>(int, int, int, int, boolean):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C9B8() {
        this(false, 0, 0, 0);
        this.A03 = 0;
        this.A03 = 0;
    }
}
