package X;

/* loaded from: classes5.dex */
public final class C39 extends AbstractC27450C9s {
    public final float A00;
    public final int A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C39) {
                C39 c39 = (C39) obj;
                if (this.A01 != c39.A01 || Float.compare(this.A00, c39.A00) != 0) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A01(this.A01 * 31, this.A00);
    }

    public C39(int i, float f) {
        this.A01 = i;
        this.A00 = f;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("WithBorder(color=");
        A1C.append(this.A01);
        A1C.append(", widthDp=");
        A1C.append(this.A00);
        return AbstractC167017dG.A0p(A1C);
    }
}
