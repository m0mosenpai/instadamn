package X;

/* loaded from: classes9.dex */
public final class OLR {
    public final int A00;
    public final AbstractC55021OWv A01;

    public OLR(AbstractC55021OWv abstractC55021OWv, int i) {
        C14360o3.A0B(abstractC55021OWv, 2);
        this.A00 = i;
        this.A01 = abstractC55021OWv;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof OLR) {
                OLR olr = (OLR) obj;
                if (this.A00 != olr.A00 || !C14360o3.A0K(this.A01, olr.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A01, this.A00 * 31);
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("GenerationalViewportHint(generationId=");
        A1C.append(this.A00);
        A1C.append(", hint=");
        return AbstractC167017dG.A0o(this.A01, A1C);
    }
}
