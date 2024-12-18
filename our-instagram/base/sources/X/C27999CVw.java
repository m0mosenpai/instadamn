package X;

/* renamed from: X.CVw, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27999CVw {
    public final float A00;
    public final int A01;
    public final int A02;
    public final int A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C27999CVw) {
                C27999CVw c27999CVw = (C27999CVw) obj;
                if (this.A02 != c27999CVw.A02 || this.A01 != c27999CVw.A01 || this.A03 != c27999CVw.A03 || Float.compare(this.A00, c27999CVw.A00) != 0) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A01(((((this.A02 * 31) + this.A01) * 31) + this.A03) * 31, this.A00);
    }

    public C27999CVw(float f, int i, int i2, int i3) {
        this.A02 = i;
        this.A01 = i2;
        this.A03 = i3;
        this.A00 = f;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("BodyParametricStyleParameters(thumbColor=");
        A1C.append(this.A02);
        A1C.append(", filledTrackColor=");
        A1C.append(this.A01);
        A1C.append(", unfilledTrackColor=");
        A1C.append(this.A03);
        A1C.append(", stepSize=");
        A1C.append(this.A00);
        return AbstractC167017dG.A0p(A1C);
    }
}
