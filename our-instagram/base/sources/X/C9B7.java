package X;

/* renamed from: X.9B7, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9B7 extends C0T6 {
    public int A00;
    public boolean A01;
    public final int A02;

    public C9B7(boolean z, int i, int i2) {
        this.A02 = i2;
        this.A01 = z;
        this.A00 = i;
    }

    public final boolean equals(Object obj) {
        int i;
        switch (this.A02) {
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
                    i = 2;
                    break;
                } else {
                    return true;
                }
        }
        if (obj instanceof C9B7) {
            C9B7 c9b7 = (C9B7) obj;
            if (c9b7.A02 != i || this.A01 != c9b7.A01 || this.A00 != c9b7.A00) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 1237;
        if (this.A01) {
            i = 1231;
        }
        return (i * 31) + this.A00;
    }
}
