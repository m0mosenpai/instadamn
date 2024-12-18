package X;

/* renamed from: X.9B1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9B1 extends C0T6 implements InterfaceC30800Dgb {
    public final int A00;
    public final int A01;

    public C9B1(int i, int i2) {
        this.A00 = i2;
        this.A01 = i;
    }

    public final boolean equals(Object obj) {
        int i;
        if (this.A00 != 0) {
            if (this != obj) {
                i = 1;
            } else {
                return true;
            }
        } else if (this != obj) {
            i = 0;
        } else {
            return true;
        }
        if (obj instanceof C9B1) {
            C9B1 c9b1 = (C9B1) obj;
            if (c9b1.A00 != i || this.A01 != c9b1.A01) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.A01;
    }
}
