package X;

/* renamed from: X.7zT, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C180397zT extends C0T6 implements InterfaceC191028cy {
    public final int A00;
    public final int A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C180397zT) {
                C180397zT c180397zT = (C180397zT) obj;
                if (this.A00 != c180397zT.A00 || this.A01 != c180397zT.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A00 * 31) + this.A01;
    }

    public C180397zT(int i, int i2) {
        this.A00 = i;
        this.A01 = i2;
    }
}
