package X;

/* loaded from: classes9.dex */
public final class NI0 extends AbstractC53446NkZ {
    public final int A00;
    public final int A01;
    public final boolean A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof NI0) {
                NI0 ni0 = (NI0) obj;
                if (this.A01 != ni0.A01 || this.A00 != ni0.A00 || this.A02 != ni0.A02) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A02, ((this.A01 * 31) + this.A00) * 31);
    }

    public NI0(int i, int i2, boolean z) {
        this.A01 = i;
        this.A00 = i2;
        this.A02 = z;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("Reorder(oldIndex=");
        A1C.append(this.A01);
        A1C.append(", newIndex=");
        A1C.append(this.A00);
        A1C.append(", isStarted=");
        return AbstractC25236BEt.A0a(A1C, this.A02);
    }
}
