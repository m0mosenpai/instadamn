package X;

/* renamed from: X.L9d, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47795L9d {
    public final int A00;
    public final int A01;
    public final int A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C47795L9d) {
                C47795L9d c47795L9d = (C47795L9d) obj;
                if (this.A02 != c47795L9d.A02 || this.A01 != c47795L9d.A01 || this.A00 != c47795L9d.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((this.A02 * 31) + this.A01) * 31) + this.A00;
    }

    public C47795L9d(int i, int i2, int i3) {
        this.A02 = i;
        this.A01 = i2;
        this.A00 = i3;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("AiOutputColor(r=");
        A1C.append(this.A02);
        A1C.append(", g=");
        A1C.append(this.A01);
        A1C.append(", b=");
        return AbstractC25236BEt.A0Z(A1C, this.A00);
    }
}
