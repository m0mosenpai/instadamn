package X;

/* loaded from: classes5.dex */
public final class CAc {
    public float A00;
    public long A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CAc) {
                CAc cAc = (CAc) obj;
                if (this.A01 != cAc.A01 || Float.compare(this.A00, cAc.A00) != 0) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A01(AbstractC25235BEs.A03(this.A01), this.A00);
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("DataPointAtTime(time=");
        A1C.append(this.A01);
        A1C.append(", dataPoint=");
        A1C.append(this.A00);
        return AbstractC167017dG.A0p(A1C);
    }
}
