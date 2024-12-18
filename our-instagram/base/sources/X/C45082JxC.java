package X;

/* renamed from: X.JxC, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45082JxC extends C0T6 {
    public int A03 = 0;
    public int A01 = 0;
    public int A00 = 0;
    public int A02 = 0;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45082JxC) {
                C45082JxC c45082JxC = (C45082JxC) obj;
                if (this.A03 != c45082JxC.A03 || this.A01 != c45082JxC.A01 || this.A00 != c45082JxC.A00 || this.A02 != c45082JxC.A02) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC25225BEi.A05(((((this.A03 * 31 * 31) + this.A01) * 31) + this.A00) * 31, this.A02) * 31;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("LoggingStats(initialMedia=");
        A1C.append(0);
        A1C.append(", withoutLocationData=");
        A1C.append(this.A03);
        A1C.append(", hasDateTaken=");
        A1C.append(0);
        A1C.append(", withLocationData=");
        A1C.append(this.A01);
        A1C.append(", afterMLFilter=");
        A1C.append(this.A00);
        A1C.append(", withMLData=");
        A1C.append(this.A02);
        A1C.append(", afterLocationGrouping=");
        A1C.append(0);
        A1C.append(", afterMinGroupSize=");
        A1C.append(0);
        A1C.append(", afterDeduping=");
        return AbstractC25236BEt.A0Z(A1C, 0);
    }
}
