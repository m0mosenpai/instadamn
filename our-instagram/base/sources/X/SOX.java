package X;

/* loaded from: classes10.dex */
public final class SOX {
    public final SPH A00;
    public final SPC A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SOX) {
                SOX sox = (SOX) obj;
                if (!C14360o3.A0K(this.A01, sox.A01) || !C14360o3.A0K(this.A00, sox.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A00, AbstractC166987dD.A0G(this.A01));
    }

    public SOX(SPH sph, SPC spc) {
        this.A01 = spc;
        this.A00 = sph;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("TooltipInfo(tooltipPositionInfo=");
        A1C.append(this.A01);
        A1C.append(", tooltipAttributes=");
        return AbstractC167017dG.A0o(this.A00, A1C);
    }
}
