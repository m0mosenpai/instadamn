package X;

/* loaded from: classes10.dex */
public final class RTO extends RT7 {
    public final int A00;
    public final int A01;
    public final int A02 = 16;
    public final C62931SXy A03;

    public RTO(C62931SXy c62931SXy, int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
        this.A03 = c62931SXy;
    }

    public final boolean equals(Object o) {
        if (!(o instanceof RTO)) {
            return false;
        }
        RTO rto = (RTO) o;
        if (rto.A01 != this.A01 || rto.A00 != this.A00 || rto.A02 != this.A02 || rto.A03 != this.A03) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC58322PtE.A09(RTO.class, Integer.valueOf(this.A01), Integer.valueOf(this.A00), Integer.valueOf(this.A02), this.A03);
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("AesEax Parameters (variant: ");
        AbstractC58322PtE.A1R(A1C, this.A03);
        A1C.append(this.A00);
        A1C.append("-byte IV, ");
        A1C.append(this.A02);
        A1C.append("-byte tag, and ");
        A1C.append(this.A01);
        return AbstractC166997dE.A0x("-byte key)", A1C);
    }
}
