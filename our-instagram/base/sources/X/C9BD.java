package X;

/* renamed from: X.9BD, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9BD extends C0T6 {
    public final int A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;

    public C9BD(boolean z, int i, boolean z2, boolean z3, boolean z4) {
        this.A00 = i;
        if (i != 0) {
            this.A04 = z;
            this.A01 = z2;
        } else {
            this.A01 = z;
            this.A04 = z2;
        }
        this.A03 = z3;
        this.A02 = z4;
    }

    public final boolean equals(Object obj) {
        C9BD c9bd;
        boolean z;
        boolean z2;
        if (this.A00 != 0) {
            if (this != obj) {
                if (obj instanceof C9BD) {
                    c9bd = (C9BD) obj;
                    if (c9bd.A00 == 1 && this.A04 == c9bd.A04) {
                        z = this.A01;
                        z2 = c9bd.A01;
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
            if (!(obj instanceof C9BD)) {
                return false;
            }
            c9bd = (C9BD) obj;
            if (c9bd.A00 != 0 || this.A01 != c9bd.A01) {
                return false;
            }
            z = this.A04;
            z2 = c9bd.A04;
        } else {
            return true;
        }
        if (z != z2 || this.A03 != c9bd.A03 || this.A02 != c9bd.A02) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        boolean z;
        if (this.A00 != 0) {
            int i2 = 1237;
            if (this.A04) {
                i2 = 1231;
            }
            i = i2 * 31;
            z = this.A01;
        } else {
            int i3 = 1237;
            if (this.A01) {
                i3 = 1231;
            }
            i = i3 * 31;
            z = this.A04;
        }
        int i4 = 1237;
        if (z) {
            i4 = 1231;
        }
        int i5 = (i + i4) * 31;
        int i6 = 1237;
        if (this.A03) {
            i6 = 1231;
        }
        int i7 = (i5 + i6) * 31;
        int i8 = 1237;
        if (this.A02) {
            i8 = 1231;
        }
        return i7 + i8;
    }
}
