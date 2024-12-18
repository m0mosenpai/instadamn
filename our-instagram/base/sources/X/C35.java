package X;

/* loaded from: classes5.dex */
public final class C35 extends AbstractC27448C9q {
    public final float A00;
    public final float A01;
    public final int A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C35) {
                C35 c35 = (C35) obj;
                if (Float.compare(this.A01, c35.A01) != 0 || this.A02 != c35.A02 || Float.compare(this.A00, c35.A00) != 0) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A01((AbstractC25235BEs.A02(this.A01) + this.A02) * 31, this.A00);
    }

    public C35(float f, int i, float f2) {
        this.A01 = f;
        this.A02 = i;
        this.A00 = f2;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("CardWithBorders(cornerRadius=");
        A1C.append(this.A01);
        A1C.append(", borderColor=");
        A1C.append(this.A02);
        A1C.append(AbstractC58317Pt9.A00(420));
        A1C.append(this.A00);
        return AbstractC167017dG.A0p(A1C);
    }
}
