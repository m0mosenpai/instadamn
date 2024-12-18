package X;

/* loaded from: classes9.dex */
public final class NI1 extends AbstractC53446NkZ {
    public final int A00;
    public final Integer A01;
    public final boolean A02;
    public final Integer A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof NI1) {
                NI1 ni1 = (NI1) obj;
                if (this.A00 != ni1.A00 || !C14360o3.A0K(this.A03, ni1.A03) || !C14360o3.A0K(this.A01, ni1.A01) || this.A02 != ni1.A02) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A02, ((((this.A00 * 31) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC166997dE.A0I(this.A01)) * 31);
    }

    public NI1(Integer num, Integer num2, int i, boolean z) {
        this.A00 = i;
        this.A03 = num;
        this.A01 = num2;
        this.A02 = z;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("Delete(index=");
        A1C.append(this.A00);
        A1C.append(", deletedSegmentStartTimeMs=");
        A1C.append(this.A03);
        A1C.append(", deletedSegmentDurationMs=");
        A1C.append(this.A01);
        A1C.append(", isStarted=");
        return AbstractC25236BEt.A0a(A1C, this.A02);
    }
}
