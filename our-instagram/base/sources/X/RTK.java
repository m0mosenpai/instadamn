package X;

/* loaded from: classes10.dex */
public final class RTK extends RT7 {
    public final SY1 A00;

    public final boolean equals(Object o) {
        if (!(o instanceof RTK) || ((RTK) o).A00 != this.A00) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC37301Gc2.A02(RTK.class, this.A00);
    }

    public RTK(SY1 variant) {
        this.A00 = variant;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("ChaCha20Poly1305 Parameters (variant: ");
        return AbstractC58323PtF.A0q(this.A00, A1C);
    }
}
