package X;

/* loaded from: classes10.dex */
public final class SO2 {
    public final boolean A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;

    public SO2(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.A00 = z;
        this.A01 = z2;
        this.A02 = z3;
        this.A03 = z4;
        this.A04 = z5;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SO2) {
                SO2 so2 = (SO2) obj;
                if (this.A00 != so2.A00 || this.A01 != so2.A01 || this.A02 != so2.A02 || this.A03 != so2.A03 || this.A04 != so2.A04) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((((AbstractC58322PtE.A02(this.A00 ? 1 : 0) + 31) * 31) + AbstractC58322PtE.A02(this.A01 ? 1 : 0)) * 31) + AbstractC58322PtE.A02(this.A02 ? 1 : 0)) * 31) + AbstractC58322PtE.A02(this.A03 ? 1 : 0)) * 31) + AbstractC58322PtE.A02(this.A04 ? 1 : 0);
    }
}
