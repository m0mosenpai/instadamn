package X;

/* renamed from: X.5qT, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5qT {
    public final int A00;
    public final int A01;

    public final boolean equals(Object obj) {
        if (obj instanceof C5qT) {
            C5qT c5qT = (C5qT) obj;
            if (c5qT.A01 == this.A01 && c5qT.A00 == this.A00) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.A01 * 31) + this.A00;
    }

    public C5qT(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
    }
}
