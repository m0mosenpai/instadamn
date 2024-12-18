package X;

/* loaded from: classes5.dex */
public final class C36 extends AbstractC27448C9q {
    public final float A00;
    public final float A01;
    public final int A02;
    public final int A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C36) {
                C36 c36 = (C36) obj;
                if (Float.compare(this.A00, c36.A00) != 0 || Float.compare(this.A01, c36.A01) != 0 || this.A03 != c36.A03 || this.A02 != c36.A02) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AbstractC166997dE.A00(AbstractC25235BEs.A02(this.A00), this.A01) + this.A03) * 31) + this.A02;
    }

    public C36(int i, int i2, float f, float f2) {
        this.A00 = f;
        this.A01 = f2;
        this.A03 = i;
        this.A02 = i2;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("Card(cornerRadius=");
        A1C.append(this.A00);
        A1C.append(", shadowRadius=");
        A1C.append(this.A01);
        A1C.append(", shadowColor=");
        A1C.append(this.A03);
        A1C.append(", backgroundColor=");
        return AbstractC25236BEt.A0Z(A1C, this.A02);
    }
}
