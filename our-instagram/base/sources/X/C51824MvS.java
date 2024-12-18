package X;

/* renamed from: X.MvS, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51824MvS extends C0T6 implements InterfaceC57817Pkj {
    public final int A00;
    public final int A01;

    public C51824MvS(int i, int i2) {
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
        if (obj instanceof C51824MvS) {
            C51824MvS c51824MvS = (C51824MvS) obj;
            if (c51824MvS.A00 != i || this.A01 != c51824MvS.A01) {
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
