package X;

/* renamed from: X.9Bc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C206199Bc extends C0T6 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final boolean A03;
    public final boolean A04;

    public C206199Bc(EnumC92424Bx enumC92424Bx, EnumC92424Bx enumC92424Bx2, boolean z, boolean z2) {
        this.A00 = 2;
        this.A03 = z;
        this.A02 = enumC92424Bx;
        this.A01 = enumC92424Bx2;
        this.A04 = z2;
    }

    public final boolean equals(Object obj) {
        int i;
        switch (this.A00) {
            case 0:
                if (this != obj) {
                    i = 0;
                    break;
                } else {
                    return true;
                }
            case 1:
                if (this != obj) {
                    i = 1;
                    break;
                } else {
                    return true;
                }
            default:
                if (this != obj) {
                    if (obj instanceof C206199Bc) {
                        C206199Bc c206199Bc = (C206199Bc) obj;
                        if (c206199Bc.A00 != 2 || this.A03 != c206199Bc.A03 || this.A02 != c206199Bc.A02 || this.A01 != c206199Bc.A01 || this.A04 != c206199Bc.A04) {
                            return false;
                        }
                        return true;
                    }
                    return false;
                }
                return true;
        }
        if (!(obj instanceof C206199Bc)) {
            return false;
        }
        C206199Bc c206199Bc2 = (C206199Bc) obj;
        if (c206199Bc2.A00 != i || this.A04 != c206199Bc2.A04 || this.A03 != c206199Bc2.A03 || !C14360o3.A0K(this.A02, c206199Bc2.A02) || !C14360o3.A0K(this.A01, c206199Bc2.A01)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int i;
        int hashCode2;
        if (2 - this.A00 != 0) {
            int i2 = 1237;
            if (this.A04) {
                i2 = 1231;
            }
            int i3 = i2 * 31;
            int i4 = 1237;
            if (this.A03) {
                i4 = 1231;
            }
            int i5 = (i3 + i4) * 31;
            Object obj = this.A02;
            if (obj == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = obj.hashCode();
            }
            hashCode = (i5 + hashCode2) * 31;
            i = this.A01.hashCode();
        } else {
            int i6 = 1237;
            if (this.A03) {
                i6 = 1231;
            }
            hashCode = ((((i6 * 31) + this.A02.hashCode()) * 31) + this.A01.hashCode()) * 31;
            i = 1237;
            if (this.A04) {
                i = 1231;
            }
        }
        return hashCode + i;
    }

    public C206199Bc(C9BH c9bh, C3t9 c3t9, int i, boolean z, boolean z2) {
        this.A00 = i;
        this.A04 = z;
        this.A03 = z2;
        this.A02 = c3t9;
        this.A01 = c9bh;
    }
}
